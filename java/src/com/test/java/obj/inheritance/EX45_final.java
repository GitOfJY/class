package com.test.java.obj.inheritance;

import java.util.Calendar;

public class EX45_final {
	public static void main(String[] args) {

		/*
		 
		 final 키워드 
		 - 한번 결정하면 바꿀 수 없다.
		 
		  1. 변수에 적용 (지역변수+멤버변수)
		  	- 초기화 이후에 값을 변경할 수 없다.
		  	- 상수
		  	- const int num = 10;
		  	
		  2. 메소드 적용
		  	- 상속 시 재정의(override)를 할 수 없다.
		  	
		  3. 클래스 적용
		  	- 상속이 불가능하다.
		  
		 */

		// 지역변수
		int a = 10;
		a = 20; // 수정 가능

		// 상수
		// - 상수는 되도록 선언과 동시에 초기화한다. > 권장
		final int b = 20;
		// b = 10; > 수정 불가능

		// 아래처럼 따로 초기화하는 방식은 비권장 > 변수처럼 보여서
		final int c;
		c = 30;

		// 상수명은 모두 대문자로 작성한다.(명명법)
		final double PI = 3.14;

		Calendar now = Calendar.getInstance();
		System.out.println(now.get(1)); // 의미없음

		int year = 1;
		System.out.println(now.get(year)); // 의미있음
		System.out.println(Calendar.YEAR); // 1 > 캘린더 상수

		// 객체변수 > new가 있어야 행동, 인스턴스 생성해야 행동
		User u1 = new User();
		System.out.println(u1.GENDER); // 2

		User u2 = new User();
		System.out.println(u2.GENDER); // 2 > 상수니까!

		System.out.println(User.NUM); // final static 상수
		System.out.println(Calendar.YEAR); // YEAR > final static 상수

	}// main

}// EX45


class User {
	// 객체 변수의 역할(***) : 객체 각각의 자신의 저장 공간 > 자신만의 데이터를 저장하기 위해 > 객체의 상태 > 상태로 객체를 구분
	public int age; // 멤버변수
	final public int GENDER = 2; // 멤버 상수 > 객체 멤버 상수를 잘 안만든다. > static과 유사하기 때문

	final public static int NUM = 3; // static변수에 상수 > static 상수
	// static > 객체 각각 아니고 한곳에만 만든다

	public User() {
		this.age = 0;
		// ***변수는 생성자에서 초기화
	}

}


class Member {
	public int a;
	public static int b;

	// 생성자 > 객체생성자
	public Member() {
		this.a = 10;
		// Member.b =20; > 정적 변수를 생성자에서 초기화하면 안된다.
		// 생성자 > 정적 생성자 > 정적 멤버만 초기화하는 역할
		// static {Member.b=20;} > 정적 생성자는 정적변수만 초기화
	}
}


class FinalParent {
	// 부모 클래스 설계시
	// - 상속받는 자식이 이 메소드만큼은 고치지 않았으면 하는 경우가 있다.
	// - 프로그램의 안정성 문제
	final public void test() {
		System.out.println("메소드");
	}
}


class FinalChild extends FinalParent {
	// public void test() {
	// System.out.println("재정의"); } > final method > 오버라이드 불가능
}


// 부모 클래스를 생성할 당시 > 먼 훗날 자식 클래스 > 포기
final class FinalUser {

}

// The type FinalUserAdmin cannot subclass the final class FinalUser
// class FinalUserAdmin extends FinalUser {}
