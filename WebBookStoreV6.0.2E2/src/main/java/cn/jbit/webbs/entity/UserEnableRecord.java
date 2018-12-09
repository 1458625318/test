package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 帐号激活表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 632
 */
public class UserEnableRecord implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:user_id 描述:帐户id
	protected Integer userId = null;

	// 数据库表字段:user_name 描述:用户帐号（手机或邮箱）
	protected String userName = null;

	// 数据库表字段:true_name 描述:真实姓名
	protected String trueName = null;

	// 数据库表字段:email 描述:邮箱
	protected String email = null;

	// 数据库表字段:mobile 描述:手机
	protected String mobile = null;

	// 数据库表字段:enable_type 描述:激活类型（帐号、手机、邮箱）
	protected String enableType = null;

	// 数据库表字段:code 描述:激活码（手机激活码：6位 有激活码：64）
	protected String code = null;

	// 数据库表字段:is_enable 描述:是否激活（0-未激活 1-已激活）
	protected Integer isEnable = null;

	// 数据库表字段:enable_time 描述:激活时间
	protected Date enableTime = null;

	// 数据库表字段:lose_time 描述:失效时间
	protected Date loseTime = null;

	// 数据库表字段:create_time 描述:创建时间
	protected Date createTime = null;

	// 数据库表字段:is_valid 描述:是否有效记录（0-无效 1-有效）
	protected Integer isValid = null;

	// 数据库表字段:invalid_date 描述:删除时间
	protected Date invalidDate = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 帐户id  get方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 帐户id  set方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public void setUserId(Integer userid) {
		this.userId = userid;
	}

	/**
	 * 用户帐号（手机或邮箱）  get方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 用户帐号（手机或邮箱）  set方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public void setUserName(String username) {
		this.userName = username;
	}

	/**
	 * 真实姓名  get方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 632
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 真实姓名  set方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public void setTrueName(String truename) {
		this.trueName = truename;
	}

	/**
	 * 邮箱  get方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 邮箱  set方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 手机  get方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 手机  set方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 激活类型（帐号、手机、邮箱）  get方法
	 * 数据库表字段：enable_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public String getEnableType() {
		return enableType;
	}

	/**
	 * 激活类型（帐号、手机、邮箱）  set方法
	 * 数据库表字段：enable_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public void setEnableType(String enabletype) {
		this.enableType = enabletype;
	}

	/**
	 * 激活码（手机激活码：6位 有激活码：64）  get方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 激活码（手机激活码：6位 有激活码：64）  set方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 是否激活（0-未激活 1-已激活）  get方法
	 * 数据库表字段：is_enable
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 633
	 */
	public Integer getIsEnable() {
		return isEnable;
	}

	/**
	 * 是否激活（0-未激活 1-已激活）  set方法
	 * 数据库表字段：is_enable
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public void setIsEnable(Integer isenable) {
		this.isEnable = isenable;
	}

	/**
	 * 激活时间  get方法
	 * 数据库表字段：enable_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public Date getEnableTime() {
		return enableTime;
	}

	/**
	 * 激活时间  set方法
	 * 数据库表字段：enable_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public void setEnableTime(Date enabletime) {
		this.enableTime = enabletime;
	}

	/**
	 * 失效时间  get方法
	 * 数据库表字段：lose_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public Date getLoseTime() {
		return loseTime;
	}

	/**
	 * 失效时间  set方法
	 * 数据库表字段：lose_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public void setLoseTime(Date losetime) {
		this.loseTime = losetime;
	}

	/**
	 * 创建时间  get方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间  set方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public void setCreateTime(Date createtime) {
		this.createTime = createtime;
	}

	/**
	 * 是否有效记录（0-无效 1-有效）  get方法
	 * 数据库表字段：is_valid
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public Integer getIsValid() {
		return isValid;
	}

	/**
	 * 是否有效记录（0-无效 1-有效）  set方法
	 * 数据库表字段：is_valid
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public void setIsValid(Integer isvalid) {
		this.isValid = isvalid;
	}

	/**
	 * 删除时间  get方法
	 * 数据库表字段：invalid_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 634
	 */
	public Date getInvalidDate() {
		return invalidDate;
	}

	/**
	 * 删除时间  set方法
	 * 数据库表字段：invalid_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 635
	 */
	public void setInvalidDate(Date invaliddate) {
		this.invalidDate = invaliddate;
	}

}