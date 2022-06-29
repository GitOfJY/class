package com.test.memo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memo/list.do")
public class List extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//List.java
		//1. DB작업 > DAO 위임 > select
		//2. 결과 반환
		//3. JSP 호출하기 + 결과 전달하기
		
		
		
		//1. + 2.
		DAO dao = new DAO();
		
		//<DTO> > 행을 나타냄
		//ArrayList > 행의 집합으로 테이블 나타냄
		//JDBC가 아닌곳에서 table은 ArrayList<DTO> list = dao.list(); 표현
		ArrayList<DTO> list = dao.list();
				
				
		//3.
		req.setAttribute("list", list);
		
		

		//4. JSP 호출 > dispatcher 이용
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/memo/list.jsp");
		dispatcher.forward(req, resp);
	}
	
}