package com.test.java;

public class Ex12_Method {
	/*
	main 메소드
	- 특수 메소드
	- 이름이 예약된 메소드(main)
	- 프로그램이 시작되면 자바가 자동으로 호출(실행)하는 메소드
	- 프로그램의 시작(Entry Point) 
	*/
	public static void main(String[] args) {
		/*
		메소드, Method 
		- 메소드(Method), 함수(Fuction), 프로시저(Procdeure), 서브 루틴(Sub Routine)  
		- 코드의 집합  
		- 같은 목적을 가진 코드의 집합 > 1가지 목적을 위해 실행하는 코드들의 집합
		- 코드 재사용의 단위 (*****)
		
		메소드 사용 단계
		1. 메소드 선언하기(정의하기)
		 - 단 1회
		 
		2. 메소드 호출하기(사용하기)
		 - 1회 ~ 무한대
		 
		메소드 장점
		1. 생산성이 높다.  > 처음 만들때 비용이 싸다. > 반복 코드 제거
		2. 유지보수가 쉽다. > 메소드 선언부만 수정 > 호출부는 그대로 재사용
		3. 가독성이 높다.  > 주제별로 코드를 분리해서 관리
		
		메소드 검색
		1. 오른쪽 outline 창
		2. 호출부 > F3
		3. 호출부 > control + 마우스오버 > open
		4. quick search
		
		프로그램에서 실행되는 코드의 흐름
		- 위 -> 아래 실행
		 */
		
		
		//요구사항 : "안녕하세요" * 5회 출력 
		//수정사항 : "반갑습니다" 수정
		
		/*
		1번째 방법 > 코드 재사용 아님
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");		
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		수정 > 하나씩 수정
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");		
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		1. 초기 생산 비용 고가 > 하드 코딩 > 저수준 방식
		2. 유지보수 비용 고가 > 초기 생산 비용 == 유지보수 비용
		*****프로그램 내에 같은 일을 하는 코드가 2군데 이상 동일한게 발견되면 절대 안된다.
			 > 질 낮은 프로그램 > 관리 불량(비용 발생 심함)
		*/
		
		//2번째 방법 > 메소드
		//메소드끼리는 같이 쓸 수 없으며 클래스의 자식

		hello(); //메소드 호출하기(실행하기)
		//hello라는 메소드가 가지는 코드를 실행해라
		//페이지 이동 명령 > 제어(프로그램 한줄한줄 실행하는 것)가 이동한다.
		//hello(); > method > 출력, hello() 지워짐 > 호출부로 돌아가고 문장 끝
		System.out.println("중간출력");
		hello();
		hello();
		hello();
		hello(); //호출을 통해 반복 재사용
		
		/*
	   왼쪽 번호 두번 클릭 > breakpoint
	   이클립스 코드 실행 방법
	   1. ctrl + F11(run) > breakpoint 작동 x
	   2. F11(Debug)      > breakpoint 작동    > breakpoint 전까지만 실행
	   						a. F5 : 현재 라인에 메소드가 있다면 메소드 정의부로 이동
	   						b. F6 : 현재 라인을 실행하고 다음줄로 이동
		
		
		요구사항 : 숫자를 출력하시오.
		1. 1~5까지
		2. 하나~다섯까지
		3. 6~10까지
		4. 여섯~열까지
	
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열"); 
		> 가독성이 안좋을 뿐 반복되는 것 없음
		 */
		
		printNumberOnetoFive();
		printNumberSixtoTen();
		printKoreanNumberOnetoFive();
		printKoreanNumberSixtoTen(); //메소드 사용
		
		
	} //maim > 괄호에 주석 안달아두면 헷갈려짐
	
	/*
	새로운 메소드 선언
	- 메소드는 클래스의 자식 위치에 선언한다.
	public  static   void    hello  ()
	접근지정자 정적키워드 반환자료형 메소드명 인자리스트
	- 바디 : 해당 메소드가 하려는 업무 구현 (1회성 코드만 작성)
	- 반드시 호출 후 실행 > main 메소드 > 메소드명();
	- 반복되는 코드 > 메소드로 만들기
	*/
	
	//헤더
	public static void hello() {
	//바디
		System.out.println("반갑습니다."); //1번만 수정하면 됨
		
	}
	
	public static void printNumberOnetoFive() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	public static void printNumberSixtoTen() {
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}
	public static void printKoreanNumberOnetoFive() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
	}
	public static void printKoreanNumberSixtoTen() {
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
} //class
