package cn.jbit.webbs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 图书表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 713
 */
public class Book implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:title 描述:书名
	protected String title = null;

	// 数据库表字段:author 描述:作者
	protected String author = null;

	// 数据库表字段:series_of_book 描述:丛书名
	protected String seriesOfBook = null;

	// 数据库表字段:press 描述:出版社
	protected String press = null;

	// 数据库表字段:isbn 描述:ISBN
	protected String isbn = null;

	// 数据库表字段:register_date 描述:上架时间
	protected Date registerDate = null;

	// 数据库表字段:publication_date 描述:出版时间
	protected Date publicationDate = null;

	// 数据库表字段:book_size 描述:开本
	protected String bookSize = null;

	// 数据库表字段:page_number 描述:页码
	protected Integer pageNumber = null;

	// 数据库表字段:edition 描述:版次（1-1）
	protected String edition = null;

	// 数据库表字段:recommend_book 描述:编辑推荐
	protected String recommendBook = null;

	// 数据库表字段:book_description 描述:内容简介
	protected String bookDescription = null;

	// 数据库表字段:translator 描述:作译者描述
	protected String translator = null;

	// 数据库表字段:directory 描述:目录
	protected String directory = null;

	// 数据库表字段:foreword 描述:前言
	protected String foreword = null;

	// 数据库表字段:preface 描述:序言
	protected String preface = null;

	// 数据库表字段:original_cost 描述:原价
	protected String originalCost = null;

	// 数据库表字段:discount_ratio 描述:折扣率
	protected String discountRatio = null;

	// 数据库表字段:is_on_self 描述:是否上架
	protected Integer isOnSelf = null;

	// 数据库表字段:is_sales_promotion 描述:是否促销
	protected Integer isSalesPromotion = null;

	// 数据库表字段:quarter_sales_colume 描述:本季度销量
	protected Integer quarterSalesColume = null;

	// 数据库表字段:star_level 描述:星级
	protected Integer starLevel = null;

	// 数据库表字段:review_total_number 描述:评论总数
	protected Integer reviewTotalNumber = null;

	// 数据库表字段:total_inventory 描述:总库存
	protected Integer totalInventory = null;

	// 数据库表字段:first_classify 描述:一级分类
	protected String firstClassify = null;

	// 数据库表字段:second_classify 描述:二级分类
	protected String secondClassify = null;

	// 数据库表字段:third_classify 描述:三级分类
	protected String thirdClassify = null;

	// 数据库表字段:fourth_classify 描述:四级分类
	protected String fourthClassify = null;

	// 数据库表字段:remark 描述:备注
	protected String remark = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 713
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 713
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 书名  get方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 713
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 书名  set方法
	 * 数据库表字段：title
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 713
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 作者  get方法
	 * 数据库表字段：author
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 713
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 作者  set方法
	 * 数据库表字段：author
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 丛书名  get方法
	 * 数据库表字段：series_of_book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public String getSeriesOfBook() {
		return seriesOfBook;
	}

	/**
	 * 丛书名  set方法
	 * 数据库表字段：series_of_book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setSeriesOfBook(String seriesofbook) {
		this.seriesOfBook = seriesofbook;
	}

	/**
	 * 出版社  get方法
	 * 数据库表字段：press
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public String getPress() {
		return press;
	}

	/**
	 * 出版社  set方法
	 * 数据库表字段：press
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setPress(String press) {
		this.press = press;
	}

	/**
	 * ISBN  get方法
	 * 数据库表字段：isbn
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * ISBN  set方法
	 * 数据库表字段：isbn
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * 上架时间  get方法
	 * 数据库表字段：register_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * 上架时间  set方法
	 * 数据库表字段：register_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setRegisterDate(Date registerdate) {
		this.registerDate = registerdate;
	}

	/**
	 * 出版时间  get方法
	 * 数据库表字段：publication_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * 出版时间  set方法
	 * 数据库表字段：publication_date
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setPublicationDate(Date publicationdate) {
		this.publicationDate = publicationdate;
	}

	/**
	 * 开本  get方法
	 * 数据库表字段：book_size
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public String getBookSize() {
		return bookSize;
	}

	/**
	 * 开本  set方法
	 * 数据库表字段：book_size
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setBookSize(String booksize) {
		this.bookSize = booksize;
	}

	/**
	 * 页码  get方法
	 * 数据库表字段：page_number
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}

	/**
	 * 页码  set方法
	 * 数据库表字段：page_number
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public void setPageNumber(Integer pagenumber) {
		this.pageNumber = pagenumber;
	}

	/**
	 * 版次（1-1）  get方法
	 * 数据库表字段：edition
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 714
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * 版次（1-1）  set方法
	 * 数据库表字段：edition
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * 编辑推荐  get方法
	 * 数据库表字段：recommend_book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getRecommendBook() {
		return recommendBook;
	}

	/**
	 * 编辑推荐  set方法
	 * 数据库表字段：recommend_book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setRecommendBook(String recommendbook) {
		this.recommendBook = recommendbook;
	}

	/**
	 * 内容简介  get方法
	 * 数据库表字段：book_description
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getBookDescription() {
		return bookDescription;
	}

	/**
	 * 内容简介  set方法
	 * 数据库表字段：book_description
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setBookDescription(String bookdescription) {
		this.bookDescription = bookdescription;
	}

	/**
	 * 作译者描述  get方法
	 * 数据库表字段：translator
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getTranslator() {
		return translator;
	}

	/**
	 * 作译者描述  set方法
	 * 数据库表字段：translator
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setTranslator(String translator) {
		this.translator = translator;
	}

	/**
	 * 目录  get方法
	 * 数据库表字段：directory
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * 目录  set方法
	 * 数据库表字段：directory
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	/**
	 * 前言  get方法
	 * 数据库表字段：foreword
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getForeword() {
		return foreword;
	}

	/**
	 * 前言  set方法
	 * 数据库表字段：foreword
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setForeword(String foreword) {
		this.foreword = foreword;
	}

	/**
	 * 序言  get方法
	 * 数据库表字段：preface
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getPreface() {
		return preface;
	}

	/**
	 * 序言  set方法
	 * 数据库表字段：preface
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setPreface(String preface) {
		this.preface = preface;
	}

	/**
	 * 原价  get方法
	 * 数据库表字段：original_cost
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getOriginalCost() {
		return originalCost;
	}

	/**
	 * 原价  set方法
	 * 数据库表字段：original_cost
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setOriginalCost(String originalcost) {
		this.originalCost = originalcost;
	}

	/**
	 * 折扣率  get方法
	 * 数据库表字段：discount_ratio
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public String getDiscountRatio() {
		return discountRatio;
	}

	/**
	 * 折扣率  set方法
	 * 数据库表字段：discount_ratio
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 715
	 */
	public void setDiscountRatio(String discountratio) {
		this.discountRatio = discountratio;
	}

	/**
	 * 是否上架  get方法
	 * 数据库表字段：is_on_self
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getIsOnSelf() {
		return isOnSelf;
	}

	/**
	 * 是否上架  set方法
	 * 数据库表字段：is_on_self
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setIsOnSelf(Integer isonself) {
		this.isOnSelf = isonself;
	}

	/**
	 * 是否促销  get方法
	 * 数据库表字段：is_sales_promotion
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getIsSalesPromotion() {
		return isSalesPromotion;
	}

	/**
	 * 是否促销  set方法
	 * 数据库表字段：is_sales_promotion
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setIsSalesPromotion(Integer issalespromotion) {
		this.isSalesPromotion = issalespromotion;
	}

	/**
	 * 本季度销量  get方法
	 * 数据库表字段：quarter_sales_colume
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getQuarterSalesColume() {
		return quarterSalesColume;
	}

	/**
	 * 本季度销量  set方法
	 * 数据库表字段：quarter_sales_colume
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setQuarterSalesColume(Integer quartersalescolume) {
		this.quarterSalesColume = quartersalescolume;
	}

	/**
	 * 星级  get方法
	 * 数据库表字段：star_level
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getStarLevel() {
		return starLevel;
	}

	/**
	 * 星级  set方法
	 * 数据库表字段：star_level
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setStarLevel(Integer starlevel) {
		this.starLevel = starlevel;
	}

	/**
	 * 评论总数  get方法
	 * 数据库表字段：review_total_number
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getReviewTotalNumber() {
		return reviewTotalNumber;
	}

	/**
	 * 评论总数  set方法
	 * 数据库表字段：review_total_number
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setReviewTotalNumber(Integer reviewtotalnumber) {
		this.reviewTotalNumber = reviewtotalnumber;
	}

	/**
	 * 总库存  get方法
	 * 数据库表字段：total_inventory
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public Integer getTotalInventory() {
		return totalInventory;
	}

	/**
	 * 总库存  set方法
	 * 数据库表字段：total_inventory
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setTotalInventory(Integer totalinventory) {
		this.totalInventory = totalinventory;
	}

	/**
	 * 一级分类  get方法
	 * 数据库表字段：first_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public String getFirstClassify() {
		return firstClassify;
	}

	/**
	 * 一级分类  set方法
	 * 数据库表字段：first_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public void setFirstClassify(String firstclassify) {
		this.firstClassify = firstclassify;
	}

	/**
	 * 二级分类  get方法
	 * 数据库表字段：second_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 716
	 */
	public String getSecondClassify() {
		return secondClassify;
	}

	/**
	 * 二级分类  set方法
	 * 数据库表字段：second_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public void setSecondClassify(String secondclassify) {
		this.secondClassify = secondclassify;
	}

	/**
	 * 三级分类  get方法
	 * 数据库表字段：third_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public String getThirdClassify() {
		return thirdClassify;
	}

	/**
	 * 三级分类  set方法
	 * 数据库表字段：third_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public void setThirdClassify(String thirdclassify) {
		this.thirdClassify = thirdclassify;
	}

	/**
	 * 四级分类  get方法
	 * 数据库表字段：fourth_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public String getFourthClassify() {
		return fourthClassify;
	}

	/**
	 * 四级分类  set方法
	 * 数据库表字段：fourth_classify
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public void setFourthClassify(String fourthclassify) {
		this.fourthClassify = fourthclassify;
	}

	/**
	 * 备注  get方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注  set方法
	 * 数据库表字段：remark
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 717
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}