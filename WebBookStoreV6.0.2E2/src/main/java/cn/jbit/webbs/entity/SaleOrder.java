package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 690
 */
public class SaleOrder implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:code 描述:订单编号（年 4  月 2  日 2  小时 2  分 2  秒 2  毫秒 3 ）
	protected String code = null;

	// 数据库表字段:user_id 描述:客户Id
	protected Integer userId = null;

	// 数据库表字段:user_name 描述:客户帐号
	protected String userName = null;

	// 数据库表字段:true_name 描述:客户姓名
	protected String trueName = null;

	// 数据库表字段:mobile 描述:客户电话
	protected String mobile = null;

	// 数据库表字段:address 描述:客户地址
	protected String address = null;

	// 数据库表字段:post_code 描述:客户邮编
	protected String postCode = null;

	// 数据库表字段:status 描述:订单状态（0-新建 1-已支付 2-已发货 3-已完成 4-取消）
	protected String status = null;

	// 数据库表字段:customer_remark 描述:客户备注
	protected String customerRemark = null;

	// 数据库表字段:seller_remark 描述:商户备注
	protected String sellerRemark = null;

	// 数据库表字段:total_amount 描述:总金额
	protected String totalAmount = null;

	// 数据库表字段:submit_time 描述:订单提交时间
	protected Date submitTime = null;

	// 数据库表字段:pay_time 描述:支付时间
	protected Date payTime = null;

	// 数据库表字段:consigner_emp_id 描述:发货人员工Id
	protected Integer consignerEmpId = null;

	// 数据库表字段:consigner_user_id 描述:发货人Id
	protected Integer consignerUserId = null;

	// 数据库表字段:consigner_user_name 描述:发货人帐号
	protected String consignerUserName = null;

	// 数据库表字段:consigner 描述:发货人姓名
	protected String consigner = null;

	// 数据库表字段:consign_time 描述:发货时间
	protected Date consignTime = null;

	// 数据库表字段:finish_emp_id 描述:完成人员工Id
	protected Integer finishEmpId = null;

	// 数据库表字段:finish_user_id 描述:完成人Id
	protected Integer finishUserId = null;

	// 数据库表字段:finish_user_name 描述:完成人帐号
	protected String finishUserName = null;

	// 数据库表字段:finish_true_name 描述:完成人姓名
	protected String finishTrueName = null;

	// 数据库表字段:finish_time 描述:完成时间
	protected Date finishTime = null;

	// 数据库表字段:cancel_reason 描述:取消原因
	protected String cancelReason = null;

	// 数据库表字段:cancel_emp_id 描述:取消人员工Id
	protected Integer cancelEmpId = null;

	// 数据库表字段:cancel_user_id 描述:取消人Id
	protected Integer cancelUserId = null;

	// 数据库表字段:cancel_user_name 描述:取消人帐号
	protected String cancelUserName = null;

	// 数据库表字段:cancel_true_name 描述:取消人姓名
	protected String cancelTrueName = null;

	// 数据库表字段:cancel_time 描述:取消时间
	protected Date cancelTime = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 订单编号（年 4  月 2  日 2  小时 2  分 2  秒 2  毫秒 3 ）  get方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 订单编号（年 4  月 2  日 2  小时 2  分 2  秒 2  毫秒 3 ）  set方法
	 * 数据库表字段：code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 客户Id  get方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 客户Id  set方法
	 * 数据库表字段：user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setUserId(Integer userid) {
		this.userId = userid;
	}

	/**
	 * 客户帐号  get方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 客户帐号  set方法
	 * 数据库表字段：user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setUserName(String username) {
		this.userName = username;
	}

	/**
	 * 客户姓名  get方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 客户姓名  set方法
	 * 数据库表字段：true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setTrueName(String truename) {
		this.trueName = truename;
	}

	/**
	 * 客户电话  get方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 客户电话  set方法
	 * 数据库表字段：mobile
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 客户地址  get方法
	 * 数据库表字段：address
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 客户地址  set方法
	 * 数据库表字段：address
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 客户邮编  get方法
	 * 数据库表字段：post_code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * 客户邮编  set方法
	 * 数据库表字段：post_code
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setPostCode(String postcode) {
		this.postCode = postcode;
	}

	/**
	 * 订单状态（0-新建 1-已支付 2-已发货 3-已完成 4-取消）  get方法
	 * 数据库表字段：status
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 订单状态（0-新建 1-已支付 2-已发货 3-已完成 4-取消）  set方法
	 * 数据库表字段：status
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 691
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 客户备注  get方法
	 * 数据库表字段：customer_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public String getCustomerRemark() {
		return customerRemark;
	}

	/**
	 * 客户备注  set方法
	 * 数据库表字段：customer_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setCustomerRemark(String customerremark) {
		this.customerRemark = customerremark;
	}

	/**
	 * 商户备注  get方法
	 * 数据库表字段：seller_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public String getSellerRemark() {
		return sellerRemark;
	}

	/**
	 * 商户备注  set方法
	 * 数据库表字段：seller_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setSellerRemark(String sellerremark) {
		this.sellerRemark = sellerremark;
	}

	/**
	 * 总金额  get方法
	 * 数据库表字段：total_amount
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public String getTotalAmount() {
		return totalAmount;
	}

	/**
	 * 总金额  set方法
	 * 数据库表字段：total_amount
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setTotalAmount(String totalamount) {
		this.totalAmount = totalamount;
	}

	/**
	 * 订单提交时间  get方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * 订单提交时间  set方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setSubmitTime(Date submittime) {
		this.submitTime = submittime;
	}

	/**
	 * 支付时间  get方法
	 * 数据库表字段：pay_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * 支付时间  set方法
	 * 数据库表字段：pay_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setPayTime(Date paytime) {
		this.payTime = paytime;
	}

	/**
	 * 发货人员工Id  get方法
	 * 数据库表字段：consigner_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public Integer getConsignerEmpId() {
		return consignerEmpId;
	}

	/**
	 * 发货人员工Id  set方法
	 * 数据库表字段：consigner_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setConsignerEmpId(Integer consignerempid) {
		this.consignerEmpId = consignerempid;
	}

	/**
	 * 发货人Id  get方法
	 * 数据库表字段：consigner_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public Integer getConsignerUserId() {
		return consignerUserId;
	}

	/**
	 * 发货人Id  set方法
	 * 数据库表字段：consigner_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setConsignerUserId(Integer consigneruserid) {
		this.consignerUserId = consigneruserid;
	}

	/**
	 * 发货人帐号  get方法
	 * 数据库表字段：consigner_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public String getConsignerUserName() {
		return consignerUserName;
	}

	/**
	 * 发货人帐号  set方法
	 * 数据库表字段：consigner_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public void setConsignerUserName(String consignerusername) {
		this.consignerUserName = consignerusername;
	}

	/**
	 * 发货人姓名  get方法
	 * 数据库表字段：consigner
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 692
	 */
	public String getConsigner() {
		return consigner;
	}

	/**
	 * 发货人姓名  set方法
	 * 数据库表字段：consigner
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setConsigner(String consigner) {
		this.consigner = consigner;
	}

	/**
	 * 发货时间  get方法
	 * 数据库表字段：consign_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public Date getConsignTime() {
		return consignTime;
	}

	/**
	 * 发货时间  set方法
	 * 数据库表字段：consign_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setConsignTime(Date consigntime) {
		this.consignTime = consigntime;
	}

	/**
	 * 完成人员工Id  get方法
	 * 数据库表字段：finish_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public Integer getFinishEmpId() {
		return finishEmpId;
	}

	/**
	 * 完成人员工Id  set方法
	 * 数据库表字段：finish_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setFinishEmpId(Integer finishempid) {
		this.finishEmpId = finishempid;
	}

	/**
	 * 完成人Id  get方法
	 * 数据库表字段：finish_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public Integer getFinishUserId() {
		return finishUserId;
	}

	/**
	 * 完成人Id  set方法
	 * 数据库表字段：finish_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setFinishUserId(Integer finishuserid) {
		this.finishUserId = finishuserid;
	}

	/**
	 * 完成人帐号  get方法
	 * 数据库表字段：finish_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public String getFinishUserName() {
		return finishUserName;
	}

	/**
	 * 完成人帐号  set方法
	 * 数据库表字段：finish_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setFinishUserName(String finishusername) {
		this.finishUserName = finishusername;
	}

	/**
	 * 完成人姓名  get方法
	 * 数据库表字段：finish_true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public String getFinishTrueName() {
		return finishTrueName;
	}

	/**
	 * 完成人姓名  set方法
	 * 数据库表字段：finish_true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setFinishTrueName(String finishtruename) {
		this.finishTrueName = finishtruename;
	}

	/**
	 * 完成时间  get方法
	 * 数据库表字段：finish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public Date getFinishTime() {
		return finishTime;
	}

	/**
	 * 完成时间  set方法
	 * 数据库表字段：finish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setFinishTime(Date finishtime) {
		this.finishTime = finishtime;
	}

	/**
	 * 取消原因  get方法
	 * 数据库表字段：cancel_reason
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public String getCancelReason() {
		return cancelReason;
	}

	/**
	 * 取消原因  set方法
	 * 数据库表字段：cancel_reason
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setCancelReason(String cancelreason) {
		this.cancelReason = cancelreason;
	}

	/**
	 * 取消人员工Id  get方法
	 * 数据库表字段：cancel_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public Integer getCancelEmpId() {
		return cancelEmpId;
	}

	/**
	 * 取消人员工Id  set方法
	 * 数据库表字段：cancel_emp_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 693
	 */
	public void setCancelEmpId(Integer cancelempid) {
		this.cancelEmpId = cancelempid;
	}

	/**
	 * 取消人Id  get方法
	 * 数据库表字段：cancel_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public Integer getCancelUserId() {
		return cancelUserId;
	}

	/**
	 * 取消人Id  set方法
	 * 数据库表字段：cancel_user_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public void setCancelUserId(Integer canceluserid) {
		this.cancelUserId = canceluserid;
	}

	/**
	 * 取消人帐号  get方法
	 * 数据库表字段：cancel_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public String getCancelUserName() {
		return cancelUserName;
	}

	/**
	 * 取消人帐号  set方法
	 * 数据库表字段：cancel_user_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public void setCancelUserName(String cancelusername) {
		this.cancelUserName = cancelusername;
	}

	/**
	 * 取消人姓名  get方法
	 * 数据库表字段：cancel_true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public String getCancelTrueName() {
		return cancelTrueName;
	}

	/**
	 * 取消人姓名  set方法
	 * 数据库表字段：cancel_true_name
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public void setCancelTrueName(String canceltruename) {
		this.cancelTrueName = canceltruename;
	}

	/**
	 * 取消时间  get方法
	 * 数据库表字段：cancel_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public Date getCancelTime() {
		return cancelTime;
	}

	/**
	 * 取消时间  set方法
	 * 数据库表字段：cancel_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 694
	 */
	public void setCancelTime(Date canceltime) {
		this.cancelTime = canceltime;
	}

}