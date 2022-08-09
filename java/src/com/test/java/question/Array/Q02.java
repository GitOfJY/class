package com.test.java.question.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception {
		/*
		2번 문제 (완료)
		요구사항  : 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		조건	    : 이름을 오름차순 정렬하시오.
		입력     : 학생 수 : 6 
				  학생명 : 홍길동 
				  학생명 : 아무개 
				  학생명 : 하하하 
				  학생명 : 호호호 
				  학생명 : 후후후 
				  학생명 : 헤헤헤 
		출력     : 입력한 학생은 총 6명입니다.
				  1. 아무개
				  2. 하하하
				  3. 헤헤헤
				  4. 호호호
				  5. 홍길동
				  6. 후후후
		 */

		makeList();

	}// main

	public static void makeList() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 : ");
		int studentNum = Integer.parseInt(reader.readLine());
		String[] name = new String[studentNum];


		for (int i = 0; i < studentNum; i++) {
			System.out.print("학생명 : ");
			String studentName = reader.readLine();
			name[i] = studentName;


		} // 1번째 for


		// sort로 사용 가능함
		for (int i = 0; i < name.length - 1; i++) {
			for (int j = 0; j < name.length - 1 - i; j++) {

				if (name[j].compareTo(name[j + 1]) > 0) {
					// campareTo 주소값
					String temp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp;
				}
			}
		} // 2번째 for

		System.out.printf("입력한 학생은 총 %d명입니다.\n", studentNum);
		for (int i = 0; i < name.length; i++)
			System.out.printf("%d. %s\n", i + 1, name[i]);
	}


}// char
