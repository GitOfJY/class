package com.test.java.question.datetime;

import java.util.Calendar;

public class Q02 {
	public static void main(String[] args) {
		/*
		2번 문제 (완료) 
		요구사항  : 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		출력     : 백일: 2022-06-23
				  첫돌: 2023-03-15
		 */
		anniversaryDay();
	}

	public static void anniversaryDay() {
		Calendar birthday = Calendar.getInstance();
		birthday.set(2022, 2, 15); // 이걸 안 지정해도 되는건가? 뭐지
		birthday.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", birthday);
		birthday.set(2022, 2, 15);
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", birthday);

	}
}
