<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.test.jsp.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 

	//1. 인코딩 처리
	//2. 데이터 가져오기
	//3. DB 작업
	//	3.1 DB 연결
	//	3.2 SQL
	//	3.3 종료
	//4. 마무리(feedback)
	//자동으로 예외 미루기
	
	
	//1.
	request.setCharacterEncoding("UTF-8");



	//2.
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	
	
	
	int result = 0;
	
	try {
		//3.
		//import > java.sql 
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		conn = DBUtil.open();
		
		//System.out.println(conn.isClosed()); //연결 o > false 
		//java.lang.ClassNotFoundException > jar 파일 필요 > (WEB-INF > lib) 추가
		
		String sql = "insert into tblAddress (seq, name, age, address, gender, tel) values (seqAddress.nextVal, ?, ?, ?, ?, ?)";
		
		pstat = conn.prepareStatement(sql);
		
		pstat.setString(1, name);
		pstat.setString(2, age);
		pstat.setString(3, address);
		pstat.setString(4, gender);
		pstat.setString(5, tel);
		
		result = pstat.executeUpdate(); //정상일때 result==1
		
		//4. 3가지
		if (result > 0) {
			//추가 성공
		} else {
			//추가 실패
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록</title>

<%@ include file="/address/inc/asset.jsp" %>

<style>

</style>

</head>
<body>

	<!--  template.jsp > addok.jsp  -->
	
	<main>
		
		<header>
			<%@ include file="inc/header.jsp" %>
		</header>
		
		<section>
			<div class="section content">
			
				<!-- 
				4.2 태그 이용
				<% if (result>0) { %>
					<div>추가 성공</div>
					<a href="list.jsp">목록 보기</a>
				<% } else { %>
					<div>추가 실패</div>
					<a href="#!" onclick="history.back();">돌아가기</a>
				<% } %>
				-->
				
			</div>
		</section>
	
	</main>
	
	<script>
	
		<%-- 
		4.1. script 이용
		
		<% if (result>0) { %>
			alert('추가 성공');
			location.href = 'list.jsp';
		<% } else { %>
			alert('추가 실패');
			history.back();
		<% } %>
		--%>
		
		
		
		<%-- 4.3. --%>
		<% if (result>0) { %>
			location.href = 'list.jsp';
		<% } else { %>
			alert('추가 실패');
			history.back();
		<% } %>
		
	</script>
	
</body>
</html>