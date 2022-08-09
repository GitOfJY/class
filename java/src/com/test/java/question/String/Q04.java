package com.test.java.question.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {


		/*
		4번 문제 (완료)
		요구사항  : 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
		조건     : 확장자는 다음으로 제한한다.
			 	  mp3, jpg, java, hwp, doc
		입력     : 파일명: 인기가요.mp3
			 	  파일명: cat.jpg
			 	  파일명: Ex01.java
			 	  파일명: icon.jpg
			 	  파일명: 수업_정리.doc
			 	  파일명: Scanner.java
			 	  파일명: food.jpg
			 	  파일명: 공지사항.hwp
			 	  파일명: 이력서.hwp
			 	  파일명: 출금내역.doc
		출력     : mp3 : 1개
				  jpg : 3개
				  java : 2개
				  hwp : 2개
				  doc : 2개
		 */


		fileNum();



	} // main


	public static void fileNum() throws Exception {
		int mp3Sum = 0;
		int jpgSum = 0;
		int javaSum = 0;
		int hwpSum = 0;
		int docSum = 0;

		for (int i = 0; i < 10; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일명 : ");
			String input = reader.readLine();

			if (input.endsWith(".mp3")) {
				mp3Sum += 1;
			} else if (input.endsWith(".jpg")) {
				jpgSum += 1;
			} else if (input.endsWith(".java")) {
				javaSum += 1;
			} else if (input.endsWith(".hwp")) {
				hwpSum += 1;
			} else if (input.endsWith(".doc")) {
				docSum += 1;
			}

		} // for
		System.out.printf("mp3 : %d개\n", mp3Sum);
		System.out.printf("jpg : %d개\n", jpgSum);
		System.out.printf("java : %d개\n", javaSum);
		System.out.printf("hwp : %d개\n", hwpSum);
		System.out.printf("doc : %d개\n", docSum);


	}


} // class

// 대소문자 구별 추가하기
