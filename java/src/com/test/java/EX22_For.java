package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class EX22_For {
	public static void main(String[] args) throws Exception {
		/*
		반복문, Loop(iteration) > i > 루프 변수
		- 특정 코드를 개발자가 원하는 횟수만큼 반복 실행한다.
		- 생산성 향상 + 유지보수성 향상
		
		 for (초기식; 조건식; 증감식) {
		 	실행문;
		 	
		 반복문 사용 이유
		 1. 반복하기 위해서
		 2. 루프 변수를 사용하기 위해서 > 연습 필요
		 }
		  
		 */
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		// m14();


	}// main

	private static void m14() {

		// 달력 만들기

		// 1. 월의 마지막일
		// 2. 월의 1일의 요일

		int year = 2022;
		int month = 3;

		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);

		System.out.println("====================================================");
		System.out.printf("                     %d년 %d월\n", year, month);
		System.out.println("====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		System.out.println("====================================================");

		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%3d\t", i);

			// 토요일 개행
			if ((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}


	}



	private static void m12() {
		// 달력 만들기
		// 1. 월의 마지막 일
		// 2. 월의 1일의 요일
		int year = 2022;
		int month = 3;

		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);

		System.out.println("=============");
		System.out.printf("%d년 %dnjf\n", year, month);
		System.out.println("=============");
		System.out.println("[일]\t[월][화][수][목][금][토]");
		System.out.println("=============");


		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%3d\t", i);

			if ((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}



	}


	private static int getDayOfWeek(int year, int month) {
		int total = 0;
		int date = 1;

		for (int i = 1; i < year; i++) {
			total += 365;

			if (isLeafYear(i)) {
				total++;
			}
		}

		for (int i = 1; i < month; i++) {
			total += getLastDay(year, i);
		}

		total += date;

		return total % 7;
	}


	private static void m13() {

		// 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.

		// 1년 = 365일

		int total = 0;
		int year = 2022;
		int month = 3;
		int date = 1;

		// 1년 1월 1일 ~ 2021년 12월 31일

		for (int i = 1; i < year; i++) {
			total += 365;

			// 현재 i년이 윤년인지 검사?
			if (isLeafYear(i)) {
				total++;
			}
		}

		System.out.println("년: " + total);


		// 2022년 1월 1일 ~ 2022년 2월 28일
		for (int i = 1; i < month; i++) {

			total += getLastDay(year, i);
		}

		System.out.println("월: " + total);


		// 2022년 3월 1일 ~ 2022년 3월 17일
		total += date;

		System.out.println("일: " + total);

		// 특정 날짜의 요일? > 기준일 + 기준일 요일 + 기준일부터 특정 날짜의 날짜 합
		// System.out.println(total % 7);


		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다.\n", year, month, date, total,
				getDay(total));



	}



	private static int getLastDay(int year, int month) {

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
		}

		return 0;
	}



	private static void m11() {

		/*
		 난수, Random
		 - 임의의 수 
		 - 난수 생성기
		 
		 1. Math.random()
		 2. Random 클래스
		 */

		// Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than
		// 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution
		// from that range.
		// 0 이상 1 미만
		// System.out.println(Math.random());

		// 1 이상 10 사이의 난수
		for (int i = 0; i < 10; i++) {
			// int num = (int) (Math.random() * 10) + 1;
			int num = (int) (Math.random() * 7);
			// 0에서부터 (곱한 숫자-1)까지 출력
			// (int)(Math.random() * B) + A
			// 최소값 : A
			// 최대값 : A + B - 1
			System.out.println(num);
		}

	}



	private static void m10() {

		// 요구 사항 : 2022.03.01 ~ 2022.03.31 날짜 출력, 캘린더 사용
		// 출력 : 2022년 3월 ?일 ?요일
		// 2020.03.01 > 시작 날짜
		// Calendar 사용 > 수정 용이

		Calendar c1 = Calendar.getInstance();
		c1.set(2022, 02, 01); // 시작 날짜 set
		// c1이 속해있는 월의 최대값 출력 > 마지막 날짜 출력
		System.out.println(c1.getActualMaximum(Calendar.DATE));
		int lastDay = c1.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%d년 %d월 %d일 %tA\n", c1.get(Calendar.YEAR),
					c1.get(Calendar.MONTH) + 1, c1.get(Calendar.DATE), c1);

			c1.add(Calendar.DATE, 1); // 루프 1바퀴 > 1일 증가
		}

	}


	private static void m9() {

		// 요구 사항 : 2022.03.01 ~ 2022.03.31 날짜 출력
		// 출력 : 2022년 3월 ?일

		for (int date = 1; date <= 31; date++) {

			String day = getDay(date);

			System.out.printf("2022년 03월 %02d일 %s요일 \n", date, day);
		}

		// 수정 사항 : 요일 같이 출력


	}


	private static void m8() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		// 짝수만 누적

		for (;;) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if (num == 0) {
				break;
			}
			if (num % 2 == 1) {
				continue;
			}
			sum += num;
		}
		System.out.println("최종 합 : " + sum);

	}


	private static void m7() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 사용자 입력 숫자 > 누적 > 횟수를 사용자가 결정
		int sum = 0;
		for (;;) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());

			if (num == 0) {
				break;
			}

			sum += num;

		}
		System.out.println("최종 합 : " + sum);



	}

	// This method must return a result of type String
	// 모든 경우에 return문이 존재해야하는데 일부 경우에는 return문이 존재하지 않는다.
	public static String getDay(int date) {

		if (date % 7 == 1) {
			return "월";
		} else if (date % 7 == 2) {
			return "화";
		} else if (date % 7 == 3) {
			return "수";
		} else if (date % 7 == 4) {
			return "목";
		} else if (date % 7 == 5) {
			return "금";
		} else if (date % 7 == 6) {
			return "토";
		} else {
			return "일";
		}

		/// if 빠져나왔을 때 return 없음
	}
	// return null;
	// 마지막 줄 수정 > else {return "월";}

	public static boolean isLeafYear(int year) {

		// a. 년도를 4로 나눈다.
		// 떨어지면 b 검사
		// 떨어지지 않으면 "평년" //O
		// b. 년도를 100으로 나눈다.
		// 떨어지면 c 검사
		// 떨어지지 않으면 "윤년" //O
		// c. 년도를 400으로 나눈다.
		// 떨어지면 "윤년"
		// 떨어지지 않으면 "평년"

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}

			} else {
				return true;
			}

		} else {
			return false;
		}

	}


	private static void m6() {

		/* 무한 루프, Infinite Loop
		for (int i = 0; i < 10; i--) { > 21억바퀴
			System.out.println("안녕하세요.");} 
		
		
		무한 루프 일부러 만들기
		조건문 공백 > 항상 참
		
		
		무한 루프
		for (;;) {System.out.println("무한루프");}		
		 
		 
		무한 루프 + 루프 변수 활용
		for (int i =0; ; i++) {System.out.println("무한루프"+i);}
		
		
		루프 탈출하는 방법
		for (int i=1; i<10; i++) {
			System.out.println(i);
			if (i==5) {break;} > if문을 제외한 나머지 제어문을 탈출하는 역할
		}
		
		
		for (int i=1; i<=10; i++) {
		if (i==5){continue;} > for문에 대해서 동작
			System.out.println(i);
		} 
		> 1 2 3 4 6 7 8 9 10 출력
		> 하던일을 멈추고 제어의 처음으로 돌아가세요.
		
		
		제어문 break, continue > 단독사용 불가능
		*/
	}



	private static void m5() throws Exception {
		// 구구단 출력
		// i * j = k

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 : ");
		int dan = Integer.parseInt(reader.readLine());

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}


		for (int i = 1; i < 10; i++) {
			System.out.printf("5 * %d = %2d\n", i, 5 * i);
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
		}


	}



	private static void m4() throws Exception {
		// 요구사항 : 사용자 숫자 입력 > 10번 입력 > 숫자의 합
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		System.out.println(sum);

		// 요구사항 : 1~10까지의 합
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);


	}



	private static void m3() {
		/*요구사항 : 1~10까지 출력
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		int num =1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		
		*/

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}


		for (int i = 1; i <= 10; i += 3) {
			System.out.println(i);
		}
	}



	private static void m2() {
		// 반복문 몇 회전?
		for (int i = 0; i < 5; i++) {
			System.out.println("실행문");
		}
		System.out.println();

		for (int i = 3; i <= 7; i++) {
			System.out.println("실행문");
		}
		System.out.println();

		for (int i = 10; i > 5; i--) {
			System.out.println("실행문");
		}
		System.out.println();
	}


	private static void m1() {

		hello();
		hello();
		hello();
		hello();
		hello();


		// int i = 1; > 초기식 > for문에 처음 진입할 때 딱 1회만 실행한다.
		// i<= 5; > 조건식 > 반복 유무를 결정한다.
		// i++ > 증감식 > 조건식의 변화를 유발한다.
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요.");
		} // for
	} // m1

	public static void hello() {
		System.out.println("안녕하세요.");
	}// hello

}// class
