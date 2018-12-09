/**
 * 
 * 
 * 创建时间：2016-8-23 上午11:04:18
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.Employee;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.service.BaseService;

/**
 * 管理平台：验证登录
 * 
 * 创建时间：2016-8-23 上午11:04:18
 * 
 * @author moshco zhu
 * 
 */
@Component("admin.verifyLoginInterceptor")
public class VerifyLoginInterceptor implements HandlerInterceptor {

	// 日志对象
	private final static Logger logger = Logger.getLogger(VerifyLoginInterceptor.class);

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseService")
	protected BaseService baseService = null;

	/**
	 * 在运行Controller的业务方法前运行
	 * 
	 * 开发时间：2016-8-23 上午11:04:18
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

		logger.info("安全验证拦截器的preHandle方法在运行......");

		// 转换为HandlerMethod类型
		HandlerMethod handleMethod = (HandlerMethod) obj;

		// 登录和注销功能不需要验证
		Class<?> clsController = handleMethod.getBeanType();// 获取当前运行的Controller的Class
		if (clsController.isAssignableFrom(LoginController.class)
				|| clsController.isAssignableFrom(LogoutController.class)
				|| clsController.isAssignableFrom(ShowAnnouncementController.class)) {
			// 直接放行
			return true;
		}

		// 验证结果
		boolean verifyResult = true;
		// 消息
		String message = null;

		// 验证登录标示
		Integer userId = null;
		if (verifyResult) {
			// 读取用户Id
			userId = (Integer) request.getSession().getAttribute("adminId");
			if (userId == null) {
				verifyResult = false;
				message = "请先登录";
			}
		}

		// 验证用户对象
		SysUser user = null;
		if (verifyResult) {
			// 存在用户对象
			user = baseService.find(SysUser.class, userId);
			if (user == null) {
				verifyResult = false;
				message = "无效的登录标示。";
			}
		}

		// 验证用户身份
		if (verifyResult) {
			if (!("员工帐号").equals(user.getUserType())) {
				verifyResult = false;
				message = "请使用员工帐号登录。";
			}
		}

		// 验证员工记录
		Employee employee = null;
		if (verifyResult) {
			// 找寻员工记录
			employee = baseService.find(Employee.class, "userId", user.getId());
			if (employee == null) {
				verifyResult = false;
				message = "不存在对应的员工记录（userId：" + user.getId() + "）。";
			}
		}

		// 验证不通过
		if (!verifyResult) {
			logger.info("登录验证不通过，原因是：\r\n" + message);
			// 保存消息
			request.setAttribute("message", message);
			// 转发到登录页面
			request.getRequestDispatcher("/html/admin/login_redirect.jsp").forward(request, response);
			// 返回函数值
			return false;
		}

		logger.info("登录验证通过。");

		// 保存员工对象
		request.setAttribute("currentEmployee", employee);
		// 保存用户对象
		request.setAttribute("currentUser", user);

		// 返回函数值
		return true;

	}

	/**
	 * 在Controller的业务方法运行完毕后运行
	 * 
	 * 开发时间：2016-8-23 上午11:04:18
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

		logger.info("安全验证拦截器的postHandle方法在运行......");

	}

	/**
	 * 请求结束前
	 * 
	 * 
	 * 开发时间：2016-8-23 上午11:04:18
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

		logger.info("安全验证拦截器的afterCompletion方法在运行......");

	}

}
