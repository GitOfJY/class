package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		5번 문제 (완료)
		요구사항  : 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		입력     : 아빠 생일(년) : 1969 
				  아빠 생일(월) : 5 
				  아빠 생일(일) : 10 
				  딸 생일(년) : 1997 
			  	  딸 생일(월) : 7 
				  딸 생일(일) : 22
		출력     : 아빠는 딸보다 총 10,300일을 더 살았습니다.
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아빠 생일(년) : ");
		int dadBirthYear = Integer.parseInt(reader.readLine());

		System.out.print("아빠 생일(월) : ");
		int dadBirthMonth = Integer.parseInt(reader.readLine());

		System.out.print("아빠 생일(일) : ");
		int dadBirthDate = Integer.parseInt(reader.readLine());

		System.out.print("딸 생일(년) : ");
		int daughterBirthYear = Integer.parseInt(reader.readLine());

		System.out.print("딸 생일(월) :");
		int daughterBirthMonth = Integer.parseInt(reader.readLine());

		System.out.print("딸 생일(일) : ");
		int daughterBirthDay = Integer.parseInt(reader.readLine());

		Calendar dadbirthday = Calendar.getInstance();
		dadbirthday.set(dadBirthYear, dadBirthMonth, dadBirthDate);

		Calendar daughterbirthday = Calendar.getInstance();
		daughterbirthday.set(daughterBirthYear, daughterBirthMonth, daughterBirthDay);

		long dif = (daughterbirthday.getTimeInMillis() - dadbirthday.getTimeInMillis()) / 1000 / 60
				/ 60 / 24;
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", dif);

	}
}
