package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		/*
		3번 문제 (완료)
		조건	    : 행의 갯수를 입력받으시오.
		입력     : 행: 5 
		출력     : 
		 			*
		 		   ***
		 		  *****
		 		 *******
		 		*********
		입력     : 행: 7
		출력     : 
		 			*
		 		   ***
		 		  *****
		 		 *******
		 		*********
		 	   ***********
		 	  *************
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
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
