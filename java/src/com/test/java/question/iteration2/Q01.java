package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		/*
		1번 문제 (완료)
		요구사항  : 숫자를 N개 입력받아 아래와 같이 출력하시오.
		조건	    : 누적값이 100을 넘어가는 순간 루프를 종료하시오.
				  짝수는 더하고 홀수는 빼시오.
		입력	    : 숫자 : 12 
				  숫자 : 28 
				  숫자 : 39 
				  숫자 : 15 
				  숫자 : 38 
				  숫자 : 24 
				  숫자 : 78
		출력     : 12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
		
		while (sum <= 100) {숫자 입력받기 -> if 홀,짝 -> 합} 
		*/

		int sum = 0;
		String stringSum = "";



		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int firstNum = Integer.parseInt(reader.readLine());
		if (firstNum % 2 != 0) {
			sum -= firstNum;
			stringSum += "- " + firstNum;
		} else {
			sum += firstNum;
			stringSum += firstNum;
		}


		while (sum <= 100) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if (num % 2 != 0) {
				sum -= num;
				stringSum += " - " + num;
			} else {
				sum += num;
				stringSum += " + " + num;
			} // 이 부분 메소드로 만들어서 풀어도 될 듯, while로 다시 가능?
		}

		System.out.printf("%s = %d", stringSum, sum);



	}
}
