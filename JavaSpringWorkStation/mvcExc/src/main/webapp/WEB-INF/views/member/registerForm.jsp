<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="forM" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/js/jquery-3.5.1.min.js"></script>
</head>
<body>
<!--  <div style="color:red">${errorMessage}</div> -->
<form action="register" method="post">
	<forM:form modelAttribute="info"><br/>
		<label for="email">
		 	메일주소 : <forM:input type="text" path="email"/><br/>
		 	<forM:errors path="email"/>
		</label><br/>
		<label for="pass">
			비밀번호 : <forM:input type="password" path="pass"/><br/>
			<forM:errors path="pass"/>
		</label><br/>
		<label for="passCheck">
			비밀번호확인 : <forM:input type="password" path="passCheck"/><br/>
			<forM:errors path="passCheck"/>
		</label><br/>
		<label for="nick">
			회원이름 : <forM:input type="text" path="nick"/><br/>
			<forM:errors path="nick"/>
		</label><br/>
		<button>등록하기</button>
	</forM:form>
</form>
</body>
</html>