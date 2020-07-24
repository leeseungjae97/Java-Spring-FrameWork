<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	이름 : <input type="text" name="info.name"/>
	전공 : <input type="text" name="info.major"/>
	국어점수 : <input type="text" name="jumsu[0]"/><br/>
	영어점수 : <input type="text" name="jumsu[1]"/><br/>
	수학점수 : <input type="text" name="jumsu[2]"/><br/>
	<button>등록</button>
</form>
</body>
</html>