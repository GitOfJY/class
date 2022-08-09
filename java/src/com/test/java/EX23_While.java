package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX23_While {
	public static void main(String[] args) throws Exception {
		/*
		  while (조건식) {    } > 반복 실행
		  >> for문이랑 똑같다!
		 */
		// m1();
		// m2();
		// m3();
		m4();


	}// main


	private static void m4() throws Exception {

		// 프로젝트 적용
		// 루프 : 메뉴 출력 > 선택 > 실행 > 다시 메뉴로 돌아가기
		// 학생 관리 시스템

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean loop = true;

		while (loop) {
			System.out.println("============");
			System.out.println("학생 관리 시스템");
			System.out.println("============");
			System.out.println("1. 학생 등록보기");
			System.out.println("2. 학생 목록보기");
			System.out.println("3. 학생 성적처리");
			System.out.println("4. 학생 상담일지");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택 : ");
			String sel = reader.readLine();
			if (sel.equals("1")) {
				// 1.학생등록
				add();
			} else if (sel.equals("2")) {
				// 2. 학생목록
				list();
			} else if (sel.equals("3")) {
				// 3. 성적처리
				score();
			} else if (sel.equals("4")) {
				// 4. 상담일지
			} else {
				loop = false; // break;도 가능, 무한 루프 탈출
				// 5. 프로그램 종료
			}


		}


	}

	private static void add() {}

	private static void list() {}

	private static void score() {}



	private static void m3() {
		// 구구단
		int dan = 5;
		int n = 1;
		while (n <= 9) {
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			n++;

		}



	}

	private static void m2() {

		// 1~100사이 값 누적하기

		int sum = 0;
		int n = 1;

		while (n <= 100) {
			sum += n;
			n++;
		}
		System.out.println(sum);


	}



	private static void m1() {
		/* 무한루프
		int num = 10;
		while (num > 0) {
			System.out.println("양수");
		} */


		// 요구사항 : 1~10 출력하시오. >루프 변수 사용 여부 먼저 생각
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}


		int num = 1; // for 처럼 루프 변수 없음
		while (num <= 10) {
			System.out.println(num);
			num++;
		}



	}

}// class
