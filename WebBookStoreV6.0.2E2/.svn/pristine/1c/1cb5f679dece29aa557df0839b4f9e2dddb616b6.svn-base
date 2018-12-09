<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书" />
<meta name="keywords" content="万维网上书城、万维网、万维书城、万维网络科技、买书、新书、好书" />
<link rel="Bookmark"
	href="<%=request.getContextPath()%>/images/module/logo.ico">
<link rel="Shortcut Icon"
	href="<%=request.getContextPath()%>/images/module/logo.ico">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/admin/admin.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/admin/login/login.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/module/jquery-1.10.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() 
	%>/js/admin/admin.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/admin/login.js"></script>
<title>管理平台登录 - 万维网上书城</title>
</head>
<body>
	<div class="page-head">
		<jsp:include page="module/page_head.jsp" flush="true"></jsp:include>
	</div>
	<div class="page-middle">
		<form name="frmLogin"
			action="<%=request.getContextPath()%>/admin/login.action"
			method="post">
			<div class="row">
				<div class="login-icon"></div>
			</div>
			<div class="row">
				<span class="label user-name"></span>
				<span class="editable">
					<input type="text" name="userName" value="admin" />
				</span>
				<span class="clear"></span>
			</div>
			<div class="row">
				<span class="label password"></span>
				<span class="editable">
					<input type="password" name="password" value="1" />
				</span>
				<span class="clear"></span>
			</div>
			<div class="row">
				<span class="label verify-code"></span>
				<span class="editable">
					<input type="text" name="verifyCode" value="" />
				</span>
				<span class="readonly">
					<input type="image" title="验证码"
						src="<%=request.getContextPath()
						%>/showVerifyCode.action?actionPlace=员工登录&p=<%=System.currentTimeMillis()%>"
						onclick="return changeVerifyCode($(this));" />
				</span>
				<span class="readonly">
					<a href="#"
						onclick="return changeVerifyCode($(this));">看不清，换一张</a>
				</span>
				<span class="clear"></span>
			</div>
			<div class="row">
				<span class="label"></span>
				<span class="readonly">
					<button type="submit"></button>
					<button type="reset"></button>
				</span>
				<span class="readonly">
					<a class="register" href="#">注册新用户</a>
				</span>
				<span class="clear"></span>
			</div>
			<c:if test="${not empty message }">
			<div class="row">
				<span class="readonly message">${message }</span>
			</div>
			</c:if>
		</form>
	</div>
	<div class="page-footer">
		<jsp:include page="module/page_footer.jsp" flush="true"></jsp:include>
	</div>
</body>
</html>