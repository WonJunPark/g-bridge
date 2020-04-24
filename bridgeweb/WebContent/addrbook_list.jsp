<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, bridgeweb.addrbook.*"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="inc_header.html" %>
<title>주소록 목록화면</title>
</head>
<body>
<div class="container mx-auto w-75 mt-5 p-5 shadow">
	<h2>주소록::목록화면</h2>
	<hr>
	<a href="addrbook_form.jsp" class="btn btn-info">주소록 등록 <i class="far fa-edit"></i></a>
	<p>
	<table class="table table-hover table-striped">
	<tr><th>번호</th><th>이름</th><th>전화번호</th><th>생일</th><th>회사</th><th>메모</th></tr>
	<c:forEach items="${datas}" var="ab">
		<tr> 
			<td><a href="addrbook_control.jsp?action=edit&ab_id=${ab.ab_id}">${ab.ab_id}</a></td>
			<td>${ab.ab_name}</td>
			<td>${ab.ab_tel}</td>
			<td>${ab.ab_birth}</td>
			<td>${ab.ab_comdept}</td>
			<td>${ab.ab_memo}</td>
		</tr>
	</c:forEach>
	</table>
	<p>
	<ul class="pagination justify-content-center">
  <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
  <li class="page-item"><a class="page-link" href="#">1</a></li>
  <li class="page-item"><a class="page-link" href="#">2</a></li>
  <li class="page-item"><a class="page-link" href="#">3</a></li>
  <li class="page-item"><a class="page-link" href="#">Next</a></li>
</ul>
</div>
</body>
</html>