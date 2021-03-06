﻿<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
					<li class="current"><a href="findByPage">您好：${u.userName},欢迎光临您的首页</a></li>
					<li><a href="findorderpage">我的订单</a></li>
					<li><a href="shop/toshopping">购物车</a></li>
					<li><a href="zhuxiao">注销</a></li>
				</c:forEach>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list orderList">
			<table>
				<tr class="title">
					<th class="orderId">订单详情编号</th>
					<th>订单编号</th>
					<th class="userName">图书预览</th>
					<th class="userName">书名</th>
					<th class="price">购买数量</th>
					<th class="createTime">商品单价</th>
					<th class="status">小计</th>
				</tr>
				<c:forEach items="${detail}" var="d">
				<tr>
					<td>${d.orderdetailId}</td>
					<td>${d.orderId}</td>
					<td class="thumb"><img src="${d.bookPicUrl}" /></td>
					<td>${d.bookAuthor}</td>
					<td>${d.orderdetailNum}</td>
					<td>${d.orderdetailPrice}</td>

					<td>${d.orderdetailNum*d.orderdetailPrice}</td>
				</tr>
				</c:forEach>
			</table>
</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
