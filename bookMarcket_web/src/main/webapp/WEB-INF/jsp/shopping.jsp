<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>

<title></title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script src="../js/jquery-3.0.0.js" language="JavaScript"></script>
<script type="text/javascript">
$(function(){
	$(".input-text").blur(function(){
		//修改购物车中书本的数量；
		$.post("updateshopcar",{"bookId":$(this).attr("bookId"),"shopCount":$(this).val()},function(data){
			alert(data);
		});
	});
});

</script>

</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<c:forEach items="${user}" var="u" >
				<li><a href="../findByPage">您好：${u.userName},欢迎光临您的首页</a></li>
				<li><a href="orderlist.jsp">我的订单</a></li>
				<li class="current"><a href="#">购物车</a></li>
				<li><a href="#">注销</a></li>
				</c:forEach>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list bookList">
		<form method="post" name="shoping" action="../orderadd">
			<table>
				<tr class="title">
					<th class="view">图片预览</th>
					<th>书名</th>
					<th class="nums">数量</th>
					<th class="price">单价</th>
					<th class="price">小计</th>
					<th class="price">删除</th>
				</tr>
				<c:set var="sum" value="0"></c:set>
				<c:forEach items="${shopcar}" var="car">
				<tr>
					<td class="thumb"><img src="../${car.value.bookPicUrl}" /></td>
					<td class="title">${car.value.bookAuthor}</td>
					<td>
						<input type="button" id="jian" value="  -  ">
						<input class="input-text" type="text" name="shopCount" bookId="${car.value.bookId}" value="${car.value.shopCount}" />
						<input type="button" id="jia" value="  +  ">
					</td>
					<td>￥<span>${car.value.bookPrice}</span></td>
					<td>￥<span>${car.value.bookPrice*car.value.shopCount}</span></td>
					<td><a href="javascript:void (0)">删除</a></td>
				</tr>
					<c:set var="sum" value="${sum+car.value.bookPrice*car.value.shopCount}"></c:set>
				</c:forEach>
			</table>
			<div class="button">
				<h4>总价：￥<span>${sum}</span>元</h4>
				<input class="input-chart" type="submit" name="submit" value="" />
			</div>
		</form>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
<%--//alert("bookId"+$(this).attr("bookId")+"shopCount"+$(this).val())--%>