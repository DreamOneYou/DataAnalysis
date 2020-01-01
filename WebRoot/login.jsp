<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/login.css">
  </head>
  
  <body>
   <%
 	String err = request.getParameter("err");
 	if(err!=null){
 		if(err.equals("1")){
 			out.print("<font color=red>未登录，请登录</font>");
 		}
 	}
  %>
    <form action="${pageContext.request.contextPath}/user_login.action " method="post"> 
	<div id="head">
	 
	<img src="image/login.gif">
	
	</div>
	<div id="middle">
		<div class="mid_one">
			<div class="mid_left">
				<div class="logintitle">用户登录</div>
				<div class="box">
					<table width:300px border="0">
						<tbody>
							<tr>
								<td class="trclass">用户名：</td>
								<td><input type="text" class="input" maxlength="32" style="width:200px; height:30px" name="username"></td>
							<tr>
								<td class="trclass">密码：</td>
								<td><input type="password" class="input" maxlength="32" style="width:200px;height:30px" name="password"></td>
							</tr>
							
							<tr>
								<td colspan="2" style="padding-top:10px; padding-right:10px;" align="right">
								<a href="#" target="_blank" style="color:blue">注册</a>&nbsp;&nbsp;
								<a href="#" target="_blank" style="color:blue">忘记密码</a>					
								<input class="submit" type="submit" value="确认登录">
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div id="foot">
	<p>版权所有&nbsp;2015&nbsp;回忆瞬间&nbsp;联系电话：18795195020&nbsp;邮箱：965800236@qq.com</p>
	</div>
</form>
  </body>
</html>
