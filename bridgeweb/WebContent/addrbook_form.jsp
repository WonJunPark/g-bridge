<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="inc_header.html" %>
<title>주소록 등록양식</title>
</head>
<body>
<div class="container mx-auto mt-5 p-5 shadow w-50">
	<h2>주소록::등록양식</h2>
	<hr>
	<a href="index.jsp" class="btn btn-info"><i class="fas fa-backward"></i> 게시물 목록</a>
	<p>
	<form action="addrbook_control.jsp" method="post">
		<input type="hidden" name="action" value="insert">
		<div class="form-group">
			<label for="ab_name">Name: </label> 
			<input type="text" class="form-control" name="ab_name" maxlength="15">
		</div>
		<div class="form-group">
			<label for="ab_email">email</label> 
			<input type="email" class="form-control" name="ab_email" maxlength="50">
		</div>
		<div class="form-group">
			<label for="ab_tel">전화번호</label>
			<input type="tel" class="form-control" name="ab_tel" maxlength="20">
		</div>
		<div class="form-group">
			<label for="ab_birth">생일</label>
			<input type="date" class="form-control" name="ab_birth">
		</div>
		<div class="form-group">
			<label for="ab_comdept">회사</label>
			<input type="text" class="form-control" name="ab_comdept" maxlength="20">
		</div>
		<div class="form-group">
			<label for="ab_memo">메모</label>
			<input type="text" name="ab_memo" class="form-control">
		</div>
		<input type="submit" value="등록" class="btn btn-primary">
		<input type="reset" value="취소" class="btn btn-warning">
	</form>
</div>
</body>
</html>