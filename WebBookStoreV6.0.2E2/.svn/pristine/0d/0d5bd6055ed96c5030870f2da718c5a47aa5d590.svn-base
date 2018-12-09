<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	// 员工Id
 	Integer adminId = (Integer) session.getAttribute("adminId");
 	// 验证员工Id
 	if (adminId == null) {
 		request.setAttribute("message", "请先登录。");
 		request.getRequestDispatcher("/html/admin/login_redirect.jsp")
 				.forward(request, response);
 		return;
 	}
%>