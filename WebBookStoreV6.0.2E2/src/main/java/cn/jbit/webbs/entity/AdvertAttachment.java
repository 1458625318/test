package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 广告附件表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 877
 */
public class AdvertAttachment implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:advert_id 描述:广告表Id
	protected Integer advertId = null;

	// 数据库表字段:title 描述:标题
	protected String title = null;

	// 数据库表字段:content_type 描述:内容类型（图片、swf视频、视频、其它）
	protected String contentType = null;

	// 数据库表字段:content_file 描述:附件文件
	protected String contentFile = null;

	// 数据库表字段:url 描述:url
	protected String url = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 877
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 广告表Id  get方法
	 * 数据库表字段：advert_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public Integer getAdvertId() {
		return advertId;
	}

	/**
	 * 广告表Id  set方法
	 * 数据库表字段：advert_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setAdvertId(Integer advertid) {
		this.advertId = advertid;
	}

	/**
	 * 标题  get方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 标题  set方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 内容类型（图片、swf视频、视频、其它）  get方法
	 * 数据库表字段：content_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * 内容类型（图片、swf视频、视频、其它）  set方法
	 * 数据库表字段：content_type
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setContentType(String contenttype) {
		this.contentType = contenttype;
	}

	/**
	 * 附件文件  get方法
	 * 数据库表字段：content_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public String getContentFile() {
		return contentFile;
	}

	/**
	 * 附件文件  set方法
	 * 数据库表字段：content_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setContentFile(String contentfile) {
		this.contentFile = contentfile;
	}

	/**
	 * url  get方法
	 * 数据库表字段：url
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * url  set方法
	 * 数据库表字段：url
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 878
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}