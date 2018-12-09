/**
 * 
 * 
 * 创建时间：2016-10-20 上午9:50:38
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.jbit.webbs.entity.SaleOrder;
import cn.jbit.webbs.entity.SysAuthority;
import cn.jbit.webbs.entity.SysMenuOption;
import cn.jbit.webbs.entity.SysUser;

/**
 * 管理平台业务
 * 
 * 创建时间：2016-10-20 上午9:50:38
 * 
 * @author moshco zhu
 * 
 */
public interface AdminService extends Serializable {

	// 查询用户有权限的菜单项对象记录
	List<SysMenuOption> querySysMenuOption(SysUser user);

	// 找寻权限对象
	SysAuthority findSysAuthority(Map<String, Object> queryParamMap);

	// 订单分页查询
	Object[] queryPaginationSaleOrder(Map<String, Object> queryParamMap, Integer pageIndex, Integer pageSize);

	// 统计订单明细
	Integer countSaleOrderDetail(SaleOrder saleOrder);

}
