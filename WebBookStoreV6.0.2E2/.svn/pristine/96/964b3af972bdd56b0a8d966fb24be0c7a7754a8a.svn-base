<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	%>/css/customer/my_account/account/main/main.css" />
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-1.10.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-ui-1.10.4/jquery-ui-1.10.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/customer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/my_account/account/main.js"></script>
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
			<div class="panel my-account-info" url="<%=request.getContextPath() 
				%>/customer/my_account/account/show.action"></div>
			<div class="panel my-trade-record" url="<%=request.getContextPath() 
				%>/html/customer/my_account/account/to_query_trade_record.jsp"></div>
			
		</div>
		<div class="clear"></div>
	</div>
	<div class="page-footer">
		<jsp:include page="../../module/page_footer.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>