/**
 * 
 * 
 * 创建时间：2017年7月7日 下午4:50:20
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.Announcement;

/**
 * 客户平台：显示当前的公告
 * 
 * 创建时间：2017年7月7日 下午4:50:20
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.showAnnouncementController")
@RequestMapping("/customer/")
public class ShowAnnouncementController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2017年7月7日 下午4:52:22
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("showAnnouncement")
	public ModelAndView execute() {

		// 模型视图对象
		ModelAndView mav = null;
		try {

			// 当前日期
			Date currentDate = new Date();

			// 找寻当前日期的通告
			Announcement announcement = findAnnouncement(currentDate);

			// 创建模型视图对象
			mav = new ModelAndView();
			// 保存数据
			mav.addObject("announcement", announcement);
			// 设置视图名称
			mav.setViewName("customer/announcement");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 返回函数的值
		return mav;

	}

}
