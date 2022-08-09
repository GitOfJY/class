package com.test.java.question.Array;

public class Q06 {
	public static void main(String[] args) {
		/*
		6번 문제 
		요구사항  : 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		조건	    : 숫자의 범위 : 1 ~ 45
				  오름차순 정렬
		출력     : [1, 5, 23, 36, 37, 41]
		
		
		num list 만들기
		num.length=6될때까지 for true문 
		난수 1개씩 받고 for문 안에 if로 중복 확인하기
		오름차순 정렬 -> dump 출력
		 */
	}

	public static void randomNum() {
		int[] ns = new int[6];
		int[] result = new int[6];

		for (int i = 1;; i++) {
			if (ns.length != 6) {
				for (int j = 0; j <= i; j++) {
					ns[i] = (int) (Math.random() * 45) + 1;
					if (ns[i - 1] == (ns[i])) {
						break;
					} else {
						ns[i] = result[i];
					}
				}
			} else {
				break;
			}
		}
	}

}
