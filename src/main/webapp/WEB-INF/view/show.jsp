<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<div class="container">
		<h1 align="center">商品展示</h1>
		<br>
		<hr>
		<br> <a href="toAdd.do">新增</a>
		
		<form action="findAll.do" method="post">
			商品名称:<input type="text" name="gname" value="${goods.gname }">
			<button>查询</button>
		</form>
		<input type="button" value="选择" onclick="sel()"><input type="button" value="批量删除" onclick="delAll()">
		<c:forEach items="${list }" var="s">
			<div float="left">
				<input type="checkbox" value="${s.gid }"> <br> <img
					alt="找不到" src="/upload/${s.imgurl }" width="160px" height="200px"><br> 价钱:${s.price }<br>
				商品名称:${s.gname }(${s.ename })<br>此${s.tname }产品${s.size }寸${s.saying }
				<input type="button" value="删除" onclick="del(${s.gid})"> <input
					type="button" value="商品编辑" onclick="reshow(${s.gid})">
			</div>
		</c:forEach>
		<br>
		<hr>
		<br>
		<form action="findAll.do" method="post">
			<button name="pageNow" value="1">首页</button>
			<button name="pageNow" value="${page.prePage==0?1:page.prePage }">上一页</button>
			<button name="pageNow"
				value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button>
			<button name="pageNow" value="${page.pages }">尾页</button>
		</form>

	</div>
</body>
<script type="text/javascript">
	function del(id){
		location="del.do?id="+id
	}
	function reshow(id){
		location="reshow.do?id="+id;
	}
	function sel(){
		$(":checkbox").map(function(){
			return this.checked=!this.checked
		})
	}
	function delAll(){
		var ids="";
		$(":checked").map(function(){
			ids+=","+$(this).val();
		})
		ids=ids.substring(1)
		location="del.do?id="+ids
	}
</script>
</html>