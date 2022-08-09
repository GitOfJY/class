package com.test.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EX04_select {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		//m6();
		//m7();
		//m8();
		//m9();
		
	} //main

	
	
	private static void m9() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//tblAddress 출력
			String sql = "select * from tblAddress order by seq asc";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			
			//자원 해제 코드, Clean-up code (생명 주기가 있기 때문에 필수 아님, 자동으로 close 호출)
			//굳이 닫는 이유? 먼저 닫는게 메모리 효율이 좋음
			//rs.close();
			//stat.close();
			//conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static void m8() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//요구사항 : 영업부 직원수와 영업부 직원 명단을 출력
			//1. select count(*) as cnt from tblInsa where buseo = '영업부';
			//2. select * from tblInsa where buseo = '영업부';
			
			String sql = "";
			
			
			// 1
			sql = "select count(*) as cnt from tblInsa where buseo = '영업부'";
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println("직원수 : " + rs.getShort("cnt"));
			}
			
			rs.close();
			
			
			
			// 2
			sql = "select * from tblInsa where buseo = '영업부'";
			
			rs = stat.executeQuery(sql);
			
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			rs.close();
			
			
			
			// 1 + 2
			sql = "select * from tblInsa where buseo = '영업부'";
			
			rs = stat.executeQuery(sql);
			
			int n = 0;
			
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				n++;
			}
			
			System.out.println("직원수" + n);
			
			
			// 1 쿼리와 2 쿼리는 독립적이다.
			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static void m7() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//회원명 + 대여한 비디오명
			String sql = "select m.name, v.name from tblVideo v inner join tblRent r on v.seq = r.video inner join tblMemeber m on m.seq = r.member";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
				// 부적합한 열 이름 > 해결방법 alias로 유일한 식별자 만들기
				
				//System.out.println(rs.getString("m.name"));
				//System.out.println(rs.getString("v.name"));
				
				//System.out.println(rs.getString("name"));
				//System.out.println(rs.getString("name_1"));
				
				//System.out.println(rs.getString("name"));
				//System.out.println(rs.getString("name"));
				
			}
			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	private static void m6() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			//NullPointerException > stat 구문 없을 때 오류
			
			String sql = "select name, buseo, jikwi from tblInsa";
			//ORA-00904: "NAME1": invalid identifier > 컬럼명이 틀렸을 때
			rs = stat.executeQuery(sql);
			//NullPointerException > rs 구문 없을 때 오류
			
			while (rs.next()) {
				
				//System.out.println(rs.getString("nae"));
				//java.sql.SQLException: 부적합한 열 이름
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("buseo"));
				System.out.println(rs.getString("jikwi"));
			
			}
			
			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static void m5() {
		
		// tblInsa + tblBous
		// 요구사항 : 특정 직원에게 보너스를 지급하시오.
		// 1. 모든 직원 명단을 출력(직원번호, 이름, 부서, 직위) > m4() 참조
		// 2. 사용자 > 직원 선택(직원번호 입력)
		// 3. 사용자 > 보너스 금액 입력
		// 4. 보너스 지급 > insert tblBonus
		// 5. 지급된 내역을 명단 출력(직원번호, 이름, 부서, 직위, 보너스, 금액) > m4()
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			Scanner scan = new Scanner(System.in);

			// 1. 모든 직원 명단을 출력(직원번호, 이름, 부서, 직위) > m4() 참조
			String sql = "select num, name, buseo, jikwi from tblInsa";
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[번호]\t [이름]\t [부서]\t [직위]");
			
			while (rs.next()) {
				System.out.printf("%s\t %s\t %s\t %s\t \n", rs.getString("num"), rs.getString("name"), rs.getString("buseo"), rs.getString("jikwi"));					
			}
			
			rs.close(); //여기서 안 닫아줘서 밑에 error
			System.out.println();
		
			
			// 2. 사용자 > 직원 선택(직원번호 입력), 보너스 금액 입력
			System.out.println("직원 번호: ");
			//int num = scan.nextInt(); 
			String num = scan.nextLine();
			
			System.out.println("보너스: ");
			//int bonus = scan.nextInt();  > basicpay랑 더해야하니까 int로 받았는데 String이어도 괜찮구나
			String bonus = scan.nextLine();
			
			
			//String reSql = "select num, name, buseo, jikwi, basicpay from tblInsa";
			///rs = stat.executeQuery(reSql);
			
			
			// ResultSet.next가 호출되지 않았음 도대체 왜!!!!!! > close 안해서
			// 4. 보너스 지급 > insert tblBonus
			//String bonusSql = "update tnlInsa set basicpay = "+rs.getInt("basicpay")+bonus+"where num = "+num;
			//rs = stat.executeQuery(bonusSql);
			sql = String.format("insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, %s, %s)", num, bonus);
			
			int result = stat.executeUpdate(sql);
			
			
			
			// 5. 지급된 내역을 명단 출력(직원번호, 이름, 부서, 직위, 보너스, 금액) > m4()
			if (result > 0) {
				System.out.println("보너스 지급을 완료했습니다.");
				System.out.println();
				
				System.out.println("[번호]\t[이름]\t[부서]\t[직위]\t[보너스]");
				
				sql = "select i.num, i.name, i.buseo, i.jikwi, b.bonus from tblInsa i inner join tblBonus b on i.num = b.num order by b.num asc";
				
				rs = stat.executeQuery(sql);
				
				while (rs.next()) {
					System.out.printf("%s\t%s\t%s\t%s\t%,10d원\n"
							, rs.getString("num")
							, rs.getString("name")
							, rs.getString("buseo")
							, rs.getString("jikwi")
							, rs.getInt("bonus"));
				}
				
				
				
				System.out.println();
				System.out.println("프로그램 종료");
				
				
			} else {
				System.out.println("보너스 지급을 실패했습니다.");
			}
				
			
			
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


	
	
	private static void m4() {
		
		// 다중값 반환
		// - N행 N열
		// - 레코드 N줄 + 컬럼 N개
		
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String buseo = "영업부";
			
			String sql = "select name, jikwi, city, basicpay from tblInsa where buseo = '"+buseo+"'";
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[이름]\t[직위]\t[지역]\t[급여]");
			
			while (rs.next()) {
				
				// 직원 1명
				System.out.printf("%s\t%s\t%s\t%,10d원\n", rs.getString("name"), rs.getString("jikwi"), rs.getString("city"), rs.getInt("basicpay"));					
			}
			
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static void m3() {
		
		// 다중값 반환
		// - N행 1열
		// - 레코드 N줄 + 컬럼 1개
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		
		try {

			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name from tblInsa order by name";
			
			// 60명
			rs = stat.executeQuery(sql);
			
			rs.next();
			rs.next();
			rs.next();
			
			// 몇 바퀴? 60바퀴 - 3바퀴 (커서때문에 4번째 사람부터 가져옴)
			//iter.hasNext()
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			// rs.next()
			// 결과 집합을 모두 소모했음
			//ResultSet.next가 호출되지 않았음
			//rs = stat.executeQuery(sql); //BOF
			// System.out.println(rs.getString("name"));
			
			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


	private static void m2() {
		
		// 다중값 반환
		// - 1행 N열
		// - 레코드 1줄 + 여러개 컬럼
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name, age, tel, address from tblAddress where seq = 2";
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("나이: " + rs.getString("age"));
				System.out.println("번호: " + rs.getString("tel"));
				System.out.println("주소: " + rs.getString("address"));
			
			} else {System.out.println("데이터가 없습니다.");}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static void m1() {

		// 단일값 반환
		// - 1행 1열
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select count(*) as cnt from tblInsa";
		
			//반환값 없을 때 > executeUpdate()
			//반환값 있을 때 > executeQuery()
			
			//int count = stat.executeUpdate(sql);
			//System.out.println(count);
			
			rs = stat.executeQuery(sql);
			
			// Result == 커서(Cursor) > 판독기 > stream, iterator, 향상된 for문
			
			rs.next(); // 커서를 1줄 전진 > 레코드 위치
			
			// 현재 커서가 가르키고 있는 레코드의 특정 컬럼값을 가져와라
			// int cnt1 = rs.getInt(컬럼 순서(index));
			int cnt1 = rs.getInt(1);
			System.out.println(cnt1);
			
			// int cnt2 = rs.getInt("컬럼명"); > 가독성이 높기 때문에 자주 사용
			//int cnt2 = rs.getInt("count(*)"); 가독성 안 좋으니 alias 붙이기
			int cnt2 = rs.getInt("cnt");
			System.out.println(cnt2);
		
			String cnt3 = rs.getString("cnt");
			System.out.println(cnt3);
			
			stat.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}//EX04
