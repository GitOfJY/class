package com.test.toy.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.test.toy.DBUtil;

public class MemberDAO {
	
	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	private ResultSet rs;
	
	public MemberDAO() {
		conn = DBUtil.open();
	}
	
	//RegisterOk 서블릿 > dto > insert
	public int add(MemberDTO dto) {
		
		try {
			
			String sql = "insert into tblToyUser (id, pw, name, lv, pic, regdate) values (?, ?, ?, '1', ?, default)";
		
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getId());
			pstat.setString(2, dto.getPw());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getPic());
			
			return pstat.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("MemberDAO.add");
			e.printStackTrace();
		}
		
		return 0;
		
	}

}