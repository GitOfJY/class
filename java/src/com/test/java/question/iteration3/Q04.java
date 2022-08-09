package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		4번 문제 (완료)
		조건	    : 행의 갯수를 입력받으시오.
		입력     : 행: 5 
		출력     :     aa
				     abba
					abccba
				   abcddbca
				  abcdeedcba
		입력     : 행: 7
		출력     :       aa
					   abba
					  abccba
					 abcddbca
					abcdeedcba
				   abcdeffedcba
				  abcdefggfedcba
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행 : ");
		int input = Integer.parseInt(reader.readLine());
		outputStar(input);


	}

	private static void outputStar(int input) {
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= (input - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + 97));
			}
			for (int j = 0; j <= i; j++) {
				int k = i;
				System.out.print((char) (97 + k - j));
				k--;
			}

			System.out.println();
		}
	}
}
