package com.test.java.question.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {


		/*
		3번 문제 (완료)
		요구사항  : 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		입력     : 숫자: 314 
		출력     : 결과: 3 + 1 + 4 = 8
		 */

		inputSum();

	} // main

	public static void inputSum() throws Exception {
		int sum = 0;
		String stringSum = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		String input = reader.readLine();

		for (int i = 0; i < input.length(); i++) {
			int num = Integer.parseInt(input.substring(i, i + 1));
			sum += num;
			if (i != input.length() - 1) {
				stringSum += input.charAt(i) + " + ";
			} else {
				stringSum += input.charAt(i);
			}
		}

		System.out.printf("결과: %s = %d", stringSum, sum);
	}
}

// split 분리해서 배열 > StringBuilder > for문 > 더하기
// tocharArray > 추출 더하기
