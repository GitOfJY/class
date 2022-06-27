package com.test.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello  extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//자바로 할 일 > 비즈니스 코드
		
		//모두 같은 행동(JSP는 Servlet이다.)
		//- Servlet > Servlet
		//- JSP > JSP
		//- Servlet > JSP
		//- JSP > Servlet
		
		//JSP 호출하기 > 왜 안되냐 나중에 확인하기
		//브라우저는 Java를 부를 수 없다 > 가상 주소 만들기
		//resp.sendRedirect("/jsp/mvc/hello.jsp");
		
		//pageContext.forward();
		//사용중이던 request, response를 다음 페이지 전달 가능, 주소 안바뀜
		
		//DB > '홍길동'
		//출력에 필요한 데이터만 JSP에 넘긴다.
		String name = "홍길동";
		req.setAttribute("name", name);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/hello.jsp");
		dispatcher.forward(req, resp); //JSP 호출
		
	}
	
}
