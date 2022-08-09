package com.test.java;

public class EX18_Method {
	public static void main(String[] args) {

		/*
		 재귀 메소드, Recursive Method
		 - 메소드과 구현부에서 자기 자신을 호출하는 구조를 가지는 메솓,
		 - 어려움 
		 - 파일 디렉토리 구조에서 사용
		 */

		// m1(); > 사용 불가, 계속 반복만 하다가 오류 발생

		int n = 4;
		int result = m2(n);
		System.out.println(result);

		// 팩토리얼
		n = 4;
		result = factorial(n);
		System.out.printf("%d! = %d\n", n, result);

	}

	public static void m1() {
		System.out.println("안녕하세요.");
		System.out.println("홍길동입니다.");
		m1(); // 재귀 호출
		// stackOverflowError
		System.out.println("반갑습니다.");
	}

	public static int m2(int n) {
		System.out.println(n);
		int result = (n == 1) ? 1 : m2(n - 1); // 재귀메소드
		return result;
	} // TODO 조건부에 다시 메소드 호출할 수 있구나 (2022. 3. 14. 오후 12:33:20)

	public static int factorial(int n) {
		return (n == 1) ? 1 : n * factorial(n - 1);
	}
}


/* 
 자격증 > 정보처리기사 > 따!
 대기업 프로젝트, 공공기관 프로젝트
 - si
 */
