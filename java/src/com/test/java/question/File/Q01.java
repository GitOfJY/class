package com.test.java.question.File;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 경로 : ");
		String input = reader.readLine();

		int index = input.lastIndexOf("\\") + 1;
		int dotindex = input.lastIndexOf(".") + 1;

		System.out.printf("파일명 : %s\n", input.substring(index, input.length()));
		System.out.printf("종류 : %s\n", input.substring(dotindex, input.length()));

		// 파일 크기는 뭐로 연결하는거지?.. > 자체적인 파일 크기로 코드 작성함

	}// main
} // Q01
