/**
 * 
 * 
 * 创建时间：2016-8-23 上午11:07:38
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 管理平台：用户注销
 * 
 * 创建时间：2016-8-23 上午11:07:38
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.logoutController")
@RequestMapping("/admin/")
public class LogoutController extends AdminController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 上午11:08:52
	 * 
	 * @author：moshco zhu
	 * @param session
	 * @return
	 */
	@RequestMapping("logout")
	public ModelAndView execute(HttpSession session) {

		// 删除登录标示
		session.removeAttribute("adminId");

		// 创建模型视图
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/html/admin/login.jsp");

		// 返回函数值
		return mav;
	}

}
