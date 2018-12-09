/**
 * 
 * 
 * 创建时间：2016-8-23 下午7:03:55
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.Customer;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.service.BaseService;

/**
 * 客户平台：安全验证
 * 
 * 创建时间：2016-8-23 下午7:03:55
 * 
 * @author moshco zhu
 * 
 */
@Component("customer.verifyLoginInterceptor")
public class VerifyLoginInterceptor implements HandlerInterceptor {

	// 日志对象
	private final static Logger logger = Logger.getLogger(VerifyLoginInterceptor.class);

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseService")
	protected BaseService baseService = null;

	/**
	 * 在Controller运行前运行
	 * 
	 * 开发时间：2016-8-23 下午7:03:55
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {

		logger.info("正在运行客户平台安全验证的业务方法preHandle......");

		// 类型转换
		HandlerMethod handlerMethod = (HandlerMethod) obj;

		// 获取Controller的类型
		Class<?> controllerClass = handlerMethod.getBeanType();
		if (controllerClass.isAssignableFrom(LoginController.class)
				|| controllerClass.isAssignableFrom(LogoutController.class)
				|| controllerClass.isAssignableFrom(ShowAnnouncementController.class)) {
			// 登录、注销、注册、显示公告功能不需要安全验证
			return true;
		}

		// 验证结果
		boolean verifyResult = true;
		// 消息
		String message = null;

		// 验证登录标示
		Integer userId = null;
		if (verifyResult) {
			// session对象
			HttpSession session = request.getSession();
			// 读取登录标示
			userId = (Integer) session.getAttribute("customerId");
			if (userId == null) {
				verifyResult = false;
				message = "请先登录。";
			}
		}

		// 验证登录标示有效性
		SysUser user = null;
		if (verifyResult) {
			// 找寻用户对象
			user = baseService.find(SysUser.class, userId);
			if (user == null) {
				verifyResult = false;
				message = "无效的登录标示。";
			}
		}

		// 验证身份
		if (verifyResult) {
			if (!"客户帐号".equals(user.getUserType())) {
				verifyResult = false;
				message = "请使用身份为[客户帐号]的帐号登录系统。";
			}
		}

		// 验证客户记录
		Customer customer = null;
		if (verifyResult) {
			// 找寻客户记录
			customer = baseService.find(Customer.class, "userId", user.getId());
			if (customer == null) {
				verifyResult = false;
				message = "不存在对应的客户记录（userId：" + user.getId() + "）。";
			}
		}

		// 验证不通过
		if (!verifyResult) {
			logger.info("登录验证不通过，原因是：\r\n" + message);
			// 保存消息
			request.setAttribute("message", message);
			// 转发到登录页面
			request.getRequestDispatcher("/html/customer/login.jsp").forward(request, response);
			// 返回函数值
			return false;
		}

		logger.info("登录验证通过。");

		// 保存客户对象
		request.setAttribute("currentCustomer", customer);
		// 保存用户对象
		request.setAttribute("currentUser", user);

		// 返回函数值
		return true;

	}

	/**
	 * 在Controller业务方法运行后，视图运行前运行
	 * 
	 * 开发时间：2016-8-23 下午7:03:55
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param obj
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex)
			throws Exception {

		logger.info("正在运行客户平台安全验证的业务方法afterCompletion......");

	}

	/**
	 * 在Controller结束运行前运行
	 * 
	 * 开发时间：2016-8-23 下午7:03:55
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param obj
	 * @param mav
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav)
			throws Exception {

		logger.info("正在运行客户平台安全验证的业务方法postHandle......");

	}

}
