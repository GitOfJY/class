package com.test.toy.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.toy.board.BoardDAO;
import com.test.toy.board.BoardDTO;

@WebServlet("/ajax/ex05json.do")
public class Ex05JSON extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Ex05JSON.java
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.get("614");
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("begin", "1");
		map.put("end", "3");
		map.put("isSearch", "n");
		
		ArrayList<BoardDTO> list = dao.list(map);
		
		
		
		//JSON 반환
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		
		//단일 데이터
		//writer.print("{");
		//writer.printf("\"name\": \"%s\"", dto.getName());
		//writer.print("}");
		
		//다중 데이터
		//writer.print("{");
		//writer.printf("\"subject\": \"%s\",", dto.getSubject());
		//writer.printf("\"content\": \"%s\",", dto.getContent());
		//writer.printf("\"name\": \"%s\","   , dto.getName());
		//writer.printf("\"regdate\": \"%s\"", dto.getRegdate());
		//writer.print("}");
		
		//다중 데이터
		int i = 0;
		
		writer.print("[");
		
		for (BoardDTO item : list) {
			writer.print("{");
			writer.printf("\"subject\": \"%s\",", item.getSubject());
			writer.printf("\"name\": \"%s\","   , item.getName());
			writer.printf("\"regdate\": \"%s\"", item.getRegdate());
			writer.print("}");
			
			if (i < list.size() - 1) {
				writer.print(",");
			}
			
			i++;
		}
		
		writer.print("]");
		
		
		writer.close();
		
		
		/*
		
		1.단일 데이터
	    { "프로퍼티": "값" } > ''안됨, 무조건 ""
			
			
		2.다중 데이터
		 { 
		 	"프로퍼티": "값",
		 	"프로퍼티": "값",
		 	"프로퍼티": "값",
		 	"프로퍼티": "값"
		 }
			
			
		3.다중 데이터 > 배열
		 [
			 { 
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값"
			 },
			 { 
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값"
			 },
			 { 
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값",
			 	"프로퍼티": "값"
			 }
		 ]
			
		
		*/
	}

}






















