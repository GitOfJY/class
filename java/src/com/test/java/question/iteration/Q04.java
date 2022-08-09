package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	/*
	4번 문제 (완료)
	요구사항  : 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
	입력     : 입력 횟수 : 10 
			  숫자 : 5 
			  숫자 : 2 
			  숫자 : 12 
			  숫자 : 3 
			  숫자 : 11 
			  숫자 : 8 
			  숫자 : 1 
			  숫자 : 7 
			  숫자 : 23 
			  숫자 : 10 
	출력     : 짝수 4개의 합 : 32
			  홀수 6개의 합 : 50
	입력     : 입력 횟수 : 3 
			  숫자 : 1 
			  숫자 : 2 
			  숫자 : 3 
	출력     : 짝수 1개의 합 : 2
			  홀수 2개의 합 : 4
			  
			  
	1. for문안에서 입력받기? > 입력 횟수만 먼저 받고 나머지는 for문 안에서?
	2. evenSum, oddSum 합 변수 생성
	3. even, odd 갯수 변수 생성
	4. 입력받기 -> if문 (짝수 / 홀수 구분, 합 구하기)
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 횟수 : ");
		int repeatNum = Integer.parseInt(reader.readLine());

		int evenSum = 0;
		int even = 0;
		int oddSum = 0;
		int odd = 0;


		for (int i = 1; i <= repeatNum; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				evenSum += num;
				even += 1;
			} else {
				oddSum += num;
				odd += 1;
			}

		}

		System.out.printf("짝수 %d개의 합 : %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합 : %d\n", odd, oddSum);
	}
}
