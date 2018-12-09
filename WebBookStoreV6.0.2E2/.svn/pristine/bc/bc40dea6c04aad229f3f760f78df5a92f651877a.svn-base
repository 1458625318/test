/**
 * 
 * 
 * 创建时间：2016-10-20 上午8:38:29
 * @author：moshco zhu
 */
package cn.jbit.webbs.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.jbit.webbs.entity.SaleOrder;
import cn.jbit.webbs.entity.SysAuthority;
import cn.jbit.webbs.entity.SysMenuOption;
import cn.jbit.webbs.entity.SysUser;

/**
 * 管理平台业务
 * 
 * 创建时间：2016-10-20 上午8:38:29
 * 
 * @author moshco zhu
 * 
 */
@Repository
public interface AdminDao extends Serializable {

	/**
	 * 找寻权限对象
	 * 
	 * 
	 * 开发时间：2017年6月27日 下午2:47:18
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	public SysAuthority findSysAuthority(Map<String, Object> queryParamMap);

	/**
	 * 查询用户有权限的菜单项对象的记录
	 * 
	 * 
	 * 开发时间：2017年6月28日 下午6:19:46
	 * 
	 * @author：moshco zhu
	 * @param user
	 * @return
	 */
	public List<SysMenuOption> querySysMenuOption(SysUser user);

	/**
	 * 订单分页查询 统计总记录数
	 * 
	 * 
	 * 开发时间：2017年6月30日 下午5:23:17
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	public Integer queryPaginationSaleOrderCount(Map<String, Object> queryParamMap);

	/**
	 * 订单分页查询 当前页的列表
	 * 
	 * 
	 * 开发时间：2017年6月30日 下午5:23:29
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	public List<SaleOrder> queryPaginationSaleOrderList(Map<String, Object> queryParamMap);

	/**
	 * 统计订单明细
	 * 
	 * 
	 * 开发时间：2017年6月30日 下午5:23:02
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 * @return
	 */
	public Integer countSaleOrderDetail(SaleOrder saleOrder);

}
