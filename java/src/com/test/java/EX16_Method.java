package com.test.java;

public class EX16_Method {

	/*
	 Swap
	 - 2개의 공간안의 값을 서로 교환하는 작업
	*/

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a, b);

		String s1 = "홍길동";
		String s2 = "아무개";
		swap(s1, s2);

		boolean b1 = true;
		boolean b2 = false;
		swap(b1, b2);
	}// main


	public static void swap(int a, int b) {
		System.out.printf("a : %d, b : %d\n", a, b);

		int temp;

		temp = a;
		a = b;
		b = temp;
		System.out.printf("a : %d, b : %d\n", a, b);
	}// int


	// 메소드 이름은 동일하지만 매개변수의 자료형이 다름으로 오버로딩 가능
	public static void swap(String a, String b) {
		System.out.printf("a : %s, b : %s\n", a, b);

		String temp;

		temp = a;
		a = b;
		b = temp;
		System.out.printf("a : %s, b : %s\n", a, b);
	}// string


	public static void swap(boolean a, boolean b) {
		System.out.printf("a : %b, b : %b\n", a, b);

		boolean temp;

		temp = a;
		a = b;
		b = temp;
		System.out.printf("a : %b, b : %b\n", a, b);
	}// boolean

}// class



/*
 Swap 로직
 1. 빈 공간 추가로 사용 > 주로 사용
 2. 비트 연산자  > A^B : 비트끼리 비교해서 똑같으면 false, 다르면 true
 			  > 이정도의 공식이 있구나로 암기만 하면 됨, 잘 사용 안함 > 정수값에만 적용 가능
 int c = 10;
 int d = 20;
 
 c = c^d;
 d = c^d;
 c = c^d;
 
 System.out.printf("c : %d, d : %d", c, d);
 > temp 빈 공간 없이 swap 가능
 */
