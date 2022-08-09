package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	/*
	5번 문제 (완료)
	요구사항  : 아래와 같이 출력하시오.  
	입력     : 시작 숫자 : 1 
			  종료 숫자 : 10 
	출력     : 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	입력     : 시작 숫자 : 3 
			  종료 숫자 : 5 
	출력     : 3 + 4 + 5 = 12
	
	1. 입력받기
	2. sum 변수 생성
	3. for (int i=시작숫자; i<=종료숫자; i++) {sum+=i}
	4. 출력 > 여기가 문제네 > String frontSum 변수 생성해서 for문 안에서 문자끼리 합치기
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int finishNum = Integer.parseInt(reader.readLine());

		int sum = 0;
		String stringSum = "";

		for (int i = startNum; i <= finishNum; i++)

			if (i != finishNum) {
				{
					sum += i;
					stringSum += i + " + ";
				}
			} else {
				sum += i;
				stringSum += i;
			}


		System.out.printf("%s = %d", stringSum, sum);
	}

}
