package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	public static void main(String[] args) throws Exception {
		/*
		8번 문제 (완료)
		요구사항  : 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		조건	    : int getApple(int sunny, int foggy)
				  사과 나무를 처음 심었을 때 나무의 길이: 0m
				  맑은 날 사과 나무의 성장률: 5㎝
				  흐린 날 사과 나무의 성잘률: 2㎝
				  사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
				  1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		입력     : 맑은 날 : 35 
				  흐린 날 : 10
		출력     : 사과가 총 9개 열렸습니다.
		1) 메소드 만들기 > (총 길이(맑은날*5+흐린날*2) - 100)/10 > 사과가 총 %d개 열렸습니다.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("맑은 날 :");
		String input1 = reader.readLine();
		int sunny = Integer.parseInt(input1);

		System.out.print("흐린 날 :");
		String input2 = reader.readLine();
		int foggy = Integer.parseInt(input2);

		int result = getApple(sunny, foggy);
		System.out.println("사과가 총 " + result + "개 열렸습니다.");

	} // main

	public static int getApple(int sunny, int foggy) {
		int apple = ((sunny * 5 + foggy * 2) - 100) / 10;
		// 조건문 빼먹음 100 보다 작을 때 처리가 안됨
		return apple;
	} // getApple
}
