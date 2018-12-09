<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../module/verify_login.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<meta name="keywords" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<link rel="Bookmark" href="<%=request.getContextPath() %>/images/module/logo.ico">
<link rel="Shortcut Icon" href="<%=request.getContextPath() %>/images/module/logo.ico">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/js/module/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/js/module/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/admin/admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/admin/home/main/main.css" />
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/easyui/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/admin/admin.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/admin/home/main.js"></script>
<title>管理平台主页 - 万维网上书城</title>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:true" class="top">
		<jsp:include page="module/page_head.jsp" flush="true"></jsp:include>
	</div>
	<div data-options="region:'west',split:true,border:true" class="left-menu">
		<jsp:include page="module/menu.jsp" flush="true"></jsp:include>
	</div>
	<%
		String message = request.getParameter("message");
		if (message != null) {
			message = new String(message.getBytes("iso-8859-1"), "utf-8");
		}else{
			message = "";
		}
	%>
	<div data-options="region:'center',border:true" class="page pg34234524" 
		default-url="<%=request.getContextPath() 
		%>/html/admin/home/welcome.jsp?message=<%=message %>"
		cookie-name="webbs2<%=session.getAttribute("adminId") %>LastUrl">
	</div>
	<div data-options="region:'south',border:true" class="bottom">
		<jsp:include page="module/page_footer.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>