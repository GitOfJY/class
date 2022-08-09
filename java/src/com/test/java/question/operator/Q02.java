package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Q02 {
	public static void main(String[] args) throws Exception {
		/* 
		2번 문제 (완료)
		요구사항 : 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		조건    : 출력 숫자에 천단위 표기 하시오. 
                 결과값은 소수 이하 1자리까지 표기 하시오.
		입력    : 첫번째 숫자 5, 두번째 숫자 3
		출력    : 5 + 3 = 8
				 5 - 3 = 2
				 5 * 3 = 15
			 	 5 / 3 = 1.7
		 		 5 % 3 = 2
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		double first_num = Integer.parseInt(input1);
		double second_num = Integer.parseInt(input2);
				
		double a, a_1, a_3;
		int a_2;
		a = first_num/second_num;
		a_1 = a * 10 + 0.5;
		a_2 = (int)a_1;
		a_3 = (double)a_2 / 10;
		String a_4 = String.valueOf(a_3);
		String a_5 = String.valueOf((int)a);
				
		System.out.printf("%.0f + %.0f = %.0f\n", first_num, second_num, first_num+second_num);
		System.out.printf("%.0f - %.0f = %.0f\n", first_num, second_num, first_num-second_num);
		System.out.printf("%.0f * %.0f = %.0f\n", first_num, second_num, first_num*second_num);
		System.out.printf("%.0f / %.0f = %s\n", first_num, second_num, first_num % second_num != 0 ? a_4 : a_5);
		System.out.printf("%.0f %% %.0f = %.0f\n", first_num, second_num, first_num%second_num);
		
	}
}
