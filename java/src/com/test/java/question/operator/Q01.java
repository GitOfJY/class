package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		
		/*
		1번 문제 (완료)
		요구사항  : 태어난 년도를 입력받아 나이를 출력하시오.
		조건	    : 우리나라 나이로 출력하시오.
		입력     : 태어난 년도 1997년
		출력     : 나이 26세
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		String input = reader.readLine();
		int age = Integer.parseInt(input); //int로 바로 받을 수 있음
		age = 2022 - age + 1;
		System.out.println("나이 "+age+"세");
		
		//산출물 보기
	}
}
