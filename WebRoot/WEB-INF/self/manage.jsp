<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎进入后台管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	
	<script type="text/javascript" src="js/publicJs.js" ></script>
	<script type="text/javascript" src="js/jquery-1.3.1.js" ></script> 
  </head>
  
  <body>
  
  <!-- 控制用户是否正确登录 -->
   	   <%--  <%
  	String s = (String)session.getAttribute("MyName");
  	if(s==null){
  		response.sendRedirect("login.jsp?err=1");
  	}
   %> --%>
	<jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content">
   			<div class="position">
   				<span class="span2">当前位置:</span>
   			</div>
   			<div id="text">
   				欢迎登陆资产分析系统
   			</div>
   		</div>
   </div>
   <jsp:include flush="true" page="tails.jsp"></jsp:include>
  </body>
</html>
