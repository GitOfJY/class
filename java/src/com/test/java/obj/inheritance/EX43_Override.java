package com.test.java.obj.inheritance;

public class EX43_Override {

	public static void main(String[] args) {

		/*
		메소드 오버로딩, Method Overloading
		- 메소드 이름 동일 x N개 생성 > 인자 리스트
		
		메소드 오버라이드, Method Override
		- 클래스 상속시에 발생
		- 메소드 재정의
		
		포인트
		1. 자식 클래스가 상속받은 부모의 메소드를 그대로 사용하기 싫다.
			- 상속은 거부할 수 없다.
		2. 상속 관계에 있는 클래스의 객체들은 대부분 공통된 사용법(메소드)을 가지고 있다고 생각한다.
			- 스스로 다른 형식의 메소드 생성 > 규칙 파괴
		3. 겉으로 보기엔 부모의 메소드와 동일한데 내용물 바뀐 메소드를 만들어내자
		
		 */


		// *** 상속관계에 있는 클래스 > 같은 목적을 가지는 메소드 구현 > 반드시 메소드 시그니처를 동일하게 만드는 것이 좋다.


		// 길을 가다가 마주쳤다
		OverrideParent p1 = new OverrideParent();
		p1.name = "홍길동";
		p1.hello();
		// 안녕하세요. 좋은 아침입니다. 저는 홍길동입니다.

		OverrideChild c1 = new OverrideChild();
		c1.name = "홍아들";

		// c1.hello();
		// 안녕하세요. 좋은 아침입니다. 저는 홍아들입니다. > 부모가 물려준 것

		// c1.hi();

		c1.hello();
		// 하이 나는 홍아들야
		// 외부에서 보면 부모의 hello()와 자식의 hello() 구분이 불가능하다.
		// 결론 > 무조건 자식의 hello()가 호출된다. (선택 불가능)
		// 외부에서 보면 행동이 바뀐것처럼 보인다.
		// 메소드의 알맹이가 수정된것처럼 보인다.
		// 메소드 재정의 > 메소드 오버라이드
		// 내용 업그레이드 + 사용법 유지 < 오버라이드 목적



	} // main
} // EX43


class OverrideParent {
	public String name;

	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다. \n", this.name);

	}
}


class OverrideChild extends OverrideParent {

	// 시간이 흘러 홍아들 중2
	// 자기 방식대로 인사를 하고 싶다
	// > 부모로부터 물려받은 메소드는 안쓰고 자신만의 메소드 선언
	// public void hi() {
	// System.out.printf("하이 나는 %s야\n", this.name);
	// } > 같은 기능을 하는 메소드가 2개 있음 > 안좋은 코드

	// 메소드 오버라이드 > 메소드 재정의
	// - 부모로부터 물려받은 메소드와 동일한 메소드를 자식 클래스에서 다시 선언하는 행동
	// - 부모 메소드와 자식 메소드가 동일하게 2개 존재하게 된다.
	@Override // 주석의 일종(프로그래밍 기능있음) > Annotation, control+space
	public void hello() {
		System.out.printf("하이 나는 %s야\n", this.name);
	}



}
