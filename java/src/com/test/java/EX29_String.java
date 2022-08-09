package com.test.java;

public class EX29_String {
	public static void main(String[] args) {

		/*
		  1. 메모리의 공간은 할당되면 더 이상 늘리거나 줄일 수 없다.
		  2. 문자열은 불변(Immutable)이다. > 한번 만들어진 문자열을 절대 수정할 수 없다.
		  3. 문자열은 참조형이다.
		  
		  자바의 자료형
		  1. 값형 
		  - 값이 변경되어도 공간의 크기는 변화가 없다.
		  2. 참조형
		  - 값이 변경되면 공간의 크기가 변한다.
		 */

		// m1();
		m2();


	}// main


	private static void m2() {

		// String vs StringBuilder
		// - 문자열

		String s1 = "홍길동"; // 문자열 리터럴 사용 ("")
		String s3 = new String("홍길동"); // 문자열의 원래 모습
		StringBuilder s2 = new StringBuilder("홍길동"); // 참조형의 기본 코드

		// StringBuilder > 기존의 String에 비해 가지는 장점 > 수정 작업에 강하다
		// 일반적인 문자열 > String
		// 하드한 수정 작업 > StringBulder

		long begin = System.nanoTime();

		String txt1 = "홍길동";

		for (int i = 0; i < 100000; i++) {
			txt1 = txt1 + "."; // 수정 작업 > 다량의 쓰레기가 생김
		}

		long end = System.nanoTime();
		System.out.println(txt1.length()); // 100003
		System.out.println(end - begin + "ns"); // 10820696500ns

		begin = System.nanoTime();

		StringBuilder txt2 = new StringBuilder("홍길동");
		for (int i = 0; i < 100000; i++) {
			txt2.append("."); // 수정 작업 > 쓰레기 발생 안함
		}
		end = System.nanoTime();
		System.out.println(txt2.length()); // 100003
		System.out.println(end - begin + "ns"); // 12505600ns
	}



	private static void m1() {

		// 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		int n1 = 10; // 4byte
		int n2 = 20; // 4byte

		n1 = 1000000000; // 4byte

		String s1 = "홍길동"; // 6byte
		String s2 = "아무개"; // 6byte
		System.out.println(s1); // 100번지


		s1 = "홍길동안녕하세요"; // 16byte
		System.out.println(s1); // 300번지 > 공간을 늘리는 것이 아니라 새로 만들고 주소값을 변경한 것

		// 코드상의 모든 문자열 리터럴은 메모리(힙)에 새로 생성된다.
		s1 = "참";
		System.out.println(s1); // 400번지

		// 자료형 > int > 모두 4byte > Stack 저장
		int a = 10;
		int b = 20;
		int c = 1000000;


		// 자료형 > int[] > 자료형은 똑같지만 메모리가 다름 > 참조형 > Heap에 저장
		int[] alist = new int[3]; // 12byte
		int[] blist = new int[5]; // 20byte
		int[] clist = new int[10]; // 40byte


		// 자료형 > String > 자료형은 똑같지만 메모리가 다름 > 참조형 > Heap에 저장
		// stack에 변수 만들고 메모리 주소 저장, heap에 실제 데이터 저장해서 연결
		String t1 = "홍길동"; // 6byte
		String t2 = "홍"; // 2byte
		String t3 = "홍길동입니다."; // 14byte

		String txt = "홍길동";
		txt = "아무개"; // 데이터 크기가 같아도 새롭게 만들고 연결

		// 같은 지역에 한해서(같은 메소드안에서만)
		String m1 = "홍길동";
		String m2 = "홍길동";
		String m3 = "홍길동";

		String w1 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";
		String w2 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";
		String w3 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";

		// 문자열은 불변이다.
		String z1 = "홍길동";
		String z2 = "홍길동";

		z1 = "홍길남";



		// 문자열을 대상하는 피해야 하는 행동 > 상황 파악
		// 1. 문자열의 잦은 수정
		// 2. 큰 문자열의 수정

		String txt1 = "홍길동";

		for (int i = 0; i < 100; i++) {
			txt1 = txt1 + "님"; // 누적 > 수정 > 100번
		}
		System.out.println(txt1);
	}

}
