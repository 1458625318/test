/**
 * 
 * 
 * 创建时间：2016-8-26 上午10:22:38
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.my_account.account;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.mhpay.entity.TradeRecord;
import cn.jbit.mhpay.ws.PaginationTradeRecord;
import cn.jbit.webbs.controller.customer.CustomerController;

/**
 * 客户平台 - 我的账户 - 账户：查询交易记录
 * 
 * 创建时间：2016-8-26 上午10:22:38
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.my_account.account.queryTradeRecordController")
@RequestMapping("/customer/my_account/account/")
public class QueryTradeRecordController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-26 上午10:25:42
	 * 
	 * @author：moshco zhu
	 * @param pageIndex
	 * @param pageSize
	 * @param business
	 * @param tradeType
	 * @param tradeTime1
	 * @param tradeTime2
	 * @return
	 */
	@RequestMapping("queryTradeRecord")
	public ModelAndView execute(Integer pageIndex, Integer pageSize,
			String business, String tradeType,
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date tradeTime1,
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date tradeTime2) {

		// 页面序号
		if (pageIndex == null || pageIndex <= 0) {
			pageIndex = 1;
		}
		// 页面尺寸
		if (pageSize == null || pageSize <= 0) {
			pageSize = 10;
		}

		// 查询参数集合
		Map<String, Object> queryParamMap = new HashMap<String, Object>();
		// 查询参数url
		StringBuffer urlParamBuffer = new StringBuffer();

		// 业务
		if (business != null && !business.equals("")) {
			queryParamMap.put("business", business);
			urlParamBuffer.append("&business=");
			urlParamBuffer.append(business);
		}

		// 交易类型
		if (tradeType != null && !tradeType.equals("")) {
			queryParamMap.put("tradeType", tradeType);
			urlParamBuffer.append("&tradeType=");
			urlParamBuffer.append(tradeType);
		}

		// 交易时间
		if (tradeTime1 != null && tradeTime2 != null) {
			queryParamMap.put("tradeTime1", tradeTime1);
			queryParamMap.put("tradeTime2", tradeTime2);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			urlParamBuffer.append("&tradeTime1=");
			urlParamBuffer.append(sdf.format(tradeTime1));
			urlParamBuffer.append("&tradeTime2=");
			urlParamBuffer.append(sdf.format(tradeTime2));
		}

		// 总记录数
		Integer totalRecord = null;
		// 总页数
		Integer totalPage = null;
		// 当前页列表
		List<TradeRecord> currentPageList = null;
		try {
			// 查询数据
			PaginationTradeRecord pagination = payWService
					.queryPaginationTradeRecord(queryParamMap, pageIndex,
							pageSize);
			// 总记录数
			totalRecord = pagination.getTotalRecord();
			// 计算总页数
			totalPage = totalRecord / pageSize;
			if (totalRecord % pageSize > 0) {
				totalPage++;
			}
			// 当前页列表
			currentPageList = pagination.getCurrentPageList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 创建对象
		ModelAndView mav = new ModelAndView();
		// 保存数据
		mav.addObject("paramUrl", urlParamBuffer.toString());
		mav.addObject("totalRecord", totalRecord);
		mav.addObject("totalPage", totalPage);
		mav.addObject("currentPageList", currentPageList);
		mav.addObject("pageIndex", pageIndex);
		mav.addObject("pageSize", pageSize);
		// 设置视图名称
		mav.setViewName("customer/my_account/account/query_trade_record_result");

		// 返回函数值
		return mav;
	}

}
