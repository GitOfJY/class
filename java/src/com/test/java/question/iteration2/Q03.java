package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		/*
		3번 문제 (완료 > 터미널에서 한번 확인 후 제출)
		요구사항  : 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		조건     : 최대 3자리까지만 입력하시오.
		입력	    : 최대 숫자 : 50 
		출력     : 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
				  21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 40 	
				  41 42 짝 44 45 짝 47 48 짝 50
				  
		1. 최대 숫자 입력
		2. while (50까지 출력) {}
		3. if 숫자%10 ==3,6,9 > 짝
		4. 그 외에는 숫자 출력
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 숫자 : ");
		int maxNum = Integer.parseInt(reader.readLine());

		int i = 0;
		String sum = "";

		while (i <= maxNum) {
			if (i % 10 == 3) {
				sum += "짝 ";
			} else if (i % 10 == 6) {
				sum += "짝  ";
			} else if (i % 10 == 9) {
				sum += "짝";
			} else {
				sum += (char) i + " ";
			}
			i++;
		}

		System.out.println(sum);
	}

}
