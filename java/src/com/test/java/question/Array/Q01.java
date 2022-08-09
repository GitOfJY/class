package com.test.java.question.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		/*
		1번 문제 (완료)
		요구사항  : 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		조건	    : int[] nums = new int[5];
		입력     : 숫자 : 5 
				  숫자 : 1 
				  숫자 : 7 
				  숫자 : 2 
				  숫자 : 3
		출력     : nums[4] = 3
				  nums[3] = 2
				  nums[2] = 7
				  nums[1] = 1
				  nums[0] = 5
		 */
		makeList();
	}

	public static void makeList() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] ns1 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 : ");
			int input = Integer.parseInt(reader.readLine());
			ns1[i] = input; // 굳이 안 넣어도 가능
		}
		printArray(ns1);

	}

	public static void printArray(int[] ns) {
		for (int i = 0; i < ns.length; i++) {
			System.out.printf("nums[%d] = %d\n", 4 - i, ns[4 - i]);
		}

	}



}
