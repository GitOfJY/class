package com.test.java.obj.cast;

public class EX46_Casting {
	public static void main(String[] args) {


		/*
		
		 형변환, Type Casting
		 
		 1. 값형 형변환, Value Type Casting
		 	- 값형끼리 형변환 (boolean 제외)
		 	
		 2. 참조형 형변환, Reference Type Casting 
		 	- 참조형끼리 형변환
		 
		 참조형 형변환
		 - 상속관계의 클래스간의 형변환 > 직계끼리만 가능 (방계는 불가능)
		 - A클래스 > B클래스
		 
		 
		 
		 1. 업캐스팅, Up Casting
		 	- 암시적인 형변환
		 	- 자식 클래스 > 부모 클래스
		 	
		 2. 다운캐스팅, Down Casting
		 	- 명시적인 형변환
		 	- 부모 클래스 > 자식 클래스
		 	
		 */

		Parent p2;
		Child c2;

		c2 = new Child(); // 원본

		// 복사
		// Parent = Child
		// 암시적 형변환
		// 부모 클래스 = 자식 클래스
		// 업캐스팅
		// 100% 가능 > 아주 안전한 형변환

		p2 = c2;
		// p2=(parent)c2;

		// 복사+형변환 > 제대로 완료 검증? > 복사된 참조변수 > 모든 멤버 접근 테스트
		p2.a = 10;
		p2.b = 20;

		System.out.println(p2.a);
		System.out.println(p2.b);

		// 안보이는 c,d는 중요하지 않다.



		Parent p3;
		Child c3;

		p3 = new Parent();

		// Child = Parent
		// 명시적 형변환
		// 자식 클래스 = 부모 클래스
		// 다운 캐스팅
		// 100% 불가능
		c3 = (Child) p3;

		// 검증 > 복사본이 사용에 문제가 없는지?
		c3.a = 10;
		c3.b = 20;
		c3.c = 30;
		c3.d = 40;

		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3.c);
		System.out.println(c3.d);

	} // main

	private static void temp() {}
}// EX46


// 참조형 형변환 > 상속 관계에 있는 직계 클래스끼리 가능
class Parent {
	public int a;
	public int b;
}


class Child extends Parent {
	public int c;
	public int d;
}
