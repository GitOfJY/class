package com.test.java.question.Array;

public class Q03 {
	public static void main(String[] args) {
		/*
		3번 문제 (완료)
		요구사항  : int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
		조건	    : String dump(int[] list)
		호출     : int[] list = new int[4];
		
				  list[0] = 10;
				  list[1] = 20;
				  list[2] = 30;
				  list[3] = 40;
		
				  String result = dump(list);
				  System.out.printf("nums = %s\n", result);
		출력     : nums = [ 10, 20, 30, 40 ]
		 */

		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;

		String result = dump(list);
		System.out.printf("nums = %s \n", result);



	}


	public static String dump(int[] ns) {
		String txt = "[ ";

		for (int i = 0; i < ns.length; i++) {
			if (i == ns.length - 1) {
				txt += ns[i];
			} else {

				txt += ns[i] + ", ";
			}
		}
		txt += " ]";

		return txt;

	}



}
