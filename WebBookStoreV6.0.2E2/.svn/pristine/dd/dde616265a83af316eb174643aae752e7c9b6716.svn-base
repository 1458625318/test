/**
 * 
 * 
 * 创建时间：2016-10-20 上午10:05:28
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jbit.webbs.controller.WebBookStoreBaseController;
import cn.jbit.webbs.entity.Employee;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.service.AdminService;

/**
 * 管理平台业务
 * 
 * 创建时间：2016-10-20 上午10:05:28
 * 
 * @author moshco zhu
 * 
 */
public abstract class AdminController extends WebBookStoreBaseController {

	// 管理平台业务
	@Autowired
	@Qualifier("adminService")
	protected AdminService adminService = null;

	/**
	 * 获取当前登录的员工对象
	 * 
	 * 
	 * 开发时间：2016-8-26 上午9:03:24
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 */
	protected Employee getCurrentEmployee(HttpServletRequest request) {
		Employee currentEmployee = (Employee) request.getAttribute("currentEmployee");
		return currentEmployee;
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

	/**
	 * 读取权限编码
	 * 
	 * 
	 * 开发时间：2017年6月27日 下午2:01:12
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthorityCode() {
		return null;
	}

}
