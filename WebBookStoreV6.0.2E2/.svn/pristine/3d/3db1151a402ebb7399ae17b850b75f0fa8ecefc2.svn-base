/**
 * 
 * 
 * 创建时间：2016-8-23 下午6:47:57
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer;

import java.net.URLEncoder;
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
 * 客户平台：用户登录
 * 
 * 创建时间：2016-8-23 下午6:47:57
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.loginController")
@RequestMapping("/customer/")
public class LoginController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 下午6:49:29
	 * 
	 * @author：moshco zhu
	 * @param session
	 * @param userName
	 * @param password
	 * @param verifyCode
	 * @return
	 */
	@RequestMapping("login")
	public ModelAndView execute(HttpSession session, String userName,
			String password, String verifyCode) {

		// 验证的结果
		boolean verifyResult = true;
		// 消息
		String message = null;

		// 空验证
		if (userName == null || userName.equals("")) {
			verifyResult = false;
			message = "用户名不能为空。";
		} else if (password == null || password.equals("")) {
			verifyResult = false;
			message = "密码不能为空。";
		} else if (verifyCode == null || verifyCode.equals("")) {
			verifyResult = false;
			message = "验证码不能为空。";
		}

		// 验证验证码
		VerifyCode verifyCodeBean = null;
		if (verifyResult) {
			// 查询条件的集合
			Map<String, Object> queryParam = new HashMap<String, Object>();
			queryParam.put("code", verifyCode);
			queryParam.put("sort", "掩码");
			queryParam.put("actionPlace", "客户登录");
			queryParam.put("isVerify", 0);
			// 找寻验证码记录
			verifyCodeBean = baseService.find(VerifyCode.class, queryParam);
			if (verifyCodeBean == null) {
				verifyResult = false;
				message = "验证码输入错误。";
			}
		}

		// 验证验证码的有效性
		if (verifyResult) {
			long beginTime = verifyCodeBean.getBegingTime().getTime();
			long timeLength = verifyCodeBean.getValidateLength() * 60 * 1000;
			if (System.currentTimeMillis() > beginTime + timeLength) {
				verifyResult = false;
				message = "验证码已经超过有效时长（" + verifyCodeBean.getValidateLength()
						+ "分钟）。";
			}
		}

		// 验证用户帐号
		SysUser user = null;
		if (verifyResult) {
			// 找寻帐号记录
			user = baseService.find(SysUser.class, "userName", userName);
			if (user == null) {
				verifyResult = false;
				message = "用户名或密码错误。";
			}
		}

		// 验证密码
		if (verifyResult) {
			if (!DigestUtils.md5Hex(password).equalsIgnoreCase(
					user.getPassword())) {
				verifyResult = false;
				message = "用户名或密码错误。";
			}
		}

		// 验证身份
		if (verifyResult) {
			if (!"客户帐号".equals(user.getUserType())) {
				verifyResult = false;
				message = "请使用身份为[客户帐号]的帐号登录。";
			}
		}

		// 验证不通过
		if (!verifyResult) {
			// 创建对象
			ModelAndView mav = new ModelAndView();
			mav.addObject("message", message);
			mav.setViewName("customer/login");
			// 返回函数值
			return mav;
		}

		// 保存登录标示
		session.setAttribute("customerId", user.getId());

		// 更新帐号登录信息
		// 上一次登录时间
		user.setPriorLoginTime(user.getLastLoginTime());
		// 最后一次登录时间
		user.setLastLoginTime(new Date());
		// 总计登录次数
		Integer totalLogin = user.getTotalLogin();
		totalLogin = (totalLogin == null) ? 1 : totalLogin + 1;
		user.setTotalLogin(totalLogin);
		// 更新到数据库
		baseService.update(user);

		// 设置验证码已经验证
		verifyCodeBean.setIsVerify(1);
		verifyCodeBean.setVerifyTime(new Date());
		// 更新到数据库
		baseService.update(verifyCodeBean);

		try {
			// 消息
			message = URLEncoder.encode("恭喜，登录成功！欢迎你" + user.getTrueName()
					+ "！", "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 创建对象
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/customer/home/main.action?message="
				+ message);

		// 返回函数值
		return mav;
	}

}
