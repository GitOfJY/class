package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX21_Switch {
	public static void main(String[] args) throws Exception {

		/*
		조건문
		 1. if
		 2. switch 
		 
		 
		switch문, switch case문
		- 조건 : 값 > 정수, 문자열, 열거형(enum)
		- if문에 비해 활용도가 낮다.
		- if문에 비해 가독성이 높다.
				
		
		 switch (조건) { > 조건으로 값을 사용한다.
		 	case 값:     > case문, 숫자+: > 라벨, 위치를 표시하는 역할
		 		실행문;
		 		break;  > switch문을 빠져나가라
		 		[실행문;
		 		break;] x N 한 개 이상 사용 가능
		 	[default:
		 		실행문;
		 		break;] 생략하거나 한번만 사용 가능
		 		
		 	
		 }
		  
		 */
		// m1();
		// m2();
		// m3();
		m4();
	}


	private static void m4() throws Exception {
		// 요구사항 : 인터넷 쇼핑몰 > 상품 구매 > 옵션(패키지)
		// 1. 노트북 + 메모리카드 + 마우스패드
		// 2. 노트북 + 메모리카드
		// 3. 노트북

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("선택 : ");
		String input = reader.readLine();

		switch (input) {
			case "1":
				System.out.println("노트북");
				System.out.println("메모리카드");
				System.out.println("마우스패드");
				break;
			case "2":
				System.out.println("노트북");
				System.out.println("메모리카드");
				break;
			case "3":
				System.out.println("노트북");
				break;
		}


		// 변경사항 : 메모리카드 > USB C타입 케이블
		switch (input) {
			case "1":
				System.out.println("마우스패드");
			case "2":
				System.out.println("USB C타입 케이블");
			case "3":
				System.out.println("노트북");
				break;
		}

	}


	private static void m3() throws Exception {
		// 요구사항 : 사용자가 월을 입력 > 해당월의 마지막 일?

		int lastDay = 0;


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("월 : ");
		String month = reader.readLine();

		switch (month) {
			case "1":
			case "3":
			case "5":
			case "7":
			case "8":
			case "10":
			case "12":
				lastDay = 31;
				break;
			case "2":
				lastDay = 28;
				break;
			case "4":
			case "6":
			case "9":
			case "11":
				lastDay = 30;
				break;

		}
		System.out.printf("입력한 %s월의 마지막 날짜는 %d일 입니다.", month, lastDay);



	}


	private static void m2() throws Exception {
		// 요구사항 : 자판기
		// - 메뉴 출력 > 음료 선택 > 가격 출력
		// - 변경 사항 > 가격 인상 > 앞으로 평생 콜라와 사이다는 동일한 가격으로 판매
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===============");
		System.out.println("     자판기   ");
		System.out.println("===============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 비타500");
		System.out.println("===============");
		System.out.print("선택(번호입력): ");

		String sel = reader.readLine();
		// int se1 = Integer.parseInt(reader.readLine()); > 숫자가 아닌데 int로 받지 말기


		/* 문자열은 == 연산자 사용 불가능
		if (sel.equals("1")) {
			System.out.println("700원입니다.");
		} else if (sel.equals("2")) {
			System.out.println("600원입니다.");
		} else if (sel.equals("3")) {
			System.out.println("500원입니다.");
		}*/

		// TODO if () 안에서 string일때 비교법 외우기 (2022. 3. 16. 오후 4:39:35)
		if (sel.equals("1") || sel.equals("2")) {
			System.out.println("700원입니다.");
		} else if (sel.equals("3")) {
			System.out.println("500원입니다.");
		}


		/*
		switch (sel) {
			case "1":
				System.out.println("700원입니다.");
				break;
			case "2":
				System.out.println("600원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
		}*/


		switch (sel) {
			case "1":
			case "2":
				System.out.println("700원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
		}

	}

	private static void m1() {
		// 요구사항 : 숫자를 1개 입력받아 한글로 출력하시오.
		int num = 3; // 사용자 입력
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}

		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			// 모든 제어문 중 가독성이 제일 높음
			default:
				System.out.println("나머지 숫자");
				break;
		}



	}
}

// TODO if 과제 switch로 바꿔보기 (2022. 3. 16. 오후 4:52:17)
