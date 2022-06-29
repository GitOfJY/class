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

	<!-- template.jsp > list.jsp -->
	
	<main>

		<%@ include file="/WEB-INF/views/memo/inc/header.jsp" %>
		
		<section>
		
			<c:forEach items="${list}" var="dto">
			<table class="table table-bordered item">
				<tr>
					<th>번호</th>
					<%-- <td><%= dto.getSeq() %></td> --%>
					<td>${dto.seq}</td>
					<th>이름</th>
					<td>${dto.name}</td>
					<th>날짜</th>
					<td>${dto.regdate}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="5">${dto.subject}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="5">${dto.content}</td>
				</tr>
			</table>
			</c:forEach>
			
		</section>
		
	</main>
	
	<script>
	
	</script>
	
</body>
</html>