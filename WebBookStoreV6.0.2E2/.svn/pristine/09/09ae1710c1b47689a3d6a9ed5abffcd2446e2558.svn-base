<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../module/verify_login.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<meta name="keywords" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<link rel="Bookmark" href="<%=request.getContextPath() %>/images/module/logo.ico">
<link rel="Shortcut Icon" href="<%=request.getContextPath() %>/images/module/logo.ico">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/js/module/jquery-ui-1.10.4/development-bundle/themes/base/jquery.ui.all.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/customer/customer.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/customer/my_account/account/return_recharge_result/return_recharge_result.css" />
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-1.10.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-ui-1.10.4/jquery-ui-1.10.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/customer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/my_account/account/return_recharge_result.js"></script>
<title>账户 - 万维网上书城</title>
</head>
<body>
	<div class="page-head">
		<jsp:include page="../../module/page_head.jsp" flush="true"></jsp:include>
	</div>
	<div class="page-middle">
		<div class="menu">
			<jsp:include page="../../module/menu.jsp" flush="true">
				<jsp:param name="current" value="my-account" />
			</jsp:include>
		</div>
		<div class="page-content">
			<div class="row tab-group">
				<jsp:include page="../module/menu.jsp" flush="true">
					<jsp:param name="current" value="account" />
				</jsp:include>
			</div>
			<!-- 充值返回信息 -->
			<div class="panel return-recharge-info">
				<c:choose>
				<c:when test="${verifyResult }">
				<div class="row message">${message }</div>
				<div class="row line">
					<div class="item recharge-money">
						<span class="label">充值金额：</span> 
						<span class="value">￥${rechargeMoney }</span>
					</div>
					<div class="item recharge-result">
						<span class="label">充值结果：</span> 
						<span class="value">
							<c:choose>
								<c:when test="${isRecharge }">充值成功</c:when>
								<c:otherwise>未完完成充值</c:otherwise>
							</c:choose>
						</span>
					</div>
					<span class="clear"></span>
				</div>
				<div class="row line">
					<div class="item balance">
						<span class="label">账户余额：</span> 
						<span class="value">￥${totalMoney }</span>
					</div>
					<div class="item freezing-amount">
						<span class="label">冻结金额：</span> 
						<span class="value">￥${lockMoney }</span>
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
								<span class="editable"><input type="text" 
									name="rechargeMoney" value=""></span>
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
				<div class="row line"></div>
				<br />
				<br />
				</c:when>
				<c:otherwise>
				<div class="row message">${message }</div>
				</c:otherwise>
			</c:choose>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="page-footer">
		<jsp:include page="../../module/page_footer.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>