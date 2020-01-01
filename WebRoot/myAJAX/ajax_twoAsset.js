//显示三级器材信息
function changeStatus(){
	/*window.alert("ok");*/
	/*$("#Twodiv").show();*/
	document.getElementById("Twodiv").style.display="block";
	/*$("#Twodiv").css("display","block");*/
}
//关闭器材窗口
function closeAsset(){
	document.getElementById("Twodiv").style.display="none";
}
var xmlrequest;
function createXMLHttpRequest(){
	if(window.ActiveXobject){
		xmlrequest = new ActiveXobject("Microsoft.XMLHTTP");
	}else{
		xmlrequest = new XMLHttpRequest();
	}
}

//点击相应二级器材类别
function setTwoAsset(o){
	createXMLHttpRequest();
	if(xmlrequest){
		var req = "/ZiChan/ChangeInfoServlet?twoId="+o.id+"&oneAssetTypeId="+o.coords;
		//打开请求
		xmlrequest.open("get", req, "true");
		//指定处理 结果函数
		/*xmlrequest.onreadystatechange = "";*/
		xmlrequest.send();
	}
}
