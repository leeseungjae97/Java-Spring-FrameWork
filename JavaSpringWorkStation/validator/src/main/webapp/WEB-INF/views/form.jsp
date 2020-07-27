<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.5.1.min.js"></script>
</head>
<body>
<form:form modelAttribute="info">
	<label for="name" >
		이름 : <form:input type="text" path="name"/>
		<!-- info라는 model -> MemberCommand NameGetter를 가져오라는 의미 -->
		<form:errors path="name"/>
	</label>
	<label for="age" >
		연령 : <form:input type="text" path="age"/>
		<!-- info라는 model -> MemberCommand AgeGetter를 가져오라는 의미 -->
		<form:errors path="age"/>
	</label>
	<button>등록하기</button>
</form:form>

</body>
</html>