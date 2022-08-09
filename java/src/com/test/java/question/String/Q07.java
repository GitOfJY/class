package com.test.java.question.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {


		/*
		7번 문제 (완료)
		요구사항  : 숫자를 입력받아 3자리마다 , 를 붙이시오.
		조건     : %,d 사용 금지
		입력 		: 숫자: 1234
		출력     : 결과: 1,234
		입력 		: 숫자: 1234567
		출력     : 결과: 1,234,567
		
		숫자 입력받기
		for문 숫자 길이/3 나머지, 몫 이용
		뒤에서 3개씩 받고 , 붙이고 ""에 저장
		 */

		threeComma();

	} // main

	public static void threeComma() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		String input = reader.readLine();

		int startNum = input.length() % 3;

		if (startNum == 0) {
			System.out.print(input.substring(0, startNum + 3) + ",");

			for (int i = 0; i < (input.length() / 3) - 1; i++) {
				if (startNum + 3 != input.length() - 3) {
					System.out.print(input.substring(startNum + 3, startNum + 6) + ",");
					startNum += 3;
				} else {
					System.out.print(input.substring(input.length() - 3, input.length()));
				}
			}
		}

		else {
			System.out.print(input.substring(0, startNum) + ",");


			for (int i = 0; i < (input.length() / 3); i++) {
				if (startNum != input.length() - 3) {
					System.out.print(input.substring(startNum + 1, startNum + 4) + ",");
					startNum += 3;
				} else {
					System.out.print(input.substring(startNum, startNum + 3));
				}
			}
		}
	}


} // class

// 뒤에서부터 3개로 나눠서 , 들어가게 > 삽입 > list로 만들고 , +붙임 > 거꾸로 가는데 리스트는 제대로 감? 뭐지
// 누적 > StringBuilder 구현
