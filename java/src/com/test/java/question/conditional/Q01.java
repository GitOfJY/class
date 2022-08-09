package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		/*
		1번 문제 (완료)
		요구사항  : 숫자 2개를 입력받아 큰수와 작은수를 출력하시오. 
		조건	    : 두 숫자가 얼마의 차이를 보이는지 출력하시오.
		입력     : 첫번째 숫자 : 5 
				  두번째 숫자 : 3 
		출력     : 큰수는 5이고, 작은수는 3입니다. 두 숫자는 2(가)이 차이납니다.
		입력     : 첫번째 숫자 : 2
				  두번째 숫자 : 10 
		출력     : 큰수는 10이고, 작은수는 2입니다. 두 숫자는 8(가)이 차이납니다.
		입력     : 첫번째 숫자 : 3
				  두번째 숫자 : 3 
		출력     : 두 숫자는 동일합니다.
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int firstNum = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int secondNum = Integer.parseInt(reader.readLine());

		comparison(firstNum, secondNum);
	}

	public static void comparison(int firstNum, int secondNum) {
		if (firstNum > secondNum) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", firstNum, secondNum,
					firstNum - secondNum);
		} else if (firstNum < secondNum) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", secondNum, firstNum,
					secondNum - firstNum);
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}
	}
}
