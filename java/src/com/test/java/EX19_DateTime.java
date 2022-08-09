package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class EX19_DateTime {
	public static void main(String[] args) {

		/*
		
		자바의 자료형 
		1. 원시형(값형) 
			- byte, short, int, long
			- float, double
			- char
			- boolean
			
		2. 참조형
			- 클래스
		  	- String(자바가 이미 만들어놓은 class 중 1개)
		  	- 날짜시간
		  	- 무제한
		  	
		자바의 날짜시간 자료형
		1. Date 클래스 > 거의 사용 안함
		2. Calender 클래스 
		3. 추가 클래스
		
		
		A. 시각 
		B. 시간
		2022년 3월 14일 4시 22분 27초  > 시각
		8시간 수업 					> 시간
		
		자료형의 시각 > 둘은 완전 다른 자료형 
		
		시각 + 시각 = 불가능, 2022-03-01 + 2025-05-10
		시각 - 시각 = 시간 , 2025-05-10 - 2022-03-01 >피연산자와 결과값의 자료형이 다르게 나온다.
		
		시간 + 시간 = 시간 
		시간 - 시간 = 시간
		
		시각 + 시간 = 시각
		시각 - 시간 = 시각
		
		특정 기준일로부터 해당 시각이 얼마큼 흘렀는지 구한 누적 시간 
		> 틱(tick)값, Epoch Time, Timestamp
		> 특정 기준일 : 1970년 1월 1일 0시 0분 0초
		
		 */
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		m7();
	}

	public static void m7() {
		// 현재 시각의 tick 1647308010776
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());

		// 전용메소드 1647308010822
		System.out.println(System.currentTimeMillis());
	}


	public static void m6() {
		// 1. 현재 시각 얻기 > getInstance() + get()
		// 2. 특정 시각 만들기 > set()
		// 3. 시각 + 시간 = 시각 > add()
		// 4. 시각 - 시간 = 시각 > add()
		// 5. 시각 - 시각 = 시간 > getTimeInMillis()

		// 6. 시간 + 시간 = 시간
		// 7. 시간 - 시간 = 시간

		// 2시간 30분 + 10분 = 2시간 40분
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.HOUR, 2);
		c1.set(Calendar.MINUTE, 30);
		System.out.printf("%tF %tT\n", c1, c1);
		// 2022-03-15 02:30:15 > 시간 아니고 시각

		int hour = 2;
		int min = 30;

		min += 10;

		System.out.printf("%d시간 %d분 \n", hour, min);

		// 2시간 30분 + 10분 = 2시간 40분
		hour = 2;
		min = 30;

		min += 40;
		System.out.printf("%d시간 %d분\n", hour, min);

		hour = hour + (min / 60); // 몫
		min = min % 60; // 나머지
		System.out.printf("%d시간 %d분\n", hour, min);
	}


	public static void m5() {
		// 연산
		// 시각-시각

		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 4, 10);

		// now - birthday = 내가 살아온 시간
		// The operator - is undefined for the argument type(s) java.util.Calendar,
		// java.util.Calendar
		// 산술 연산자(-)는 값형을 대상으로 연산을 한다.
		// System.out.println(now - birthday);

		// tick, epoch
		// Returns this Calendar's time value in milliseconds.
		// Returns:the current time as UTC milliseconds from the epoch

		// 800068029866 ms
		System.out.println(birthday.getTimeInMillis());

		// 1647306476477 ms
		System.out.println(now.getTimeInMillis());
		System.out.println(now.getTimeInMillis() / 1000 / 60 / 60 / 24 / 365);

		// 847238399953 ms
		System.out.println(now.getTimeInMillis() - birthday.getTimeInMillis());
		// 9805일
		System.out.println(
				(now.getTimeInMillis() - birthday.getTimeInMillis()) / 1000 / 60 / 60 / 24);

		// 올해 크리스마스가 며칠 남았는지?
		// 수료일까지 며칠 남았는지?
		// 오늘 수업 끝나려면 몇시간 남았는지?
		// 점심시간 몇 분 남았는지

		Calendar christmas = Calendar.getInstance();
		christmas.set(2022, 11, 25, 0, 0, 0);

		long nowTick = now.getTimeInMillis();
		long christmasTick = christmas.getTimeInMillis();

		// 284일
		System.out.println((christmasTick - nowTick) / 1000 / 60 / 60 / 24);

		Calendar end = Calendar.getInstance();
		end.set(Calendar.HOUR_OF_DAY, 18);
		end.set(Calendar.MINUTE, 0);

		long endTick = end.getTimeInMillis();

		System.out.println((double) (endTick - nowTick) / 1000 / 60 / 60);
	}


	public static void m4() {
		// 연산
		// 시각+시간
		// 시각-시간

		// 오늘 만난 커플 > 100일 기념일
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차 : %tF\n", now);
		now.add(Calendar.DATE, 100);
		// 반환값 없음, now 자체 수정
		System.out.printf("100일차 : %tF\n", now);

		Calendar birthday = Calendar.getInstance();
		birthday.set(1996, 5, 3);
		birthday.add(Calendar.DATE, 100);
		System.out.printf("내 백일 잔치 : %tF\n", birthday);

		// 돌잔치
		birthday.set(1996, 5, 3); // 다시 생일로 설정
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("내 돌잔치 : %tF\n", birthday);

		// 현재 시각 초기화
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -50);
		System.out.printf("50일 전 : %tF\n", now);

		now = Calendar.getInstance();
		// 3시간 25분 뒤 비타민 복용
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 25);
		System.out.printf("비타민 먹을 시간 : %tT\n", now);
	}


	private static void m3() {

		// Calendar 메소드
		// 1. int get(int)
		// 2. int set(...)

		// 현재 시각 얻어오기
		Calendar c1 = Calendar.getInstance();

		// 특정 시각 얻어오기 > 원하는 시각 만들기
		// 1. 현재 시각 만들기
		// 2. 원하는 시각으로 수정하기
		Calendar birthday = Calendar.getInstance();

		// 시각 수정하기
		// - void set()
		birthday.set(Calendar.YEAR, 1996);
		birthday.set(Calendar.MONTH, 5); // 숫자 1 빼야함
		birthday.set(Calendar.DATE, 3);

		birthday.set(Calendar.HOUR, 3);
		birthday.set(Calendar.MINUTE, 40);
		birthday.set(Calendar.SECOND, 0);

		System.out.printf("%tF %tT %tA\n", birthday, birthday, birthday);


		Calendar christmas = Calendar.getInstance();
		christmas.set(2022, 11, 25);
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);

		christmas.set(2022, 11, 25, 13, 0);
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);

		christmas.set(2022, 11, 25, 13, 0, 0);
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);
	}


	private static void m2() {

		// 두번째 예제
		// Calender 클래스
		// 현재 시각 얻어오기(가장 기본적인 행동) > 현재 컴퓨터의 시계의 시각을 얻어온다.
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		// java.util.GregorianCalendar[time=1647245428891,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=73,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=10,SECOND=28,MILLISECOND=891,ZONE_OFFSET=32400000,DST_OFFSET=0]
		// C1안에 들어있는 수많은 데이터 중 원하는 데이터 추출
		// - int get(int)

		System.out.println(c1.get(1)); // 년도 추출
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));

		int year = 1;
		System.out.println(c1.get(year)); // 가독성 높음

		// 자바가 제공하는 Calendar 상수(변수)
		System.out.println(Calendar.YEAR); // 1
		System.out.println(c1.get(Calendar.YEAR)); // 실제로 사용하는 구문
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(c1.get(Calendar.YEAR)); // 2022, 년도
		System.out.println(c1.get(Calendar.MONTH)); // 2, 월(0~11)
		System.out.println(c1.get(Calendar.DATE)); // 14, 날짜(일)
		System.out.println(c1.get(Calendar.HOUR)); // 5, 시(12H)
		System.out.println(c1.get(Calendar.MINUTE)); // 23, 분
		System.out.println(c1.get(Calendar.SECOND)); // 22, 초
		System.out.println(c1.get(Calendar.MILLISECOND)); // 251, 밀리초(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); // 1, 오전(0), 오후(1)

		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); // 73, 일(올해들어 며칠)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); // 14, 일(날짜)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); // 2, 일(요일, 일(1) ~ 토(7))

		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); // 12, 주(올해 들어 몇주차)
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); // 3, 주(이번달에 몇주차, 목요일 포함여부)

		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); // 17, 시(24H)

		// 요구사항 : "오늘은 2022년 3월 14일 입니다." 출력하시오.
		Calendar now = Calendar.getInstance();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));

		// 요구사항 : "지금은 오후 5시 37분입니다." 출력하시오.

		System.out.printf("지금은 %s %d시 %d분입니다.\n", now.get(Calendar.AM_PM) == 0 ? "오전" : "오후",
				now.get(Calendar.HOUR), now.get(Calendar.MINUTE));

		// printf(), format() > 형식문자 + 날짜시간
		System.out.printf("%tF\n", now); // 2022-03-14, *****
		System.out.printf("%d-%02d-%02d\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1,
				now.get(Calendar.DATE));
		System.out.printf("%tT\n", now); // 17:45:10, *****
		System.out.printf("%tA\n", now); // 월요일
	}


	private static void m1() {
		// 첫번째 예제
		// Date
		// 자료형(Date) 변수명(date) = new Date();
		Date date = new Date(); // 현재 시각을 생성해서 date라는 변수에 담아라
		// Mon Mar 14 17:09:36 KST 2022
		System.out.println(date);
	}
}
