<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	var strLoginUrl = "<%=request.getContextPath()%>/html/admin/login.jsp";
	if(top != null){
		top.location.href = strLoginUrl;
	}else{
		window.location.href = strLoginUrl;
	}
</script>