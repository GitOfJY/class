package com.test.java.question.method;

public class Q02 {
	public static void main(String[] args) {
		/*
		2번 문제 (완료)
		요구사항  : 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		조건	    : String getName(String name)
				  name: OOO(이름) > 이건 무슨 뜻이지 그냥 이름이라는건가
				  return: OOO(이름)님
		호출     : result = getName("홍길동");
				  System.out.printf("고객: %s\n", result);
		
				  result = getName("아무개");
				  System.out.printf("고객: %s\n", result);
		출력     : 고객: 홍길동님
				  고객: 아무개님
		 */

		String result = getName("홍길동");
		System.out.printf("고객: %s\n", result);

		String result1 = getName("아무개");
		System.out.printf("고객: %s\n", result1);

	}

	public static String getName(String name) {
		String result = name + "님";
		return result;
	}

	/*
	 문제 이해 잘못함
	 처음 :  System.out.printf("고객: %s님\n", result1);
	 문제 -> '님' 붙이는 메소드였는데 처음 만든 메소드는 변수만 받는 것
	 name 자체가 string 이니까 "님" +로 붙이면 됨
	 */

}
