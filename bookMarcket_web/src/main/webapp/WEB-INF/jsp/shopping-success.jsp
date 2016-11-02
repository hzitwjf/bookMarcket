<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<div class="userMenu">
			<ul>
				<c:forEach items="${user}" var="u" >
					<li><a href="findByPage">${u.userName}</a></li>
				</c:forEach>
				<li><a href="findorderpage">我的订单</a></li>
				<li class="current"><a href="shop/toshopping">购物车</a></li>
				<li><a href="zhuxiao">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			 搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="success">
		<div class="information">
			<p>恭喜：购买成功！</p>
			<p><a href="findorderpage">点此查看订单详情&gt;&gt;</a></p>
		</div>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
