<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page import="java.util.Random" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  ex02_page_directive.jsp  -->
	
	<h1>페이지 지시자</h1>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dignissimos error magni aspernatur dolore eligendi beatae dolores deleniti maiores neque! Rerum possimus sed aliquam doloribus quas natus inventore! Natus tenetur porro.</p>
	
	<%
	
		//Random rnd = null;
		//System.out.println(rnd.nextInt()); > NUllPointError > error.jsp 페이지로 이동
	
	%>
	
	<!--
	
	<div>
		<hr>
		&copy;Copyright 2022 test.com All rights reserved.
	</div>
	
	-->
	
	<%@ include file="inc/copyright.jsp" %>

</body>
</html>