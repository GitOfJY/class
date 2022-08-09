package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	/*
	3번 문제 (완료)
	요구사항  : 숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
	입력     : 숫자 : 5 
	출력     : 1 ~ 5 = 15
	입력     : 숫자 : 10
	출력     : 1 ~ 10 = 55
	
	
	1. 숫자 입력받기
	2. sum 변수 생성
	3. for (int i=1; i<=입력받은숫자; i++) {sum += i}
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int finishNum = Integer.parseInt(reader.readLine());

		int sum = 0;

		for (int i = 1; i <= finishNum; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d", finishNum, sum);
	}

}
