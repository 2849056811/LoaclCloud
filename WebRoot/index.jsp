<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>永恒黑暗</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="js/themes/gray/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/ztree/zTreeStyle.css">
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/ztree/jquery.ztree.core.js"></script>
	<script type="text/javascript">
	function clickFile() {
			fileDiv.style.display="block";
			floppyDiv.style.display="none";
			showDiv.style.display="none";
	}
	function clickFloppy() {
			fileDiv.style.display="none";
			floppyDiv.style.display="block";
			showDiv.style.display="none";
	}
	function clickShow() {
			fileDiv.style.display="none";
			floppyDiv.style.display="none";
			showDiv.style.display="block";
	}
	function clickcloppy1() {
		var clickcloppy=document.getElementById("cloppy1");
		if(clickcloppy.style.display=="block"){
			clickcloppy.style.display="none";
		}else{
			clickcloppy.style.display="block";
		}
	}
	function clickcloppy2() {
		var clickcloppy=document.getElementById("cloppy2");
		if(clickcloppy.style.display=="block"){
			clickcloppy.style.display="none";
		}else{
			clickcloppy.style.display="block";
		}
	}
	function clickcloppy3() {
		var clickcloppy=document.getElementById("cloppy3");
		if(clickcloppy.style.display=="block"){
			clickcloppy.style.display="none";
		}else{
			clickcloppy.style.display="block";
		}
	}
	var zTreeObj,
	setting = {
		view: {
			selectedMulti: false,
			fontCss:{color:"#ffffff"}
		}
	},
	zTreeNodes = [
		{"name":"cloppy1", open:true, children: [
			{ "name":"文件夹", "url":"",open:true,
				children: [
					{"name":"文件夹","url":"",open:true},
					{"name":"文件","url":""}
				]
			},
			{ "name":"文件", "url":"", "target":"_blank"},
			{ "name":"文件", "url":"", "target":"_blank"}
			]
		}
	];

	$(document).ready(function(){
		zTreeObj = $.fn.zTree.init($("#tree"), setting, zTreeNodes);

	});
	</script>
  </head>
  
  <body bgcolor="#000000">
  	<div style="position:relative;height: 20%">
  		<div style="position:relative;height:100%;width:10%">
	  		<ul type="none">
	  			<li style="color: #ffffff;background-color:#1c1c1c">
	  				<a onclick="clickFile()">文件</a>
	  			</li>
	  			<li style="color: #ffffff;background-color:#1c1c1c">
	  				<a onclick="clickFloppy()">软盘</a>
	  			</li>
	  			<li style="color: #ffffff;background-color:#1c1c1c">
	  				<a onclick="clickShow()">查看</a>
	  			</li>
	  		</ul>
  		</div>
  		<div id="fileDiv" style="position:relative;height:100%;width:90%;top:-100%;left:10%;background-color:#2d2d2d">
  			<font color="#ffffff" >最新添加</font><br>
  			<font color="#ffffff">删除记录</font>
  		</div>
  		<div id="floppyDiv" style="position:relative;height:100%;width:90%;top:-100%;left:10%;display:none;background-color:#2d2d2d">
  			<font color="#ffffff">新增软盘</font><br><font color="#ffffff">删除软盘</font>
  		</div>
  		<div id="showDiv" style="position:relative;height:100%;width:90%;top:-100%;left:10%;display:none;background-color:#2d2d2d">
  			<font color="#ffffff">最近访问</font><br><font color="#ffffff">添加文件</font><br><font color="#ffffff">删除文件</font>
  		</div>
  	</div>
  	<div style="position:relative;height: 80%;">
  		<div style="height: 100%;width:20%">
  			<ul id="tree" class="ztree" style="width:230px; overflow:auto;"></ul>
  		</div>
  		<div style="position:relative;height: 100%;width:80%;background-color: #1c1c1c;left:20%;top:-100%"></div>
  	</div>
  </body>
</html>
