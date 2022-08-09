package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX11_Test {
	public static void main(String[] args) throws Exception {
		//연산자 수업 연장 > 일부 테스트 
		//요구사항 : 사용자 키보드 입력 > 문자 1개 > 영어 소문자연산인지 검사
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("영소문자 입력:");
		String input = reader.readLine();
		System.out.println("입력된 문자: "+input);
		//입력한 문자의 문자코드값 얻기 > int로 형변환
		//String(참조형) -> int(값형)로 형변환 불가능
		//String -> Char -> int
		char c = input.charAt(0); //"a" -> 'a'변환 
		int code = (int)c;
		System.out.println(code);
		
		//영소문자 확인(a(97) ~ z(122))
		System.out.println(code >= 97);
		System.out.println(code <= 122);
		
		System.out.println(code >= 97 && code <= 122);
		
		System.out.println(code >= (int)'a');
		System.out.println(code <= (int)'z');
		
		//Char 자료형은 우위 비교가 가능하다. > 내부적으로 숫자이기 때문에
		//String 자료형은 우위 비교가 불가능하다. (똑같은 한글자라도 불가능하다.)
		System.out.println(c >= 'a');
		System.out.println(c <= 'z');
	}
}
