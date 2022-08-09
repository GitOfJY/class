package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {
	/*
	9번 문제 (완료)
	요구사항  : 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
	조건	    : 시도 횟수가 10회가 넘어가면 프로그램을 강제로 종료하시오.
	입력/출력 : 컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.
	
			  숫자 : 1 
			  틀렸습니다.
	
			  숫자 : 3 
			  틀렸습니다.
	
			  숫자 : 7 
			  틀렸습니다.
	
			  숫자 : 2 
			  틀렸습니다.
	
			  숫자 : 5 
			  맞았습니다.
	
			  컴퓨터가 생각한 숫자는 5입니다.
			  정답을 맞추는데 시도한 횟수는 5회입니다.
			 
			  프로그램을 종료합니다.
			  
			  1. 랜덤으로 1~10 중 숫자 하나 지정
			  2. for문 작성 > buff 입력받기 > if 비교 
	
	 */

	public static void main(String[] args) throws Exception {
		int computerNum = (int) (Math.random() * 10) + 1;
		int howMany = 0;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();

		for (int i = 1; i <= 10; i++) {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자 : ");
			int userNum = Integer.parseInt(reader.readLine());

			if (userNum == computerNum) {
				System.out.println("맞았습니다.");
				System.out.println();
				howMany += 1;
				break;
			} else {
				System.out.println("틀렸습니다.");
				System.out.println();
				howMany += 1;
			}
		}
		/*
		컴퓨터가 생각한 숫자는 5입니다.
		  정답을 맞추는데 시도한 횟수는 5회입니다.
		 
		  프로그램을 종료합니다. */

		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", computerNum);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", howMany);
		System.out.println();
		System.out.println("프로그램을 종료합니다.");


	}
}
