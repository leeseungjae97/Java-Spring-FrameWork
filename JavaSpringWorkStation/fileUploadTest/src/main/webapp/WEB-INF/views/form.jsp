<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.5.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('#btnUpload').click(function() {
			var form = document.getElementById("uploadForm");
			//uploadForm 내부의 input file의 값을 받아온다
			var formData = new FormData(form);
			//fileField를 갖는 formData
			$.ajax({
				url : 'upload',
				data : formData,
				dataType: 'text',
				//-----아래 두개 반드시 지정할 것 -------
				processData: false,
				contentType: false,
				//----미지정 시 프로그램이 알아서 지정해버림 -
				type : 'POST',
				success : function(data) {
					console.log(data);
				}
			});
			alert("파일을업로드합니다.");
		});
	});
</script>
</head>
<body>

<form id="uploadForm" action="upload" enctype="multipart/form-data">
업로드 파일 <input type="file" id="upfile" name="upfile" multiple/><br/>
<button type="button" id="btnUpload">업로드</button>
</form>

</body>
</html>