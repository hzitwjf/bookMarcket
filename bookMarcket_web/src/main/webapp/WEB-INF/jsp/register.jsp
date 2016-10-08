<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
	<title>用户注册</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
	<script src="js/jquery-3.0.0.js" language="JavaScript"></script>
	<script type="text/javascript">
		var b=false;
		function one(){
			$.post("findUser",{"userName":$("#userName").val()},function(data){
				if(data==1){
					$("#yonghu").text("当前用户已存在！")
					b= false;
				}else{
					$("#yonghu").text("OK")
					b= true;
				}
			});
		}
		function two(){
			var mima=$("#userPwd").val();
			if(mima==""){
				$("#pwd").text("密码不能为空！");
				return false;
			}
			if(  mima.length<6 ){
				$("#pwd").text("密码过于简单！");
				return false;
			}
			$("#pwd").text("ok！");
			return true;
		}
		function three(){
			var mima=$("#userPwd").val();
			var qrmima=$("#rePassWord").val();
			if(qrmima==""){
				$("#repwd").text("密码不能为空！");
				return false;
			}
			if(qrmima!=mima){
				$("#repwd").text("密码不一致！");
				return false;
			}
			$("#repwd").text("OK！");
			return true;
		}
		function four(){
			//拿到初始值
			var youxiang=$("#userEmail").val();
			//條件判斷
			if(youxiang==""){
				$("#email").text("請輸入email賬號");
				return false;
			}
			var reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
			if(reg.test(youxiang)==false){
				$("#email").text("請輸入正確的email，必須韓有點和@符號");
				return false;
			}
			$("#email").text("OK!");
			return true;
		}
		function checkAll()
		{
			return  b && two() && three() && four()
		}
	</script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="register">
	<div class="title">

		<h2>欢迎注册合众艾特网上书城</h2>
	</div>
	<div class="steps">
		<ul class="clearfix">
			<li class="current">1.填写注册信息</li>
			<li class="unpass">2.注册成功</li>
		</ul>
	</div>
	<form method="post" action="zhuce" onsubmit="return checkAll()">
		<dl>
			<dt>用 户 名：</dt>
			<dd><input class="input-text" type="text" name="userName" id="userName" onblur="one()"/><span id="yonghu"></span></dd>
			<dt>密　　码：</dt>
			<dd><input class="input-text" type="password" name="userPwd" id="userPwd" onblur="two()"/><span id="pwd"></span></dd>
			<dt>确认密码：</dt>
			<dd><input class="input-text" type="password" name="rePassWord" id="rePassWord" onblur="three()" /><span id="repwd"></span></dd>
			<dt>Email地址：</dt>
			<dd><input class="input-text" type="text" name="userEmail" id="userEmail" onblur="four()"/><span id="email"></span></dd>
			<dt></dt>
			<dd class="button"><input class="input-reg" type="submit" name="register" value="" /></dd>
		</dl>
	</form>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>