/**
 * 
 * 
 * 创建时间：2016-10-20 上午9:54:16
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.jbit.webbs.dao.BaseDao;
import cn.jbit.webbs.dao.CustomerDao;
import cn.jbit.webbs.dao.WebBookStoreBaseDao;

/**
 * 客户平台业务
 * 
 * 创建时间：2016-10-20 上午9:54:16
 * 
 * @author moshco zhu
 * 
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseDao")
	protected BaseDao baseDao = null;

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("webBookStoreBaseDao")
	protected WebBookStoreBaseDao webBookStoreBaseDao = null;

	// 客户平台业务
	@Autowired
	@Qualifier("customerDao")
	protected CustomerDao customerDao = null;

}
