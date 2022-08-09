package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/* 
		5번 문제 (완료)
		요구사항 : 자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		조건    : 기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
				 모든 출력 숫자는 천단위 표기하시오.
		입력    : 사용자가 페달을 밟은 횟수 : 1000
		출력    : 사용자가 총 1,000회 페달을 밟아 자전거가 총 2,074.697m를 달렸습니다.
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String input1 = reader.readLine();
				
		int num = Integer.parseInt(input1);
		int radius_inch = 26;
		double radius_meter = radius_inch*0.0254;
		double perimeter = 3.14*2*(radius_meter / 2);
		double distance = num*perimeter;
		DecimalFormat dc = new DecimalFormat("###,###.#"); //%,d %,.3f
		String final_distance = dc.format(distance);
		System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %sm를 달렸습니다.", num, final_distance);
	}
}
