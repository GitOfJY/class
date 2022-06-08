package com.test.java;

import java.sql.Connection;

//import mylibrary.db.DBUtil;
//컴파일 된 jar파일로 재사용 > 더 바람직하다.


public class EX02 {
	public static void main(String[] args) {
		
		
		try {
		
			Connection conn = DBUtil.open();
			System.out.println(conn.isClosed() ? "연결안됨" : "연결됨");
			DBUtil.close();
			
			//conn=DBUtil.open("localhost", "system", "java1234");
			//System.out.println(conn.isClosed() ? "연결안됨" : "연결됨");

			// 오류
			
			// 1. 서버 주소 틀렸을 때
			// IO 오류: The Network Adapter could not establish the connection
			//conn=DBUtil.open("localhost2", "hr", "java1234");
			//conn=DBUtil.open("200.0.0.10", "hr", "java1234");
			
			// 2. 아이디 틀렸을 때
			// ORA-01017: invalid username/password; logon denied
			//conn=DBUtil.open("localhost", "hi", "java1234");
			
			// 3. 비밀번호 틀렸을 때
			//: ORA-01017: invalid username/password; logon denied
			//conn=DBUtil.open("localhost", "hr", "java");
			
			// 4. 서버 중지일 때
			// Listener refused the connection with the following error:
			conn = DBUtil.open("localhost", "hr", "java1234");
			System.out.println(conn.isClosed() ? "연결안됨" : "연결됨");
			
			// 5. 연결 문자열 오타
			// 	String url = "jdbc:oracle:thin@localhost:1521:xe";
			// 부적합한 Oracle URL이 지정되었습니다
			
			// 6. 포트번호 틀렸을 때
			// IO 오류: The Network Adapter could not establish the connection
			
			// 7. SID 틀렸을 때
			// ORA-12505, TNS:listener does not currently know of SID given in connect descriptor
			
			// 8. 드라이버 이름 틀렸을 때
			// oracle.jdbc.driver.OracleDrdiver
			
			// 9. 라이브러리 참조 안했을 때(ojdbc6.jar 안가져왔을 때)
			// oracle.jdbc.driver.Oracledriver
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
} //EX02
