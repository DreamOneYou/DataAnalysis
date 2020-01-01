<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>人员列表</title>
    
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	<link rel="stylesheet" type="text/css" href="css/self/addUser.css">
	<link rel="stylesheet" type="text/css" href="css/Firm/list.css">

  </head>
  
  <body>
    <jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content_add">
   			<div class="position">
   				<span class="span2">当前位置:人员管理 &nbsp; > &nbsp;人员列表</span>
   			</div>
   			<div class="list_user">
   				<table class="list_table" border="1" cellpadding="0" cellspacing="0">
   					<tr style="border:0px;">
   						<td style="width:70px;text-align: right;border:0px;">公司名称&nbsp;:&nbsp;
   						<td style="border:0px;"><input type="text" width="80" name="firm_name"></td>
   						<td style="border:0px;"><input type="submit" width="40" value="筛选"></td>
   					</tr>
   					<tr class="list_tr">
   						<td>公司名称</td><td>联系人</td><td>移动电话</td>
   						<td>固定电话</td><td>邮箱</td><td>邮政编码</td>
   						<td>网址</td><td>联系地址</td><td width="90">操作</td>
   					</tr>
   					<c:forEach items="${pagebean.list}" var="firm">
   					<tr>
   						<td>${firm.firm_name}</td>
   						<td>${firm.s_name}</td>
   						<td>${firm.s_move_tel}</td>
   						<td>${firm.s_fixed_tel}</td>
   						<td>${firm.s_email}</td>
   						<td>${firm.s_code}</td>
   						<td>${firm.s_web}</td>
   						<td>${firm.s_city}</td>
   						<td><a href="${pageContext.request.contextPath}/firm_delete.action?sid=${firm.sid}">&nbsp;删除</a>
   						&nbsp;&nbsp;
   						<a href="${pageContext.request.contextPath}/firm_revise.action?sid=${firm.sid}">&nbsp;修改</a></td>
   					</tr>
   					</c:forEach>
   					
   					<tr>
   						<td colspan="9">
  <span>
  	<div class="page">
  		共【<b>${pagebean.totalRow}</b>】条记录,共【<b>${pagebean.totalPage}</b>】页,
  		当前第【<b>${pagebean.currentPage}</b>】页
  		<c:if test="${pagebean.currentPage!=1}">
  			【<a href="${pageContext.request.contextPath}/firm_listPage.action?currentPage=${pagebean.currentPage-1}">上一页</a>】
  		</c:if>
  		<c:if test="${pagebean.currentPage!=pagebean.totalPage}">
  			【<a href="${pageContext.request.contextPath}/firm_listPage.action?currentPage=${pagebean.currentPage+1}">下一页</a>】
  		</c:if>
  	</div>
  </span>
   						</td>
   					</tr>
   					
   				</table>
   			</div>
   		</div>
   </div>
   <jsp:include flush="true" page="/WEB-INF/self/tails.jsp"></jsp:include>
  </body>
</html>
