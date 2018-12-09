package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统备份记录
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 930
 */
public class BackupRecord implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:backup_type 描述:备份类型（数据库备份、运行时备份）
	protected String backupType = null;

	// 数据库表字段:backup_start_time 描述:备份开始时间
	protected Date backupStartTime = null;

	// 数据库表字段:backup_end_time 描述:备份结束时间
	protected Date backupEndTime = null;

	// 数据库表字段:backup_length 描述:备份时长（单位：秒）
	protected Integer backupLength = null;

	// 数据库表字段:attachment 描述:附件
	protected String attachment = null;

	// 数据库表字段:create_time 描述:创建时间
	protected Date createTime = null;

	// 数据库表字段:remark 描述:备注
	protected String remark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 备份类型（数据库备份、运行时备份）  get方法
	 * 数据库表字段：backup_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public String getBackupType() {
		return backupType;
	}

	/**
	 * 备份类型（数据库备份、运行时备份）  set方法
	 * 数据库表字段：backup_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public void setBackupType(String backuptype) {
		this.backupType = backuptype;
	}

	/**
	 * 备份开始时间  get方法
	 * 数据库表字段：backup_start_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public Date getBackupStartTime() {
		return backupStartTime;
	}

	/**
	 * 备份开始时间  set方法
	 * 数据库表字段：backup_start_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 930
	 */
	public void setBackupStartTime(Date backupstarttime) {
		this.backupStartTime = backupstarttime;
	}

	/**
	 * 备份结束时间  get方法
	 * 数据库表字段：backup_end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public Date getBackupEndTime() {
		return backupEndTime;
	}

	/**
	 * 备份结束时间  set方法
	 * 数据库表字段：backup_end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public void setBackupEndTime(Date backupendtime) {
		this.backupEndTime = backupendtime;
	}

	/**
	 * 备份时长（单位：秒）  get方法
	 * 数据库表字段：backup_length
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public Integer getBackupLength() {
		return backupLength;
	}

	/**
	 * 备份时长（单位：秒）  set方法
	 * 数据库表字段：backup_length
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public void setBackupLength(Integer backuplength) {
		this.backupLength = backuplength;
	}

	/**
	 * 附件  get方法
	 * 数据库表字段：attachment
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public String getAttachment() {
		return attachment;
	}

	/**
	 * 附件  set方法
	 * 数据库表字段：attachment
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	/**
	 * 创建时间  get方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间  set方法
	 * 数据库表字段：create_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public void setCreateTime(Date createtime) {
		this.createTime = createtime;
	}

	/**
	 * 备注  get方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注  set方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 931
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}