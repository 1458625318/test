/**
 * 
 * 
 * 创建时间：2016-8-23 下午7:39:10
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.controller.admin.AdminController;

/**
 * 管理平台 - 主页：主页面
 * 
 * 创建时间：2016-8-23 下午7:39:10
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.home.mainController")
@RequestMapping("/admin/home/")
public class MainController extends AdminController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 下午7:40:10
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("main")
	public ModelAndView execute() {

		// 创建对象
		ModelAndView mav = new ModelAndView();
		// 设置视图名称
		mav.setViewName("admin/home/main");

		// 返回函数值
		return mav;
	}

}
