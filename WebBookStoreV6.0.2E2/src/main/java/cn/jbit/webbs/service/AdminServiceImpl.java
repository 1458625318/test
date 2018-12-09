/**
 * 
 * 
 * 创建时间：2016-10-20 上午9:51:03
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jbit.webbs.dao.AdminDao;
import cn.jbit.webbs.dao.BaseDao;
import cn.jbit.webbs.dao.WebBookStoreBaseDao;
import cn.jbit.webbs.entity.SaleOrder;
import cn.jbit.webbs.entity.SysAuthority;
import cn.jbit.webbs.entity.SysMenuOption;
import cn.jbit.webbs.entity.SysUser;

/**
 * 管理平台业务
 * 
 * 创建时间：2016-10-20 上午9:51:03
 * 
 * @author moshco zhu
 * 
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseDao")
	protected BaseDao baseDao = null;

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("webBookStoreBaseDao")
	protected WebBookStoreBaseDao webBookStoreBaseDao = null;

	// 管理平台业务
	@Autowired
	@Qualifier("adminDao")
	protected AdminDao adminDao = null;

	/**
	 * 查询用户有权限的菜单项对象记录
	 * 
	 * 
	 * 开发时间：2016-4-29 下午12:08:09
	 * 
	 * @author：moshco zhu
	 * @param user
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public List<SysMenuOption> querySysMenuOption(SysUser user) {
		return adminDao.querySysMenuOption(user);
	}

	/**
	 * 找寻权限对象
	 * 
	 * 
	 * 开发时间：2017年6月27日 下午2:45:17
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public SysAuthority findSysAuthority(Map<String, Object> queryParamMap) {
		return adminDao.findSysAuthority(queryParamMap);
	}

	/**
	 * 订单分页查询
	 * 
	 * 
	 * 开发时间：2017年6月30日 下午5:10:24
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public Object[] queryPaginationSaleOrder(Map<String, Object> queryParamMap, Integer pageIndex, Integer pageSize) {

		// 统计总记录数
		Integer totalRecord = adminDao.queryPaginationSaleOrderCount(queryParamMap);

		// 起始记录序号
		queryParamMap.put("beginIndex", (pageIndex - 1) * pageSize);
		// 页面尺寸
		queryParamMap.put("pageSize", pageSize);
		// 查询当前页列表
		List<SaleOrder> saleOrderList = adminDao.queryPaginationSaleOrderList(queryParamMap);
		// 删除
		queryParamMap.remove("beginIndex");
		queryParamMap.remove("pageSize");

		// 封装查询结果
		Object[] pagination = new Object[] { totalRecord, saleOrderList };

		// 返回函数的值
		return pagination;
	}

	/**
	 * 统计订单明细
	 * 
	 * 
	 * 开发时间：2017年6月30日 下午5:10:41
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public Integer countSaleOrderDetail(SaleOrder saleOrder) {
		return adminDao.countSaleOrderDetail(saleOrder);
	}

}
