<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'h_head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/self/head.css">
	

  </head>
  
  <body>
    <div class="head"></div>
    <div >
    	<img class="img1" src="image/h_bag.jpg" />
    </div>
    <div id="Nav">
    	<table>
    		<tr>
    			<td width="130">当前用户&nbsp;:&nbsp;${sessionScope.user.username}</td>
    			<td width="90"><a href="${pageContext.request.contextPath}/user_passwd.action?adminId=${sessionScope.user.adminID}"><font color="red">修改密码</font></a></td>
    			<td><a href="${pageContext.request.contextPath}/user_login.action"><font color="red">退出系统</font></a></td>
    		</tr>
    	</table>
    </div>
  </body>
</html>
