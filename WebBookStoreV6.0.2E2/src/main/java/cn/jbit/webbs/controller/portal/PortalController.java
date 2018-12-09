/**
 * 
 * 
 * 创建时间：2016-10-20 上午10:09:01
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jbit.webbs.controller.WebBookStoreBaseController;
import cn.jbit.webbs.service.PortalService;

/**
 * 门户平台业务
 * 
 * 创建时间：2016-10-20 上午10:09:01
 * 
 * @author moshco zhu
 * 
 */
public abstract class PortalController extends WebBookStoreBaseController {

	@Autowired
	@Qualifier("portalService")
	protected PortalService portalService = null;

}
