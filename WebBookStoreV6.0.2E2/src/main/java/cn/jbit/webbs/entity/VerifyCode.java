package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 验证码表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 614
 */
public class VerifyCode implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:code 描述:验证码
	protected String code = null;

	// 数据库表字段:sort 描述:验证码类型（掩码、手机验证码、邮箱验证码）
	protected String sort = null;

	// 数据库表字段:email 描述:邮箱
	protected String email = null;

	// 数据库表字段:mobile 描述:手机号
	protected String mobile = null;

	// 数据库表字段:session_id 描述:sessionId
	protected String sessionId = null;

	// 数据库表字段:customer_id 描述:客户表Id
	protected Integer customerId = null;

	// 数据库表字段:customer 描述:客户姓名
	protected String customer = null;

	// 数据库表字段:action_place 描述:验证码功能（客户登录、员工登录、注册、验证手机、验证邮箱）
	protected String actionPlace = null;

	// 数据库表字段:beging_time 描述:开始时间
	protected Date begingTime = null;

	// 数据库表字段:end_time 描述:结束时间
	protected Date endTime = null;

	// 数据库表字段:validate_length 描述:有效时长（分钟）
	protected Integer validateLength = null;

	// 数据库表字段:is_verify 描述:是否验证（0-否 1-是）
	protected Integer isVerify = null;

	// 数据库表字段:verify_time 描述:验证时间
	protected Date verifyTime = null;

	// 数据库表字段:create_time 描述:创建时间
	protected Date createTime = null;

	// 数据库表字段:remark 描述:备注
	protected String remark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 验证码  get方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 验证码  set方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 验证码类型（掩码、手机验证码、邮箱验证码）  get方法
	 * 数据库表字段：sort
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * 验证码类型（掩码、手机验证码、邮箱验证码）  set方法
	 * 数据库表字段：sort
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * 邮箱  get方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 615
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 邮箱  set方法
	 * 数据库表字段：email
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 手机号  get方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 手机号  set方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * sessionId  get方法
	 * 数据库表字段：session_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * sessionId  set方法
	 * 数据库表字段：session_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public void setSessionId(String sessionid) {
		this.sessionId = sessionid;
	}

	/**
	 * 客户表Id  get方法
	 * 数据库表字段：customer_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * 客户表Id  set方法
	 * 数据库表字段：customer_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public void setCustomerId(Integer customerid) {
		this.customerId = customerid;
	}

	/**
	 * 客户姓名  get方法
	 * 数据库表字段：customer
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * 客户姓名  set方法
	 * 数据库表字段：customer
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 616
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * 验证码功能（客户登录、员工登录、注册、验证手机、验证邮箱）  get方法
	 * 数据库表字段：action_place
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public String getActionPlace() {
		return actionPlace;
	}

	/**
	 * 验证码功能（客户登录、员工登录、注册、验证手机、验证邮箱）  set方法
	 * 数据库表字段：action_place
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public void setActionPlace(String actionplace) {
		this.actionPlace = actionplace;
	}

	/**
	 * 开始时间  get方法
	 * 数据库表字段：beging_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public Date getBegingTime() {
		return begingTime;
	}

	/**
	 * 开始时间  set方法
	 * 数据库表字段：beging_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public void setBegingTime(Date begingtime) {
		this.begingTime = begingtime;
	}

	/**
	 * 结束时间  get方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 结束时间  set方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public void setEndTime(Date endtime) {
		this.endTime = endtime;
	}

	/**
	 * 有效时长（分钟）  get方法
	 * 数据库表字段：validate_length
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public Integer getValidateLength() {
		return validateLength;
	}

	/**
	 * 有效时长（分钟）  set方法
	 * 数据库表字段：validate_length
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public void setValidateLength(Integer validatelength) {
		this.validateLength = validatelength;
	}

	/**
	 * 是否验证（0-否 1-是）  get方法
	 * 数据库表字段：is_verify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 617
	 */
	public Integer getIsVerify() {
		return isVerify;
	}

	/**
	 * 是否验证（0-否 1-是）  set方法
	 * 数据库表字段：is_verify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public void setIsVerify(Integer isverify) {
		this.isVerify = isverify;
	}

	/**
	 * 验证时间  get方法
	 * 数据库表字段：verify_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public Date getVerifyTime() {
		return verifyTime;
	}

	/**
	 * 验证时间  set方法
	 * 数据库表字段：verify_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public void setVerifyTime(Date verifytime) {
		this.verifyTime = verifytime;
	}

	/**
	 * 创建时间  get方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间  set方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public void setCreateTime(Date createtime) {
		this.createTime = createtime;
	}

	/**
	 * 备注  get方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注  set方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 618
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}