<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 验证登录标示
	Integer userId = (Integer) session.getAttribute("customerId");
	if (userId == null) {
		// 消息
		request.setAttribute("message", "请先登录。");
		request.getRequestDispatcher("/html/customer/login.jsp").forward(request, response);
		return;
	}
%>