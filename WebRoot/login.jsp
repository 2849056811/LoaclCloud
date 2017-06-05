<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>User Login</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- load jquery package -->
	<link rel="stylesheet" type="text/css" href="js/themes/gray/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/themes/icon.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
	
	<style type="text/css">
		#i1{position:absolute;left:200px;top:200px;height: 40%;width: 30%;}
		.i2{position:relative;left:27px;height:45px;width: 200px;font-size:25px;color:#ffffff;background-color:#000000;border-color:#000000;border: 0;}
		#f1{font-size: 25px;color: #ffffff;}
		.s1{position:relative;top:-1px;left:60px;height:45px;width: 200px;font-size:25px;background-color:#000000;color: #ffffff;border-color:#000000;border: 0;}
		#img{height:100%;width: 60%;}
		.c1{height:52%;}
		.c2{height:16%;}
		.c3{position:relative;width:25%;height:100%;}
		.c4{position:relative;left:25%;top:-100%;height:100%;width:50%;}
		.c5{position:relative;left:75%;top:-200%;width:25%;height:100%;}
	</style>
	<script type="text/javascript">
		$(function(){
			$("#login").click(function(){
				var account=$("#uname").val();
				var password=$("#upassword").val();
				if(account == "" || password == ""){
					alert("false");
					return false;
				}
				$.ajax({
					type:"post",
					url:"selectUserInfoByNameAndPassWord",
					data:{uName:account,uPassWord:password},
					dataType:"json",
					success: function(msg){
						var m=eval(msg);
					     if(m.flg==1){
					    	 alert(m.msg);
					    	 window.location.href=m.url;
					     }
					     else{
					    	 alert( m.msg);
					    	 return;
					     }
					   }
				});
			});
		});
	</script>
  </head>
  <!-- images/loginLOGO.png -->
  <body bgcolor="#000000">
		<div id="i1">
	  		<div class="c1">
	  			<div class="c3"></div>
	  			<div class="c4"><img id="img" src="./images/loginLOGO.png"></div>
	  			<div class="c5"></div>
	  		</div>
	  		<div class="c2">
	  			<font id="f1">账户：</font>
	  			<input class="i2" id="uname" name="uname" type="text">
	  		</div>
	  		<div class="c2">
	  			<font id="f1">密码：</font>
	  			<input class="i2" id="upassword" name="upassword" type="password">
	  		</div>
	  		<div class="c2">
	  			<input class="s1" id="login" name="login" type="button" value="登      陆">
	  		</div>
		</div>
  </body>
</html>
