package com.test.toy.member;

import java.io.File;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UnregisterOk extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//UnregisterOk.java
		//1. 탈퇴회원 아이디
		//2. DB 작업 > DAO 위임 > update
		//3. 결과
		//4. JSP 호출하기
		
		HttpSession session = req.getSession();
		
		//1.
		String id = (String)session.getAttribute("auth");
		
		//2 + 3.
		MemberDAO dao = new MemberDAO();
		
		//프로필 사진 삭제
		MemberDTO dto = dao.get(id);
		
		if (!dto.getPic().equals("pic.png")) {
			String path = req.getRealPath("/pic");
			path += "/" + dto.getPic();
			
			File file = new File(path);
			file.delete();
		}
		
		int result = dao.unregister(id);
		
		if (result == 1) {
			session.invalidate();
		}
		
		//4.
		req.setAttribute("result", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("");
		dispatcher.forward(req, resp);
				
	}

}
