<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="inc/asset.jsp" %>

</head>
<body>

	<!--  ex12_request.jsp  -->

	<p>요청 URL: <%= request.getRequestURI() %></p>
	<!-- /JSPTest/example/ex12_request.jsp -->
	<p>요청 서버 도메인: <%= request.getServerName() %></p>
	<!-- localhost -->
	<p>요청 쿼리 문자열: <%= request.getQueryString() %></p>
	<!-- ex12_request,jsp?name=홍길동&age=22 > name=홍길동&age=22 -->
	<!-- null -->
	<p>클라이언트 주소: <%= request.getRemoteAddr() %></p>
	<!-- 0:0:0:0:0:0:0:1 -->
	<p>요청 방식: <%= request.getMethod() %></p>
	<!-- GET -->
	<p>컨텍스트 경로: <%= request.getContextPath() %></p>
	<!-- /JSPTest > 서버 module eidt > /jsp 변경 -->
	
	<p><%= request.getHeader("host") %></p>
	
	<%
	
		//request.getHeader("헤더명")
		
		Enumeration<String> e = request.getHeaderNames();
	
		while (e.hasMoreElements()) {
			String name = e.nextElement();
			System.out.println(name);
		}
	
	%>

	
</body>
</html>