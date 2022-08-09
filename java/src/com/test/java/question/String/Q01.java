package com.test.java.question.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {


		/*
		1번 문제 (완료)
		요구사항  : 문장을 입력받아 역순으로 출력하시오.
		입력     : 문장 입력 : 가나다 
		출력     : 역순 결과 : "다나가"
		입력     : 문장 입력 : 안녕하세요. 홍길동입니다. 
		출력     : 역순 결과 : ".다니입동길홍 .요세하녕안"
		 */

		inverseStatement();

	} // main

	public static void inverseStatement() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장 입력 : ");
		String input = reader.readLine();
		System.out.print("역순 결과 : \"");

		for (int i = 1; i <= input.length(); i++) {
			System.out.print(input.substring(input.length() - i, input.length() - i + 1));
		}
		System.out.print("\"");

	}

} // class

// 빈 리스트 만들어서 뒤에서부터 리스트에 담기
