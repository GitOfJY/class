<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 

	//로그인 정보 가져오는 2가지 방법
	//1. DB에서 기져오기 > select ... where id= session.getAttribute("id")
	//2. session에 따로 저장 > 서버 메모리를 계속 사용하기 때문에 일부 페이지에서 사용할 때는 db가 더 괜찮을 수 있음

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/auth/inc/asset.jsp" %>

<style>

</style>

</head>
<body>

	<!--  index.jsp  -->
	
	<!-- 
		- Register, Login, Logout
		- Signup, Singin, Singout
	
	 -->
	
	<div class="container">
		<h1>인증, 허가</h1>
		
		<% if (session.getAttribute("auth") == null) { %>
		<fieldset>
			<input type="button" value="로그인(Log in, Sign in)" class="btn btn-primary" onclick="location.href='login.jsp';">
		</fieldset>
		<% } %>
		
		<% if (session.getAttribute("auth") != null) { %>
		<fieldset>
			<input type="button" value="로그아웃(Log out, Sign out)" class="btn btn-primary" onclick="location.href='logout.jsp';">
			
			<hr>
			
			<div>
			 	이름(<%= session.getAttribute("auth") %>) 등급(<%= session.getAttribute("lv") %>)
			</div>
		</fieldset>
		<% } %>
		
		<hr>
		
		<!-- 등급 > 허가 -->
		
		<!-- 1. 비노출 방식 -->
		<% if (session.getAttribute("auth") != null && (int)session.getAttribute("lv") < 3) { %>
		<a href="member.jsp" class="btn btn-success">회원 전용 페이지</a>
		<% } %>
		
		<!-- 2. 노출 방식 > 회원가입 유도 --> 
		<% if (session.getAttribute("auth") == null || (int)session.getAttribute("lv") == 3) { %>
		<a href="#!" class="btn btn-success" onclick="alert('회원만 접근이 가능합니다.')">회원 전용 페이지</a>
		<% }  else { %>
		<a href="member.jsp" class="btn btn-success">회원 전용 페이지</a>
		<% } %>
		
		<hr>
		
		<% if (session.getAttribute("auth") == null || (int)session.getAttribute("lv") != 1) { %>
		<a href="#!" class="btn btn-success" onclick="alert('관리자 접근이 가능합니다.')">관리자 전용 페이지</a>
		<% }  else { %>
		<a href="admin.jsp" class="btn btn-success">관리자 전용 페이지</a>
		<% } %>
		
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>