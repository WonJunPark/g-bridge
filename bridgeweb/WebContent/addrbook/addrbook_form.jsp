<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>주소록::등록양식</h2>
	<hr>
	<form action="addrbook_control.jsp" method="post">
		<input type="hidden" name="action" value="insert">
		<div>
			<label for="ab_name">Name: </label>
			<input type="text" name="ab_name">
		</div>
		
		<div>
			<label for="ab_email">Email: </label>
			<input type="email" name="ab_email">
		</div>
		
		<div>
			<label for="ab_tel">Tel: </label>
			<input type="text" name="ab_tel">
		</div>
		
		<div>
			<label for="ab_birth">Birth: </label>
			<input type="text" name="ab_birth">
		</div>
		
		<div>
			<label for="ab_comdept">Company: </label>
			<input type="text" name="ab_comdept">
		</div>
		
		<div>
			<label for="ab_memo">Memo: </label>
			<input type="text" name="ab_memo">
		</div>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>