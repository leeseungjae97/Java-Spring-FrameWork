<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="color:red">${errorMessage}</div>
<form action="register" method="post"><br/>
	메일주소 : <input type="text" name="email" value="${info.email}"/><br/>
	비밀번호 : <input type="password" name="pass" value="${info.pass}"/><br/>
	비밀번호확인 : <input type="password" name="passCheck"/><br/>
	회원이름 : <input type="text" name="nick" value="${info.nick}"/><br/>
	<button>등록하기</button>
</form>
</body>
</html>