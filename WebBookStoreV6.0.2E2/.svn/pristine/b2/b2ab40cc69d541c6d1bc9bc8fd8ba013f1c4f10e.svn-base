/**
 * 
 * 
 * 创建时间：2016-8-25 上午10:35:40
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.my_account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.controller.customer.CustomerController;

/**
 * 客户平台 - 我的账户：主页面
 * 
 * 创建时间：2016-8-25 上午10:35:40
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.my_account.mainController")
@RequestMapping("/customer/my_account/")
public class MainController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-25 上午10:38:18
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("main")
	public ModelAndView execute() {
		// 创建对象
		ModelAndView mav = new ModelAndView();
		// 设置视图名称
		mav.setViewName("customer/my_account/main");
		// 返回函数值
		return mav;
	}

}
