package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		/*
		6번 문제 (완료)
		요구사항  : 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		조건	    : 전화를 걸면 짜장면은 10분 뒤에 도착합니다.
				  전화를 걸면 치킨은 18분 뒤 도착합니다.
				  전화를 걸면 피자는 25분 뒤 도착합니다.
			  	  음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		입력     : 음식을 받기 원하는 시각
				  시 : 13 
				  분 : 47
		출력     : 짜장면 : 13시 37분
		 	      치킨 : 13시 29분
				  피자 : 13시 22분
				  
				짜장면 원하는 시각 - 10분
				치킨 원하는 시각 - 18분
				피자 원하는 시각 - 25분
		 */

		// 음식 받기 원하는 시간은 오후 11시 이전에만 가능합니다. > 반복문, 종료문도 없어서 불가능
		// 캘린더로 이용


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("음식을 받기 원하는 시각 \n시 : ");
		String input1 = reader.readLine();
		int originHour = Integer.parseInt(input1);


		System.out.print("분 : ");
		String input2 = reader.readLine();
		int originMin = Integer.parseInt(input2);

		order("짜장면", originMin, originHour, 10);
		order("치킨", originMin, originHour, 18);
		order("피자", originMin, originHour, 25);



	}

	public static void order(String name, int originMin, int originHour, int orderMin) {
		int min = originMin >= orderMin ? originMin - orderMin : (60 - (orderMin - originMin));
		int hour = originMin >= orderMin ? originHour : originHour - 1;
		System.out.printf("%s : %d시간 %d분\n", name, hour, min);

	}


}
