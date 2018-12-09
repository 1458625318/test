package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 用户组和角色之间的关系表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 540
 */
public class SysUserGroupRole implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:user_group_id 描述:用户组Id
	protected Integer userGroupId = null;

	// 数据库表字段:role_id 描述:角色Id
	protected Integer roleId = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 540
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 540
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 用户组Id  get方法
	 * 数据库表字段：user_group_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 540
	 */
	public Integer getUserGroupId() {
		return userGroupId;
	}

	/**
	 * 用户组Id  set方法
	 * 数据库表字段：user_group_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 541
	 */
	public void setUserGroupId(Integer usergroupid) {
		this.userGroupId = usergroupid;
	}

	/**
	 * 角色Id  get方法
	 * 数据库表字段：role_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 541
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * 角色Id  set方法
	 * 数据库表字段：role_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 541
	 */
	public void setRoleId(Integer roleid) {
		this.roleId = roleid;
	}

}