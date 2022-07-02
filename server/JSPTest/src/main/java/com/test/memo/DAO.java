package com.test.memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//***** DAO의 업무 메소드(add, list 등)는 하나의 업무 메소드에서는 하나의 업무만 진행한다
public class DAO {
	
	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	private ResultSet rs;
	
	public DAO() {
		
		conn = DBUtil.open();
		
	}


	
	//AddOk라는 서블릿이 입력받은 데이터(dto)를 줄테니 insert해라
	//tblMemo 안에 모든 레코드가 dto 단위로 포장되있는 arraylist 반환 
	public int add(DTO dto) {
		
		try {
			
			//insert 쿼리 짜기 > JDBC 수업 복습하기
			String sql = "insert into tblMemo (seq, subject, content, name, pw, regdate) values (seqMemo.nextVal, ?, ?, ?, ?, default)";	
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getSubject());
			pstat.setString(2, dto.getContent());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getPw());
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			
			//catch절 > 절대 비워놓으면 안된다. 주의
			System.out.println(e);
			
		}
		
		return 0;
	}


	
	//List 서블릿이 메모 목록 요청
	public ArrayList<DTO> list() {
		
	try {
		
		String sql = "select * from tblMemo order by seq desc";
		
		stat = conn.createStatement();
		
		rs = stat.executeQuery(sql);
		
		ArrayList<DTO> list = new ArrayList<DTO>();
		
		while (rs.next()) {
			
			//레코드 1줄 > DTO 1개
			DTO dto = new DTO();
			
			//rs.get메서드로 가져온 DB데이터를 dto.set메서드로 옮겨담기
			dto.setSeq(rs.getString("seq"));
			dto.setSubject(rs.getString("subject"));
			dto.setContent(rs.getString("content"));
			dto.setName(rs.getString("name"));
			dto.setRegdate(rs.getString("regdate"));
			
			//arraylist에 옮겨 담기
			list.add(dto);
			
		}
		
		//까먹지않게 조심
		return list;
		
	} catch (Exception e) {
		System.out.println("DAO.list");
		e.printStackTrace();
	}
		
		return null;
	
	}


	//Edit 서블릿이 메모 번호 전달하면 레코드 전체 반환 요청
	public DTO get(String seq) {
		
		try {
		
			String sql = "select * from tblMemo where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, seq);
			
			rs = pstat.executeQuery();
			
			DTO dto = new DTO();
			
			if (rs.next()) {
				
				dto.setSeq(rs.getString("seq"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setName(rs.getString("name"));
				dto.setRegdate(rs.getString("regdate"));
				
			}
			
			return dto;
			
		} catch (Exception e) {
			System.out.println("DAO.get");
			e.printStackTrace();
		}
		
		return null;
	}


	//EditOk 서블릿에서 수정할 DTO 넘겨주면 수정하기
	public int edit(DTO dto) {
		
		try {
			
			String sql = "update tblMemo set subject = ?, content = ?, name = ? where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getSubject());
			pstat.setString(2, dto.getContent());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getSeq());
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("DAO.edit");
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	//EditOk 서블릿이 메모 번호와 입력 암호를 줄테니 이게 맞는건지 확인 요청
	public boolean check(DTO dto) {

		try {
				
			String sql = "select count(*) as cnt from tblMemo where seq = ? and pw = ?";
				
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getSeq());
			pstat.setString(2, dto.getPw());
				
			rs = pstat.executeQuery();
				
			if (rs.next()) {	
				return rs.getInt("cnt") == 1 ? true : false;				
			}
				
		} catch (Exception e) {
			System.out.println("DAO.check");
			e.printStackTrace();
		}
			return false;
		}


	//DelOk 서블릿이 seq를 전달하니 삭제 요청
	public int del(String seq) {
		
		try {
			
			String sql = "delete from tblMemo where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, seq);
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("DAO.del");
			e.printStackTrace();
		}
		
		return 0;
	}

}



