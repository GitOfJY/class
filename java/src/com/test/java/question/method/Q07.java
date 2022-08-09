package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {
		/*
		7번 문제 (완료)
		요구사항  : 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		조건	    : int getTime(int station, int change, int time)
				  각 역간 소요 시간 : 2분 소요
				  환승 소요 시간 : N분 소요
				  시간대에 따라 환승 소요 시간이 다르다.
				  평상시: 3분
				  출근시: 4분
				  퇴근시: 5분
		입력     : 역의 개수 : 15 
				  환승역의 횟수 : 1 
				  시간대(1.평상시, 2.출근시, 3.퇴근시): 1  
		출력     : 총 소요 시간은 33분입니다.
		입력     : 역의 개수 : 22 
				  환승역의 횟수 : 2 
				  시간대(1.평상시, 2.출근시, 3.퇴근시): 3 
		출력     : 총 소요 시간은 54분입니다.
		
		1) 메소드 만들기 > 2*(역 개수) + 환승소요시간 (1/2/3중 선택) * 환승역횟수 > 총 소요 시간은 %d분입니다.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("역의 개수 :");
		String input1 = reader.readLine();
		int station = Integer.parseInt(input1);

		System.out.print("환승역의 횟수 :");
		String input2 = reader.readLine();
		int change = Integer.parseInt(input2);

		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시):");
		String input3 = reader.readLine();
		int time = Integer.parseInt(input3);

		int result = getTime(station, change, time);
		System.out.println("총 소요 시간은 " + result + "분입니다.");


	}

	public static int getTime(int station, int change, int time) {
		int timePick = (time == 1) ? 3 : (time == 2) ? 4 : 5;
		int totalTime = 2 * station + timePick * change;
		return totalTime;

		// 예외적인 것도 추가로 기입하기
	}
}
