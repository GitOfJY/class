package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		/* 
		3번 문제 (완료)
		요구사항 : 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		조건    : 사각형 넓이 = 가로 * 높이
				 사각형 둘레 = 가로 * 2 + 높이 * 2
		입력    : 너비 = 20, 높이 = 10
		출력    : 사각형의 넓이는 200㎠입니다.
				 사각형의 둘레는 60㎝입니다.
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비: ");
		String input1 = reader.readLine();
		
		System.out.print("높이: ");
		String input2 = reader.readLine();
		
		int width = Integer.parseInt(input1);
		int height = Integer.parseInt(input2);
		
		System.out.println("사각형의 넓이는 "+(width*height)+"㎠입니다.");
		System.out.println("사각형의 둘레는 "+(2*(width+height))+"㎝입니다.");
		
		//변수명 의미있게
		
	}
}
