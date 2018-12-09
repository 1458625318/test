/**
 * 
 * 
 * 创建时间：2017年7月7日 下午5:54:08
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin.maintain.announcement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.controller.admin.AdminController;

/**
 * 管理平台 - 网站维护 - 系统公告：主页面
 * 
 * 创建时间：2017年7月7日 下午5:54:08
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.maintain.announcement.mainController")
@RequestMapping("/admin/maintain/announcement/")
public class MainController extends AdminController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2017年7月7日 下午5:55:14
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("main")
	public ModelAndView execute() {

		// 模型视图对象
		ModelAndView mav = null;
		try {

			// 创建模型视图
			mav = new ModelAndView();
			// 设置视图名称
			mav.setViewName("admin/maintain/announcement/main");

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 返回函数的值
		return mav;

	}

}
