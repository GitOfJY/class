package com.test.java.obj;

public class EX31_Class {
	public static void main(String[] args) {

		// 클래스 맴버
		// 1. 멤버 변수
		// 2. 멤버 메소드


		User u1 = new User();
		u1.info();

		User u2 = new User();
		u2.info();

		User u3 = new User();
		u3.info();

		System.out.println("-----------------");

		User u4 = new User();
		u4.info();
		u4.info();
		u4.info(); // 정적이기 때문에 위에와 결과가 똑같음

		System.out.println();
		System.out.println();


		// 하나의 클래스로부터 만들어진 객체는 형태와 역할이 동일하다.
		// - 검은색 볼펜, 빨간색 볼펜 > 객체의 상태(State, 멤버변수) 차이로 구분 가능하다.

		// 객체의 유일성

		Member m1 = new Member();
		m1.id = "hong"; // 객체의 상태를 다르게 지정 > 행동(메소드)에게 영향
		m1.info();

		Member m2 = new Member();
		m2.id = "lee";
		m2.info();



	} // main
} // class


class Member {
	public String id;

	// 멤버 메소드는 구현할 때 벱머 변수를 활용해야 진정한 가치를 가지게 된다.
	public void info() {
		System.out.printf("제 아이디는 %s입니다.\n", id);
		// id의 생명주기는 Member{}이기 때문에 사용가능
		// 본인의 멤버 변수를 활용 > 상태 활용
	}
}



class User {
	public void info() {
		// 메소드 > 공간의 저장 아님
		// 정적
		System.out.println("회원의 정보를 출력합니다.");
	}
}
