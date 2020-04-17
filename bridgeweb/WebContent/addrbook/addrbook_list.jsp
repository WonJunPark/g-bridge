<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, bridgeweb.addrbook.*" %>

<%-- 자바 라이브러리를 바로 사용할 수 있게 선언 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!-- 아이콘을 쓸수있게 해줌, https://fontawesome.com/start -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>주소록 목록화면</title>
</head>
<body>
	<div class="container mx-auto w-75 mt-5 p-5 shadow">
		<h2>주소록::목록화면</h2>
		<hr>
		<a href="addrbook_form.jsp" class="btn btn-info">주소록 등록 <i class="far fa-edit"></i></a>
		<p>
		
		<table class="table table-hover table-striped table-dark" >
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>생일</th>
			<th>회사</th>
			<th>메모</th>
		</tr>
		
		<c:forEach items="${datas}" var="ab">
		<tr>
			<td>${ab.ab_id}</td>
			<td>${ab.ab_name}</td>
			<td>${ab.ab_tel}</td>
			<td>${ab.ab_birth}</td>
			<td>${ab.ab_comdept}</td>
			<td>${ab.ab_memo}</td>
		</tr>
		</c:forEach>
		
		</table>
		
		<ul class="pagination mt-2">
		  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
		  <li class="page-item"><a class="page-link" href="#">1</a></li>
		  <li class="page-item"><a class="page-link" href="#">2</a></li>
		  <li class="page-item"><a class="page-link" href="#">3</a></li>
		  <li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>

	</div>
</body>
</html>