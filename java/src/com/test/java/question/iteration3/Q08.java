package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	public static void main(String[] args) throws Exception {
		/*
		8번 문제 
		요구사항  : 숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
		조건	    : 공약수: 둘 이상의 정수에 공통된 약수
		입력     : 첫번째 숫자: 12 
				  두번째 숫자: 8 
		출력     : 12의 약수: 1, 2, 3, 4, 6, 12
				  8의 약수: 1, 2, 4, 8
				  12와 8의 공약수: 1, 2, 4
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		int firstNum = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int secondNum = Integer.parseInt(reader.readLine());
		int sameNum = 0;
		
		for (int i=1; i <= firstNum; i++) {
			for (int j=1; j<=firstNum-1; j++) {
				if () {}
			}
		}

	}
}
