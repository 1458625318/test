/**
 * 
 * 
 * 创建时间：2016-10-20 上午10:07:20
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jbit.webbs.controller.WebBookStoreBaseController;
import cn.jbit.webbs.entity.Customer;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.service.CustomerService;

/**
 * 客户平台业务
 * 
 * 创建时间：2016-10-20 上午10:07:20
 * 
 * @author moshco zhu
 * 
 */
public abstract class CustomerController extends WebBookStoreBaseController {

	// 客户平台业务
	@Autowired
	@Qualifier("customerService")
	protected CustomerService customerService = null;

	/**
	 * 获取当前登录的客户对象
	 * 
	 * 
	 * 开发时间：2016-8-26 上午8:48:32
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 */
	protected Customer getCurrentCustomer(HttpServletRequest request) {
		Customer currentCustomer = (Customer) request.getAttribute("currentCustomer");
		return currentCustomer;
	}

	/**
	 * 获取当前登录的用户对象
	 * 
	 * 
	 * 开发时间：2016-8-27 下午2:11:22
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 */
	protected SysUser getCurrentUser(HttpServletRequest request) {
		SysUser currentUser = (SysUser) request.getAttribute("currentUser");
		return currentUser;
	}

}
