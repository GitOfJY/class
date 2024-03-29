package com.test.java.obj.inheritance;

public class EX68 {
	public static void main(String[] args) {

		// 상속 this, super
		CupChild c = new CupChild();
		// new CupParent() 실행

		// 외부
		c.bbb();
		c.test();
		c.call();

	}// main
}// EX68


class CupParent {

	// 접근 지정자도 변함없이 그대로 상속
	private int a;
	private int b;

	private void aaa() {}

	public void bbb() {
		System.out.println(this.a);
	}

	public void test() {
		System.out.println("부모 메소드");
	}
}


class CupChild extends CupParent {

	// 같은 클래스 내부에서는 접근 지정자가 동작하지 않는다.
	// 같은 클래스 내부에서는 전부 같은 식구 > 접근할 수 있다.

	private int c;

	public void ccc() {

		// 부모가 물려준 private 멤버가 안보인다.
		// System.out.println(a);
		// System.out.println(b);

		System.out.println(c);
		bbb(); // 접근 불가능했던 부모의 private 멤버 a를 접근하는 인터페이스

	}


	// public void test() {
	// System.out.println("자식메소드"); > 재정의
	// }


	@Override
	public void test() {
		super.test();
		// 안전 장치 > 자식이 오버라이드 완성X > 기존에 쓰던 부모 메소드라도 호출
		// 지울거면 뭐라도 만들어야함
	}


	public void call() {
		// 자식 메소드가 호출 > 부모가 물려준 test()를 호출하고 싶은 경우
		// test();
		// this.test();

		super.test(); // 부모의 test()

		// 객체 접근 연산자
		// 1. this > 나, 현재 객체
		// 2. super > 부모 객체

	}
}
