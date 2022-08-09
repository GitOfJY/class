package com.test.java.question.obj.access;

import java.util.Calendar;

public class Q03 {


	/*
	3번 문제 조건 (calendar로 생산일자 받는 걸 못하겠음) 
	Bugles 객체의 정보
	가격, 용량, 생산일자, 유통기한
	모든 멤버 변수의 접근 지정자는 private으로 한다.
	멤버 접근을 위한 Setter와 Getter를 정의한다.
	용량 : 쓰기 전용, 300g, 500g, 850g
	가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
	생산일자 : 쓰기 전용(Calendar)
	남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
	Bugles 객체 메소드
	void eat() : 과자 먹기
	먹을수 있는 날짜 = 유통기한 - 현재 - 제조시간
	5 : 먹을 수 있는 날짜가 5일 남음
	-3 : 먹을 수 있는 날짜가 3일 지남
	*/


	public static void main(String[] args) {

		Bugles snack = new Bugles();

		snack.setWeight(500);
		snack.setCreationTime("2022-3-20");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();


		Bugles snack2 = new Bugles();

		snack2.setWeight(300);
		snack2.setCreationTime("2022-3-12");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();



	} // main

} // class



class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;



	// 가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
	public int getPrice() {
		return price;
	}

	// 용량 : 쓰기 전용, 300g, 500g, 850g
	public void setWeight(int weight) {
		if ((weight == 300) || (weight == 500) || (weight == 800)) {
			this.weight = weight;
		} else {
			System.out.println("용량은 300g, 500g, 850g 으로 입력하세요.");
		}
	}


	// 생산일자 : 쓰기 전용(Calendar) > 이 부분 틀린 것 같은데 잘 모르겠음;;
	public void setCreationTime(String day) {
		Calendar crationTime = Calendar.getInstance();

		int year = Integer.parseInt(day.substring(0, 4));
		int month = Integer.parseInt(day.substring(5, 6));
		int date = Integer.parseInt(day.substring(7));

		creationTime.set(year, month - 1, date);
		this.creationTime = creationTime;
	}
	/*
	  
	 
	 public void setBirthday(Calendar birthday) {
	 this.birthday = birthday;} 
	  
	 Calendar birthday = Calendar.getInstance();
	 birthday.set(1995, 2, 24);
	 hong.setBirthday(birthday);
	  
	 snack2.setCreationTime("2022-3-12");
	  
	 
	 father.setBirthday(1965, 5, 10); 
	 
	 public void setBirthday(int year, int month, int date) {
		Calendar birthday = Calendar.getInstance();
		birthday.set(year, month - 1, date);
		this.birthday = birthday;}
	
	snack.setCreationTime("2022-3-20");
	
	public void setCreationTime(String day) {
	//스트링 쪼개서 year,month,day 인트로 바꾸기
	int year = Integer.parsInt(day.substring(0, 4));
	int month = Integer.parsInt(day.substring(5, 6));
	int day = Integer.parsInt(day.substring(7));
	
	Calendar crationday = Calendar.getInstance();
	creation.set(year, month-1, date);
	this.creationday = creationday;}
	
	
		*/



	// 남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
	// 여기도 조금 이상함
	public int getExpiration() {
		if (weight == 300) {
			expiration = 7;
		} else if (weight == 5) {
			expiration = 10;
		} else {
			expiration = 15;
		}
		return expiration;
	}

	public void eat() {

	}
}


/*
 출력 
 가격 : 1,200원
 유통기한 : 5일 남았습니다.
 과자를 맛있게 먹습니다.

 가격 : 850원
 유통 기한이 -6일 남았습니다.
 유통기한이 지나 먹을 수 없습니다	   
*/

