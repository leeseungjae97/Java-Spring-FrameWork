<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="resultForm" action="result" method="get">
	가입정보<br/>
	전자메일: ${member.email}<br/>
	비밀번호: ${member.pass}<br/>
	닉네임 : ${member.nick}
</form>
</body>
</html>