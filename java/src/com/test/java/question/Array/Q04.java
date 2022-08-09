package com.test.java.question.Array;

import java.util.Arrays;

public class Q04 {
	public static void main(String[] args) {
		/*
		4번 문제 (완료)
		요구사항  : 1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
		조건	    : 난수를 20개 발생 후 배열에 넣는다.
				  난수는 1 ~ 20 사이
		출력     : 원본 : 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17
				  최대값 : 18
				  최소값 : 3
				  
				  
			크기순으로 배열하고 [0]최소, [19]최대, 원본 출력
		 */

		randomNum();
	}



	private static void randomNum() {

		int[] ns = new int[20];
		for (int i = 0; i < ns.length; i++) {
			ns[i] = (int) (Math.random() * 20) + 1;
		}


		System.out.print("원본 : ");
		for (int i = 0; i < ns.length; i++) {
			if (i == ns.length - 1) {
				System.out.printf("%d \n", ns[i]);
			} else {
				System.out.printf("%d, ", ns[i]);
			}
		}

		Arrays.sort(ns);
		// sort 없이 코드 작성하기

		System.out.printf("최대값 : %d\n", ns[19]);
		System.out.printf("최소값 : %d", ns[0]);

	}

}
