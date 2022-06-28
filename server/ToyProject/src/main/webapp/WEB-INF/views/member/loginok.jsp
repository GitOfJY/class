<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% 




%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Toy Project</title>

<%@ include file="/WEB-INF/views/inc/asset.jsp" %>

<style>

</style>

</head>
<body>

	<!--  template.jsp > registerok.jsp > loginok.jsp -->


	<main>
	
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>
	
	<section>
		
	</section>
	
	</main>
	
	<script>
	
		//${auth != null} 보다는 ${not empty auth} 사용
		<c:if test="${not empty auth}">
			location.href = '/toy/index.do';
		</c:if>
		
		<c:if test="${empty auth}">
			alert('failed');
			history.back();
		</c:if>
		
	</script>
	
</body>
</html>