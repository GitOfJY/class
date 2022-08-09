package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		
		/* 
		4번 문제 (완료)
		요구사항 : 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		조건    : ℉ = ℃ × 1.8 + 32
				 소수 이하 1자리까지 출력하시오.
		입력    : 섭씨(℃) : 29
		출력    : 섭씨 29℃는 화씨 84.2℉입니다.
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨(℃) :");
		String input = reader.readLine();
		int celsius = Integer.parseInt(input); //string으로 받지 않고 한줄로
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("섭씨 %d℃는 화씨 %.1f℉입니다.", celsius, fahrenheit);
	}
}
