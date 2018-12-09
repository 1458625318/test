package cn.jbit.mhpay.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易记录 创建时间：2016-10-15 14:59:25
 *
 * @author moshco zhu
 *
 */
public class TradeRecord implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	protected Integer id = null;

	// 对应数据库字段：project_id 字段描述：项目id
	protected Integer projectId = null;

	// 对应数据库字段：project_code 字段描述：项目编码
	protected String projectCode = null;

	// 对应数据库字段：project 字段描述：项目名
	protected String project = null;

	// 对应数据库字段：user_id 字段描述：帐号Id
	protected Integer userId = null;

	// 对应数据库字段：customer_id 字段描述：客户Id
	protected Integer customerId = null;

	// 对应数据库字段：account_id 字段描述：账户Id
	protected Integer accountId = null;

	// 对应数据库字段：user_name 字段描述：账户名（用户帐号）
	protected String userName = null;

	// 对应数据库字段：true_name 字段描述：真实姓名
	protected String trueName = null;

	// 对应数据库字段：business_code 字段描述：业务编码
	protected String businessCode = null;

	// 对应数据库字段：business 字段描述：业务
	protected String business = null;

	// 对应数据库字段：trade_type 字段描述：交易类型（用户充值、用户提现、购买商品）
	protected String tradeType = null;

	// 对应数据库字段：direction 字段描述：交易方向（0-出 1-入）
	protected Integer direction = null;

	// 对应数据库字段：mobile 字段描述：手机
	protected String mobile = null;

	// 对应数据库字段：before_money 字段描述：交易前余额
	protected String beforeMoney = null;

	// 对应数据库字段：trade_money 字段描述：交易金额
	protected String tradeMoney = null;

	// 对应数据库字段：after_money 字段描述：余额
	protected String afterMoney = null;

	// 对应数据库字段：target_man_id 字段描述：帐号Id（目标账户）
	protected Integer targetManId = null;

	// 对应数据库字段：target_man_account_id 字段描述：账户Id（目标账户）
	protected Integer targetManAccountId = null;

	// 对应数据库字段：target_man_user_name 字段描述：帐号（目标账户）

	protected String targetManUserName = null;

	// 对应数据库字段：target_man_mobile 字段描述：手机（目标账户）

	protected String targetManMobile = null;

	// 对应数据库字段：target_man 字段描述：真实姓名（目标账户）

	protected String targetMan = null;

	// 对应数据库字段：order_id 字段描述：订单Id

	protected Integer orderId = null;

	// 对应数据库字段：order_code 字段描述：订单号

	protected String orderCode = null;

	// 对应数据库字段：alipay_order_id 字段描述：支付宝订单记录Id

	protected Integer alipayOrderId = null;

	// 对应数据库字段：alipay_trade_code 字段描述：支付宝交易号

	protected String alipayTradeCode = null;

	// 对应数据库字段：remark 字段描述：备注

	protected String remark = null;

	// 对应数据库字段：trade_time 字段描述：交易时间
	protected Date tradeTime = null;

	// 对应数据库字段：check_man 字段描述：审核人
	protected String checkMan = null;

	// 对应数据库字段：check_time 字段描述：审核时间
	protected Date checkTime = null;

	// 对应数据库字段：check_status 字段描述：审核状态（未审核、未通过、已通过）
	protected String checkStatus = null;

	// 对应数据库字段：check_cotent 字段描述：审核意
	protected String checkCotent = null;

	// 对应数据库字段：is_valid 字段描述：是否有效记录
	protected Integer isValid = null;

	// 对应数据库字段：invalid_date 字段描述：删除时间
	protected Date invalidDate = null;

	/**
	 * 对应数据库字段：id 字段描述：记录编号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 对应数据库字段：id 字段描述：记录编号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 对应数据库字段：project_id 字段描述：项目id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * 对应数据库字段：project_id 字段描述：项目id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：projectId
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * 对应数据库字段：project_code 字段描述：项目编码
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getProjectCode() {
		return projectCode;
	}

	/**
	 * 对应数据库字段：project_code 字段描述：项目编码
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：projectCode
	 */
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	/**
	 * 对应数据库字段：project 字段描述：项目名
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getProject() {
		return project;
	}

	/**
	 * 对应数据库字段：project 字段描述：项目名
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * 对应数据库字段：user_id 字段描述：帐号Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 对应数据库字段：user_id 字段描述：帐号Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 对应数据库字段：customer_id 字段描述：客户Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * 对应数据库字段：customer_id 字段描述：客户Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：customerId
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * 对应数据库字段：account_id 字段描述：账户Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getAccountId() {
		return accountId;
	}

	/**
	 * 对应数据库字段：account_id 字段描述：账户Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：accountId
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：账户名（用户帐号）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：账户名（用户帐号）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 对应数据库字段：true_name 字段描述：真实姓名
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 对应数据库字段：true_name 字段描述：真实姓名
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：trueName
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	/**
	 * 对应数据库字段：business_code 字段描述：业务编码
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getBusinessCode() {
		return businessCode;
	}

	/**
	 * 对应数据库字段：business_code 字段描述：业务编码
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：businessCode
	 */
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	/**
	 * 对应数据库字段：business 字段描述：业务
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getBusiness() {
		return business;
	}

	/**
	 * 对应数据库字段：business 字段描述：业务
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：business
	 */
	public void setBusiness(String business) {
		this.business = business;
	}

	/**
	 * 对应数据库字段：trade_type 字段描述：交易类型（用户充值、用户提现、购买商品）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * 对应数据库字段：trade_type 字段描述：交易类型（用户充值、用户提现、购买商品）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：tradeType
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * 对应数据库字段：direction 字段描述：交易方向（0-出 1-入）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getDirection() {
		return direction;
	}

	/**
	 * 对应数据库字段：direction 字段描述：交易方向（0-出 1-入）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：direction
	 */
	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	/**
	 * 对应数据库字段：mobile 字段描述：手机
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 对应数据库字段：mobile 字段描述：手机
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 对应数据库字段：before_money 字段描述：交易前余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getBeforeMoney() {
		return beforeMoney;
	}

	/**
	 * 对应数据库字段：before_money 字段描述：交易前余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：beforeMoney
	 */
	public void setBeforeMoney(String beforeMoney) {
		this.beforeMoney = beforeMoney;
	}

	/**
	 * 对应数据库字段：trade_money 字段描述：交易金额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTradeMoney() {
		return tradeMoney;
	}

	/**
	 * 对应数据库字段：trade_money 字段描述：交易金额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：tradeMoney
	 */
	public void setTradeMoney(String tradeMoney) {
		this.tradeMoney = tradeMoney;
	}

	/**
	 * 对应数据库字段：after_money 字段描述：余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getAfterMoney() {
		return afterMoney;
	}

	/**
	 * 对应数据库字段：after_money 字段描述：余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：afterMoney
	 */
	public void setAfterMoney(String afterMoney) {
		this.afterMoney = afterMoney;
	}

	/**
	 * 对应数据库字段：target_man_id 字段描述：帐号Id（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getTargetManId() {
		return targetManId;
	}

	/**
	 * 对应数据库字段：target_man_id 字段描述：帐号Id（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：targetManId
	 */
	public void setTargetManId(Integer targetManId) {
		this.targetManId = targetManId;
	}

	/**
	 * 对应数据库字段：target_man_account_id 字段描述：账户Id（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getTargetManAccountId() {
		return targetManAccountId;
	}

	/**
	 * 对应数据库字段：target_man_account_id 字段描述：账户Id（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：targetManAccountId
	 */
	public void setTargetManAccountId(Integer targetManAccountId) {
		this.targetManAccountId = targetManAccountId;
	}

	/**
	 * 对应数据库字段：target_man_user_name 字段描述：帐号（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTargetManUserName() {
		return targetManUserName;
	}

	/**
	 * 对应数据库字段：target_man_user_name 字段描述：帐号（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：targetManUserName
	 */
	public void setTargetManUserName(String targetManUserName) {
		this.targetManUserName = targetManUserName;
	}

	/**
	 * 对应数据库字段：target_man_mobile 字段描述：手机（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTargetManMobile() {
		return targetManMobile;
	}

	/**
	 * 对应数据库字段：target_man_mobile 字段描述：手机（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：targetManMobile
	 */
	public void setTargetManMobile(String targetManMobile) {
		this.targetManMobile = targetManMobile;
	}

	/**
	 * 对应数据库字段：target_man 字段描述：真实姓名（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTargetMan() {
		return targetMan;
	}

	/**
	 * 对应数据库字段：target_man 字段描述：真实姓名（目标账户）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：targetMan
	 */
	public void setTargetMan(String targetMan) {
		this.targetMan = targetMan;
	}

	/**
	 * 对应数据库字段：order_id 字段描述：订单Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * 对应数据库字段：order_id 字段描述：订单Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：orderId
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * 对应数据库字段：order_code 字段描述：订单号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getOrderCode() {
		return orderCode;
	}

	/**
	 * 对应数据库字段：order_code 字段描述：订单号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：orderCode
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * 对应数据库字段：alipay_order_id 字段描述：支付宝订单记录Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getAlipayOrderId() {
		return alipayOrderId;
	}

	/**
	 * 对应数据库字段：alipay_order_id 字段描述：支付宝订单记录Id
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：alipayOrderId
	 */
	public void setAlipayOrderId(Integer alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	/**
	 * 对应数据库字段：alipay_trade_code 字段描述：支付宝交易号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getAlipayTradeCode() {
		return alipayTradeCode;
	}

	/**
	 * 对应数据库字段：alipay_trade_code 字段描述：支付宝交易号
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：alipayTradeCode
	 */
	public void setAlipayTradeCode(String alipayTradeCode) {
		this.alipayTradeCode = alipayTradeCode;
	}

	/**
	 * 对应数据库字段：remark 字段描述：备注
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 对应数据库字段：remark 字段描述：备注
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 对应数据库字段：trade_time 字段描述：交易时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Date getTradeTime() {
		return tradeTime;
	}

	/**
	 * 对应数据库字段：trade_time 字段描述：交易时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：tradeTime
	 */
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	/**
	 * 对应数据库字段：check_man 字段描述：审核人
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getCheckMan() {
		return checkMan;
	}

	/**
	 * 对应数据库字段：check_man 字段描述：审核人
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：checkMan
	 */
	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}

	/**
	 * 对应数据库字段：check_time 字段描述：审核时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Date getCheckTime() {
		return checkTime;
	}

	/**
	 * 对应数据库字段：check_time 字段描述：审核时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：checkTime
	 */
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	/**
	 * 对应数据库字段：check_status 字段描述：审核状态（未审核、未通过、已通过）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getCheckStatus() {
		return checkStatus;
	}

	/**
	 * 对应数据库字段：check_status 字段描述：审核状态（未审核、未通过、已通过）
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：checkStatus
	 */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	/**
	 * 对应数据库字段：check_cotent 字段描述：审核意见
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getCheckCotent() {
		return checkCotent;
	}

	/**
	 * 对应数据库字段：check_cotent 字段描述：审核意见
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：checkCotent
	 */
	public void setCheckCotent(String checkCotent) {
		this.checkCotent = checkCotent;
	}

	/**
	 * 对应数据库字段：is_valid 字段描述：是否有效记录
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getIsValid() {
		return isValid;
	}

	/**
	 * 对应数据库字段：is_valid 字段描述：是否有效记录
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：isValid
	 */
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	/**
	 * 对应数据库字段：invalid_date 字段描述：删除时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Date getInvalidDate() {
		return invalidDate;
	}

	/**
	 * 对应数据库字段：invalid_date 字段描述：删除时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：invalidDate
	 */
	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

}
