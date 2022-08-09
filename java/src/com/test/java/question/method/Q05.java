package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		5번 문제 (완료)
		요구사항  : 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		조건	    : String getNumber(int)
		입력     : 숫자 : 5 
		호출     : result = getNumber(n); 
				  System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		출력     : 입력하신 숫자 '5'는(은) '홀수'입니다.
		입력     : 숫자 : 2 
		호출     : result = getNumber(n); 
				  System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		출력     : 입력하신 숫자 '2'는(은) '짝수'입니다.
		
		1) buffer 숫자 입력
		2) 메소드 만들기 > %2에서 나머지가 0이면 짝수 1이면 홀수 > 입력하신 숫자 '%d'는(은) '%s'입니다.\n
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 :");
		String input = reader.readLine();
		int n = Integer.parseInt(input);

		String result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);



	} // main

	public static String getNumber(int x) {
		String result = (x % 2) == 0 ? "짝수" : "홀수";
		return result;
	}

}
