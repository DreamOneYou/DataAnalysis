<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加器材</title>
	<link rel="stylesheet" type="text/css" href="css/self/manager.css">
	<link rel="stylesheet" type="text/css" href="css/self/addUser.css">
 	<link rel="stylesheet" type="text/css" href="css/Asset/addAsset.css">
 	<script type="text/javascript" src="myAJAX/ajax_twoAsset.js"></script>
  </head>
  
  <body>
    <jsp:include flush="true" page="/WEB-INF/self/h_head.jsp"></jsp:include>
   <div class="manager">
   		<jsp:include flush="true" page="/WEB-INF/self/menu.jsp"></jsp:include>
   		<div class="content_add">
   			<div class="position">
   				<span class="span2">当前位置:人员管理 &nbsp;>&nbsp;新增器材</span>
   			</div>
   			<div class="add_user">
   			<form action="${pageContext.request.contextPath}/asset_toListPage.action" method="post" >
   				<table class="add_table">
   					<tr>
   						<td>器材厂商:</td>
   						<td>
							<select name="sid">
							<c:forEach var="firmlist" items="${firmlist}">
								<option value="${firmlist.sid}">
	   								----${firmlist.firm_name}----
								</option>
							</c:forEach>
							</select>
						</td>
						
   					</tr>
   					<tr>
   					<td width="90">器材名称:</td>
	   					<td><input type="text"  maxlength="50" name="a_name"></td>
   						<!-- 一级器材类别 -->
   						<td>器材类型:</td>
   						<td>
							<select name="a_type_id">
							<c:forEach var="oneType" items="${onelist}">
								<option value="${oneType.a_type_id}">
	   							----${oneType.type_name}----
								</option>
								</c:forEach>
							</select>
						</td>
   					
   					</tr>
   					<tr>
   						<td width="90">器材用途:</td>
   						<td><input type="text" maxlength="20" name="a_use"></td>
	   					<td width="90">具体类别:</td>
	   					<td><input id="type" type="text" name="a_type_id" onclick="changeStatus()"></td>
	   					
   					</tr>
   					<tr>
	   					<td>价&nbsp;&nbsp;&nbsp;&nbsp;格:</td>
	   					<td><input type="text" maxlength="50" name="a_money"></td>
	   					<td>描述商家:</td>
	   					<td><input type="text" maxlength="20" name="a_application"></td>
   					</tr>
   					<tr>
   						<td>使用年限:</td>
	   					<td><input type="text" maxlength="50" name="a_userLife"></td>
   						<td>购买日期:</td>
   						<td><input  type="text" maxlength="50" name="s_city" value="2017/09/13"></td>
   					</tr>
   					<tr>
   						<td>具体产地 :</td>
   						<td><input type="text"  maxlength="20" name="a_address"></td>
	   					<!-- <td>上传图片:</td>
	   					<td><input type="file" name="photo"></td> -->
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
   
   <div class="divSch" id="Twodiv">
   	
   	<table border="1" height="50px" width="300px" bordercolor="#C3C3C3" cellspacing="0">
  	
   	
   	<!-- 二级器材类别 -->
   	<tr>
   		<td bordercolor="#C3C3C3">
   			<div class="twoType" id="twoType">
   				<table  width="97%">
   					<tr>
   					<td>
		   				<c:forEach var="twoAsset" items="${twolist}">
		   				<a onclick="setTwoAsset(this)" href="javascript:void(0)" id="${twoAsset.a_twotype_id}" 
		   				coords="${twoAsset.a_one_id}">${twoAsset.type_name } |</a>
		   				</c:forEach>
	   				</td>
   					</tr>
   				</table>
   			</div>
   		</td>
   	</tr>
   	
   	<!-- 三级器材类别 -->
   	<tr>
   		<td  valign="top" bordercolor="#C3C3C3">
   			<div class="threeType">
   				<table width="97%">
   					<tr>
			   			<c:forEach var="threeAsset" items="${threelist}" varStatus="vs">
			   			<td>
			   				<li>
			   				<a href="javascript:void(0)" id="threeAsset.a_threetype_id"
			   				>*${threeAsset.type_name }</a>
			   				</li>
			   			</td>
			   			<c:if test="${vs.count%3==0}"></tr><tr></c:if>
			   			</c:forEach>
   					</tr>
   				</table>
   			</div>
   		</td>
   	</tr>
   	<tr>
   		<td align="right" bordercolor="#FFFFFF">
   			<input class="typeInput" type="submit" onclick="closeAsset()" value="关闭窗口" />
   		</td>
   	</tr>
   	</table>
   </div>
  </body>
</html>
