<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 




%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/example/inc/asset.jsp" %>

<style>

</style>

</head>
<body>

	<!--  hello.jsp  -->
	
	<!-- 위치 이동 : webapp > WEB-INF > views -->
	<!-- 404 error > WEB-INF안에 jsp 파일 없어야함 -->
	<!-- jsp는 servlet을 통해서만 호출해야하기 때문에 직접 호출하면 error 발생하도록 web-inf 안에 넣기 -->
	
	<div class="container">
		<h1>Hello</h1>
		DB: <%= request.getAttribute("name") %>
	</div>
	
	<script>
	
	</script>
	
</body>
</html>