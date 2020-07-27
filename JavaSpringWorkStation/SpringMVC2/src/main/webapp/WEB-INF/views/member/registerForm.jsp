<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="regForm" action="register" method="post">
<div>
	<label>
		메일주소 <input type="text" name="email">
	</label>
	<label>
		비밀번호 <input type="password" name="pass">
	</label>
	<label>
		비밀번호확인 <input type="password" name="passCheck">
	</label>
	<label>
		회원이름 <input type="text" name="nick">
	</label>
</div>
<div>
	<button>가입하기</button>
</div>
</form>
</body>
</html>