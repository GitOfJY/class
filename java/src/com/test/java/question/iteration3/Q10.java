package com.test.java.question.iteration3;

public class Q10 {
	public static void main(String[] args) {
		/*
		10번 문제 (완료)
		요구사항  : 아래와 같이 출력하시오. 
		출력     :  1 ~  10 :  55
				  11 ~  20 : 155
				  21 ~  30 : 255
				  31 ~  40 : 355
				  41 ~  50 : 455
				  51 ~  60 : 555
				  61 ~  70 : 655
				  71 ~  80 : 755
				  81 ~  90 : 855
				  91 ~ 100 : 955
		 */

		for (int i = 0; i <= 9; i++) {
			sum(i * 10 + 1);
		}
	} // main

	public static void sum(int startNum) {
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum += (startNum + i);
		}
		System.out.printf("%2d ~ %3d : %3d\n", startNum, startNum + 9, sum);
	}
} // class
