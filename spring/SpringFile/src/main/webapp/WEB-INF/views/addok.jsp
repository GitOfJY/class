<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>결과</h1>
	
	<!-- 1 -->
	<div><a href="/spring/resources/files/${filename}" download>${filename}</a></div>
	
	<!-- 2 -->
	<div><a href="/spring/download?filename=${filename}">${filename}</a></div>

	<!-- 1 보다 2 사용 -->
	
</body>
</html>