package com.test.java.obj.constructor;

public class EX36_Constructor {
	public static void main(String[] args) {

		/*
		
		생성자, Constructor
		- (특수한 목적을 가지는)메소드
		- 객체 멤버(변수)를 초기화하는 역할을 가지는 메소드
		- 일반 메소드처럼 마음대로 호출이 불가능하다.
		  > 객체가 생성될 때 딱 1번만 호출된다.
		  > 그 뒤에는 호출이 불가능
		  > 1회용
		- 클래스 이름과 동일한 이름을 가진다.
		
		객체 생성 연산자, new
		
		Test t = new Test(); > Test() 생성자
		 */


		// 1. 연산자 new : Cup이라는 설계도를 보고 비어있는 인스턴스 제작
		// 2. 생성자 Cup() 호출 : 각 멤버들을 원하는 값으로 세팅
		// 하얀색, 미정
		Cup c1 = new Cup();
		// Setter 역할 > 객체 초기화
		// Setter 역할 > 객체 정보 수정
		c1.setColor("노란색");
		c1.setOwner("홍길동");

		Cup c2 = new Cup();
		// c2.setColor("흰색");
		// c2.setOwner("미정");

		c1.info();
		c2.info();



		User u1 = new User();
		System.out.println(u1.getName()); // NULL
		System.out.println(u1.getAge()); // 0
		System.out.println(u1.isFlag()); // false > 생성자 User가 초기화



	} // main
} // class


class Cup {
	private String color;
	private String owner;


	// 기본 생성자는 개발자가 작성 안하면 자동 생성된다.
	// 기본 생성자는 개발자가 작성하면 자동 생성안된다.
	// 개발자가 기본 생성자를 생성 후 일부 멤버를 초기화 안해도 그 일부 멤버에 한해서는 자동으로 초기화 코드가 작성된다.
	// ***** 객체의 멤버 변수는 반드시 초기화 과정을 거치게 된다.
	public Cup() { // 제품의 초기화하는 메소드 > 생성자 역할
		this.color = "흰색";
		this.owner = "미정";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void info() {
		System.out.printf("색상: %s, 소유주: %s\n", this.color, this.owner);
	}
} // Cup



class User {
	private String name;
	private String id;
	private int age;
	private boolean flag;


	// 기본 생성자
	// 1. 메소드명 == 클래스명
	// 2. 반환값 명시 안함 > 생성자 반환값을 가질 수 없다. > 표현 안함
	// 3. return문을 가질 수 없다.
	// 4. 구현부는 해당 클래스의 멤버를 초기화 코드를 작성해야한다.


	public User() { // 생성자의 실제 모습, 생성자가 초기화해줌
		// this.name = null;
		// this.id = null;
		// this.age = 0;
		// this.flag = false;

		this.name = "익명";
		this.id = "none";
		this.age = 12;
		this.flag = true; // 초기화 변경 가능
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFlag() { // boolean일 때 get 아니고 is
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


} // User
