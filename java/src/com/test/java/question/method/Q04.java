package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		4번 문제 (완료)
		요구사항  : 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		조건	    : String add(int, int)
				  String subtract(int, int)
				  String multiply(int, int)
				  String divide(int, int)
				  String mod(int, int)
		입력     : 첫번째 숫자 : 5 
				  두번째 숫자 : 3 
		호출     : result = add(n1, n2); 
				  System.out.println(result);
		
				  result = subtract(n1, n2);
				  System.out.println(result);
		
				  result = multiply(n1, n2);
				  System.out.println(result);
		
				  result = divide(n1, n2);
				  System.out.println(result);
		
			      result = mod(n1, n2);
				  System.out.println(result);
		출력     : 5 + 3 = 8
				  5 - 3 = 2
				  5 * 3 = 15
				  5 / 3 = 1.7
				  5 % 3 = 2 		
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 입력값을 받을 때 print 없을 순 없나?
		System.out.print("첫번째 숫자 :");
		String input1 = reader.readLine();
		int n1 = Integer.parseInt(input1);

		System.out.print("두번째 숫자 :");
		String input2 = reader.readLine();
		int n2 = Integer.parseInt(input2);

		String result = add(n1, n2);
		System.out.println(result);

		String result1 = subtract(n1, n2);
		System.out.println(result1);

		String result2 = multiply(n1, n2);
		System.out.println(result2);

		String result3 = divide(n1, n2);
		System.out.println(result3);

		String result4 = mod(n1, n2);
		System.out.println(result4);

	}// main

	public static String add(int x, int y) {
		return x + " + " + y + " = " + (x + y);
	} // add

	public static String subtract(int x, int y) {
		return x + " - " + y + " = " + (x - y);
	} // subtract

	public static String multiply(int x, int y) {
		return x + " * " + y + " = " + (x * y);
	} // multiply

	public static String divide(int x, int y) {
		double x_1 = x, y_1 = y, beforeResult, beforeResult_1, beforeResult_2, resultFinal;
		int result;
		beforeResult = x_1 / y_1;
		beforeResult_1 = beforeResult * 10 + 0.5;
		result = (int) beforeResult_1;
		resultFinal = (double) result / 10;
		return x + " / " + y + " = " + resultFinal;
	} // divide

	public static String mod(int x, int y) {
		return x + " % " + y + " = " + (x % y);
	} // mod

	// divide 알려주신 방법으로 다시 풀어보기

}
