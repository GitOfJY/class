package com.test.java.question.overload;

public class Q03 {
	public static void main(String[] args) {
		/*
		3번 문제 (완료)
		요구사항  : 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		조건	    : int positive(int)
				  int positive(int, int)
				  int positive(int, int, int)
				  int positive(int, int, int, int)
				  int positive(int, int, int, int, int)
		호출     : count = positive(10);
				  count = positive(10, 20);
				  count = positive(10, 20, -30);
				  count = positive(10, 20, -30, 40);
				  count = positive(10, 20, -30, 40, 50);
		출력     : 양수 : 1개
				  양수 : 2개
				  양수 : 2개
				  양수 : 3개
				  양수 : 4개
		 */

		int count = positive(10);
		System.out.printf("양수 : %d개\n", count);

		int count1 = positive(10, 20);
		System.out.printf("양수 : %d개\n", count1);

		int count2 = positive(10, 20, -30);
		System.out.printf("양수 : %d개\n", count2);

		int count3 = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d개\n", count3);

		int count4 = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n", count4);



	}

	public static int positive(int x) {
		return x > 0 ? 1 : 0;
	}

	public static int positive(int x, int y) {
		return (x > 0 && y > 0) ? 2 : (x < 0 && y < 0) ? 0 : 1;
	}

	public static int positive(int x, int y, int z) {
		int n = 0;
		n = x > 0 ? n + 1 : n;
		n = y > 0 ? n + 1 : n;
		n = z > 0 ? n + 1 : n;
		return n;
	}

	public static int positive(int x, int y, int z, int i) {
		int n = 0;
		n = x > 0 ? n + 1 : n;
		n = y > 0 ? n + 1 : n;
		n = z > 0 ? n + 1 : n;
		n = i > 0 ? n + 1 : n;
		return n;
	}

	public static int positive(int x, int y, int z, int i, int j) {
		int n = 0;
		n = x > 0 ? n + 1 : n;
		n = y > 0 ? n + 1 : n;
		n = z > 0 ? n + 1 : n;
		n = i > 0 ? n + 1 : n;
		n = j > 0 ? n + 1 : n;
		return n;
	}

	// 문제를 좀 정확히 읽고 꼼꼼히 풀자

}
