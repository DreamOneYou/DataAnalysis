<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>资产分析系统首页</title>
    
	<link href="css/home.css" rel="stylesheet" />

	<script>
	function colorchange1(obj){
		obj.style.background="#4CCFEB";
	}
	function colorchange2(obj){
		obj.style.background="#BECAF2";
	}
	</script>
  </head>
  
  <body>

  	<jsp:include flush="true" page="head.jsp"></jsp:include>
    		<div id="Content">
			<div class="left">
				<div class="left_ret">
				<div class="left_ret1">
					<span>信息检索</span>
				</div>
				<form class="gjc">
					<p>关键词:</p>
					<input type="text" style="width:150px;height:30px;border:1px solid #CCFFCC; ">
					<input class="stubiao" type="image" src="image/index_image.gif">
				</form>
			</div>
			<div class="left_nav">
				<span>系统导航</span>
				<div class="XtNav">
					<ul>
						<li><a href="#">设备采购网</a></li>
						<li><a href="#">设备软件申购</a></li>
						<li><a href="#">贵重设备共享</a></li>
						<li><a href="#">设备报废管理</a></li>
						<li><a href="#">公房出租管理</a></li>
						<li><a href="#">废旧物资处理</a></li>
					</ul>
				</div>
			</div>
			</div>
			<div class="right">
				<div class="box1">
					<span>工作动态</span>
					<ul>
						<li>><a href="#">XXX校园扩建工程道路工程设计中标公示 </a></li>
						<li>><a href="#">XXX宣传部宣传专用设备采购项目招标公告 </a></li>
						<li>><a href="#">XXX图书馆2017年纸质图书采购项目二次公开招标变更公告 </a></li>
						<li>><a href="#">招聘公示：XXX2017年非事业编制合同聘用专任教师招聘拟聘人员公示（第三批） </a></li>
						<li>><a href="#">XXX2018年“大学生论文相似度检测系统”单一来源采购项目成交公告 </a></li>
						<li>><a href="#">XXX2016-2017学年度信息公开工作年度报告 </a></li>
						<li>><a href="#">XXX2017年外文电子资源回溯单一来源采购项目公示 </a></li>
						<li>><a href="#">宁夏国家安全机关举报须知 </a></li>
						<li>><a href="#">XXX档案整理采购项目中标公告 </a></li>
					</ul>
				</div>
				<div class="box2">
					<span>通知公告</span>
					<ul>
						<li>><a href="#">XXX校园扩建工程道路工程设计中标公示 </a></li>
						<li>><a href="#">XXX宣传部宣传专用设备采购项目招标公告 </a></li>
						<li>><a href="#">XXX图书馆2017年纸质图书采购项目二次公开招标变更公告 </a></li>
						<li>><a href="#">招聘公示：XXX2017年非事业编制合同聘用专任教师招聘拟聘人员公示（第三批） </a></li>
						<li>><a href="#">XXX2018年“大学生论文相似度检测系统”单一来源采购项目成交公告 </a></li>
						<li>><a href="#">XXX2016-2017学年度信息公开工作年度报告 </a></li>
						
						
					</ul>
				</div>
				<div class="box3">
					<div id="bg">
						<span><a href="#" onmouseover="colorchange1(this)" onmouseout="colorchange2(this)">政策法规</a></span>
						<span><a href="#" onmouseover="colorchange1(this)" onmouseout="colorchange2(this)">下载专区</a></span>
					</div>
					<div>
					
					</div>
				</div>
				<div id="foot">
					<div class="bm">
						<table>
							<tr>
								<td width="150px"><a href="#">71电影网</a></td>
								<td><a href="#">40网</a></td>
							</tr>
							<tr>
								<td><a href="#">XXX官网</a></td>
								<td><a href="#">41网</a></td>
							</tr>
							<tr>
								<td><a href="#">71电影网</a></td>
								<td><a href="#">71电影网</a></td>
							</tr>
						</table>
					</div>
					<div class="lj">
						<table>
							<tr>
								<td width="150px"><a href="#">80电影网</a></td>
								<td><a href="#">40网</a></td>
							</tr>
							<tr>
								<td><a href="#">XXX官网</a></td>
								<td><a href="#">41网</a></td>
							</tr>
							<tr>
								<td><a href="#">71电影网</a></td>
								<td><a href="#">71电影网</a></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			
		</div>
		<jsp:include flush="true" page="tail.jsp"></jsp:include>
  </body>
</html>
