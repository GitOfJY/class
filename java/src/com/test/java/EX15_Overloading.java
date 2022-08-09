package com.test.java;

public class EX15_Overloading {
	public static void main(String[] args) {
		// String result = test1();
		// System.out.println(result);


		number();
		// 1. 호출 구문 > 메소드 자동 생성 (ctrl+1 >create)
		// 2. 블럭 선택 > refactor > extract method

		/*
		 int a = 10;
		int b = 20; >블럭 잡고 ctrl+shift+f > 아래 결과처럼 수정
		*/

		int a = 10;
		int b = 20;


		/*
		메소드 오버로딩, Method Overloading
		- 메소드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
		- 같은 이름의 메소드 + 인자를 다양하게
		
		메소드 오버로딩을 하는 이유?
		- 성능 향상(x)
		- 개발자 도움(o) > 메소드 이름 외우기 힘들 개발자를 위해 > 일종의 추상화?
		- ex. println > 10개 메소드 오버로딩
		
		메소드 오버로딩 구현 조건 가능
		1. 매개변수의 갯수
		2. 매개변수의 자료형
		
		메소드 오버로딩 구현 조건 불가능
		1. 매개변수의 이름
		2. 반환값의 자료형
		
		
		메소드를 선언하는 중
		1. public static void test(){} 				//o
		2. public static void test(){}				//x, 1번과 중복
		3. public static void test(int n){}			//o
		4. public static void test(int m){}     	//x, 3번과 중복
		5. public static void test(String s){}  	//o, 매개변수의 자료형의 차이
		6. public static void test(int n, int m){}  //o, 매개변수의 갯수가 서로 다름
		7. public static int test(){} 				//x, 1번과 구분 불가능 > 변환값의 자료형이 달라도 오버로딩 불가능
		
		메소드를 호출하기(검증)***
		1 호출 > test();
		3 호출 > test(10); 
		> 이름으로는 구분할 수 없지만 인자로 구분되기 때문에 오버로딩 가능
		4 호출 > test(15);
		> 호출값이 3과 같기 때문에 오버로딩 불가능
		5 호출 > test("문자열");
		6 호출 > test(20, 30);
		7 호출 > int result = test();
		> 인자값이 없는 test를 찾아가는데 1번과 7번 2개 존재
		 */

		// 요구사항 : 선을 출력하는 메소드
		drawLine();
		// 추가사항 : 기존의 메소드도 사용, 선의 모양을 다양하게
		drawLine("*");
		drawLine("1");

		// TODO 어떨 때 앞에 String result = "";이런식으로 해야하는거지? 헷갈림 ㅜㅜ (2022. 3. 14. 오전 10:21:28)

	}// main
	/*
	private static String test1() {
		
		
		10 / 3 -> "3.3"
		10/3 = 3
		10.0/3.0 = 3.333
		System.out.printf("%.1f\n", 10.0/3);
		System.out.println(Math.round(10.0/3*10)/10.0);
		return String.valueOf(Math.round(10.0/3*10)/10.0);
		
		1. 자바 수학 기능
		Math. > Math.
		2. 형식 문자열 지원 메소드
		
		String result = String.format("%.1f", 5.0 / 3);
		> printf와 기능은 동일하지만 결과를 출력(x) 결과를 반환(o)
		return result; }
		
		*/
	// TODO 위 2가지 기능을 사용하면 입력받은 값으로는 사용 불가능하지 않나? double,int로 받고 풀어야하나? 문제에 적용해보기 (2022. 3. 14.
	// 오전 9:39:59)


	private static void number() {
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
	}

	// TODO 헤더에 int랑 string이 헷갈림, main 부분 코드도 헷갈림, 정리 필요 (2022. 3. 14. 오전 9:14:04)
	// TODO return 다음에 올 수 있는 형태 (2022. 3. 14. 오전 9:21:03)


	// 메소드 생성 > 이름?
	public static void drawLine() {
		System.out.println("===============");
	}

	// 호출(사용)할 때 어느 것을 가져올지 정할 수 없어서 사용 불가능
	// *****식별자 중복 > 숫자 붙이는 행동 절대 금지 > 의미 불분명
	// public static void drawLine() {
	// System.out.println("***************");
	// }

	public static void drawLine(String s) {
		// 똑같은 이름의 메소드지만 1개에는 매개변수 부여
		// 이름은 똑같지만 다른 메소드
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);

	}
}// class



/*
  printf() > 형성 문자 사용 > 출력할 때 사용만 가능
  
  
  코드 컨벤션 : 프로그래밍 코드 작성 시 지켜야할 규칙
  구글 + 자바 코딩 + 코드 컨벤션
  1) 수동 적용 > 블럭 잡고 > ctrl+shift+F > 
  2) 자동 적용 > 저장할 때 > window > preference > save > 1,2번째 체크박스, 동그라미 위에 체크 
 */
