package com.test.java.question.overload;

public class Q01 {
	public static void main(String[] args) throws Exception {
		/*
		1번 문제 (완료)
		요구사항  : 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		조건	    : void sum(int)
				  void sum(int, int)
				  void sum(int, int, int)
				  void sum(int, int, int, int)
				  void sum(int, int, int, int, int)
		호출     : sum(10);
				  sum(10, 20);
				  sum(10, 20, 30);
				  sum(10, 20, 30, 40);
				  sum(10, 20, 30, 40, 50);
		출력     : 10 = 10
				  10 + 20 = 30
				  10 + 20 + 30 = 60
				  10 + 20 + 30 + 40 = 100
				  10 + 20 + 30 + 40 + 50 = 150
		 */

		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}

	public static void sum(int x) {
		System.out.printf("%d = %d\n", x, x);
	}

	public static void sum(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}

	public static void sum(int x, int y, int z) {
		System.out.printf("%d + %d + %d  = %d\n", x, y, z, x + y + z);
	}

	public static void sum(int x, int y, int z, int i) {
		System.out.printf("%d + %d + %d + %d = %d\n", x, y, z, i, x + y + z + i);
	}

	public static void sum(int x, int y, int z, int i, int j) {
		System.out.printf("%d + %d + %d + %d + %d = %d\n", x, y, z, i, j, x + y + z + i + j);
	}
}
