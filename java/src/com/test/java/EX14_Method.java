package com.test.java;

public class EX14_Method {
	public static void main(String[] args) {
		
		/*
		메소드 매개변수
		- 호출 > 데이터 > 메소드
		
		메소드 반환값
		- 메소드가 실행 뒤 호출한 곳에 값을 돌려주는 행동
		- 메소드 > 데이터 > 호출
		 */
		
		getNum(); //다시 돌아왔을 때, getNum은 없어지고 return값(10)이 남는다.
		System.out.println(getNum());
		
		int num = getNum(); //메서드를 변수에 저장 x
							//메서드가 실행된 뒤 반환값을 num에 저장
		System.out.println(num);
		
		int age = 25;
		String result = ckeckAge(age);
		System.out.println(result);
		
	}
	
	 public static int getNum() {//This method must return a result of type int
		 //리턴문, 반환문
		 //- getNum을 호출한 곳에 아래의 값을 돌려준다.
		 return 10; //숫자를 가지고 돌아가라
		 //return "문자열"; > error, 선언부와 자료형 통일 
	 }
	 
	 public static void test() {
		 //return값이 없을 때 자료형 대신 void 사용
		 //return 10; > 선언부에서 void인에 return값이 있어도 error
	 }
	 
	public static String ckeckAge(int age) {
		String result = age >= 19 ? "성인" : "미성년자";
		return result;
	}
}