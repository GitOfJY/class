package com.test.java.question.iteration3;

public class Q11 {
	public static void main(String[] args) {
		/*
		11번 문제 (완료)
		요구사항  : 아래와 같이 출력하시오.
		조건	    : 마지막 숫자가 100이 넘기 전까지 출력하시오.
		출력     : 1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 = 469
		 */

		sum();

	}// main

	public static void sum() {
		int sum = 0;
		int jSum = 0;
		for (int i = 1; jSum < 90; i++) {
			for (int j = i - 1; j <= i - 1; j++) {
				jSum += j;
			}
			System.out.print((1 + jSum) + "+");
			sum += (1 + jSum);
		}
		System.out.print("=" + sum);

		// TODO 수업시간에 했던거 마지막에 + 없애고 터미널?로 보는 방법 모르겠음 (2022. 3. 20. 오후 8:17:00)

	}
}// class
