<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../../module/verify_login.jsp"%>

<c:choose>
	<c:when test="${not empty currentPageList }">
	
		<span class="title">共查询到${totalRecord }条记录，查询结果列表如下：</span>
		
		<div class="panel data-table-panel">
			<div class="row title">
				<div class="cell id w40">编号</div>
				<div class="cell business w90">业务</div>
				<div class="cell trade-type w90">交易类型</div>
				<div class="cell direction w70">收入/支出</div>
				<div class="cell trade-money w80">交易金额</div>
				<div class="cell after-money w80">交易后余额</div>
				<div class="cell trade-time w110">交易时间</div>
				<div class="cell remark last w50">备注</div>
			</div>
			<div class="panel data-list-panel">
				<c:forEach items="${currentPageList }" var="tradeRecord" varStatus="vs">
				<div class="row data-row <c:if test="${vs.last }">last</c:if>">
					<div class="cell id center w40">${vs.count }</div>
					<div class="cell business w90">${tradeRecord.business }</div>
					<div class="cell trade-type w90">${tradeRecord.tradeType }</div>
					<div class="cell direction center w70">
						<c:if test="${tradeRecord.direction eq 0 }">支出</c:if>
						<c:if test="${tradeRecord.direction eq 1 }">收入</c:if>
					</div>
					<div class="cell trade-money w80 right">￥${tradeRecord.tradeMoney }</div>
					<div class="cell after-money w80 right">￥${tradeRecord.afterMoney }</div>
					<div class="cell trade-time center w110">
						<fmt:formatDate value="${tradeRecord.tradeTime }" pattern="yyyy-MM-dd HH:mm"/>
					</div>
					<div class="cell remark last w50">${tradeRecord.remark }</div>
				</div>
				</c:forEach>
			</div>
		</div>
		<div class="panel pagination-bar-panel">
			<div class="unit total-info">
				每页显示${pageSize }条&nbsp;${pageIndex }/${totalPage }
			</div>
			<div class="unit navigation">
				<c:if test="${pageIndex > 1 }">
				<a class="item" href="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action" 
					paramUrl="pageIndex=1&pageSize=${pageSize }${paramUrl }" 
					onclick="return goPage1($(this));">第一页</a>
				<a class="item" href="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action"
					paramUrl="pageIndex=${pageIndex - 1 }&pageSize=${pageSize }${paramUrl }" 
					onclick="return goPage1($(this));">上一页</a>
				</c:if>
				<c:if test="${pageIndex < totalPage }">
				<a class="item" href="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action"
					paramUrl="pageIndex=${pageIndex + 1 }&pageSize=${pageSize }${paramUrl }" 
					onclick="return goPage1($(this));">下一页</a>
				<a class="item" href="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action"
					paramUrl="pageIndex=${totalPage }&pageSize=${pageSize }${paramUrl }" 
					onclick="return goPage1($(this));">最后一页</a>
				</c:if>
			</div>
			<div class="unit r change-page-size">
				<span class="text">每页显示</span>
				<select name="pageSize" onchange="goPage3($(this));"
					url="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action" 
					paramUrl="pageIndex=${pageIndex }${paramUrl }">
					<option value="2" <c:if test="${pageSize eq 2 }">selected</c:if>>2</option>
					<option value="5" <c:if test="${pageSize eq 5 }">selected</c:if>>5</option>
					<option value="10" <c:if test="${pageSize eq 10 }">selected</c:if>>10</option>
					<option value="20" <c:if test="${pageSize eq 20 }">selected</c:if>>20</option>
					<option value="50" <c:if test="${pageSize eq 50 }">selected</c:if>>50</option>
				</select>
				<span class="text">条记录</span>
			</div>
			<div class="unit r go-page">
				<span class="text">去第</span>
				<input type="text" name="pageIndex" value="${pageIndex }" />
				<span class="text">页</span>
				<button class="action" onclick="goPage2($(this));" 
					url="<%=request.getContextPath() 
					%>/customer/my_account/account/queryTradeRecord.action" 
					paramUrl="pageSize=${pageSize }${paramUrl }">go</button>
			</div>
			<div class="clear"></div>
		</div>
	
	
	</c:when>
	<c:otherwise>
	
		<span class="title">没有找到数据。</span>
		
		<div class="panel data-table-panel">
			<div class="row title">
				<div class="cell id w40">编号</div>
				<div class="cell business w90">业务</div>
				<div class="cell trade-type w90">交易类型</div>
				<div class="cell direction w70">收入/支出</div>
				<div class="cell trade-money w80">交易金额</div>
				<div class="cell after-money w80">交易后余额</div>
				<div class="cell trade-time w110">交易时间</div>
				<div class="cell remark last w50">备注</div>
			</div>
			<div class="panel data-list-panel">
				<div class="row data-row last">
					<div class="cell id center w40"></div>
					<div class="cell business w90"></div>
					<div class="cell trade-type w90"></div>
					<div class="cell direction center w70">
					</div>
					<div class="cell trade-money w80 right"></div>
					<div class="cell after-money w80 right"></div>
					<div class="cell trade-time center w110">
					</div>
					<div class="cell remark last w50"></div>
				</div>
			</div>
		</div>
			
		
	</c:otherwise>
</c:choose>