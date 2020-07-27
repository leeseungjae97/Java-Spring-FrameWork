<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty loginInfo}">
해당 회원정보는 존재하지 않는 회원정보입니다. <br/>
이메일과 비밀번호를 확인해주세요
</c:if>
<c:if test="${!empty loginInfo}">
	메일주소 : ${loginInfo.email}<br/>
	회원이름 : ${loginInfo.nick}<br/>
	가입일자 : ${loginInfo.registeredAt}<br/>
</c:if>
</body>
</html>