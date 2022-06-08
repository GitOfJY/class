package com.test.java.mvc;

import java.util.ArrayList;
import java.util.Scanner;

//Address 업무 담당 객체
//1. 쓰기
//2. 읽기
//3. 수정하기
//4. 삭제하기


public class Service {

	public void start() {
		
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		
		while (loop) {
		
			View view = new View();
			
			view.menu();
			
			
		
			String input = scan.nextLine();
			// 산술연산 아니면 되도록 문자열로 처리
		
		
			if (input.equals("1")) {
				add();
			} else if (input.equals("2")) {
				list();
			} else if (input.equals("3")) {
				edit();
			} else if (input.equals("4")) {
				del();
			} else {
				loop = false;
			}
		
		}//while
		
		
	}

	
	
	
	private void add() {
		
		System.out.println("[주소록 등록하기]");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 :");
		String name = scan.nextLine();
		
		System.out.print("나이 :");
		String age = scan.nextLine();
		
		System.out.print("성별(m,f) :");
		String gender = scan.nextLine();
		
		System.out.print("전화 :");
		String tel = scan.nextLine();
		
		System.out.print("주소 :");
		String address = scan.nextLine();
		
		//DB 담당자
		DAO dao = new DAO();
		
		//Service > 데이터 > DAO
		Address dto = new Address();
		dto.setName(name);
		dto.setAge(age);
		dto.setGender(gender);
		dto.setTel(tel);
		dto.setAddress(address);
		
		
		int result = dao.add(dto); // 1.성공 0.실패
		
		if (result == 1) {
			//성공
			System.out.println("주소록 등록을 완료했습니다.");
		}
		else {
			// 실패
			System.out.println("주소록 등록을 실패했습니다.");
		}
		
		pause();
		
	} //add()

	
	
	
	private void list() {
		
		System.out.println("[주소록 목록보기]");
		
		// 1. DAO 위임 > DB > select > rs
		// 2. 결과셋 반환
		// 3. View에게 전달 + 출력
		
		
		DAO dao = new DAO();
		
		
		// *** DB 담당자 > JDBC 코드 관리 > DAO
		// *** Service 담당자 > JDBC 코드 관리
		// Connection, Statement, ResultSet > 반드시 DAO.java에서만 코딩
		// ResultSet rs = dao.list();
		
		
		// Address > 레코드
		// ArrayList > 테이블
		ArrayList<Address> list = dao.list();
		
		View view = new View();
		view.list(list);
		
		pause();
		
	}//list()

	
	
	
	private void edit() {
		
		System.out.println("[주소록 수정하기]");
		
		// 수정할 번호 > 입력 > 현재 내용 출력 > 수정할 데이터 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 번호 : ");
		String seq = scan.nextLine();
		
		DAO dao = new DAO();
		
		Address dto = dao.get(seq);
		
		System.out.println("이름: "+dto.getName());
		System.out.println("나이: "+dto.getAge());
		System.out.println("성별: "+dto.getGender());
		System.out.println("전화: "+dto.getTel());
		System.out.println("주소: "+dto.getAddress());
		System.out.println();
		
		
		System.out.println("수정할 항목(수정하지 않으려면 입력하지 않고 엔터)");
		
		System.out.print("이름: ");
		String name = scan.nextLine(); // 수정 안하면 원래 이름
		
		if (!name.equals("")) {
			dto.setName(name); // db전 dto안에 이름만 수정
		}
		
		System.out.print("나이: ");
		String age = scan.nextLine();
		
		if (!age.equals("")) {
			dto.setAge(age); 
		}
		
		System.out.print("성별: ");
		String gender = scan.nextLine();
		
		if (!gender.equals("")) {
			dto.setGender(gender); 
		}
		
		System.out.print("전화: ");
		String tel = scan.nextLine();
		
		if (!tel.equals("")) {
			dto.setTel(tel); 
		}
		
		System.out.print("주소: ");
		String address = scan.nextLine();
		
		if (!address.equals("")) {
			dto.setAddress(address); 
		}
		
		
		// DB > update
		int result = dao.edit(dto);
		
		if (result == 1) {
			System.out.println("주소록 수정을 완료했습니다.");
		} else {
			System.out.println("주소록 수정을 실패했습니다.");
		}
		
		pause();
		
	}//edit()

	
	
	
	private void del() {
		
		System.out.println("[주소록 삭제하기]");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 번호: ");
		String seq = scan.nextLine();
		
		
		DAO dao = new DAO();
		
		int result = dao.del(seq);
		
		if (result == 1) {
			System.out.println("주소록 삭제를 완료했습니다.");
		} else {
			System.out.println("주소록 삭제를 실패했습니다.");
		}
		
		
		pause();
		
	}//del()
	
	
	
	private void pause() {
		Scanner scan = new Scanner(System.in);
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	} //pause()
	
	
}//Service




/*

int num = scan.nextInt();
System.out.println(num);

int num2 = scan.nextInt();
System.out.println(num2);

> 해결법 : scan.skip("\r\n"); || scan.nextLine();

String str = scan.nextLine();
System.out.println(str);

System.out.println("종료");


[출력 결과]
선택 : 1
1
2
2
     > 두번째 숫자를 입력 버퍼로부터 가져가고 입력 버퍼안에는 \r\n이 남아있는 상태
       (??????? 멈춰서 str 입력 안받고 자동 건너뛰기 됨) > 공회전 > Skip
종료

	
scan.nextLine() vs scan.nextXXX()
nextLine > nextXXX  문제 없음
nextXXX  > nextLine 문제 발생

 */




