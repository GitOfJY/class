package com.test.java.obj.stereo;

public class EX50_abstarct {
	public static void main(String[] args) {

		/*
		 
		 1. 클래스
		 - 실체화를 한다. > 객체를 만든다.
		 - 구현된 멤버를 가진다. > 멤버 변수, 멤버 메소드({body})
		 
		 2. 인터페이스
		 - 실체화가 불가능하다. > 객체를 못 만든다.
		 - 추상 멤버를 가진다. > 추상 메소드
		 - 클래스의 부모 역할 > 표준화 역할(사용법 강제 통일)
		 
		 3. 추상 클래스 
		 - 클래스와 인터페이스의 중간
		 - 실체화가 불가능하다. > 객체를 못 만든다.
		 - 구현된 멤버를 가진다. > 멤버 변수, 멤버 메소드({body})
		 - 추상 멤버를 가진다. > 추상 메소드
		
		
		사용 빈도
		인터페이스(규칙만 주고 마음대로) >>>>> 추상 클래스(규칙에 부품까지 주고 마음대로)
		(동시에 공부하면 헷갈리니까 인터페이스만 제대로 잡기)
		
		 */

		// Keyboard k1 = new Keyboard(); > charge 호출했을 떄 문제 > 내용이 없음 > 실체화 불가
		// 인터페이스처럼 상속할 때 사용
		K8 k = new K8();
		k.color = "White"; // 구현멤버 사용
		k.info(); // 구현멤버 사용
		k.charge(); // 추상멤버 구현



	}// main
}// EX50


// 추상 클래스
abstract class Keyboard {

	// 구현 멤버
	private int price;
	public String color;

	public void info() {
		System.out.println(this.color);
		System.out.println(this.price);
	}

	// 추상 멤버
	public abstract void charge();
}


class K8 extends Keyboard {

	// 추상멤버 뿐만 아니라 구현멤버도 물려줌
	@Override
	public void charge() {

	}

}
