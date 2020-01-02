<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1 align="center" style="color: red">添加页面</h1>
		<hr>
		<br>
		<form id="f1">
			图片:<input type="file" name="file"><br> <br> 商品名称：<input
				type="text" name="gname"><br> <br> 英文名称：<input
				type="text" name="ename"><br> <br> 商品品牌:<select
				name="bid">

			</select><br> <br> 商品种类:<select name="tid">

			</select><br> <br> 尺寸:<input type="text" name="size"><br>
			<br> 单价(元):<input type="text" name="price"><br> <br>
			数量:<input type="text" name="num"><br> <br> 标签:<input
				type="text" name="saying"><br> <br> <input
				type="button" value="提交" onclick="add()">
		</form>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "findBrand.do",
			dataType : "json",
			success : function(s) {
				//alert(JSON.stringify(s))
				for ( var i in s) {
					$("[name='bid']").append(
							"<option value='"+s[i].bid+"'>" + s[i].bname
									+ "</option>")
				}
			}
		})
		$.ajax({
			url : "findKind.do",
			dataType : "json",
			success : function(s) {
				//alert(JSON.stringify(s))
				for ( var i in s) {
					$("[name='tid']").append(
							"<option value='"+s[i].tid+"'>" + s[i].tname
									+ "</option>")
				}
			}
		})
	})
	function add() {
		var formData = new FormData($("#f1")[0]);
		$.ajax({
			url : "add.do",
			data : formData,
			type:"post",
			processData : false,
			contentType : false,
			success : function(s) {
				location = "findAll.do"
			}
		})
	}
</script>
</html>