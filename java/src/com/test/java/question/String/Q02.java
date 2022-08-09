package com.test.java.question.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {


		/*
		2번 문제 (완료)
		요구사항  : 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		입력     : 이메일: hong@gmail.com 
		출력     : 아이디: hong
				  도메인: gmail.com
		 */
		extractID();



	} // main

	public static void extractID() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이메일: ");
		String input = reader.readLine();

		int index = input.indexOf("@");
		String extractId = input.substring(0, index);

		System.out.println("아이디 :" + extractId);
		String extractDomain = input.substring(index + 1, input.length() - 1);
		System.out.println("도메인 :" + extractDomain);

	}

}

// split으로 없애면 num[0], num[1]로 풀이
