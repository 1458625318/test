/**
 * 
 * 
 * 创建时间：2016-8-23 下午7:19:51
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.controller.customer.CustomerController;

/**
 * 客户平台 - 主页：主页面
 * 
 * 创建时间：2016-8-23 下午7:19:51
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.home.mainController")
@RequestMapping("/customer/home/")
public class MainController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 下午7:20:52
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("main")
	public ModelAndView execute() {

		// 创建对象
		ModelAndView mav = new ModelAndView();
		// 设置视图
		mav.setViewName("customer/home/main");

		// 返回函数值
		return mav;
	}

}
