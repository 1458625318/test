/**
 * 
 * 
 * 创建时间：2016-11-22 下午3:25:29
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.LeaveMessage;
import cn.jbit.webbs.service.WebBookStoreBaseService;

/**
 * hello world
 * 
 * 创建时间：2016-11-22 下午3:25:29
 * 
 * @author moshco zhu
 * 
 */
@Controller("sayHelloController")
@RequestMapping("/")
public class SayHelloController implements Serializable {

	@Autowired
	@Qualifier("webBookStoreBaseService")
	protected WebBookStoreBaseService webBookStoreBaseService = null;

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-11-22 下午3:27:02
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("sayHello")
	public ModelAndView execute(@RequestParam("trueName") String trueName) {

		// 消息
		String message = "你好" + trueName + "！";

		// 创建消息
		LeaveMessage lMessage = new LeaveMessage();
		lMessage.setTitle(message);
		lMessage.setSort("其它");
		lMessage.setSubmitTime(new Date());

		// 保存数据
		webBookStoreBaseService.saveLeaveMessage(lMessage);

		// 找寻记录
		lMessage = webBookStoreBaseService.findLeaveMessage(lMessage.getId());

		// 修改
		lMessage.setSort("评价");
		// 更新数据
		webBookStoreBaseService.updateLeaveMessage(lMessage);

		// 创建模型视图对象
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", message);
		mav.setViewName("say_hello");

		// 返回函数值
		return mav;
	}

}
