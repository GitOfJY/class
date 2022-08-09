package com.test.java.question.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		5번 문제 (완료)
		요구사항  : 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		조건	    : 난수를 20개 발생 후 배열에 넣는다.
				  난수는 1 ~ 20 사이
				  배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		입력     : 최대 범위 : 15 
				  최소 범위 : 5 
		출력     : 원본 : 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
				  결과 : 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		 */
		randomNum();

	}

	private static void randomNum() throws Exception {

		int[] ns = new int[20];
		for (int i = 0; i < ns.length; i++) {
			ns[i] = (int) (Math.random() * 20) + 1;
		}



		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 범위 : ");
		int maxNum = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		int minNum = Integer.parseInt(reader.readLine());



		System.out.print("원본 : ");
		for (int i = 0; i < ns.length; i++) {
			if (i == ns.length - 1) {
				System.out.printf("%d \n", ns[i]);
			} else {
				System.out.printf("%d, ", ns[i]);
			}
		}


		System.out.print("결과 : ");
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] <= maxNum && ns[i] >= minNum) {
				if (i == ns.length - 1) {
					System.out.printf("%d \n", ns[i]);
				} else {
					System.out.printf("%d, ", ns[i]);
				}
			} else {
				continue;
			}



		}
	}


}
