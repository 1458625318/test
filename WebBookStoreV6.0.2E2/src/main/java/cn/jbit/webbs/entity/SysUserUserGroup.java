package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 用户和用户组之间关系表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 521
 */
public class SysUserUserGroup implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:user_id 描述:用户Id
	protected Integer userId = null;

	// 数据库表字段:user_group_id 描述:用户组Id
	protected Integer userGroupId = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 521
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 521
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 用户Id  get方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 522
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 用户Id  set方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 522
	 */
	public void setUserId(Integer userid) {
		this.userId = userid;
	}

	/**
	 * 用户组Id  get方法
	 * 数据库表字段：user_group_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 522
	 */
	public Integer getUserGroupId() {
		return userGroupId;
	}

	/**
	 * 用户组Id  set方法
	 * 数据库表字段：user_group_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 522
	 */
	public void setUserGroupId(Integer usergroupid) {
		this.userGroupId = usergroupid;
	}

}