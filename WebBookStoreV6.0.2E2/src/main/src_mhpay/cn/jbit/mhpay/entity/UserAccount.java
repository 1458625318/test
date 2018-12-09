package cn.jbit.mhpay.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户表 创建时间：2016-10-15 14:59:25
 *
 * @author moshco zhu
 *
 */
public class UserAccount implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	protected Integer id = null;

	// 对应数据库字段：project_id 字段描述：项目id
	protected Integer projectId = null;

	// 对应数据库字段：project_code 字段描述：项目编码
	protected String projectCode = null;

	// 对应数据库字段：project 字段描述：项目名
	protected String project = null;

	// 对应数据库字段：user_id 字段描述：帐号id
	protected Integer userId = null;

	// 对应数据库字段：customer_id 字段描述：客户Id
	protected Integer customerId = null;

	// 对应数据库字段：user_name 字段描述：账户名（用户帐号）
	protected String userName = null;

	// 对应数据库字段：true_name 字段描述：真实姓名
	protected String trueName = null;

	// 对应数据库字段：total_money 字段描述：账户余额
	protected String totalMoney = null;

	// 对应数据库字段：lock_money 字段描述：冻结金额
	protected String lockMoney = null;

	// 对应数据库字段：total_point 字段描述：总积分
	protected Integer totalPoint = null;

	// 对应数据库字段：create_time 字段描述：创建时间
	protected Date createTime = null;

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
	 * 对应数据库字段：user_id 字段描述：帐号id
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
	 * 对应数据库字段：user_id 字段描述：帐号id
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
	 * 对应数据库字段：total_money 字段描述：账户余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getTotalMoney() {
		return totalMoney;
	}

	/**
	 * 对应数据库字段：total_money 字段描述：账户余额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：totalMoney
	 */
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	/**
	 * 对应数据库字段：lock_money 字段描述：冻结金额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getLockMoney() {
		return lockMoney;
	}

	/**
	 * 对应数据库字段：lock_money 字段描述：冻结金额
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：lockMoney
	 */
	public void setLockMoney(String lockMoney) {
		this.lockMoney = lockMoney;
	}

	/**
	 * 对应数据库字段：total_point 字段描述：总积分
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getTotalPoint() {
		return totalPoint;
	}

	/**
	 * 对应数据库字段：total_point 字段描述：总积分
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：totalPoint
	 */
	public void setTotalPoint(Integer totalPoint) {
		this.totalPoint = totalPoint;
	}

	/**
	 * 对应数据库字段：create_time 字段描述：创建时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 对应数据库字段：create_time 字段描述：创建时间
	 *
	 * 开发时间：2016-10-15 14:59:25
	 * 
	 * @author：moshco zhu
	 * @param：createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
