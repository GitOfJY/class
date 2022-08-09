package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	/*
	5번 문제 (완료)
	요구사항  : 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
	조건	    : 정수만 입력하시오.(유효성 검사 필요없음)
			  나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
			  연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
	입력     : 첫번째 숫자 : 5 
			  두번째 숫자 : 3 
			  연산자 : * 
	출력     : 5 * 3 = 15
	입력     : 첫번째 숫자 : 10
			  두번째 숫자 : 3
			  연산자 : / 
	출력     : 10 / 3 = 3.3
	입력     : 첫번째 숫자 : 3 
			  두번째 숫자 : 2 
			  연산자 : >=
	출력     : 연산이 불가능합니다.
	
	1. 스트링으로 연산자 받고 if로 구분하기
	2. 실제 연산할때는 프린트문에서 연산자 그대로 사용하면 될 듯
	   > 연산자도 int로 바꾸고 해야할 듯
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int firstNum = Integer.parseInt(reader.readLine());

		System.out.print("두번째 숫자 : ");
		int secondNum = Integer.parseInt(reader.readLine());

		System.out.print("연산자 : ");
		String operator = reader.readLine();


		if (operator.equals("+")) {
			System.out.printf("%d + %d = %d", firstNum, secondNum, firstNum + secondNum);
		} else if (operator.equals("-")) {
			System.out.printf("%d - %d = %d", firstNum, secondNum, firstNum - secondNum);
		} else if (operator.equals("*")) {
			System.out.printf("%d * %d = %d", firstNum, secondNum, firstNum * secondNum);
		} else if (operator.equals("/")) {
			System.out.printf("%d / %d = %.1f", firstNum, secondNum, (double) firstNum / secondNum);
		} else if (operator.equals("%")) {
			System.out.printf("%d %% %d = %d", firstNum, secondNum, firstNum + secondNum);
		} else {
			System.out.println("연산이 불가능합니다.");
		}



		/*
		int numOperator = operator.charAt(0);
		// (+, -, *, /, %)
		if (numOperator == 43) {
			System.out.printf("%d + %d = %d", firstNum, secondNum, firstNum + secondNum);
		} else if (numOperator == 45) {
			System.out.printf("%d - %d = %d", firstNum, secondNum, firstNum - secondNum);
		} else if (numOperator == 42) {
			System.out.printf("%d * %d = %d", firstNum, secondNum, firstNum * secondNum);
		} else if (numOperator == 47) {
			System.out.printf("%d / %d = %.1f", firstNum, secondNum, (double) firstNum / secondNum);
		} else if (numOperator == 37) {
			System.out.printf("%d %% %d = %d", firstNum, secondNum, firstNum + secondNum);
		} else {
			System.out.println("연산이 불가능합니다.");
		} */

	}// main
}// class
