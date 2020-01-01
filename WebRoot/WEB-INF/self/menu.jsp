<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="man_left">
   		<span class="span1">功能菜单</span>
   		<p  onchange="changeStatus(this)"><a href="#" >+人员管理</a></p>
   			<div class="people">
	   			<table class="menu">
	   				<tr><td><a href="${pageContext.request.contextPath}/firm_toAddPage.action">--&nbsp;新增人员</a></td></tr>
	   				<tr><td><a href="${pageContext.request.contextPath}/firm_listPage.action?currentPage=1">--&nbsp;人员列表</a></td></tr>
	   			</table>
   			</div>
   			<p  onchange="changeStatus(count)"><a href="#">+统计分析</a></p>
   			<div class="count">
	   			<table class="menu">
	   				<tr><td><a href="${pageContext.request.contextPath}/asset_AssetInfo.action">--&nbsp;各类设备总数一览表</a></td></tr>
	   				<tr><td><a href="${pageContext.request.contextPath}/asset_toAddPage.action">--&nbsp;添加器材</a></td></tr>
	   			</table>
   			</div>
   			<p  onchange="changeStatus(data)"><a href="#">+数据分析</a></p>
   			<div class="data">
	   			<table class="menu">
	   				<tr><td><a href="${pageContext.request.contextPath}/analysis_Analysis.action">--&nbsp;主机数据分析</a></td></tr>
	   			</table>
   			</div>
   			<p  onchange="changeStatus(all)"><a href="#">+文章管理</a></p>
   			<div class="all">
	   			<table class="menu">
	   				<tr><td><a href="#">--&nbsp;添加文章</a></td></tr>
	   				<tr><td><a href="#">--&nbsp;管理文章</a></td></tr>
	   			</table>
   			</div>
   			
   			<p  onchange="changeStatus(all)"><a href="#">+图片管理</a></p>
   			<div class="all">
	   			<table class="menu">
	   				<tr><td><a href="#">--&nbsp;添加图片</a></td></tr>
	   				<tr><td><a href="#">--&nbsp;管理图片</a></td></tr>
	   			</table>
   			</div>
   			
   			<p  onchange="changeStatus(system)"><a href="#">+系统管理</a></p>
   			<div class="system">
	   			<table class="menu">
	   				<tr><td><a href="${pageContext.request.contextPath}/system_toSystem.action">--&nbsp;系统日志</a></td></tr>
	   				<tr><td><a href="${pageContext.request.contextPath}/system_information.action">--&nbsp;系统信息</a></td></tr>
	   			</table>
   			</div>
   		</div>