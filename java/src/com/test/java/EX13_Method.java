package com.test.java;

public class EX13_Method {
	public static void main(String[] args) {
		/*
		접근지정자 정적키워드 반환자료형 메소드명 인자리스트
		public  static   void    hello  (){
			System.out.println();	
		- 구현코드, 업무 코드(비즈니스 코드) }
		
		
		메소드의 인자리스트
		- 파라미터(Parameter)
		- 인자(Arguments)
		- 매개변수
		- 메소드를 호출할 때 매소드에게 값을 전달할 수 있다. > 도구
		 */
		
		hello(); //메소드는 호출해서 잘 만들었는지 확인해야함
		hello2();
		hello3();
		hello4();
		helloEveryOne("홍길동"); //()안에 홍길동 매개변수를 가지고 메소드로 이동
							   //실인자
		ckeckAge(20);
		ckeckAge(15); 
		//실인자와 가인자의 자료형은 동일해야 한다.
		//ckeckAge("스무살"); > error
		//실인자와 가인자의 갯수가 동일해야 한다.
		//ckeckAge(); > error
		
		

		score(60, 70, 80);
		//실인자와 가인자의 순서가 동일해야 한다.
		//score + cntrl+shift 사용해서 순서 확인
		//Documetn 주석 활용하기
		
		
		//구현 메소드 > 각가의 담당 업무 구현 > 담당자
		//메인 메소드 > 구현 메소드들을 사용해서 흐름 생성
		
		
		checkNumber(5);
		checkNumber(-1);
		checkNumber(0);
		
	} //main
	
	public static void checkNumber(int num) {
		//양수? 음수? >  if(x), 삼항연산자
		//String result = (num > 0) ? "양수" : "음수";
		String result = (num > 0) ? "양수" : (num < 0) ? "음수" : "영";
											//C자리에 또 다른 연산식
		System.out.printf("%d = %s\n", num, result);
		
	}
	
	//주석 > Document 주석 (/+**)
	/**
	 * 성적을 처리합니다. (메소드 설명)
	 * @param kor 국어 (매개변수 설명)
	 * @param eng 영어
	 * @param math 수학
	 */
	public static void score(int kor, int eng, int math) {
							//int kor, eng, math > error, 각각 ,로 연결
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + (kor+eng+math));
	}
	
	
	public static void ckeckAge(int age) {
		String result = age >= 19 ? "성인" : "미성년자";
		System.out.printf("%d살은 %s입니다.\n", age, result);
	}
	
	//요구사항 : '홍길동'에게 인사를 하는 메소드를 선언하시오.
	public static void hello() {
		System.out.println("홍길동님 안녕하세요.");
	}
	
	//추가사항 : '아무개'에게 인사를 하는 메소드를 추가하시오.
	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	}
	
	//추가사항 : 강의실에 있는 모든 사람마다 인사를 하는 메소드를 추가하시오.
	public static void hello3() {
		System.out.println("홍길동1님 안녕하세요.");
	}
	public static void hello4() {
		System.out.println("아무개1님 안녕하세요.");
	}
	//추가사항 : 대한민국 사람 모두에게 인사하는 메소드를 추가하시오.
	//         메소드 * 70000000 개 작성
	//똑같은 기능을 하는 메소드가 중복 발생 > 메소드의 매개변수 활용
	
	public static void helloEveryOne(String name) {//가인자
		//String name = ""; > 이름 고정아니고 변수로 지정, 메소드에서 이름 지정돼버림
		System.out.printf("%s님 안녕하세요.\n", name); 
		//name = null상태 > 초기화되지 않은 변수 사용하면 error
		//호출부(외부)에서 매개변수 가지고 옴
		//메소드 가용성이 높아졌다.
		//생산성 향상 > 코드 절감
	}
	
} //class 
