package com.test.java.obj.stereo;

public class EX51_enum {
	public static void main(String[] args) {


		/*
		클래스 종류
		1. 클래스
		- class 클래스명 { 구현 멤버 }
		2. 인터페이스
		- interface 인터페이스명 { 추상 멤버 }
		3. 추상 클래스
		- abstract class 추상클래스명 { 구현 멤버 / 추상 멤버 }
		4. enum (이넘) 
		- enum 열거형명 { 열거형 멤버 }
		
		공통점 : 자료형 > 변수 만들 수 있음
		
		열거형, Enumeration 
		- 클래스의 일종
		  
		 */



		// 요구사항 : 의류 쇼핑몰 > 티셔츠 > 고객 > 색상 선택(빨강, 노랑, 파랑)
		// Case1. 오타 발생 가능 높음
		String color = "빨강";

		if (color.equals("빨강") || color.equals("노랑") || color.equals("파랑")) {
			System.out.println("판매가능");
		} else {
			System.out.println("재고 없음");
		}



		// Case2. 오타가 발생하면 바로 에러 발생
		// 선택형 > 제약적 > 제공한 것들 중에서만 선택해서 사용해라 > 안정성
		색상 c1 = 색상.빨강; // 열거형 방식 리터럴 표기법
		색상 c2 = 색상.파랑;
		색상 c3 = 색상.노랑;

		if (c1 == 색상.빨강 || c1 == 색상.노랑 || c1 == 색상.파랑) {
			System.out.println("판매가능");
		} else {
			System.out.println("재고 없음");
		}



		int c3 = 색상2.노랑;

		if (c3 == 색상2.빨강 || c3 == 색상2.노랑 || c3 == 색상2.파랑) {
			System.out.println("판매가능");
		} else {
			System.out.println("재고 없음");
		}

		직급 position = 직급.사원;

		Gender g1 = Gender.MALE;
		Gender g2 = Gender.FEMALE;


	} // main
}// EX51


// 열겨형 선언하기 > , 조심하기
// enum 에서는 int로 저장됨
enum 색상 {
	빨강, 노랑, 파랑 // final static 상수
}


// enum의 실체
class 색상2 {
	final public static int 빨강 = 0;
	final public static int 노랑 = 1;
	final public static int 파랑 = 2;
}


enum 직급 {
	사원, 대리, 과장, 부장
}


enum Gender {
	// 열거형 멤버 > 상수 > 대문자로 작성
	MALE, FEMALE
}

