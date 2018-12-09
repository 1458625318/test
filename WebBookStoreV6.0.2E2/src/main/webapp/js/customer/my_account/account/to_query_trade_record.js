// 构建日历组件
$("input[name=tradeTime1],input[name=tradeTime2]").datepicker({
			showOtherMonths : true,// 可以显示其它月份
			selectOtherMonths : true,// 可以选中其它月份
			dateFormat : "yy-mm-dd"// 日历值格式化
		});

// 单击查询按钮
$("button.action.query-trade-record").click();

/**
 * 查询交易记录
 * 
 * 开发时间：2016-8-26 上午10:09:18
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 */
function queryTradeRecord(oBtn) {

	try {

		// 表单对象
		var oForm = oBtn
				.parents(".form-panel.query-form-panel.query-trade-record:first");

		// 查询参数
		var queryParam = {};
		queryParam["business"] = oForm.find("input[name=business]").val();
		queryParam["tradeType"] = oForm.find("input[name=tradeType]").val();
		queryParam["tradeTime1"] = oForm.find("input[name=tradeTime1]").val();
		queryParam["tradeTime2"] = oForm.find("input[name=tradeTime2]").val();

		// 读取url
		var url = oBtn.attr("url");

		$(".query-result-panel.query-trade-record").html("正在查询数据......");

		// 发出请求
		$.post(url, queryParam, function(htmlContent) {
					// 显示查询结果
					$(".query-result-panel.query-trade-record")
							.html(htmlContent);
				});

	} catch (e) {
		alert(e.message);
	}

}

/**
 * 单击链接
 * 
 * @param {}
 *            linkDiv
 * @return {Boolean}
 */
function goPage1(linkDiv) {
	try {

		// action url
		var url = linkDiv.attr("href");
		// url参数
		var paramUrl = linkDiv.attr("paramUrl");
		// 发出请求
		$.post(url, paramUrl, function(htmlContent) {
					// 显示查询结果
					$(".query-result-panel.query-trade-record")
							.html(htmlContent);
				});

	} catch (e) {
		alert(e.message);
	}
	// 返回函数的值
	return false;
}

/**
 * 单击去第页
 * 
 * @param {}
 *            buttonDiv
 */
function goPage2(buttonDiv) {
	try {

		// 页面序号
		var pageIndex = buttonDiv.parent().find("input[name=pageIndex]").val();
		if (isNaN(pageIndex)) {
			alert("请输入一个有效的页面序号。");
			return;
		}

		// action url
		var url = buttonDiv.attr("url");
		// url参数
		var paramUrl = buttonDiv.attr("paramUrl") + "&pageIndex=" + pageIndex;
		// 发出请求
		$.post(url, paramUrl, function(htmlContent) {
					// 显示查询结果
					$(".query-result-panel.query-trade-record")
							.html(htmlContent);
				});

	} catch (e) {
		alert(e.message);
	}
}

/**
 * 改变页面尺寸
 * 
 * @param {}
 *            selectDiv
 */
function goPage3(selectDiv) {
	try {

		// 页面尺寸
		var pageSize = selectDiv.val();

		// action url
		var url = selectDiv.attr("url");
		// url参数
		var paramUrl = selectDiv.attr("paramUrl") + "&pageSize=" + pageSize;
		// 发出请求
		$.post(url, paramUrl, function(htmlContent) {
					// 显示查询结果
					$(".query-result-panel.query-trade-record")
							.html(htmlContent);
				});

	} catch (e) {
		alert(e.message);
	}
}
