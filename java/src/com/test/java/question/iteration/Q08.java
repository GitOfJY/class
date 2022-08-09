package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	/*
	8번 문제
	요구사항  : 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
	조건	    : Calendar 클래스 사용 금지
	출력     : 2022년 3월 16일은 738,230일째 되는 날이고 수요일입니다.
	
	4년에 한번 윤년 ; 366
	100년에 한번씩 윤년 -> 평년
	100년 기준 > 24번의 윤년, 76번의 평년 > 24*366 + 76*365 일
	
	> 현재 년도 / 100 > 202
	> 현재 년도 % 100 > 2 > 저번에 했던 검사기
	
	> 윤년 > 2월이 28일까지 있는거 > if문 사용 >
	1) 입력받은 월이 2월보다 초과인지 아닌지
	2) 초과라면 윤년인지 아닌지 
	3) 윤년이라면 29 아니면 28일 계산
	
	1. 오늘 날짜 받기 > 년도, 월, 일 따로 받기
	2. 년도 / 100 > 며칠구하기
	3. 년도 % 100 > 나머지 달 윤년인지 평년인지 구분 
	4. 월 > 일로 변환
	5. 년도 월 일 다 더하기
	 */


	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 : ");
		int getYear = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		int getMonth = Integer.parseInt(reader.readLine());
		System.out.print("일 : ");
		int getDay = Integer.parseInt(reader.readLine());


		int getYearDay1 = (getYear / 100) * (24 * 366 + 76 * 365);
		int getYearDay2 = (getYear % 100) - 1; // 2
		int sum = 0;

		for (int i = getYear - getYearDay2; i <= getYear; i++) {
			int day = whatYear(i);
			sum += day;
		}

		System.out.println(sum);

		int totalYearDay = getYearDay1 + sum;

		int year = whatYear(getYear);
		int totalMonthDay = 0;

		// -------------------------------year-------------------

		if (year == 365) {
			int feb = 29;
			int a = totalMonth(getMonth, totalMonthDay, feb);
			int total = totalYearDay + a + getDay;
			System.out.println(totalYearDay); // 738532
			System.out.println(a); // 59
			System.out.printf("%d년 %d월 %d일은 %d일째 되는 날이고 수요일입니다.", getYear, getMonth, getDay, total);


		} else {
			int feb = 28;
			int a = totalMonth(getMonth, totalMonthDay, feb);
			int total = totalYearDay + a + getDay;
			System.out.println(totalYearDay);
			System.out.println(a);
			System.out.printf("%d년 %d월 %d일은 %d일째 되는 날이고 수요일입니다.", getYear, getMonth, getDay, total);

		}


		// ------------------------------month-------------------

	}

	public static int whatYear(int whatYear) {
		if (whatYear % 4 == 0) {
			if (whatYear % 100 == 0) {
				if (whatYear % 400 == 0) {
					return 366; // 윤년
				} else {
					return 365; // 평년
				}
			} else {
				return 366;
			}
		} else {
			return 366;
		}
	}

	public static int whatDay(int whatYear) {
		if (whatYear % 4 == 0) {
			if (whatYear % 100 == 0) {
				if (whatYear % 400 == 0) {
					return 29;
				} else {
					return 28;
				}
			} else {
				return 29;
			}
		} else {
			return 28;
		}
	}

	public static int totalMonth(int getMonth, int totalMonthDay, int feb) {
		if (getMonth == 1) {
			totalMonthDay = 0;
		} else if (getMonth == 2) {
			totalMonthDay = 31;
		} else if (getMonth == 3) {
			totalMonthDay = 31 + feb;
		} else if (getMonth == 4) {
			totalMonthDay = 31 + feb + 31;
		} else if (getMonth == 5) {
			totalMonthDay = 31 + feb + 31 + 30;
		} else if (getMonth == 6) {
			totalMonthDay = 31 + feb + 31 + 30 + 31;
		} else if (getMonth == 7) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30;
		} else if (getMonth == 8) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30 + 31;
		} else if (getMonth == 9) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31;
		} else if (getMonth == 10) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		} else if (getMonth == 11) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		} else if (getMonth == 12) {
			totalMonthDay = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}

		return totalMonthDay;
	}

}
