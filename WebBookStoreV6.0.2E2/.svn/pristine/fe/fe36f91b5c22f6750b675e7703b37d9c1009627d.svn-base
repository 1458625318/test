/**
 * 
 * 
 * 创建时间：2016-8-23 下午7:51:48
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin.home;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jbit.webbs.controller.admin.AdminController;
import cn.jbit.webbs.entity.SysMenuOption;
import cn.jbit.webbs.entity.SysUser;

/**
 * 管理平台 - 主页：获取用户有权限的菜单
 * 
 * 创建时间：2016-8-23 下午7:51:48
 * 
 * @author moshco zhu
 * 
 */
@Controller("admin.home.getMenuOptionTreeController")
@RequestMapping("/admin/home/")
public class GetMenuOptionTreeController extends AdminController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-23 下午7:54:15
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 */
	@RequestMapping("getMenuOptionTree")
	@ResponseBody
	public List<Option> execute(HttpServletRequest request) {

		// 获取当前登录用户的对象
		SysUser currentUser = (SysUser) request.getAttribute("currentUser");
		// 查询用户有权限的菜单项对象记录
		List<SysMenuOption> allMenuOptionList = adminService
				.querySysMenuOption(currentUser);

		// 顶级节点列表
		List<Option> topOptionList = null;
		if (allMenuOptionList != null && allMenuOptionList.size() > 0) {

			// 创建列表对象
			topOptionList = new ArrayList<Option>();
			for (int i = 0; i < allMenuOptionList.size();) {
				// 读取菜单项记录
				SysMenuOption sysMenuOption = allMenuOptionList.get(i);
				if (sysMenuOption.getSuperId() == null
						|| sysMenuOption.getSuperId() <= 0) {
					// 构建节点
					Option option = new Option(sysMenuOption);
					// 加入到列表中
					topOptionList.add(option);
					// 删除记录
					allMenuOptionList.remove(i);
				} else {
					// 下一条记录
					i++;
				}
			}

			// 构建顶级节点的菜单树
			if (topOptionList.size() > 0) {
				for (int i = 0; i < topOptionList.size();) {
					// 菜单项记录如果为空，则不用继续构建
					if (allMenuOptionList.size() <= 0) {
						topOptionList.remove(i);
						continue;
					}
					// 读取一个顶级节点
					Option topOption = topOptionList.get(i);
					// 默认设置为关闭
					topOption.setState("closed");
					// 构建菜单节点的子菜单列表树
					List<Option> childrenOptionList = buildChildrenOptionList(
							topOption, allMenuOptionList);
					if (childrenOptionList != null
							&& childrenOptionList.size() > 0) {
						// 设置为子菜单树
						topOption.setChildren(childrenOptionList);
						i++;
					} else {
						topOptionList.remove(i);
					}
				}
			}
		}

		// 用户有权限的菜单项树
		List<Option> userMenuOptionList = new ArrayList<Option>();
		// 唯一的根节点
		Option rootOption = new Option();
		// 记录编号
		rootOption.setId(0);
		// 标题
		rootOption.setText("系统菜单项");
		// 子节点列表
		rootOption.setChildren(topOptionList);
		// 加入到列表中
		userMenuOptionList.add(rootOption);

		// 返回函数值
		return userMenuOptionList;
	}

	/**
	 * 构建菜单节点的子菜单列表树
	 * 
	 * 
	 * 开发时间：2016-8-23 下午7:56:32
	 * 
	 * @author：moshco zhu
	 * @param option
	 * @param allMenuOptionList
	 * @return
	 */
	protected List<Option> buildChildrenOptionList(Option option,
			List<SysMenuOption> allMenuOptionList) {

		// 菜单项纪录不能为空
		if (allMenuOptionList == null || allMenuOptionList.size() <= 0) {
			return null;
		}

		// 下级节点列表（不包含子节点树）
		List<Option> childrenOptionList = null;
		for (int i = 0; i < allMenuOptionList.size();) {
			// 读取菜单项记录
			SysMenuOption sysMenuOption = allMenuOptionList.get(i);
			if (sysMenuOption.getSuperId() != null
					&& sysMenuOption.getSuperId().intValue() == option.getId()) {
				// 删除记录
				allMenuOptionList.remove(i);

				// 创建菜单项记录
				Option childrenOption = new Option(sysMenuOption);

				// 加入到列表中
				if (childrenOptionList == null) {
					childrenOptionList = new ArrayList<Option>();
				}
				childrenOptionList.add(childrenOption);
			} else {
				i++;
			}
		}

		// 子节点为空，则返回
		if (childrenOptionList == null) {
			return null;
		}

		// 构建子节点的菜单树
		for (int i = 0; i < childrenOptionList.size(); i++) {
			// 子节点
			Option childrenOption = childrenOptionList.get(i);
			// 构建下级节点树
			List<Option> nextOptionList = buildChildrenOptionList(
					childrenOption, allMenuOptionList);
			// 设置为子节点列表
			if (nextOptionList != null && nextOptionList.size() > 0) {
				childrenOption.setChildren(nextOptionList);
			}
		}

		// 返回函数值
		return childrenOptionList;
	}

}
