package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	/*
	6번 문제 (완료)
	요구사항  : 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
	조건	    : 유효성 검사를 하시오.(영문자만 입력 가능)
	입력     : 문자 : a 
	출력     : 'a'의 대문자는 'A'입니다.
	입력     : 문자 : F 
	출력     : 'F'의 소문자는 'f'입니다.
	입력     : 문자 : 가 
	출력     : 영문자만 입력하시오.
	
	1. 문자 입력받기
	2. int로 변환하기
	3. 숫자 범위로 대소문자 구분하기
	대문자 65 - 90
	소문자 97 - 122
	4. 출력할때 변환하기
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String alphabet = reader.readLine();
		int numAlphabet = alphabet.charAt(0);


		if ((numAlphabet >= 65 && numAlphabet <= 90) || (numAlphabet >= 97 && numAlphabet <= 122)) {
			if (numAlphabet >= 65 && numAlphabet <= 90) {
				System.out.printf("'%s'의 소문자는 '%c'입니다.", alphabet, (char) (numAlphabet + 32));
			} else if (numAlphabet >= 97 && numAlphabet <= 122) {
				System.out.printf("'%s'의 대문자는 '%s'입니다.", alphabet, (char) (numAlphabet - 32));
			}
		} else {
			System.out.println("영문자만 입력하시오.");
		}


	}// main
}// class
