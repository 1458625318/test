/**
 * 
 * 
 * 创建时间：2016-10-20 上午9:56:51
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.jbit.webbs.dao.BaseDao;
import cn.jbit.webbs.dao.PortalDao;
import cn.jbit.webbs.dao.WebBookStoreBaseDao;

/**
 * 门户平台
 * 
 * 创建时间：2016-10-20 上午9:56:51
 * 
 * @author moshco zhu
 * 
 */
@Service("portalService")
public class PortalServiceImpl implements PortalService {

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseDao")
	protected BaseDao baseDao = null;

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("webBookStoreBaseDao")
	protected WebBookStoreBaseDao webBookStoreBaseDao = null;

	// 门户平台
	@Autowired
	@Qualifier("portalDao")
	protected PortalDao portalDao = null;

}
