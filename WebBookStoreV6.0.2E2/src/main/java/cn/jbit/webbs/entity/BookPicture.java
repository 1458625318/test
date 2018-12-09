package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 图书图片表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 727
 */
public class BookPicture implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:title 描述:图片标题
	protected String title = null;

	// 数据库表字段:book_id 描述:图书Id
	protected Integer bookId = null;

	// 数据库表字段:book 描述:书名
	protected String book = null;

	// 数据库表字段:pic_file 描述:图片文件
	protected String picFile = null;

	// 数据库表字段:is_default 描述:是否默认图片（0-否 1-是）
	protected Integer isDefault = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 图片标题  get方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 图片标题  set方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 图书Id  get方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * 图书Id  set方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setBookId(Integer bookid) {
		this.bookId = bookid;
	}

	/**
	 * 书名  get方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public String getBook() {
		return book;
	}

	/**
	 * 书名  set方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setBook(String book) {
		this.book = book;
	}

	/**
	 * 图片文件  get方法
	 * 数据库表字段：pic_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public String getPicFile() {
		return picFile;
	}

	/**
	 * 图片文件  set方法
	 * 数据库表字段：pic_file
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setPicFile(String picfile) {
		this.picFile = picfile;
	}

	/**
	 * 是否默认图片（0-否 1-是）  get方法
	 * 数据库表字段：is_default
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public Integer getIsDefault() {
		return isDefault;
	}

	/**
	 * 是否默认图片（0-否 1-是）  set方法
	 * 数据库表字段：is_default
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 727
	 */
	public void setIsDefault(Integer isdefault) {
		this.isDefault = isdefault;
	}

}