package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	/*
	6번 문제 (완료)
	요구사항  : 아래와 같이 출력하시오.
	입력     : 시작 숫자 : 1 
			  종료 숫자 : 10
	출력     : 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
	입력     : 시작 숫자 : 3 
			  종료 숫자 : 5
	출력     : 3 - 4 + 5 = 4
	
	1.숫자 입력받기
	2. for문에서 if문 넣고 i가 짝수면 -, 홀수면 + 계산
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int finishNum = Integer.parseInt(reader.readLine());

		int sum = 0;
		String stringSum = "";



		for (int i = startNum; i <= finishNum; i++) {

			if (i != startNum) {
				if (i % 2 == 0) {
					sum -= i;
					stringSum += " - " + i;
				} else {
					sum += i;
					stringSum += " + " + i;
				}
			} else {
				sum += i;
			}
		}


		System.out.printf("%d%s = %d", startNum, stringSum, sum);
	}
	/*
	public static int evenOddSum (int num, int sum, String stringSum) {
		if (num % 2 == 0) {
			sum -= num;
		} else {
			sum += num;
		}
		
		public static void evenOddString (int num, int sum, String stringSum) {
			if (num % 2 == 0) {
				sum -= num;
				stringSum = "-" + num;
			} else {
				sum += num;
				stringSum = "+" + num;
			}
	
	} */
}
