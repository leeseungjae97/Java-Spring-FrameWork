<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="forM" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
등록된 게시글<br/>
게시글 번호 : ${board.sid}<br/>
게시자 메일주소 : ${board.email}<br/>
게시글 내용 : ${board.content}<br/>
답글 : ${board.ssid}<br/>
등록날짜 : ${board.regiDate}<br/>
조회숫자 : ${board.regiCount}<br/>
</body>
</html>