package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	/*
	1번 문제 (완료)
	요구사항  : 사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
	입력     : 이름 : 홍길동 
			  횟수 : 3 
	출력     : 홍길동님 안녕하세요~
			  홍길동님 안녕하세요~
			  홍길동님 안녕하세요~
	
	1. buff 입력 받기
	2. 인사하는 메소드 만들기
	3. for문 안에서 인사 메소드 출력
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 : ");
		String name = reader.readLine();
		System.out.print("횟수 : ");
		int num = Integer.parseInt(reader.readLine());

		for (int i = 1; i <= num; i++) {
			hello(name);
		}



	}// main

	public static void hello(String name) {
		System.out.printf("%s님 안녕하세요~\n", name);
	}

}// class
