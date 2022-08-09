package com.test.java.obj.access;

public class EX33_Access {
	public static void main(String[] args) {

		/*
		접근 지정자(제어자), Access Modifier
		- 클래스 멤버에 붙여서 사용한다.
		- 클래스 자체에 붙여서 사용한다.
		- 지역변수에는 사용 불가능
		- 클래스(객체)의 영역을 기준으로 외부에 해당 멤버를 노출하는 수위 결정
		- 멤버를 외부에 공개할지 여부를 조절하는 역할 
		
		
		1. public > 100% 공개
		2. private > 100% 비공개 (03/23 수업, 나머지는 다음)
		3. protected
		4. default
		  */


		Book b1 = new Book();
		b1.title = "자바의 정석"; // public
		// b1.author = "남궁성"; > 오류 //private


		/*
		"홍길동" : Phone 클래스 설계
		
		"아무개" : 객체 생성
		Phone p1 = new Phone();
		p1.model = "S22";
		p1.color = "white";
		p1.price = 1200000;
		p1.weight = 350;
		
		System.out.println(p1.model);
		System.out.println(p1.color);
		System.out.println(p1.price);
		System.out.println(p1.weight);
		System.out.println();
		
		"하하하" : 객체 생성 (클래스에 대한 이해가 없는 사람)
		> 오류는 없지만 말도 안돼는 객체가 생성됨
		Phone p2 = new Phone();
		p2.model = "A22";
		p2.color = "yellow";
		p2.price = 1000000000;
		p2.weight = 1000000000;
		
		System.out.println(p2.model);
		System.out.println(p2.color);
		System.out.println(p2.price);
		System.out.println(p2.weight);
		*/

		Phone p3 = new Phone();
		p3.aaa("S22");
		// 변수를 직접 접근하는 것이 아니라 메소드 통해 접근하도록 만든 것
		System.out.println(p3.bbb());
		p3.ccc(1200000);
		System.out.println(p3.ddd());
		System.out.println();
		System.out.println();


		SmartPhone s1 = new SmartPhone();

		// 쓰기
		s1.setModel("S22");
		s1.setColor("white");
		s1.setPrice(120);
		s1.setWeight(300); // g

		System.out.println(s1.getModel());
		System.out.println(s1.getColor());
		System.out.println(s1.getPrice());
		System.out.println(s1.getWeight()); // kg

		// s1.calcWeight(1000);
		// 사용자에게 혼동을 초래한다. > 이 메소드가 왜 있지?
		// 공개되면 안됨, 사용자가 사용하는 메소드 아님

		/*
		 클래스 설계시 접근 지정자 가이드
		 1. 멤버 변수 > private
		 2. 필요한 Getter/Setter > public
		 3. 불필요한 내부 멤버 메소드 > private
		 4. 외부 호출 멤버 메소드 > piblic
		 
		 private/public > 잘 모를때 가이드
		 1. 무조건 모두 다 private(변수, 메소드)
		 2. Getter/Setter > public
		 3. 필요한데 안보이는 멤버 발생 > 하나씩 public으로 교체
		 */

		// 인스턴스/객체 만드는 쪽 > 사용자, 클래스의 내부 상관 없음
		// 클래스 내부 > 클래스 만드는 사람
		Cup cup = new Cup();

		// 쓰기, 읽기 프로퍼티
		cup.setColor("brown"); // 쓰기
		System.out.println(cup.getColor()); // 읽기

		// 쓰기 전용 프로퍼티
		cup.setWeight(500); // 쓰기
		// System.out.println(cup.getWeight()); > 읽기 구현 안함 > Getter 없음

		// 읽기 전용 프로퍼티
		// cup.setPrice(2000); > 쓰기 구현 안함 > Setter 없음
		System.out.println(cup.getPrice()); // 읽기

		/*
		Getter/Setter 역할
		1. 멤버 보호(멤버 변수에 유효하지 않은 값이 들어가는 것을 방지
		2. 쓰기 전용, 읽기 전용 가능 (접근 행동 제한) 
		3. 계산된 멤버 생성 가능
		 */

		// private String info; > 없음
		// return > price 베이스로 가공해서 또 다른 값 > 계산된 프로퍼티
		System.out.println(cup.getInfo());


		// TODO 나중에(지금, 1-2개월뒤) 객체지향의 사실과 오해 읽어보기 (2022. 3. 23. 오후
		// 4:23:54)
		// 객체지향 사고프로세스 / Uml과 java로 배우는 ~ 도 참고, 객체지향과 관련된 책은 여러권 읽어야함 > 코드의 질이 다름



	} // main


} // EX33



/*
정보 은닉화
인터페이스
캡슐화

객체 > 내부에 여러가지 멤버 소유

케이스(캡슐)로 감싸는 이유?
- 외부로부터 내부 요소를 보호하기 위해서
- 객체의 사용법을 단수화하기 위해서
*/



/*
 모든 상황에서 범위가 큰 요소와 범위가 작은 요소끼리 충돌 발생
 > 무조건(100%) 범위가 작은 요소가 우선한다.  
 > 범위가 작을수록 구체적이기 때문이다.
 */



class Book {
	public String title; // 도서명
	private String author; // 저자
} // Book


class Phone {

	// 1. 무조건 멤버 변수는 private을 지정한다.
	private String model;
	private String color;
	private int price;
	private int weight;

	// 2. public 메소드를 생성한다. > 대리자 > 인터페이스 > 리모컨의 버튼들 > 객체의 사용법(방법)
	public void aaa(String a) {
		model = a;
	} // aaa

	public String bbb() {
		return model;
	} // bbb

	public void ccc(int c) { // 메소드이기 때문에 조건 붙일 수 있음
		if (c >= 0 && c <= 15000000) {
			price = c;
		} else {
			System.out.println("Error");
		}
	} // ccc

	public int ddd() {
		return price;
	}

} // ddd


class SmartPhone {

	// 1. 멤버 변수 > private > 모든게 private이면 쓸모 없음 > 메소드 오픈
	private String model;
	private String color;
	private int price;
	private int weight;

	// 2. 인터페이스 역할 메소드 생성

	// Setter
	// - 쓰기
	// - setXXX()
	// - set멤버변수()
	public void setModel(String model) {
		// model = model; > 멤버변수 = 매개변수; > 구별 불가능, 둘 다 매개변수

		// this
		// - 객체 접근 연산자

		// this.멤버변수 = 매개변수(지역변수);
		this.model = model;
	}

	// Getter
	// - 읽기
	// - getXXX()
	// - get멤버변수()
	public String getModel() {
		return this.model;
		// 혼자 있으니까(충돌이 없어도) this 붙여도 되고 안 붙여도됨
		// 보통 붙임 > 가독성이 높아지기 때문
	}

	public void setColor(String color) {
		// 색상 > 주관식 X > 선택 > 열거형
		if (color.equals("black") || color.equals("white") || color.equals("red")
				|| color.equals("blue") || color.equals("yellow")) {
			this.color = color;
		} else {
			System.out.println("존재하지 않는 색상입니다.");
		}
	}

	public String getColor() {
		return this.color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		}
	}

	public double getWeight() {
		// g -> kg 환산 후 출력할 때
		// return this.weight / 1000.0;
		return calcWeight(this.weight);
	}


	// 이 메소드의 성격?
	// - Getter? > no
	// - 내부업무에 필요한 작업을 분리시키기 위해서 (g > kg 변환)
	// public > private 변경
	private double calcWeight(int weight) {
		return weight / 1000.0;
		// 코드가 길어지면 다른 메소드 활용
	}


} // smartphone


// 캡슐화 == 블랙 박스 (작동만 되면 되고 내부는 상관 없음)
class Cup {


	private String color;
	private int weight;
	private int price = 1000;
	private String type;
	// 커서 위치 클래스{}안에 두고 source > setters, getters 만들기


	public String getColor() {

		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// getWeight

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	// setPrice

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInfo() {
		if (this.price < 500) {
			return "싼 컵";
		} else if (this.price < 1000) {
			return "보통 컵";
		} else {
			return "비싼 컵";
		}
	}

} // cup



// Alt+Tab > 프로그램 전환
// Ctrl + Tab > 탭 전환
// 이클립스 단축키 설정 : window > perference > keys > next editor > unbind > 설정
