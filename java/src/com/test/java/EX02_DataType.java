package com.test.java;


public class EX02_DataType {
	public static void main(String[] args) {
	
		
		//단일라인 주석 : 선택 후 ctrl+/
		//다중라인 주석 : 선택 후 ctrl+shift+/ 취소할 땐 역슬래쉬
		//라인 이동 : alt+방향키
		//블럭잡기(선택영역)
		//shift+방향키
		//shift+ctrl+방향키
		//shift+Home
		//shift+End
		//라인 지우기 : ctrl + d
		
		
		System.out.println("두번째 예제입니다.");
		
	}
}



//새로운 언어(기술) > 자료형(Date Type) 확인

/*



자료형, Data Type (교재 p55~p68)

-데이터(자료)의 형태

-데이터의 길이(범위)와 생김새를 미리 정의하고 분류해놓은 규칙 > 이름





자바의 자료형

1.원시형 (Primitive Type), 값형(Value Type)

a.숫자형

	1.정수형 : 표현할 수 있는 공간의 크기가 다르기 때문에 4종류로 나누어짐
		a. byte
			- 1byte(=8bit)
			- 2^8
			- -128~127

		b. short 
			- 2byte(=16bit)
			- 2^16
			- -23768~32767

		c. int
			- 4byte(=32bit)
			- 2^32
			- -21억~21억

		d. long
			- 8byte(=64bit)
			- 2^64
			- -922경~922경

	2.실수형

		a. float
			- 4byte
			- 무제한
			- 단정도형(정밀도 > 유효한 숫자 저장할 범위)

		b. double
			- 8byte
			- 무제한
			- 배정도형(단정도*2 정밀도)

b.문자형

	1.문자형

		a. char
			- 2byte
			- 유니코드 지원
			- 문자셋 -> 문자코드 -> 테이블내장

c.논리형

	1.논리형

		a. boolean
			- 1byte
			- 명제 참, 거짓
			- true. false


2.참조형 (Reference Type)



*/





//bit : 물리적으로 저장할 수 있는 최소 단위, 0과 1만 저장 가능 

//1024byte = 1KB (byte -> KB -> MB -> GB -> TB)

//교재 ch1~5(ch4~5, 알고리즘 공부와 자료구조), ch6~7(class, 어려움), ch8~10, ch11(중요), ch12(class확장), ch14(최근 기술) 

//ch13, ch16 수업 안함