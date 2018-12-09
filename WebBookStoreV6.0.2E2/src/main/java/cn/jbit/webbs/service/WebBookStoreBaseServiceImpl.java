/**
 * 
 * 
 * 创建时间：2016-11-22 下午3:21:35
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.jbit.webbs.dao.BaseDao;
import cn.jbit.webbs.dao.WebBookStoreBaseDao;
import cn.jbit.webbs.entity.Announcement;
import cn.jbit.webbs.entity.LeaveMessage;

/**
 * 公共业务（业务有关）
 * 
 * 创建时间：2016-11-22 下午3:21:35
 * 
 * @author moshco zhu
 * 
 */
@Service("webBookStoreBaseService")
public class WebBookStoreBaseServiceImpl implements WebBookStoreBaseService {

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseDao")
	protected BaseDao baseDao = null;

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("webBookStoreBaseDao")
	protected WebBookStoreBaseDao webBookStoreBaseDao = null;

	/**
	 * 保存留言
	 * 
	 * 
	 * 开发时间：2016-11-22 下午4:44:28
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveLeaveMessage(LeaveMessage leaveMessage) {
		webBookStoreBaseDao.saveLeaveMessage(leaveMessage);
	}

	/**
	 * 更新留言
	 * 
	 * 
	 * 开发时间：2016-11-22 下午4:44:37
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateLeaveMessage(LeaveMessage leaveMessage) {
		webBookStoreBaseDao.updateLeaveMessage(leaveMessage);
	}

	/**
	 * 找寻留言
	 * 
	 * 
	 * 开发时间：2016-11-22 下午4:44:46
	 * 
	 * @author：moshco zhu
	 * @param leaveMessageId
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public LeaveMessage findLeaveMessage(Integer leaveMessageId) {
		return webBookStoreBaseDao.findLeaveMessage(leaveMessageId);
	}

	/**
	 * 找寻通告记录
	 * 
	 * 
	 * 开发时间：2017年7月7日 下午5:16:21
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public Announcement findAnnouncement(Map<String, Object> queryParamMap) {
		return webBookStoreBaseDao.findAnnouncement2(queryParamMap);
	}

}
