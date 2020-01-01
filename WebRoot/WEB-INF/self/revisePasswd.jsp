<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
    
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	<link rel="stylesheet" type="text/css" href="css/self/addUser.css">

  </head>
  
  <body>
    <jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content_add">
   			<div class="position">
   				<span class="span2">当前位置:人员管理 &nbsp;>&nbsp;修改密码</span>
   			</div>
   			<div>
   				<form action="${pageContext.request.contextPath}/user_revisePasswd.action" method="post">
   				<input type="hidden" name="adminID" value="${userOne.adminID }">
   				<table class="rp_table" border="0">
   					<tr>
   						<td colspan="2" style="padding-left: 150px;"><span>更改密码</span></td>
   					</tr>
   					<tr>
   						<td class="rp_td">用户名:</td>
   						<td><input type="text" maxlength="20" name="username" value="${userOne.username }"></td>
   					</tr>
   					<tr>
   						<td class="rp_td">学号:</td>
   						<td><input type="text" maxlength="10" name="number" value="${userOne.number }"></td>
   					</tr>
   					<tr>
   						<td class="rp_td">旧密码:</td>
   						<td><input type="password" maxlength="20" name="password"></td>
   					</tr>
   					<tr>
   						<td class="rp_td">新密码:</td>
   						<td><input type="password" maxlength="20" name="newpassword"></td>
   					</tr>
   					<tr>
   						<td ></td>
   						<td>&nbsp;<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;<input type="submit" value="保存"></td>
   					</tr>
   				</table>
   				</form>
   			</div>
   		</div>
   </div>
   <jsp:include flush="true" page="/WEB-INF/public/tail.jsp"></jsp:include>
  </body>
</html>
