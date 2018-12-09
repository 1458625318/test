package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 866
 */
public class Advert implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:sort 描述:广告类型（主页大幅广告、主页广告、新书广告、特价书广告、促销书广告、图书广告、推荐作者、热销作者）
	protected String sort = null;

	// 数据库表字段:title 描述:标题
	protected String title = null;

	// 数据库表字段:content_file 描述:内容文件
	protected String contentFile = null;

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
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 广告类型（主页大幅广告、主页广告、新书广告、特价书广告、促销书广告、图书广告、推荐作者、热销作者）  get方法
	 * 数据库表字段：sort
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * 广告类型（主页大幅广告、主页广告、新书广告、特价书广告、促销书广告、图书广告、推荐作者、热销作者）  set方法
	 * 数据库表字段：sort
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * 标题  get方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 标题  set方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 内容文件  get方法
	 * 数据库表字段：content_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public String getContentFile() {
		return contentFile;
	}

	/**
	 * 内容文件  set方法
	 * 数据库表字段：content_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setContentFile(String contentfile) {
		this.contentFile = contentfile;
	}

	/**
	 * 开始时间  get方法
	 * 数据库表字段：begin_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * 开始时间  set方法
	 * 数据库表字段：begin_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setBeginTime(Date begintime) {
		this.beginTime = begintime;
	}

	/**
	 * 结束时间  get方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 结束时间  set方法
	 * 数据库表字段：end_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setEndTime(Date endtime) {
		this.endTime = endtime;
	}

	/**
	 * 是否发布（0-否 1-是）  get方法
	 * 数据库表字段：is_publish
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public Integer getIsPublish() {
		return isPublish;
	}

	/**
	 * 是否发布（0-否 1-是）  set方法
	 * 数据库表字段：is_publish
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setIsPublish(Integer ispublish) {
		this.isPublish = ispublish;
	}

	/**
	 * 发布人  get方法
	 * 数据库表字段：publisher
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 发布人  set方法
	 * 数据库表字段：publisher
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 866
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * 发布时间  get方法
	 * 数据库表字段：publish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * 发布时间  set方法
	 * 数据库表字段：publish_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public void setPublishTime(Date publishtime) {
		this.publishTime = publishtime;
	}

	/**
	 * 提交人  get方法
	 * 数据库表字段：submit_man
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public String getSubmitMan() {
		return submitMan;
	}

	/**
	 * 提交人  set方法
	 * 数据库表字段：submit_man
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public void setSubmitMan(String submitman) {
		this.submitMan = submitman;
	}

	/**
	 * 提交时间  get方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * 提交时间  set方法
	 * 数据库表字段：submit_time
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 867
	 */
	public void setSubmitTime(Date submittime) {
		this.submitTime = submittime;
	}

}