package com.test.java.question.iteration3;

public class Q09 {
	public static void main(String[] args) {
		/*
		9번 문제 (완료)
		요구사항  : 아래와 같이 출력하시오.
		출력     : 1 ~  10 :   55
				  1 ~  20 :  210
				  1 ~  30 :  465
				  1 ~  40 :  820
				  1 ~  50 : 1275
				  1 ~  60 : 1830
				  1 ~  70 : 2485
				  1 ~  80 : 3240
				  1 ~  90 : 4095
				  1 ~ 100 : 5050
		 */
		for (int i = 1; i <= 10; i++) {
			sum(i * 10);
		}


	}// main

	public static void sum(int finalNum) {
		int result = 0;
		for (int i = 1; i <= finalNum; i++) {
			result += i;
		}
		System.out.printf("1 ~ %3d : %4d \n", finalNum, result);

	}


}// class
