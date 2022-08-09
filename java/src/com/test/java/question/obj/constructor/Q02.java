package com.test.java.question.obj.constructor;

public class Q02 {
	public static void main(String[] args) {

		/*
		 2번 문제 (완료)
		 요구 사항 : 시간 클래스를 구현하시오.
		 조    건 : 생성자 오버로딩을 구현하시오.
				   2자리 출력
				   Time
				   시간 클래스
				   상태
				   hour: 시(0 이상 양의 정수)
				   minute: 분(0 이상 양의 정수)
				   second: 초(0 이상 양의 정수)
				
				   public Time()
				   기본 생성자
				   시(0), 분(0), 초(0)
				   public Time(int hour, int minute, int second)
				   생성자 오버로딩
				   hour : 시
				   minute : 분
				   second : 초
				   public Time(int minute, int second)
				   생성자 오버로딩
				   minute : 분
				   second : 초
				   public Time(int second)
				   생성자 오버로딩
				   second : 초
				   String info()
				   02:30:45*/



		Time t1 = new Time(); // 기본 생성자 호출
		System.out.println(t1.info());

		Time t2 = new Time(2, 30, 45); // 오버로딩 생성자 호출
		System.out.println(t2.info());

		Time t3 = new Time(1, 70, 30); // 오버로딩 생성자 호출
		System.out.println(t3.info());

		Time t4 = new Time(30, 10); // 오버로딩 생성자 호출
		System.out.println(t4.info());

		Time t5 = new Time(90, 10); // 오버로딩 생성자 호출
		System.out.println(t5.info());

		Time t6 = new Time(50); // 오버로딩 생성자 호출
		System.out.println(t6.info());

		Time t7 = new Time(10000); // 오버로딩 생성자 호출
		System.out.println(t7.info());



	} // main
} // Q02


class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(0, 0, 0);
	}

	public Time(int hour, int minute, int second) {

		// 유효성 검사
		if (hour >= 0) {
			this.hour = hour;
		}
		if (minute >= 0) {
			this.minute = minute;
		}
		if (second >= 0) {
			this.second = second;
		}
	}


	public Time(int minute, int second) {
		this(0, minute, second);
	}


	public Time(int second) {
		this(0, 0, second);
	}


	String info() {

		// 시간 계산
		int totalSec = 3600 * this.hour + 60 * this.minute + this.second;
		int resultHour = totalSec / 3600;
		int resultMin = (totalSec - resultHour * 3600) / 60;
		int resultSec = totalSec - resultHour * 3600 - resultMin * 60;


		return String.format("%02d:%02d:%02d", resultHour, resultMin, resultSec);
	}// info

}// Time



/*
 출력
00:00:00 //t1.info();
02:30:45 //t2.info();
02:10:30 //t3.info();
00:30:10 //t4.info();
10:30:10 //t5.info();
00:00:50 //t6.info();
02:46:40 //t7.info();
*/
