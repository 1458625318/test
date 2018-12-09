/**
 * 
 * 
 * 创建时间：2016-8-25 下午12:04:48
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.my_account.account;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.mhpay.entity.UserAccount;
import cn.jbit.webbs.controller.customer.CustomerController;
import cn.jbit.webbs.entity.Customer;

/**
 * 客户平台 - 我的账户 - 账户：显示账户信息
 * 
 * 创建时间：2016-8-25 下午12:04:48
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.my_account.account.showController")
@RequestMapping("/customer/my_account/account/")
public class ShowController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-25 下午12:05:58
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 */
	@RequestMapping("show")
	public ModelAndView execute(HttpServletRequest request) {

		// 获取当前登录的客户对象
		Customer currentCustomer = getCurrentCustomer(request);

		// 账户记录
		UserAccount userAccount = null;
		try {
			// 找寻账户记录
			userAccount = payWService.findUserAccount(currentCustomer
					.getAccountId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 创建对象
		ModelAndView mav = new ModelAndView();
		// 保存客户数据
		mav.addObject("customer", currentCustomer);
		// 保存账户数据
		mav.addObject("userAccount", userAccount);
		// 设置视图名称
		mav.setViewName("customer/my_account/account/show");

		// 返回函数值
		return mav;
	}

}
