package cn.jbit.webbs.entity;

import java.io.Serializable;

/**
 * 热评图书表
 * @author moshco zhu
 * @开发时间：2016-10-19 14:30:57 954
 */
public class CommentHot implements Serializable {

	// 数据库表字段:id 描述:记录编号
	protected Integer id = null;

	// 数据库表字段:book_id 描述:图书Id
	protected Integer bookId = null;

	// 数据库表字段:book 描述:书名
	protected String book = null;

	// 数据库表字段:comment_id 描述:推荐评论Id
	protected Integer commentId = null;

	/**
	 * 记录编号  get方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 记录编号  set方法
	 * 数据库表字段：id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 图书Id  get方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * 图书Id  set方法
	 * 数据库表字段：book_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public void setBookId(Integer bookid) {
		this.bookId = bookid;
	}

	/**
	 * 书名  get方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public String getBook() {
		return book;
	}

	/**
	 * 书名  set方法
	 * 数据库表字段：book
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public void setBook(String book) {
		this.book = book;
	}

	/**
	 * 推荐评论Id  get方法
	 * 数据库表字段：comment_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public Integer getCommentId() {
		return commentId;
	}

	/**
	 * 推荐评论Id  set方法
	 * 数据库表字段：comment_id
	 * @author moshco zhu
	 * @开发时间：2016-10-19 14:30:57 954
	 */
	public void setCommentId(Integer commentid) {
		this.commentId = commentid;
	}

}