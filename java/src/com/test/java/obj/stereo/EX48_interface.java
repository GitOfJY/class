package com.test.java.obj.stereo;

public class EX48_interface {
	public static void main(String[] args) {

		/*
		 Stereo Type
		 - 추상적인 자료형
		 - 인터페이스, 추상클래스 > 클래스의 일종 
		 
		 인터페이스, interface
		 
		 1. 인터페이스는 자료형이다.
		 2. 인터페이스는 객체를 만들 수 없다.
		 	- 클래스처럼 인스턴스 생성 불가 Mouse m1 = new Mouse();
		 	- 추상 멤버(추상 메소드)를 가지고 있기 때문에 실체화 할 수 없다.  
		 */

		// G304 m1 = new G304();
		// m1.click();
		// m1.click();
		// m1.click();

		// 새마우스
		// G102 m2 = new G102();
		// m2.click();

		// Mouse m1 = new Mouse();
		// m1.test(); > 이것 때문에 객체를 만들 수가 없다.
		// 추상멤버를 가지고 있기 때문 > 알맹이가 없기 때문에 호출 불가


	}// main
}// EX48

// 서로 비슷한 부류의 객체들의 사용법을 물리적으로 통일시키는 방법 > 인터페이스
// 인터페이스 == 제품의 규격 역할


// 인터페이스 선언
interface Mouse {
	// 인터페이스 멤버 선언
	// - 추상 메소드를 멤버로 가진다. (*****)
	// - 멤버 변수는 가질 수 없다.
	// - 일반 메소드는 가질 수 없다.

	// private String name;
	// Illegal modifier for the interface field Mouse.name; only public, static & final are
	// permitted
	// public String name; > 변수 선언 불가능

	// Abstract methods do not specify a body
	// 추상 메소드 > 구현부가 없음 > 할일이 정의되지 않음
	// 추상 메소드 선언(인터페이스 멤버)
	void test();
	// (pubic abstract) void test();
	// 일반 클래스는 추상 메소드 선언 불가능

	void click();


}


// 클래스 선언
// The type G304 must implement the inherited abstract method Mouse.test(
class G304 implements Mouse {
	private String type;
	private String color;
	private int dpi;

	// public void click() {}

	// 인터페이스는 자식 클래스에 강제로(***) 어떤 메소드를 만들도록 한다.
	@Override
	public void test() {
		// 마음대로 구현
	} // test

	@Override
	public void click() {}// click

}// G304



class G102 implements Mouse {
	private String color;
	private int price;
	private int buttons;

	// public void click() {}

	@Override
	public void test() {
		// 마음대로 구현
	} // test

	@Override
	public void click() {}// click


}


class AAA {
	private BBB b;
	private int num;
	private CCC[] list;
}


class BBB {
}


class CCC {
}


class DDD {
	public void test() {
		EEE e = new EEE();
	}
}


class EEE {
}
