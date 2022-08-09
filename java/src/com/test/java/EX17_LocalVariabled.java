package com.test.java;

public class EX17_LocalVariabled {
	public static void main(String[] args) {
		/*
		 자바 변수의 종류 
		 1. 멤버 변수
		 - 수업 x
		 
		 2. 지역 변수
		 - 수업 o
		 
		 지역 변수, Local Variable
		 - 메소드 안에서 선언한 변수
		 - 메소드 영역(=지역, 해당 변수의 지역)
		 - 자신이 선언된 메소드를 자신의 영역(Scope)이라고 생각한다. > 지역 변수는 자신의 영역 밖으로 나가지 못한다.
		   > 외부 지역에서는 이 지역 변수를 접근이 불가능하다. (*****) > 변수의 가용 범위 
		 - 메소드 매개 변수도 지역 변수이다.(역할 추가)
		 
		 main{
		 int a = 10;  > a는 main 메소드의 지역 변수이다.
		 m1();
		 System.out.println(b); > b는 선언되지 않는 변수로 오류 발생
		 int c = 100;} 
		 m1{int b = 20; > b는 m1 메소드의 지역 변수이다.
		 System.out.println(a); > a는 선언되지 않는 변수로 오류 발생
		 int c = 200;} > main에 존재하는 변수 c와 다른 변수
		
		 지역 변수의 생명 주기, Life Cycle
		 - 어떤 요소가 언제 태어나서(메모리에 생성된다) 언제 죽는지(메모리에서 소멸된다)
		 - 생성 > 변수 선언문이 실행되는 순간
		 - 소멸 > 변수 선언문이 포함된 자신의 영역을 제어가 빠져나가는 순간
		 */
	} // main
} // class
