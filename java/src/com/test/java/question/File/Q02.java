package com.test.java.question.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) {

		/* 2번 문제
		 요구사항 : 지정한 폴더의 특정 파일(확장자)만을 출력하시오.
		 조   건 : 확장자 대소문자 구분없이 검색 가능
		 입   력 : 폴더: C:\class\eclipse 
				  확장자: exe 
		 출   력 : eclipse.exe 
				  eclipsec.exe
		 입   력 : 폴더: C:\class\eclipse 
		 	      확장자: xml
		 출   력 : artifacts.xml
				  구글.XML
		 */



	} // main

	private static void findMethod() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파일 경로 : ");
		String path = reader.readLine();

		System.out.print("확장자 : ");
		String extension = reader.readLine();

		File dir = new File(path);


		if (dir.exists()) {
			File[] list = dir.listFiles();

			// 폴더에 총 파일이 몇개인지 어떻게 세지?
			for (int i = 0; i < list.length; i++) {
				String input = list[i];
				int dotindex = input.lastIndexOf(".") + 1;
			}
		}
	}

} // Q02

// 대소문자 구분
// 확장자 lastindexof > . 찾기
