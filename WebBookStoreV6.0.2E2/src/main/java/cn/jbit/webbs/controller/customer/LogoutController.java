/**
 * 
 * 
 * 创建时间：2016-8-23 下午6:56:11
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 客户平台：用户注销
 * 
 * 创建时间：2016-8-23 下午6:56:11
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.logoutController")
@RequestMapping("/customer/")
public class LogoutController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 下午6:57:03
	 * 
	 * @author：moshco zhu
	 * @param session
	 * @return
	 */
	@RequestMapping("logout")
	public ModelAndView execute(HttpSession session) {

		// 删除登录标示
		session.removeAttribute("customerId");

		// 创建对象
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/html/customer/login.jsp");

		// 返回函数值
		return mav;
	}

}
