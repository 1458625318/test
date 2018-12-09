package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 帐号表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 362
 */
public class SysUser implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:user_name 描述:用户帐号
	protected String userName = null;

	// 数据库表字段:password 描述:登录密码
	protected String password = null;

	// 数据库表字段:true_name 描述:真实姓名
	protected String trueName = null;

	// 数据库表字段:email 描述:邮箱
	protected String email = null;

	// 数据库表字段:mobile 描述:手机
	protected String mobile = null;

	// 数据库表字段:enable 描述:是否激活（0-否 1-是）
	protected Integer enable = null;

	// 数据库表字段:user_type 描述:帐号类型（客户帐号、员工帐号、webservice接口帐号）
	protected String userType = null;

	// 数据库表字段:prior_login_time 描述:前一次登录时间
	protected Date priorLoginTime = null;

	// 数据库表字段:last_login_time 描述:最后一次登录时间
	protected Date lastLoginTime = null;

	// 数据库表字段:total_login 描述:登录次数
	protected Integer totalLogin = null;

	// 数据库表字段:create_time 描述:创建时间
	protected Date createTime = null;

	// 数据库表字段:remark 描述:备注
	protected String remark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 362
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 362
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 用户帐号  get方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 用户帐号  set方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public void setUserName(String username) {
		this.userName = username;
	}

	/**
	 * 登录密码  get方法
	 * 数据库表字段：password
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 登录密码  set方法
	 * 数据库表字段：password
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 真实姓名  get方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 真实姓名  set方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public void setTrueName(String truename) {
		this.trueName = truename;
	}

	/**
	 * 邮箱  get方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 邮箱  set方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 363
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 手机  get方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 手机  set方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 是否激活（0-否 1-是）  get方法
	 * 数据库表字段：enable
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public Integer getEnable() {
		return enable;
	}

	/**
	 * 是否激活（0-否 1-是）  set方法
	 * 数据库表字段：enable
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	/**
	 * 帐号类型（客户帐号、员工帐号、webservice接口帐号）  get方法
	 * 数据库表字段：user_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * 帐号类型（客户帐号、员工帐号、webservice接口帐号）  set方法
	 * 数据库表字段：user_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public void setUserType(String usertype) {
		this.userType = usertype;
	}

	/**
	 * 前一次登录时间  get方法
	 * 数据库表字段：prior_login_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public Date getPriorLoginTime() {
		return priorLoginTime;
	}

	/**
	 * 前一次登录时间  set方法
	 * 数据库表字段：prior_login_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public void setPriorLoginTime(Date priorlogintime) {
		this.priorLoginTime = priorlogintime;
	}

	/**
	 * 最后一次登录时间  get方法
	 * 数据库表字段：last_login_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 364
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * 最后一次登录时间  set方法
	 * 数据库表字段：last_login_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public void setLastLoginTime(Date lastlogintime) {
		this.lastLoginTime = lastlogintime;
	}

	/**
	 * 登录次数  get方法
	 * 数据库表字段：total_login
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public Integer getTotalLogin() {
		return totalLogin;
	}

	/**
	 * 登录次数  set方法
	 * 数据库表字段：total_login
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public void setTotalLogin(Integer totallogin) {
		this.totalLogin = totallogin;
	}

	/**
	 * 创建时间  get方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间  set方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public void setCreateTime(Date createtime) {
		this.createTime = createtime;
	}

	/**
	 * 备注  get方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注  set方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 365
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}