/**
 * 
 * 
 * 创建时间：2016-8-23 上午10:29:30
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.entity.VerifyCode;

/**
 * 管理平台：员工登录
 * 
 * 创建时间：2016-8-23 上午10:29:30
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.loginController")
@RequestMapping("/admin/")
public class LoginController extends AdminController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 上午10:30:53
	 * 
	 * @author：moshco zhu
	 * @param session
	 * @param userName
	 * @param password
	 * @param verifyCode
	 * @return
	 */
	@RequestMapping("login")
	public ModelAndView execute(HttpSession session, String userName, String password, String verifyCode) {

		// 验证结果
		boolean bVerifyResult = true;
		String message = null;

		// 空验证
		if (userName == null || userName.trim().equals("")) {
			bVerifyResult = false;
			message = "用户名不能为空！";
		} else if (password == null || password.trim().equals("")) {
			bVerifyResult = false;
			message = "密码不能为空！";
		} else if (verifyCode == null || verifyCode.trim().equals("")) {
			bVerifyResult = false;
			message = "验证码不能为空！";
		}

		// 找寻验证码
		VerifyCode verifyCodeBean = null;
		if (bVerifyResult) {
			// 封装查询条件的集合
			Map<String, Object> queryParam = new HashMap<String, Object>();
			queryParam.put("isVerify", 0);// 未验证
			queryParam.put("sort", "掩码");// 掩码
			queryParam.put("code", verifyCode);// 编码
			queryParam.put("actionPlace", "员工登录");// 员工登录
			verifyCodeBean = baseService.find(VerifyCode.class, queryParam);
			if (verifyCodeBean == null) {
				bVerifyResult = false;
				message = "验证码输入错误！";
			}
		}

		// 验证码的有效性
		if (bVerifyResult) {
			long lTime1 = verifyCodeBean.getBegingTime().getTime();
			long lTime2 = verifyCodeBean.getValidateLength() * 60 * 1000;
			if (System.currentTimeMillis() - lTime1 > lTime2) {
				bVerifyResult = false;
				message = "验证码已经超出有效时长（" + verifyCodeBean.getValidateLength() + "分钟）！";
			}
		}

		// 有效性验证
		SysUser user = null;
		if (bVerifyResult) {
			user = baseService.find(SysUser.class, "userName", userName);
			if (user == null) {
				bVerifyResult = false;
				message = "用户名或密码错误！";
			}
		}

		// 验证密码
		if (bVerifyResult) {
			if (!DigestUtils.md5Hex(password).equalsIgnoreCase(user.getPassword())) {
				bVerifyResult = false;
				message = "用户名或密码错误！";
			}
		}

		// 验证身份
		if (bVerifyResult) {
			if (!"员工帐号".equals(user.getUserType())) {
				bVerifyResult = false;
				message = "请使用员工帐号登录！";
			}
		}

		// 帐号必须被激活
		if (bVerifyResult) {
			if (user.getEnable() != 1) {
				bVerifyResult = false;
				message = "帐号未激活。";
			}
		}

		if (!bVerifyResult) {
			// 创建模型视图
			ModelAndView mav = new ModelAndView();
			mav.addObject("message", message);
			mav.setViewName("admin/login");// /html/admin/login.jsp
			// mav.setViewName("forward:/html/admin/login.jsp");
			// 返回函数值
			return mav;
		}

		// 记录用户登录标示
		session.setAttribute("adminId", user.getId());

		// 上一次登录时间
		user.setPriorLoginTime(user.getLastLoginTime());
		// 最后一次登录时间
		user.setLastLoginTime(new Date());
		// 登录次数
		Integer iTotalLogin = user.getTotalLogin();
		iTotalLogin = (iTotalLogin == null || iTotalLogin < 0) ? 1 : iTotalLogin + 1;
		user.setTotalLogin(iTotalLogin);

		// 保存到数据库中
		baseService.update(user);

		// 更新验证码状态
		verifyCodeBean.setIsVerify(1);// 设置已经验证
		verifyCodeBean.setVerifyTime(new Date());// 设置验证时间
		// 更新到数据库
		baseService.update(verifyCodeBean);

		// 创建模型视图
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/admin/home/main.action");

		// 返回函数值
		return mav;
	}

}
