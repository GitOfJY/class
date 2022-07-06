<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Toy Project</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>

</head>
<body>

	<main>
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>
		<section>
			
			<h2>Login</h2>
			
			<form method="POST" action="/toy/member/loginok.do">
			<table class="table table-bordered vertical">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" class="form-control short" required></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="pw" class="form-control short" required></td>
				</tr>
			</table>
			<div class="btns">
				<input type="button" value="돌아가기" class="btn btn-secondary"
					onclick="history.back();">
				<button class="btn btn-primary">
					<i class="fas fa-sign-in-alt"></i>
					로그인
				</button>
			</div>
			</form>
			
			<hr>
			
			<!-- 개발할 때만 사용하는 테스트용, 개발 완료 후 지우기 -->
			<div style="display: flex">
			<form method="POST" action="/toy/member/loginok.do">
				<input type="hidden" name="id" value="admin">
				<input type="hidden" name="pw" value="1111">
				<input type="submit" value="관리자(admin)" class="btn btn-success">
			</form>
			&nbsp;
			<form method="POST" action="/toy/member/loginok.do">
				<input type="hidden" name="id" value="hong">
				<input type="hidden" name="pw" value="1111">
				<input type="submit" value="홍길동(hong)" class="btn btn-success">
			</form>
			&nbsp;
			<form method="POST" action="/toy/member/loginok.do">
				<input type="hidden" name="id" value="test">
				<input type="hidden" name="pw" value="1111">
				<input type="submit" value="테스트(test)" class="btn btn-success">
			</form>
			&nbsp;
			<form method="POST" action="/toy/member/loginok.do">
				<input type="hidden" name="id" value="hoho">
				<input type="hidden" name="pw" value="1111">
				<input type="submit" value="호호호(hoho)" class="btn btn-success">
			</form>
			&nbsp;
			<form method="POST" action="/toy/member/loginok.do">
				<input type="hidden" name="id" value="lee">
				<input type="hidden" name="pw" value="1111">
				<input type="submit" value="이순신(lee)" class="btn btn-success">
			</form>
			</div>
			
		</section>
	</main>
	
	<script>
		
	</script>

</body>
</html>


















