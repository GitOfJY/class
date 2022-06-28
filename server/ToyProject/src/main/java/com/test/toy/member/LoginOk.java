package com.test.toy.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

@WebServlet("/member/loginok.do")
public class LoginOk {
	
	protected void doPost() {
		// TODO Auto-generated method stub
		//loginok.java
		//1. 데이터 가져오기
		//2. DB 작업 > DAO 위임
		
		HttpSession session = req.getSession();
		
		//1.
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		//2.
		MemberDTO dto = new MemberDTO();
		
		dto.setId(id);
		dto.setPw(pw);
		
		MemberDAO ao = new MemberDAO();
		
		MemberDTO result = dao.login(dto);
		
		//3.
		if (result != null) {
			
			//인증 티켓 발급
			session.setAttribute("auth", id);
			
			session.setAttribute("name", result.getName());
			session.setAttribute("lv", result.getLv());
			
		}
		
		//4.
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/member/loginok.jsp");
		dispatcher.forwar(req, resp);
	}

}
