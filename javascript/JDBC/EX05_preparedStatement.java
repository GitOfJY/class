package com.test.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EX05_preparedStatement {
	public static void main(String[] args) {
		
		//m1();
		m2();
		
		
		
	}//main

	private static void m2() {
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			
			// 정적 쿼리
			String sql = "select name from tblInsa where num = 1001";
			
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			rs.close();
			stat.close();
			
			
			//동적 쿼리
			sql = "select name from tblInsa where num = ?";
			
			pstat = conn.prepareStatement(sql);
			
			//인덱스에서 누락된 IN 또는 OUT 매개변수:: 1 > ?에 값 안 넣었을 때
			pstat.setString(1, "1001");
			//pstat.setInt(1, 1001); > java 입장 자료형
			//둘 다 동작
			//내부적으로 알아서 처리하기 떄문에 자료형 신경 안써도 됨
			rs = pstat.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			rs.close();
			pstat.close();
			
			
			
			//인자가 없는 쿼리 > pstat > 가능하지만 혼동을 줌
			sql = "select count(*) as cnt from tblInsa";
			pstat = conn.prepareStatement(sql);
			rs=pstat.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString("cnt"));
			}
			
			rs.close();
			pstat.close();
			
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//statement vs preparedStatement
		//- SQL 실행
		//- 매개변수 처리 지원 유무
		//- Statement         > 정적 SQL
		//- PreparedStatement > 동적 쿼리
		
		//insert > 사용자 입력
		String name = "하하하";
		String age = "20";
		String gender = "m";
		String tel = "010-1111-2222";
		//String address = "서울시 동대문구 쌍문동";
		
		String address = "서울시 동대문구 쌍문's동";
		//ORA-00917: missing comma
		//address = address.replace("'", "''"); > 이스케이프 처리
		//결과 > 서울시 동대문구 쌍문''s동
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		try {
			
			
			conn = DBUtil.open();
			stat = conn.createStatement(); //A
			
			
			//Statement
			String sql = String.format("insert into tblAddress(seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', '%s', '%s', '%s', '%s', default)", name, age, gender, tel, address);
			
			System.out.println(sql);
			
			//int result = stat.executeUpdate(sql); //A. 실행 시 SQL 대입
			//System.out.println(result);

			
			
			
			//preparedStatment
			// ? : 오라클 매개변수
			//- SQL 작성이 용이하다. > String.format과 유사
			//- 매개변수값으로 부적절한 값이 있어도 자동으로 이스케이프 시켜준다.(****) > 안정성이 높다.
			sql = "insert into tblAddress(seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";

			pstat = conn.prepareStatement(sql); //B. 미리 SQL 대입
			pstat.setString(1, name);
			pstat.setString(2, age);
			pstat.setString(3, gender);
			pstat.setString(4, tel);
			pstat.setString(5, address);
			
			int result = pstat.executeUpdate(); //B
			System.out.println(result);
					
			
			
			stat.close();
			conn.close();
			
			//결론 
			//sql 쿼리에 변화가 있어 String.format 사용 > pstat
			//sql 쿼리에 변화가 없으면 > stat
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
}//EX05
