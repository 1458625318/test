<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a class="tab account <c:if test="${param.current eq 'account' }">current</c:if>" 
	href="<%=request.getContextPath() %>/customer/my_account/account/main.action"></a>
<a class="tab withdrawals <c:if test="${param.current eq 'withdrawals' }">current</c:if>" 
	href="<%=request.getContextPath() %>/customer/my_account/withdrawals/main.action"></a>
<a class="tab my_points <c:if test="${param.current eq 'my_points' }">current</c:if>" 
	href="<%=request.getContextPath() %>/customer/my_account/my_points/main.action"></a>
    