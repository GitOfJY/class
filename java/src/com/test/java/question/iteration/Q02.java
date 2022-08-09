package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	/*
	2번 문제 (완료)
	요구사항  : 시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
	입력     : 시작 숫자 : 5 
			  종료 숫자 : 12 
			  증감치 : 1 
	출력     : 5
			  6
			  7
			  8
			  9
			  10
			  11
			  12
	입력     : 시작 숫자 : 10
			  종료 숫자 : 1 
			  증감치 : -2 
	출력     : 10
			  8
			  6
			  4
			  2
			  
		1. buff 입력받기 > int로 받기
		2. for문 이용해서 출력 -> (i=시작숫자 ;i=종료숫자; i += 증감치 )
		   > 증감치 음수일 때 출력 안되네 > if문으로 음양 나눠야하나?
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int finishNum = Integer.parseInt(reader.readLine());
		System.out.print("증감치 : ");
		int increaseNum = Integer.parseInt(reader.readLine());


		if (increaseNum >= 0) {
			for (int i = startNum; i <= finishNum; i += increaseNum) {
				System.out.println(i);
			}
		} else {
			for (int i = startNum; i >= finishNum; i += increaseNum) {
				System.out.println(i);
			}
		}

	}// main
}// class


/*
for (int i = startNum; i <= finishNum; i += increaseNum) {
	System.out.println(i);
} */

