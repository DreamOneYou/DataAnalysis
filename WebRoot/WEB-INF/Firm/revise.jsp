<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改信息</title>
    
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	<link rel="stylesheet" type="text/css" href="css/self/addUser.css">

  </head>
  
  <body>
    <jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content_add">
   			<div class="position">
   				<span class="span2">当前位置:人员管理 &nbsp;>&nbsp;修改信息</span>
   			</div>
   			<div class="add_user">
   			<form action="${pageContext.request.contextPath}/firm_update.action" method="post">
   				<input type="hidden" name="sid" value="${firmOne.sid}">
   				<table class="add_table">
   					<tr>
   					<td width="90">公司名称:</td>
   					<td><input type="text"  maxlength="50" name="firm_name" value="${firmOne.firm_name}"></td>
   					<td width="90">联系人:&nbsp;&nbsp;</td>
   					<td><input type="text" maxlength="20" name="s_name" value="${firmOne.s_name}"></td>
   					</tr>
   					<tr>
   					<td>移动电话:</td>
   					<td><input type="text"  maxlength="20" name="s_move_tel" value="${firmOne.s_move_tel}"></td>
   					<td>固定电话:</td>
   					<td><input type="text" maxlength="20" name="s_fixed_tel" value="${firmOne.s_fixed_tel}"></td>
   					</tr>
   					<tr>
   					<td>邮&nbsp;&nbsp;&nbsp;&nbsp;箱:</td>
   					<td><input type="text" maxlength="50" name="s_email" value="${firmOne.s_email}"></td>
   					<td>联系地址:</td>
   					<td><input type="text" maxlength="50" name="s_city" value="${firmOne.s_city}"></td>
   					</tr>
   					<tr>
   					<td>公司介绍:</td>
   					<td><input type="text" maxlength="50" name="s_credit" value="${firmOne.s_credit}"></td>
   					<td>邮政编码:</td>
   					<td><input type="text" maxlength="10" name="s_code" value="${firmOne.s_code}"></td>
   					</tr>
   					<tr>
   					<td>网&nbsp;&nbsp;&nbsp;&nbsp;址:</td>
   					<td><input type="text" maxlength="50" name="s_web" value="${firmOne.s_web}"></td>
   					<td colspan="2"></td>
   					</tr>
   					<tr>
   					<td><input type="submit" style="width:60px;" value="保   &nbsp;&nbsp;存"></td>
   					<td colspan="3"></td>
   					</tr>
   				</table>
   				</form>
   			</div>
   		</div>
   </div>
   <jsp:include flush="true" page="/WEB-INF/self/tails.jsp"></jsp:include>
  </body>
</html>
