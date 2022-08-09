package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		4번 문제
		요구사항  : 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		조건 		: 9자리 이하 숫자만 입력하시오.
				  Math.pow() 메소드 사용(제곱값 구하는 메소드)
				  Math.pow(10, 2) → 100
				  Math.pow(10, 3) → 1000
				  Math.pow(10, 4) → 10000
		입력	    : 숫자 입력 : 273645281 
		출력     : 짝수의 합 : 22
				  홀수의 합 : 16
				  
				  
		1. 9자리 정수 입력받기 > 1000000000보다 작은 것
		> 문제 : 무조건 9자리가 아닐 수 있다는 것 , 그럼 범위를 9개로 또 나눠야함....
		2. 메소드 사용해서 10 제곱으로 나눠서 몫 구하기 > 각 자리 숫자 구하기 > 홀짝 나누기
		
		예. 9888
		
		4자리 -> 3번 루프
		몇 자리인지 어떻게 확인 ? > 또 메소드?
		
		
		9888 / 10 몫 988, 나머지 >  8 / 1 = 8 /일자리
		9888 / 100  98, 88     >  88/10 = 8 /십자리
		9888 / 1000 9, 888	   > 888/100 = 8 /백자리
		       				   > 몫  /천자리
		-> 10 거듭제곱으로 나눈 나머지 / 각자리 거듭제곱 몫  >> 메소드로 만들기 가능?
		while (자리수 -1 ) { } > 이러면 루프 돌때마다 변수 새롭게 생성해야하는데 불가능
		어쩔 수 없이 범위 나눠서 풀어야할 것 같은데;
		
		> 메소드 안하고 바로 합 구하는거랑 똑같을 듯
		
		
		*/

		boolean first = true;
		int evenSum = 0;
		int oddSum = 0;

		while (first) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자 입력 : ");
			int input = Integer.parseInt(reader.readLine());
			if (input < 100000000) {
				first = false;
			} else {
				System.out.println("9자리 이하 숫자만 입력하시오.");
			}
		}



	} // main

	public static void evenOddSum(int evenSum, int oddSum, int num) {
		if (num % 2 == 0) {
			evenSum += num;
		} else {
			oddSum += num;
		}
	}


} // class
