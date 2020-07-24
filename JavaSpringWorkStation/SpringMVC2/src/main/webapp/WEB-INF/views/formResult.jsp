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
이름 : ${student.info.name}<br/>
전공 : ${student.info.major}<br/>
<c:forEach var="jumsu" items="${student.jumsu}">
	${jumsu}
</c:forEach>
</body>
</html>