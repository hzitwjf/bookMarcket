﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>合众艾特网上书城</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<li class="current"><a href="index.jsp">User首页</a></li>
				<li><a href="orderlist.jsp">我的订单</a></li>
				<li><a href="shopping.jsp">购物车</a></li>
				<li><a href="#">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list bookList">
		<form method="post" name="shoping" action="shop/shopcar">
			<table>
				<tr class="title">
					<th class="checker"></th>
					<th>书名</th>
					<th class="price">价格</th>
					<th class="store">库存</th>
					<th class="view">图片预览</th>
				</tr>
				<c:forEach items="${pagebook.content}" var="pagelist">
				<tr>

					<td><input type="checkbox"  name="bookId"  value="${pagelist.bookId}"/></td>
					<td>${pagelist.bookAuthor}</td>
					<td>${pagelist.bookStock}</td>
					<td>${pagelist.bookPrice}</td>
					<td><img src="${pagelist.bookPicUrl}"></td>
				</tr>
				</c:forEach>
			</table>
			<div class="page-spliter">
				<a href="findByPage?page=${currentpage-1}">&lt;</a>
				<a href="findByPage?page=0">首页</a>
				<c:forEach  begin="0" end="${pagebook.totalPages-1}" var="p">
				<a href="findByPage?page=${p}">${p+1}</a>
				</c:forEach>
				<span>...</span>
				<a href="findByPage?page=${pagebook.totalPages-1}">尾页</a>
				<a href="findByPage?page=${currentpage+1}">&gt;</a>
			</div>
			<div class="button"><input class="input-btn" type="submit" name="submit" value="" /></div>
		</form>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
