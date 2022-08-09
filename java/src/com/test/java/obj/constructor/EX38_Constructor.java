package com.test.java.obj.constructor;

public class EX38_Constructor {
	public static void main(String[] args) {


		Developer d1 = new Developer();
		d1.info();

		Developer d2 = new Developer("홍길동");
		d2.info();

		Developer d3 = new Developer("홍길동", "Java");
		d3.info();



	}// main
} // EX38



class Developer {

	private String name;
	private String language;

	// 생성자를 여러개 생성(생성자 오버로딩)
	// - 대부분의 생성자가 비슷한 행동을 한다.
	// - 중복코드 발생 > 줄이기
	// - 다른 생성자 호출 형태 코드 개선 > this(); > 생성자 호출하는 표현

	// A
	public Developer() {
		// this.name = "익명";
		// this.language = "없음";

		// C 호출 > 중복코드 삭제
		this("익명", "없음");
	}

	// B
	public Developer(String name) {
		// this.name = name;
		// this.language = "없음";

		// C 호출 > 중복코드 삭제
		this(name, "없음");
	}


	/*
	 
	public Developer(String language) {
		this.name = name;
		this.language = language;
	}
	
	> 이미 매개변수에 String이 있기 때문에 생성자 불가능
	> 자료형이 다르면 가능
	
	*/

	// C
	public Developer(String name, String language) {
		this.name = name;
		this.language = language;
	}


	public void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("언어 : " + this.language);
		System.out.println();
	}

} // Developer
