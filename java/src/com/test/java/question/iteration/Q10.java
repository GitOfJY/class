package com.test.java.question.iteration;

public class Q10 {
	/*
	10번 문제 (완료)
	요구사항  : 2부터 100사이의 소수를 구하시오.
	조건	    : 소수: 1과 자기자신으로밖에 나눠지지 않는 수
	출력     : 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	
	 1. 바깥 for (i) 2부터 100 
	 2. 내부 for 2부터 i-1까지 나눠서 0이면 소수 아님 
	 
	 
	 */

	public static void main(String[] args) {

		String sum = "";
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i - 1; j++)
				if (j != i - 1) {
					{
						if (i % j == 0) {
							break;
						}
					}
				} else {
					sum += i + ", ";
				}
		}
		System.out.println(sum);


	}
}
