package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX10_Input {
	public static void main(String[] args) throws Exception {
		//ctrl+shfit+o : 현재 페이지에 모든 클래스 import 단축기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//요구사항 : 숫자 2개를 입력받아 두 숫자의 합을 구하시오.
		
		System.out.print("숫자입력: ");
		String input1 = reader.readLine();
		
		System.out.print("숫자입력: ");
		String input2 = reader.readLine();
		
		System.out.println(input1+input2); // 10+20=1020
		
		//String"10"(참조형) -> int'10'(값형)
		//값형과 참조형끼리는 형변환이 불가능하다.
		//형변환은 불가능하고 해당 작업은 가능(따로 구현)
		
		//유틸 클래스
		//- 문자열을 자신의 자료형으로 바꿔주는 일 제공
		//input1 = "100";
		//Integer.parseInt("100"); //100으로 변환
		
		//문자열 -> 값형 (형변환 아님)
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		
		//문자열을 자신의 자료형으로 바꿔주는 일 제공 > 메소드 기억하기 (형변환 아님)
		//Byte.parseByte("문자열")
		//short.parseShort("")
		//Integer.parseInt("")
		//Long.parseLong("")
		//Float.parseFloat("")
		//Double.parseDouble("")
		//Boolean.parseBoolean("")
		
		//"A" -> 'A'
		//"A".charAt(0) 추출함수? 문자열 > char
		
		//자신의 자료형을 문자열로 바꿔주는 일 (형변환 아님)
		//100->"100"
		//String.valueOf(100)  -> "100"
		//String.valueOf(3.14) -> "3.14"
		//String.valueOf(true) -> "true"
		
		/*
		 5. 형변환 / 74
			5.1. 형변환(캐스팅, casting)이란? / 74
			5.2 형변환 방법 / 74
			5.3 정수형 간의 형변환 / 75
			5.4 실수형 간의 형변환 / 77
			5.5 정수형과 실수형간의 형변환 / 80
	 		5.6 자동 형변환 / 82
		 */

	}
	
}
