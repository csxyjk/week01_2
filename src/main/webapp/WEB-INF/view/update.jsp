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
		<h1 align="center" style="color: red">修改页面</h1>
		<hr>
		<br>
		<form action="update.do">
			<img alt="" src="/upload/${goods.imgurl }" width="160px" height="200px">
			图片:<input type="file" name="file"><br> <br> 商品名称：<input
				type="text" name="gname" value="${goods.gname }"><br> <br>
			英文名称：<input type="text" name="ename" value="${goods.ename }"><br>
			<br> 商品品牌:<select name="bid">

			</select><br> <br> 商品种类:<select name="tid">

			</select><br> <br> 尺寸:<input type="text" name="size"
				value="${goods.size }"><br> <br> 单价(元):<input
				type="text" name="price" value="${goods.price }"><br> <br>
			数量:<input type="text" name="num" value="${goods.num }"><br>
			<br> 标签:<input type="text" name="saying"
				value="${goods.saying }"><br> <br> <input
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
							"<option name='bids' value='"+s[i].bid+"'>" + s[i].bname
									+ "</option>")
				}
				$("[name='bids'][value='"+${goods.bid}+"']").attr("selected",true);
			}
		})
		$.ajax({
			url : "findKind.do",
			dataType : "json",
			success : function(s) {
				//alert(JSON.stringify(s))
				for ( var i in s) {
					$("[name='tid']").append(
							"<option name='tids' value='"+s[i].tid+"'>" + s[i].tname
									+ "</option>")
				}
				$("[name='tids'][value='"+${goods.tid}+"']").attr("selected",true);
			}
		})
	})
	function add() {
		var formData = new FormData($("form")[0]);
		alert(formData)
		$.ajax({
			url : "update.do",
			data : formData,
			type : "post",
			dataType : "json",
			processData : false,
			contentType : false,
			success : function(s) {
				if (s) {
					alert("修改成功")；
					location = "findAll.do"
				} else {
					alert("修改失败")
				}
			}
		})
	}
</script>
</html>