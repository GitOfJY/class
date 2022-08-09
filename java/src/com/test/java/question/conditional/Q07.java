package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	/*
	7번 문제 (완료)
	요구사항  : 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
	조건	    : 1 ~ 10 사이의 정수만 입력받으시오.
	입력     : 숫자 입력 : 3 
			  숫자 입력 : 2 
			  숫자 입력 : 7 
			  숫자 입력 : 1 
			  숫자 입력 : 8 
	출력     : 짝수는 2개 홀수는 3개 입력했습니다.
			  홀수가 짝수보다 1개 더 많습니다.
			  
		1. 숫자 입력
		2. if 홀수 -> n에 저장, 짝수 -> 5-n개
		3. else 1 ~ 10 사이의 정수만 입력
		- 메소드 만들어서 ? 계속 호출? 어케할까 -> 누적 합계가 안됨
		
	 */
	public static void main(String[] args) throws Exception {

		int evenSum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num2 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num3 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num4 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num5 = Integer.parseInt(reader.readLine());

		if (num1 >= 1 && num1 <= 10) {
			if (num1 % 2 == 0) {
				evenSum += 1;
			}
		} else {
			System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
		}

		if (num2 >= 1 && num2 <= 10) {
			if (num2 % 2 == 0) {
				evenSum += 1;
			}
		} else {
			System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
		}

		if (num3 >= 1 && num3 <= 10) {
			if (num3 % 2 == 0) {
				evenSum += 1;
			}
		} else {
			System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
		}

		if (num4 >= 1 && num4 <= 10) {
			if (num4 % 2 == 0) {
				evenSum += 1;
			}
		} else {
			System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
		}

		if (num5 >= 1 && num5 <= 10) {
			if (num5 % 2 == 0) {
				evenSum += 1;
			}
		} else {
			System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
		}


		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.", evenSum, 5 - evenSum);


		if (evenSum > 3) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", evenSum * 2 - 5);
		} else {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", 5 - evenSum * 2);
		}


	}// main
	/* 메소드 만들었는데 main에서 sum 누적이 안됨
		public static void sum(int num, int evenSum) {
			if (num >= 1 && num <= 10) {
				if (num % 2 == 0) {
					evenSum += 1;
				}
			} else {
				System.out.println("1 ~ 10 사이의 정수만 입력하세요.");
			}
	
		} */
}// clas
