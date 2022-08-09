package com.test.java.obj;

public class EX32_Class {
	public static void main(String[] args) {

		/*
		 ** contrl + shift + l > quick search 자주 사용하기
		 
		- 보통 자바에서는 물리적인 파일 1개에 클래스를 (되도록) 1개만 선언한다.
		- 이유 > 관리 차원
		ex)
		EX20_if 클래스에서 문제 발생 > "EX20_if.java" 클래스 찾기
		Size 클래스에서 문제 발생 > 파일명에 없기 때문에 바로 찾을 수 없음
		
		- 절대 규칙 : 파일의 이름과 클래스의 이름이 반드시 동일해야 한다.
		> 위반 : 컴파일 오류 발생
		
		- 파일 1개에 N개의 클래스를 선언할 수 있다.
		> 파일안에 N개의 클래스 중 public을 가지는 클래스는 딱 1개
		> public 클래스 == 대표 클래스 > 대표 클래스의 이름이 파일명이 된다.
		  
		 */
	} // main
} // class


class Mouse {
}


// class Point { }
// 오류 > 클래스의 영역 > package > EX30파일에 존재 (동일한 패키지)
// 같은 패키지 안에는 똑같은 클래스 만들 수 없다.
