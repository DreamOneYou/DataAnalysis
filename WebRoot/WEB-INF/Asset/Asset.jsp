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
    
    <title>各类设备总数一览表</title>
    
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	<link rel="stylesheet" type="text/css" href="css/Asset/asset.css">
  </head>
  
  <body>
   	<jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content">
   			<div class="position">
   				<span class="span2">当前位置:统计分析>各类设备总数一览表</span>
   			</div>
   			<div>
   				<table border="1" class="asset_table">
   					<tr class="asset_tr">
   						<td>类别</td>
   						<td>总数</td>
   						<td>操作</td>
   					</tr>
   					<c:forEach items="${assetpagebean.list}" var="asset">
   					<tr>
   						<td>${asset.a_type}</td>
   						<td></td>
   						<td></td>
   					</tr>
   					</c:forEach>
   				</table>
   			</div>
   		</div>
   </div>
   <jsp:include flush="true" page="/WEB-INF/self/tails.jsp"></jsp:include>
  </body>
</html>
