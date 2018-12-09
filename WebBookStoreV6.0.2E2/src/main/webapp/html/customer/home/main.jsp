<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/verify_login.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<meta name="keywords" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书">
<link rel="Bookmark" href="<%=request.getContextPath() %>/images/module/logo.ico" />
<link rel="Shortcut Icon" href="<%=request.getContextPath() %>/images/module/logo.ico" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/customer/customer.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() 
	%>/css/customer/home/main/main.css" />
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/module/jquery-1.10.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/customer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/customer/main.js"></script>
<title>客户平台主页 - 万维网上书城</title>
</head>
<body>
	<div class="page-head">
		<jsp:include page="../module/page_head.jsp" flush="true"></jsp:include>
	</div>
	<div class="page-middle">
		<div class="menu">
			<jsp:include page="../module/menu.jsp" flush="true"></jsp:include>
		</div>
		<div class="page-content">
			<div class="welcome">欢迎使用万维网上书城客户平台</div>
			<%
				// 读取消息
				String message = request.getParameter("message");
				if(message != null && !message.equals("")){
					message = new String(message.getBytes("iso-8859-1"),"utf-8");
			%>
			<div class="message"><%=message %></div>
			<%
				}
			%>
			<table class="user-info" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td class="label">姓名：</td>
					<td class="text">${currentUser.trueName }</td>
				</tr>
				<tr>
					<td class="label">帐号：</td>
					<td class="text">${currentUser.userName }</td>
				</tr>
				<tr>
					<td class="label">上一次登录：</td>
					<td class="text">
						<fmt:formatDate value="${currentUser.priorLoginTime }" 
							pattern="yyyy-MM-dd HH:mm"/>
					</td>
				</tr>
				<tr>
					<td class="label">登录次数：</td>
					<td class="text">${currentUser.totalLogin }</td>
				</tr>
				<tr>
					<td class="label">注册时间：</td>
					<td class="text">
						<fmt:formatDate value="${currentUser.createTime }" 
							pattern="yyyy-MM-dd HH:mm"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div class="page-footer">
		<jsp:include page="../module/page_footer.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>