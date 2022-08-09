package com.test.java.obj.staticmember;

public class EX40_Static {
	public static void main(String[] args) {

		// 요구사항
		// 1. 펜을 생성하시오.
		// 2. 생산된 펜의 개수를 세시오.

		/*
		Case 1.
		- Pen과 count간의 관계 약함 > 가독성 낮음(count라는 이름이 Pen하고 아무 상관 없음)
		- 오차 발생(count++ 누락)
		int count = 0;
		
		Pen p1 = new Pen("Monami", "Black");
		count++;
		
		Pen p2 = new Pen("Monami", "Black");
		count++;
		
		Pen p3 = new Pen("Monami", "Black");
		count++;
		
		System.out.println("볼펜의 개수: " + count);
		 
		
		
		Case 2.
		- count변수와 Pen의 관계를 강하게 연결 > 결합 (class안에 변수 생성)
		Pen p1 = new Pen("Monami", "Black");
		p1.count++; // 소속이 명확
		
		Pen p2 = new Pen("Monami", "Black");
		p2.count++; > 각각 count에 저장되니까 p1으로 한번에 저장
		p1.count++;
		
		Pen p3 = new Pen("Monami", "Black");
		p3.count++;
		p1.count++;  > 공용으로 쓰기 위한 데이터지만 p1(개인 객체)으로 몰아주고 있음
		
		System.out.println("볼펜의 개수: " + p1.count);
		> p1이라는 객체(개인)이 모든 펜들의 개수를 세는 공통적인 값을 대표로 저장할만한 이유가 없다.
		> 카 오 스 , 가장 최악의 상태
		
		
		
		Case 3.
		- Pen과 count 변수의 관계 명확
		- 소재 분명 > 여러곳 아니라 유일 > 변수가 딱 1개
		Pen p1 = new Pen("Monami", "Black");
		Pen.count++;
		
		Pen p2 = new Pen("Monami", "Black");
		Pen.count++;
		
		Pen p3 = new Pen("Monami", "Black");
		Pen.count++;
		
		System.out.println("볼펜의 개수: " + Pen.count); 
		*/


		// Case 4.
		// - 생성자 + Static 합쳐진 경우
		// - 가장 이상적인 방법
		// - count++ 누락 방지
		Pen p1 = new Pen("Monami", "Black"); // 생성과 동시에 자동으로 count ++
		Pen p2 = new Pen("Monami", "Black");
		Pen p3 = new Pen("Monami", "Black");

		System.out.println("볼펜의 개수: " + Pen.count);


	}
}

/*
class Pen {
	private String model;
	private String color;
	public int count = 0; > Case 2.

	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String dump() {
		return String.format("{ model: %s, color: %s }", this.model, this.color);
	}
}
*/


class Pen {
	private String model;
	private String color;
	public static int count = 0; // Case 3. 공용데이터, 변수 1개만 생성

	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++; // Case 4. pen만들때 유일하게 호출되는 생성자 메소드
	}

	public String dump() {
		return String.format("{ model: %s, color: %s }", this.model, this.color);
	}
}
