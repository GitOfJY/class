package com.test.java.question.method;

public class Q03 {
	public static void main(String[] args) {
		/*
		3번 문제 (완료)
		요구사항  : 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		조건	    : void digit(int num)
				  입력한 숫자가 4자리 이상이면 그대로 출력한다.
		호출     : digit(1);
				  digit(12);
				  digit(321);
				  digit(5678);
				  digit(98765);
		출력     : 1 → 0001
				  12 → 0012
				  321 → 0321
				  5678 → 5678
				  98765 → 98765
				  
			1) digit 메소드 만들기
			2) 입력받은 숫자가 9999보다 크다 > 그냥 출력
			3) 입력받은 숫자가 9999보다 작다 > 오른쪽 정렬, 0으로 채우기
		 */

		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);

	}

	public static void digit(int num) {
		String result = num > 999 ? String.valueOf(num) : String.format("%04d", num);
		System.out.println(num + " -> " + result);
	}
	// 더 간단한 방법이 있었음
	// System.out.printf("%d -> %04d\n", num, num);
	// 4자리 확인 안해도 자동으로 넘어감
}
