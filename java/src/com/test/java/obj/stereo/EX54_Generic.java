package com.test.java.obj.stereo;

public class EX54_Generic {
	public static void main(String[] args) {

		// Item is a raw type.
		// References to generic type Item<T> should be parameterized
		Item i1 = new Item(); // 작동은 가능하지만 어떤 문제가 생길지 모름

		Item<String> i2 = new Item<String>();
		i2.c = "문자열";
		Item<Integer> i3 = new Item<Integer>();
		i3.c = 10;

		// ***값형을 사용할 수 없다. > 반드시 참조형(클래스)만 가능
		// Item<int> i3 = new Item<int>(); > 오류
		// byte > Byte
		// int > Integer
		// short > Short


		Pen<Boolean> p1 = new Pen<Boolean>();
		p1.a = true;
		p1.b = false;
		p1.c = true;

		// Desk<String> d1 = new Desk<>(); > 가능하지만 비권장
		Desk<String> d1 = new Desk<String>();
		d1.a = "문자열";
		d1.test("문자열");
		String result = d1.get();

		Cup<String, Integer> c1 = new Cup<String, Integer>("문자열", 100);
		Cup<Double, Boolean> c2 = new Cup<Double, Boolean>(3.14, true);

		System.out.println(c1.getA());
		System.out.println(c1.getB());

	}// main
}// EX54



// 제네릭 클래스
// - T : 타입 변수 > 자료형을 저장하는 변수
// - <> : 인자 리스트 역할
class Item<T> {

	public int a;
	public int b;
	public T c;
	// 클래스 설계 당시에는 c의 자료형 결정 되지 않음 > 객체 생성할 때 결정

} // Item<T>


// int a = 10; > 데이터 담는 공간
// T = int; > 자료형 담는 공간


class Pen<T> {

	public T a;
	public T b;
	public T c;

}


class Desk<T> {

	public T a; // 멤버변수의 자료형

	public void test(T a) { // 메소드 매개변수의 자료형
		T b; // 지역변수 > 비권장
	}

	public T get() { // 메소드 반환타입
		return this.a;
	}


}


class Cup<T, U> {

	public T a;
	public U b;

	public Cup(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return this.a;
	}

	public U getB() {
		return this.b;
	}
}
