/**
 * 
 * 
 * 创建时间：2017年6月27日 下午1:41:25
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.entity.SysAuthority;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.service.AdminService;

/**
 * 管理平台：验证权限拦截器
 * 
 * 创建时间：2017年6月27日 下午1:41:25
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.verifyAuthorityInterceptor")
public class VerifyAuthorityInterceptor implements HandlerInterceptor {

	// 日志对象
	private final static Logger logger = Logger.getLogger(VerifyAuthorityInterceptor.class);

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("adminService")
	protected AdminService adminService = null;

	/**
	 * 在Controller运行前去运行
	 * 
	 * 开发时间：2017年6月27日 下午1:41:26
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param object
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

		logger.info("正在执行VerifyAuthorityInterceptor（权限验证）的preHandle......");

		logger.info("开始执行权下验证......");

		// HandlerMethod
		HandlerMethod handlerMethod = (HandlerMethod) object;

		// 读取Controller的实例对象
		AdminController controller = (AdminController) handlerMethod.getBean();
		// 读取Controller的权限码
		String authorityCode = controller.getAuthorityCode();

		// 不需要权限验证直接返回空值
		if (authorityCode == null) {
			return true;
		}

		// 获取当前登录的用户对象
		SysUser currentUser = (SysUser) request.getAttribute("currentUser");

		// 验证权限
		if (!verifyAuthority(currentUser, authorityCode)) {
			// 消息
			request.setAttribute("message", "没有权限运行这个程序。");
			// 获取请求类型
			String requestType = request.getHeader("X-Requested-With");
			logger.info("X-Requested-With" + requestType);
			if (requestType == null) {
				// 普通业务请求
				// 转发到没有权限的提示页面
				request.getRequestDispatcher("/html/admin/no_authority.jsp").forward(request, response);
			} else {
				// Ajax的请求
				// 转发到没有权限的提示页面
				request.getRequestDispatcher("/html/admin/no_authority_ajax.jsp").forward(request, response);
			}

			// 返回函数的值
			return false;
		}

		// 返回函数的值
		return true;
	}

	/**
	 * 验证用户权限
	 * 
	 * 
	 * 开发时间：2017年6月27日 下午2:38:35
	 * 
	 * @author：moshco zhu
	 * @param currentUser
	 * @param authorityCode
	 * @return
	 */
	protected boolean verifyAuthority(SysUser currentUser, String authorityCode) {
		// 查询参数集合
		Map<String, Object> queryParamMap = new HashMap<String, Object>();
		// 用户编号
		queryParamMap.put("userId", currentUser.getId());
		// 权限编码
		queryParamMap.put("authorityCode", authorityCode);
		// 找寻权限对象
		SysAuthority authority = adminService.findSysAuthority(queryParamMap);
		// 返回函数的值
		return (authority == null) ? false : true;
	}

	/**
	 * 在Controller之后视图之前运行
	 * 
	 * 开发时间：2017年6月27日 下午1:41:26
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param object
	 * @param mav
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mav)
			throws Exception {

		logger.info("正在执行VerifyAuthorityInterceptor（权限验证）的postHandle......");

	}

	/**
	 * 在请求结束前运行
	 * 
	 * 开发时间：2017年6月27日 下午1:41:26
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @param object
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex)
			throws Exception {

		logger.info("正在执行VerifyAuthorityInterceptor（权限验证）的afterCompletion......");

	}

}
