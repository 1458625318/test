<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../module/verify_login.jsp" %>

	<div class="form-panel query-form-panel query-trade-record">
		<div class="title">查询</div>
		<div class="content">
			<div class="unit">
				<span class="label">业务：</span>
				<span class="field">
					<input type="text" name="business" value="" />
				</span>
				<span class="clear"></span>
			</div>
			<div class="clear" ></div>
			<div class="unit">
				<span class="label">交易类型：</span>
				<span class="field">
					<input type="text" name="tradeType" value="" />
				</span>
				<span class="clear"></span>
			</div>
			<div class="unit">
				<span class="label">交易时间：</span>
				<span class="field">
					<input type="text" name="tradeTime1" value="" />
				</span>
				<span class="text">至</span>
				<span class="field">
					<input type="text" name="tradeTime2" value="" />
				</span>
				<span class="clear"></span>
			</div>
			<div class="unit">
				<button type="button" class="action query-trade-record"
					url="<%=request.getContextPath() 
						%>/customer/my_account/account/queryTradeRecord.action" 
					onclick="queryTradeRecord($(this));">查询</button>
				<span class="clear"></span>
			</div>
			<span class="clear"></span>
		</div>
	</div>
	
	<div class="query-result-panel query-trade-record"></div>
	
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/js/module/jquery-ui-1.10.4/development-bundle/themes/ui-lightness/jquery.ui.all.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/customer/my_account/account/to_query_trade_record/to_query_trade_record.css" />
	
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-ui-1.10.4/development-bundle/ui/i18n/jquery.ui.datepicker-zh-CN.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/my_account/account/to_query_trade_record.js"></script>
