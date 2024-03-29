package com.test.java.lambda;

public class EX72_Lambda {
	public static void main(String[] args) {

		/*
		 
		 
		 
		람다식, Lambda Expression
		- 함수형 프로그래밍 방식 지원하는 표현식
		- 람다식을 사용하면 코드가 간결해진다.
		- 자바 > 컬렉션 조작을 위해서 제공
		- 자바 메소드 표현
		- 람다식은 매개변수를 가지는 코드블럭이다.(=메소드)
		- 자바의 람다식은 인터페이스를 사용해서 만든다. (***)
		- 자바의 람다식은 익명 객체를 만드는 방법을 간소화시킨 기술이다. (***)
		
		
		 
		람다식 형식
		- 인터페이스 변수 = 람다식;
		- ex) MyInterface m1 = () -> {};
		- (매개변수) -> {실행 코드}
		- a. (매개변수) : 메소드의 매개변수 리스트와 동일
		- b. -> : 화살표(Arrow), 코드블럭 호출 역할
		- c. {실행코드} : 메소드의 구현부와 동일
		
		
		
		 */

		// 요구사항 : MyInterface를 구현한 객체를 1개 만드시오.



		// Case 1. 클래스 선언 + 객체 생성
		MyInterface m1 = new MyClass();
		m1.test();



		// Case 2. 익명 객체 생성
		MyInterface m2 = new MyInterface() {
			public void test() {
				System.out.println("익명 클래스 객체에서 구현한 메소드");
			}

		};
		m2.test();



		// Case 3. 람다식
		// - 람다식 == (익명) 메소드 (인터페이스로부터 상속받아 재정의한 메소드)
		MyInterface m3 = () -> {
			System.out.println("람다식으로 만든 객체에서 구현한 메소드");
		};
		m3.test();



		// 익명 객체의 (추상) 메소드 형식에 따라

		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();


		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();


		// 실행블럭에 문장이 유일하면 {} 생략이 가능하다.
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();


		/*
		 모든 제어문 > 실행문이 1줄일 땐 {} 없어도 됨
		 while (true) System.out.println("test");
		 while (true) {System.out.println("test")};
		*/


		// void call(int num)
		ParameterNoReturn pr4 = (int num) -> {
			System.out.println(num);
		};
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);


		// 매개변수의 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (int num) -> System.out.println(num);
		pr5.call(400);
		pr5.call(500);


		// 매개변수의 ()을 생략할 수 있다.
		ParameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(400);
		pr6.call(500);


		// void call(String name, int age)
		MultiParameterNoReturn pr7 = (String name, int age) -> {
			System.out.println(name + ", " + age);
		};
		pr7.call("홍길동", 20);


		// 매개변수의 자료형을 생략할 수 있다. > 추상메소드에 매개변수가 이미 정의되어 있다.
		// 매개변수의 () 생략할 수 없다. > 매개변수의 () 생략은 매개변수가 1개일때만 가능하다.
		MultiParameterNoReturn pr8 = (name, age) -> {
			System.out.println(name + ", " + age);
		};
		pr8.call("아무개", 25);


		NoParameterReturn pr9 = () -> {
			return 20;
		};
		System.out.println(pr9.call());


		// 실행문에 return문이 유일하면 {}과 return을 생략할 수 있다.
		NoParameterReturn pr10 = () -> 20;
		System.out.println(pr10.call());

	}// main

} // EX72_Lambda


interface MyInterface {
	void test();
}


class MyClass implements MyInterface {
	public void test() {
		System.out.println("실명 클래스 객체에서 구현한 메소드");
	}
}



interface NoParameterNoReturn {
	void call();
}



interface ParameterNoReturn {
	void call(int num);
}



interface MultiParameterNoReturn {
	void call(String name, int age);
}



interface NoParameterReturn {
	int call();
}

