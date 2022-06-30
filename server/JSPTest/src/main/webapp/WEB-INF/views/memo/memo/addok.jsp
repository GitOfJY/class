<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/memo/inc/asset.jsp" %>
<style>

</style>
</head>
<body>

	<!-- template.jsp > addok.jsp -->
	
	<main>
		<%@ include file="/WEB-INF/views/memo/inc/header.jsp" %>
		<section>
			
		</section>
	</main>
	
	<script>
	
		//내장객체 안에 있는건 el로 가져온다. ${}
		//연산이 필요하면 {}안에서 해결한다.(하나의 el 표현으로 해결한다.) 
		<c:if test="${result == 1}">
		location.href = '/jsp/memo/list.do';
		</c:if>
		
		<c:if test="${result == 0}">
			alert('쓰기 실패');
			history.back();
		</c:if>
		
	</script>
	
</body>
</html>