package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 854
 */
public class Announcement implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:content 描述:内容
	protected String content = null;

	// 数据库表字段:begin_time 描述:开始时间
	protected Date beginTime = null;

	// 数据库表字段:end_time 描述:结束时间
	protected Date endTime = null;

	// 数据库表字段:is_publish 描述:是否发布（0-否 1-是）
	protected Integer isPublish = null;

	// 数据库表字段:publisher 描述:发布人
	protected String publisher = null;

	// 数据库表字段:publish_time 描述:发布时间
	protected Date publishTime = null;

	// 数据库表字段:submit_man 描述:提交人
	protected String submitMan = null;

	// 数据库表字段:submit_time 描述:提交时间
	protected Date submitTime = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 内容  get方法
	 * 数据库表字段：content
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 内容  set方法
	 * 数据库表字段：content
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 开始时间  get方法
	 * 数据库表字段：begin_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * 开始时间  set方法
	 * 数据库表字段：begin_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setBeginTime(Date begintime) {
		this.beginTime = begintime;
	}

	/**
	 * 结束时间  get方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 结束时间  set方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setEndTime(Date endtime) {
		this.endTime = endtime;
	}

	/**
	 * 是否发布（0-否 1-是）  get方法
	 * 数据库表字段：is_publish
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public Integer getIsPublish() {
		return isPublish;
	}

	/**
	 * 是否发布（0-否 1-是）  set方法
	 * 数据库表字段：is_publish
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setIsPublish(Integer ispublish) {
		this.isPublish = ispublish;
	}

	/**
	 * 发布人  get方法
	 * 数据库表字段：publisher
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 发布人  set方法
	 * 数据库表字段：publisher
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * 发布时间  get方法
	 * 数据库表字段：publish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * 发布时间  set方法
	 * 数据库表字段：publish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 854
	 */
	public void setPublishTime(Date publishtime) {
		this.publishTime = publishtime;
	}

	/**
	 * 提交人  get方法
	 * 数据库表字段：submit_man
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 855
	 */
	public String getSubmitMan() {
		return submitMan;
	}

	/**
	 * 提交人  set方法
	 * 数据库表字段：submit_man
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 855
	 */
	public void setSubmitMan(String submitman) {
		this.submitMan = submitman;
	}

	/**
	 * 提交时间  get方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 855
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * 提交时间  set方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 855
	 */
	public void setSubmitTime(Date submittime) {
		this.submitTime = submittime;
	}

}