package com.test.java.obj.inheritance;

import java.util.Calendar;
import java.util.Date;

public class EX44_ToString {
	public static void main(String[] args) {

		Time t1 = new Time(2, 30);
		// 각각 멤버변수 > Getter 호출
		System.out.println(t1.getHour());
		System.out.println(t1.getMin());

		Time t2 = new Time(5, 10);
		// 객체의 상태를 한번에 확인 가능
		System.out.println(t2.info());

		Date now = new Date();
		Calendar now2 = Calendar.getInstance();

		System.out.println(now);
		// Mon Mar 28 12:38:49 KST 2022
		// 객체의 내부 데이터 출력
		System.out.println(now2);
		// java.util.GregorianCalendar[time=1648438729683,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=87,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=38,SECOND=49,MILLISECOND=683,ZONE_OFFSET=32400000,DST_OFFSET=0]
		// 객체의 내부 데이터 출력

		System.out.println(t1);
		// com.test.java.obj.inheritance.Time@66048bfd
		System.out.println(t2);
		// com.test.java.obj.inheritance.Time@61443d8f
		// com.test.java.obj.inheritance.Time > 객체의 자료형(패키지.클래스)
		// @
		// 61443d8f > 숫자(16진수) > 메모리 주소값 > 해시코드(HashCode)

		System.out.println();
		System.out.println();

		// 객체 출력 > 객체의 toString() 반환값을 출력
		System.out.println(now);
		System.out.println(now.toString()); // Object.toString

		System.out.println(t1);
		System.out.println(t1.toString()); // 상속받아 자동으로 toString 변환
		// now.toString(): String - Date(오버라이드(재정의))
		// t1.toString() : String - Object
		// t1.toString() : String - Time (오버라이드)

		// Object.toString()
		// - 자식 클래스에서 그대로 사용하지 않는다. > 쓸모 없음
		// - 반드시 메소드 오버라이드(재정의)를 해서 사용한다.
		// - 모든 객체는 toString() 소유
		// - 어떤 코드를 재정의? > 자신이 소유한 데이터(멤버 변수)의 값을 문자열로 돌려주는 코드 > 덤프(dump)
		// - 규칙 역할

		QQQ q = new QQQ();
		// q.aaa(): void QQQ
		// q.test(): void PPP
		// q.test(): void QQQ > 오버라이드돼서 자기거 사용


	}// main
}// EX44



class PPP {
	public void test() {

	}
}


class QQQ extends PPP {
	public void aaa() {}

	@Override
	public void test() {
		super.test();
	}
}



// 클래스 = 멤버변수 + 생성자 + Getter/Setter + toString() 재정의
class Time {
	private int hour;
	private int min;

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String info() {
		// 객체 상태 확인하기 쉬우라고 만든 메소드
		return this.hour + ":" + this.min;

	}

	// 개발자만 보는 정보
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}

	// @Override
	// public String toString() {
	// 최소 권유 > 객체의 데이터를 알아볼 수 있게 문자열
	// return this.hour + ":" + this.min;}



}


