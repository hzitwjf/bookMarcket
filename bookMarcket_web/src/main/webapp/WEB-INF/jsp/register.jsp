<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
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
	<form method="post" action="zhuce">
		<dl>
			<dt>用 户 名：</dt>
			<dd><input class="input-text" type="text" name="userName" /><span></span></dd>
			<dt>密　　码：</dt>
			<dd><input class="input-text" type="password" name="userPwd" /><span></span></dd>
			<dt>确认密码：</dt>
			<dd><input class="input-text" type="password" name="rePassWord" /><span></span></dd>
			<dt>Email地址：</dt>
			<dd><input class="input-text" type="text" name="userEmail" /><span></span></dd>
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