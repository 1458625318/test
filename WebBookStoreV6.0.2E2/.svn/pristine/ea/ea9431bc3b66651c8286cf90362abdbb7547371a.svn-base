<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../module/verify_login.jsp" %>

<div class="row">
	<div class="item balance">
		<span class="label">账户余额：</span> 
		<span class="value">￥${userAccount.totalMoney }</span>
	</div>
	<div class="item freezing-amount">
		<span class="label">冻结金额：</span> 
		<span class="value">￥${userAccount.lockMoney }</span>
	</div>
	<span class="clear"></span>
</div>
<div class="row line">
	<div class="item to-recharge">
		<span class="label">去充值：</span> 
		<a class="link" href="<%=request.getContextPath() 
			%>/customer/my_account/account/submitRecharge.action"
			onclick="return toRecharge($(this));"></a>
		<form name="frmRecharge" class="to-recharge-form" style="display: none;">
			<div class="row">
				<span class="label">请输入充值金额：￥</span>
				<span class="editable"><input type="text" name="rechargeMoney" value=""></span>
				<span class="readonly">（必须填写。）</span>
				<span class="clear"></span>
			</div>
			<div class="row message hidden"></div>
			<input type="hidden" name="cookie-path" value="<%=request.getContextPath() 
				%>/html/customer/my_account/account" >
		</form>
		<iframe id="ifRefreshCookie" name="ifRefreshCookie" url="<%=request.getContextPath() 
			%>/html/customer/my_account/account/refresh_cookie.html" src=""
			onload="javascript:checkCookie(this);"
			style="width: 0px;height: 0px;border: 0px;" frameborder="0"></iframe>
	</div>
	<span class="clear"></span>
</div>