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

	<!--  template.jsp > info.jsp -->


	<main>
	
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>
	
	<section>
	
		<h2>Info</h2>
		
		<div style="background-color=">
				<td>${dto.name}(${dto.id})</td>
				<td>LV.${dto.lv}(${dto.lv == 1 ? "일반회원" : "관리자" })</td>
				<td>가입일(${dto.regdate})</td>
				<td><img src="/toy/pic/${dto.pic}"></td>
		</div>
		
		<input type="button" value="탈퇴하기" class="btn btn-danger">
		
	</section>
	
	</main>
	
	<script>
	
	</script>
	
</body>
</html>