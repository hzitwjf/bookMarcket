<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
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
					<th class="orderId">订单编号</th>
					<th>订单商品</th>
					<th class="userName">收货人</th>
					<th class="price">订单金额</th>
					<th class="createTime">下单时间</th>
					<th class="status">订单状态</th>
					<th>订单详情</th>
				</tr>
				<c:forEach items="${orderlist.content}" var="ordlist">
				<tr>
					<td>${ordlist.orderId}</td>
					<td class="thumb"><img src="${ordlist.bookPicUrl}" /></td>
					<c:forEach items="${user}" var="u" >
					<td>${u.userName}</td>
				</c:forEach>
					<td>${ordlist.orderPrice}</td>
					<td>${ordlist.orderCreateTime}</td>
					<td>${ordlist.orderStatus}</td>
					<td><a class="status" href="toorderdetail?orderId=${ordlist.orderId}">点我查看详情</a></td>
				</tr>
				</c:forEach>
				<c:if test="${orderlist.totalPages==0}">
					<tr>
						<td colspan="6"> 订单里面空空如也，赶紧去添加订单吧!</td>
						<td><a href="findByPage">去逛逛！</a></td>
					</tr>
				</c:if>
			</table>
			<div class="page-spliter">
				<c:if test="${orderlist.totalPages>0}" >
				<a href="findorderpage?page=${currenpage-1}">&lt;</a>
				<a href="findorderpage?page=0">首页</a>
				<c:forEach begin="0" end="${orderlist.totalPages-1}" var="ordpage">
				<a href="findorderpage?page=${ordpage}">${ordpage+1}</a>
				</c:forEach>

				<span>...</span>
				<a href="findorderpage?page=${orderlist.totalPages-1}">尾页</a>
				<a href="findorderpage?page=${currenpage+1}">&gt;</a>
				</c:if>
			</div>
			<div class="button"><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /></div>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
