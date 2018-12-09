/**
 * 
 * 
 * 创建时间：2016-8-26 上午10:41:42
 * @author：moshco zhu
 */
package cn.jbit.mhpay.ws;

import java.io.Serializable;
import java.util.List;

import cn.jbit.mhpay.entity.TradeRecord;

/**
 * 交易记录分页查询结果
 * 
 * 创建时间：2016-8-26 上午10:41:42
 * 
 * @author moshco zhu
 * 
 */
public class PaginationTradeRecord implements Serializable {

	// 总记录数
	protected Integer totalRecord = null;

	// 当前页列表
	protected List<TradeRecord> currentPageList = null;

	/**
	 * 
	 * 构造函数
	 * 
	 * 开发时间：2016-8-26 上午10:43:22
	 * 
	 * @author：moshco zhu
	 */
	public PaginationTradeRecord() {
	}

	/**
	 * 
	 * 构造函数
	 * 
	 * 开发时间：2016-8-26 上午10:38:28
	 * 
	 * @author：moshco zhu
	 * @param pagination
	 */
	public PaginationTradeRecord(Object[] pagination) {
		if (pagination != null && pagination.length == 2) {
			// 总记录数
			totalRecord = (Integer) pagination[0];
			// 当前页列表
			currentPageList = (List<TradeRecord>) pagination[1];
		}
	}

	/**
	 * @return the totalRecord
	 */
	public Integer getTotalRecord() {
		return totalRecord;
	}

	/**
	 * @param totalRecord
	 *            the totalRecord to set
	 */
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	/**
	 * @return the currentPageList
	 */
	public List<TradeRecord> getCurrentPageList() {
		return currentPageList;
	}

	/**
	 * @param currentPageList
	 *            the currentPageList to set
	 */
	public void setCurrentPageList(List<TradeRecord> currentPageList) {
		this.currentPageList = currentPageList;
	}

}
