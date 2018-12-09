package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 促销书表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 792
 */
public class BookSale implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:book_id 描述:图书Id
	protected Integer bookId = null;

	// 数据库表字段:book 描述:书名
	protected String book = null;

	// 数据库表字段:sales_promotion_integral 描述:促销积分
	protected Integer salesPromotionIntegral = null;

	// 数据库表字段:sales_promotion_price 描述:促销价
	protected String salesPromotionPrice = null;

	// 数据库表字段:sales_promotion_remark 描述:促销描述
	protected String salesPromotionRemark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 图书Id  get方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * 图书Id  set方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setBookId(Integer bookid) {
		this.bookId = bookid;
	}

	/**
	 * 书名  get方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public String getBook() {
		return book;
	}

	/**
	 * 书名  set方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setBook(String book) {
		this.book = book;
	}

	/**
	 * 促销积分  get方法
	 * 数据库表字段：sales_promotion_integral
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public Integer getSalesPromotionIntegral() {
		return salesPromotionIntegral;
	}

	/**
	 * 促销积分  set方法
	 * 数据库表字段：sales_promotion_integral
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setSalesPromotionIntegral(Integer salespromotionintegral) {
		this.salesPromotionIntegral = salespromotionintegral;
	}

	/**
	 * 促销价  get方法
	 * 数据库表字段：sales_promotion_price
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public String getSalesPromotionPrice() {
		return salesPromotionPrice;
	}

	/**
	 * 促销价  set方法
	 * 数据库表字段：sales_promotion_price
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setSalesPromotionPrice(String salespromotionprice) {
		this.salesPromotionPrice = salespromotionprice;
	}

	/**
	 * 促销描述  get方法
	 * 数据库表字段：sales_promotion_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public String getSalesPromotionRemark() {
		return salesPromotionRemark;
	}

	/**
	 * 促销描述  set方法
	 * 数据库表字段：sales_promotion_remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 792
	 */
	public void setSalesPromotionRemark(String salespromotionremark) {
		this.salesPromotionRemark = salespromotionremark;
	}

}