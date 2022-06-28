<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>

	.fas.fa-coffee {
	
		<c:if test="${not empty auth and lv == 2}">
		color: tomato;
		</c:if>
		
		<c:if test="${not empty auth and lv == 1}">
		color: cornflowerblue;
		</c:if>
	
	}
	
	header > h1 > span {
		font-size: 16px;
		color: #777;
	}

</style>

<header>
		
		<h1>
			<i class="fas fa-coffee"></i>
			Toy Project
			<c:if test="${not empty auth}">
			<span>by ${auth}</span>
			</c:if>
		</h1>
		
		<nav>
			<ul>
			
				<li a href="/toy/index.do">Home</li>
				
				<c:if test="${empty auth}">
				<li a href="/toy/member/register.do">Register</li>
				<li a href="/toy/member/login.do">Login</li>
				</c:if>
				
				<c:if test="${not empty auth}">
				<li a href="/toy/member/info.do">Info</li>
				<li a href="/toy/member/logout.do">Logout</li>
				</c:if>
				
				<li a href="/toy/board/list.do">Board</li>
				<li a href="/toy/etc">Etc</li>
				<li a href="/toy/etc">Etc</li>
				<li>Etc</li>
				
			</ul>
		</nav>
		
	</header>

</body>
</html>