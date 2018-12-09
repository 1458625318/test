package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 特价书
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 782
 */
public class BookBargain implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:book_id 描述:图书Id
	protected Integer bookId = null;

	// 数据库表字段:book 描述:书名
	protected String book = null;

	// 数据库表字段:classify 描述:分类（推荐特价书、热销特价书）
	protected String classify = null;

	// 数据库表字段:order_index 描述:排序
	protected String orderIndex = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 图书Id  get方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * 图书Id  set方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public void setBookId(Integer bookid) {
		this.bookId = bookid;
	}

	/**
	 * 书名  get方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public String getBook() {
		return book;
	}

	/**
	 * 书名  set方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public void setBook(String book) {
		this.book = book;
	}

	/**
	 * 分类（推荐特价书、热销特价书）  get方法
	 * 数据库表字段：classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public String getClassify() {
		return classify;
	}

	/**
	 * 分类（推荐特价书、热销特价书）  set方法
	 * 数据库表字段：classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 782
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}

	/**
	 * 排序  get方法
	 * 数据库表字段：order_index
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 783
	 */
	public String getOrderIndex() {
		return orderIndex;
	}

	/**
	 * 排序  set方法
	 * 数据库表字段：order_index
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 783
	 */
	public void setOrderIndex(String orderindex) {
		this.orderIndex = orderindex;
	}

}