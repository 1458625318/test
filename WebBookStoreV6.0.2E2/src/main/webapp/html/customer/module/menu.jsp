<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="verify_login.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br />
<ul>
	<li class="my-space">
		<a <c:if test="${param.current eq 'my-space' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_space/main.action"></a>
	</li>
	<li class="my-address">
		<a <c:if test="${param.current eq 'my-address' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_address/main.action"></a>
	</li>
	<li class="my-account">
		<a <c:if test="${param.current eq 'my-account' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_account/main.action"></a>
	</li>
	<li class="my-order">
		<a <c:if test="${param.current eq 'my-order' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_order/main.action"></a>
	</li>
	<li class="my-book">
		<a <c:if test="${param.current eq 'my-book' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_book/main.action"></a>
	</li>
	<li class="my-comment">
		<a <c:if test="${param.current eq 'my-comment' }">class="current"</c:if>
			href="<%=request.getContextPath() %>/customer/my_comment/main.action"></a>
	</li>
	<li class="exit">
		<a href="<%=request.getContextPath() %>/customer/logout.action"></a>
	</li>
</ul> 
    