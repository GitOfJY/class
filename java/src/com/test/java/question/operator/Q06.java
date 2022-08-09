package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		/* 
		6번 문제 (완료)
		요구사항 : 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		조건    : 세금 : 수입의 3.3%
		입력    : 한달 수입 금액(원) : 1000000 
		출력    : 세후 금액(원) : 967,000원
				 세금(원) : 33,000원
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원) :");
		String input = reader.readLine();
		
		int price = Integer.parseInt(input);
		int price_after = (int)(price * (100-3.3)); //세금 잘못계산
		int tax = (int)(price * 3.3);
		
		System.out.printf("세후 금액(원) : %d원 \n 세금(원) : %d원", price_after, tax);
	}
}
