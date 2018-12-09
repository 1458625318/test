package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 促销书附赠商品表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 802
 */
public class BookSalesDetail implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:sales_promotion_id 描述:促销书表Id
	protected Integer salesPromotionId = null;

	// 数据库表字段:title 描述:商品名称
	protected String title = null;

	// 数据库表字段:num 描述:商品数量
	protected Integer num = null;

	// 数据库表字段:price 描述:商品原价
	protected String price = null;

	// 数据库表字段:remark 描述:商品描述
	protected String remark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 促销书表Id  get方法
	 * 数据库表字段：sales_promotion_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public Integer getSalesPromotionId() {
		return salesPromotionId;
	}

	/**
	 * 促销书表Id  set方法
	 * 数据库表字段：sales_promotion_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public void setSalesPromotionId(Integer salespromotionid) {
		this.salesPromotionId = salespromotionid;
	}

	/**
	 * 商品名称  get方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 商品名称  set方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 商品数量  get方法
	 * 数据库表字段：num
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * 商品数量  set方法
	 * 数据库表字段：num
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * 商品原价  get方法
	 * 数据库表字段：price
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * 商品原价  set方法
	 * 数据库表字段：price
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 802
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * 商品描述  get方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 803
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 商品描述  set方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 803
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}