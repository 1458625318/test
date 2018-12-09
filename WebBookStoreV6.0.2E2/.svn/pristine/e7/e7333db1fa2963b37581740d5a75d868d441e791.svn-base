/**
 * 
 * 
 * 创建时间：2016-11-22 下午3:20:32
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.io.Serializable;
import java.util.Map;

import cn.jbit.webbs.entity.Announcement;
import cn.jbit.webbs.entity.LeaveMessage;

/**
 * 公共业务（业务有关）
 * 
 * 创建时间：2016-11-22 下午3:20:32
 * 
 * @author moshco zhu
 * 
 */
public interface WebBookStoreBaseService extends Serializable {

	// 保存留言
	void saveLeaveMessage(LeaveMessage leaveMessage);

	// 更新留言
	void updateLeaveMessage(LeaveMessage leaveMessage);

	// 找寻留言
	LeaveMessage findLeaveMessage(Integer leaveMessageId);

	// 找寻通告记录
	Announcement findAnnouncement(Map<String, Object> queryParamMap);

}
