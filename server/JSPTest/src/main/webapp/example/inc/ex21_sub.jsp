<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  ex19_sub.jsp  -->

<div>

	<h1>조각 페이지</h1>
	
	조각 페이지 영역
	
	<%--
	<div>1. 지역변수 a: <%= a %></div>
	<p>2. 멤버변수 b: <%= b %></p>
	--%>
	<p>3. pageContext c: <%= pageContext.getAttribute("c") %></p>	
	<p>4. request d: <%= request.getAttribute("d") %></p>	

</div>
	