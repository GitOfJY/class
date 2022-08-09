package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EX25_Array {

	public static void main(String[] args) throws Exception {


		/*
		 베열, Array 
		 - 자료형 
		 - 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형
		 - 같은 자료형을 저장하는 집합 > 같은 자료형 변수들의 집합	 
		  
		*/
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();

		// m6();
		// m7();
		// m8();
		// m9();

		// m10();
		m11();


	}

	private static void m11() {
		// 1~10 사이의 난수
		int[] ns = new int[10];
		for (int i = 0; i < ns.length; i++) {
			ns[i] = (int) (Math.random() * 10) + 1;
		}

		// 배열안의 상태? > 확인 작업
		for (int i = 0; i < ns.length; i++) {
			System.out.println(ns[i]);
		}

		System.out.println();
		printArray(ns);
		System.out.println();

		System.out.println(dump(ns));

		// 배열의 작업을 도와주는 클래스 > Arrays
		System.out.println(Arrays.toString(ns));
		// 덤프 메소드 > 배열 상태 확인용으로 사용

		// TODO 덤프 메소드가 뭐야? (2022. 3. 20. 오후 9:27:54)

	}

	// 배열의 상태를 문자열로 바꿔서 변환 > 덤프(dump);
	public static String dump(int[] ns) {
		String txt = "[";

		for (int i = 0; i < ns.length; i++) {
			txt += ns[i] + ",";
		}
		txt += "]";

		return txt;

	}

	private static void m10() {
		// 배열 초기화 리스트

		int[] ns1 = new int[5];
		printArray(ns1); // 자동 초기화
		System.out.println();

		ns1[0] = 100;
		ns1[1] = 90;
		ns1[2] = 80;
		ns1[3] = 70;
		ns1[4] = 60;
		printArray(ns1); // 사용자 초기화
		System.out.println();

		int[] ns2 = new int[] {100, 90, 80, 70, 60}; // 초기화 리스트
		printArray(ns2);
		System.out.println();

		int[] ns3 = {100, 90, 80, 70, 60}; // 초기화 리스트
		printArray(ns3);
		System.out.println();

		String[] name1 = new String[3];
		name1[0] = "홍길동";
		name1[1] = "아무개";
		name1[2] = "하하하";

		String[] name2 = new String[] {"홍길동", "아무개", "하하하"};


	}

	private static void m9() {
		// 변수의 생성 직 후 상태

		// int a; > null상태
		// System.out.println(a);

		int[] ns = new int[3];
		System.out.println(ns[0]); // 0

		/*
		 배열 자동 초기화
		 배열(참조형)은 값형과 다르게 생성 직후에 사용자(개발자)가 아무것도 안해도 자동으로 초기화가 된다.
		 
		  규칙
		  1. 정수배열 > 0
		  2. 실수배열 > 0.0
		  3. 문자배열 > \0(null)
		  4. 논리배열 > false
		  5. 참조형배열 > null
		  
		 */

		double[] ns2 = new double[3];
		System.out.println(ns2[0]); // 0.0

		boolean[] ns3 = new boolean[3];
		System.out.println(ns3[0]); // false


	}


	private static void m8() {
		// 배열 복사
		// 1. 얕은 복사, Shallow Copy
		// - 주소값 복사
		// - Side Effect 발생

		// 2. 깊은 복사, Deep Copy
		// - 요소끼리 복사 > 값복사
		// - Side Effect 발생 X
		int[] ns = new int[3];

		ns[0] = 10;
		ns[1] = 20;
		ns[2] = 30;

		int[] copy = new int[3]; // =new int[3];

		// copy = ns;
		// ns[0] = 100;

		for (int i = 0; i < ns.length; i++) {
			// 값형 복사
			// int = int
			copy[i] = ns[i];
		}

		ns[0] = 100; // copy에는 영향 없음

		printArray(ns);
		System.out.println();

		printArray(copy);
		System.out.println();

	}

	public static void printArray(int[] ns) {
		for (int i = 0; i < ns.length; i++) {
			System.out.printf("%d: %d\n", i, ns[i]);
		}

	}


	private static void m7() {
		// 배열복사(=참조형 복사기)
		// 1. 값형 복사
		// 2. 참조형 복사

		// a안에는 데이터(값) 10이 들어있다.
		int a = 10; // 값형 (Value Type)
		int b = a;

		// 값형의 복사 > 공간이 가지는 값을 복사한다.
		b = a;

		// 원본 수정 > 복사본 영향 없음 > Side Effect 발생하지 않는다.
		a = 20;

		System.out.println("a : " + a); // 20
		System.out.println("b : " + b); // 10

		// ns안에는 실제배열의 주소가 들어있다.
		int[] ns = new int[3]; // 참조형(reference Type)

		ns[0] = 10;
		ns[1] = 20;
		ns[2] = 30;


		int[] copy = new int[3];

		// int[] = int[]
		// 참조형 복사 > 주소값을 복사한다.
		copy = ns;

		// 원본 수정 > 복사본 영향 있음 > Side Effect 발생한다. > 주의!
		ns[0] = 100;

		System.out.println(ns[0]);
		System.out.println(copy[0]);


		String name = "홍길동";

		// TODO 스택? 힙? (2022. 3. 19. 오후 12:34:35)



	}

	private static void m6() throws Exception {
		// 프로그램 > 메모리 공간 할당 > 변수 생성
		// 메모리에 할당 받은 공간의 크기는 불변이다.
		// 배열의 길이는 불변이다.

		// 성적 처리 프로그램
		// - 배열의 길이? > 300명 > 전학생? > 최대치 320~330

		// 자바의 배열은 길이는 불변이지만, 동적할당은 가능하다.
		// int[] list = new int[3]; > 정적할당
		// int[] list = new int[?]; > 동적할당
		// 정적할당 > 컴파일 때 이미 배열의 길이가 정해짐
		// 동적할당 > 컴파일 때는 배열의 길이를 모름 > 런타임때 정해짐

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열의길이 : ");
		int length = Integer.parseInt(reader.readLine());
		int[] num = new int[length];

	}


	private static void m5() {

		// 각 자료형 > 배열

		// 정수 배열(byte, short, int, long)

		byte[] list1 = new byte[3];
		list1[0] = 10;
		System.out.println(list1[0]);

		long[] list2 = new long[3];
		list2[0] = 100000000;
		System.out.println(list2[0]);

		// 실수 배열 (float, double)
		double[] list3 = new double[3];

		// 문자형 배열, 참조형 배열
		String[] list4 = new String[3];
		list4[0] = "홍길동";

	}

	private static void m4() {

		int[] kors = new int[3];

		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		// kors[3] = 70;
		// java.lang.ArrayIndexOutOfBoundsException:
		// 배열의 범위가 늘어났다.

		for (int i = 0; i < 3; i++) {
			System.out.printf("kors{%d] = %d\n, i, kors[i]", i, kors[i]);
		}


	}


	private static void m3() {

		// int[] > int베열
		// kors > 변수명, 배열명
		// new > 객체생성 연산자
		// 3 > 배열의 길이 > 변수의 갯수
		int[] kors = new int[3];

		// 배열의 길이 == 방의 갯수
		System.out.println(kors.length); // 프로퍼티(property) 필드(field)


		int index = 0;
		kors[index] = 100; // 배열 0번째 방에 100을 넣어라
		index++;
		kors[index] = 90; // 배열 1번째 방에 100을 넣어라

		// 배열 방 > 요소
		// 배열 방번호 > 첨자(Index)
		// 자바 배열의 방번호는 0부터 시작한다.

		// 루프 변수(i)의 변화 > 베열 방번호 변화
		// 배열의 탐색
		for (int i = 0; i < kors.length; i++) {
			kors[i] = 100;
		}

		int total = 0;
		for (int i = 0; i < kors.length; i++) {
			total = kors[i];
		}

		double avg = (double) total / kors.length;

	}


	private static void m2() {
		// 1.배열 선언하기 (생성하기)
		// - 자료형[] 변수명 = new 자료형[길이]
		// 2.배열 사용하기 (입/출력)

		// 학생수 300명 증가


		// n의 자료형? int
		int n = 10;

		// kors의 자료형? int[] > int배열
		int[] kors = new int[3];

		// kors[0]의 자료형 > int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		// kors[299] = 100;

		int total = kors[0] + kors[1] + kors[2];
		double avg = total / kors.length;

		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);



	}



	private static void m1() {
		// 같은 성격의 데이터 (데이터의 성격(국어) + int)를 여러개 취급하는 상황

		// 요구사항 : 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항 : 학생 수 증가 > 300명

		int kor1;
		int kor2;
		int kor3;
		// 변수 297개 더 필요

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// 279개 필요

		int total = kor1 + kor2 + kor3; // kor4+kor5+...+kor279
		double avg = total / 3.0;
		// double이니까 둘 중 한개는 double형
		// double avg = (double)total / 3 도 가능하지만 위에가 더 좋음
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);



	}
}
