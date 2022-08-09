package com.test.java.question.overload;

public class Q02 {
	public static void main(String[] args) {

		/*
		2번 문제 (완료)
		요구사항  : 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		조건	    : 사원 → 대리 → 과장 → 부장
				  void position(String)
				  void position(String, String)
				  void position(String, String, String)
				  void position(String, String, String, String)
		호출     : position("홍길동");
				  position("홍길동", "유재석");
			 	  position("홍길동", "유재석", "박명수");
				  position("홍길동", "유재석", "박명수", "정형돈");
		출력     : 사원 : 홍길동
		 
				  사원 : 홍길동
				  대리 : 유재석
		
				  사원 : 홍길동
				  대리 : 유재석
				  과장 : 박명수
		
				  사원 : 홍길동
				  대리 : 유재석
				  과장 : 박명수
				  부장 : 정형돈
				  */

		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");

	}

	public static void position(String s1) {
		System.out.printf("사원 : %s\n", s1);
		System.out.println("");
	}

	public static void position(String s1, String s2) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n", s2);
		System.out.println("");
	}

	public static void position(String s1, String s2, String s3) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n", s2);
		System.out.printf("과장 : %s\n", s3);
		System.out.println("");
	}

	public static void position(String s1, String s2, String s3, String s4) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n", s2);
		System.out.printf("과장 : %s\n", s3);
		System.out.printf("부장 : %s\n", s4);
		System.out.println("");
	}



}
