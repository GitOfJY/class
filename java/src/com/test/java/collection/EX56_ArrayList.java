package com.test.java.collection;

import java.util.ArrayList;

public class EX56_ArrayList {
	public static void main(String[] args) {



		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		m7();

	} // main


	private static void m7() {


		ArrayList<Integer> list = new ArrayList<Integer>(10);


		// 컬렉션에 반복적으로 데이터를 넣는 행동 > 가변 특성 유지
		// 1. 가비지 발생 > 비용 발생
		// 2. 배열 복사 발생

		// 위의 문제점을 해결하는 방법
		// - ArrayList 초기 길이를 지정할 수 있다.
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list.size());

		list.add(10); // 20칸 생성
		// 이 이후로 list에 데이터를 추가할 일이 없다. > 9칸 남음

		list.trimToSize(); // 20칸 > 11칸으로 줄인다.


		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = i;
		}


		for (int n : list) {
			System.out.println(n);
		}

		for (int n : num) {
			System.out.println(n);
		}

	}
	// m7



	private static void m6() {

		// ArrayList(컬렉션) 특징
		// 1. 내부에 배열을 가지고 있다. == ArrayList를 배열이라고 생각하자.
		// 2. ArrayList 클래스의 대부분 기능이 내부 배열을 조작하는 기능들로 구성
		// 3. 길이가 가변 > 데이터를 넣으면 계속 공간이 늘어난다.

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		System.out.println(list.size()); // 1
		// 내부배열의 길이는 4, size 1 > 데이터의 갯수 != length

		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list.size());

		System.out.println(list.get(1));

	}

	private static void m5() {

		// 선택?
		// 배열(고정) vs ArrayList(불확실)
		// 길이(기준이 딱 하나)로 선택
		// 학생이 몇명인지 정확 > 배열, 학생 몇명인지 모름 > ArrayList
		ArrayList<Student> list = new ArrayList<Student>();



		for (int i = 0; i < 5; i++) {
			// 점수 > 60~100 사이 난수
			int kor = (int) (Math.random() * 41) + 60;
			int eng = (int) (Math.random() * 41) + 60;
			int math = (int) (Math.random() * 41) + 60;


			Student s = new Student("학생" + i, kor, eng, math);

			list.add(s); // 베열에 학생 추가
		}

		// 성적표 출력
		System.out.println("===============================================");
		System.out.println("                   성적표");
		System.out.println("===============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");

		for (Student s : list) {
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n", s.getName(), s.getKor(),
					s.getEng(), s.getMath(), total, avg);
		}


	} // m5



	private static void m4() {
		// 배열(컬렉션)의 요소
		// - 값형 데이터, 문자열
		// - 객체

		// 1. Cup을 5개 만들어라
		// 2. Cup을 담을 수 있는 방을 5개 만들어라
		// Cup[] clist = new Cup[5]; ***** 2번 (배열 : 앞에있는 타입을 집어넣을 수 있는 방을 만드는 것, 알맹이 없음)
		// System.out.println(clist[0].toString()); > NullPinterException


		// Cup(인스턴스(객체))을 5개 만들어라 > new연산자, 생성자 필요
		// 껍데기 + 알맹이
		Cup c1 = new Cup("", 0);
		Cup c2 = new Cup("", 0);
		Cup c3 = new Cup("", 0);
		Cup c4 = new Cup("", 0);
		Cup c5 = new Cup("", 0);


		// Cup을 담을 수 있는 방을 5개 만들어라 > 변수 만들어라 > 인스턴스 없음
		// 껍데기만
		Cup p1;
		Cup p2;
		Cup p3;
		Cup p4;
		Cup p5;



		Cup[] clist = new Cup[5]; // 방 5개
		clist[0] = new Cup("", 0); // 1번째 컵
		clist[1] = new Cup("", 0);
		clist[2] = new Cup("", 0);
		clist[3] = new Cup("", 0);
		clist[4] = new Cup("", 0); // 5번째 컵

		ArrayList<Cup> list = new ArrayList<Cup>();
		list.add(new Cup("", 0)); // 1번째 컵
		list.add(new Cup("", 0));
		list.add(new Cup("", 0));
		list.add(new Cup("", 0));
		list.add(new Cup("", 0)); // 5번째 컵


		for (int i = 0; i < clist.length; i++) {
			System.out.println(clist[i]);
		}
		System.out.println();

		// 향상된 for문 > index 안보임
		for (Cup cup : clist) {
			System.out.println(cup);
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		for (Cup cup : list) {
			System.out.println(cup);
		} // 배열/컬렉션 모습이 완전히 동일 > 추상화가 잘 되어있음
		System.out.println();

	}

	private static void m3() {
		int[] ns1 = new int[3];
		int[][] ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][3];

		// ns1 > 1차원 정수 배열
		ArrayList<Integer> ms1 = new ArrayList<Integer>();

		// ns2 > 2차원 정수 배열
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();

		// ns3 > 3차원 정수 배열
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 =
				new ArrayList<ArrayList<ArrayList<Integer>>>();

		// 2차원 배열 초기화
		ns2[0][0] = 10;

		// 2차원 컬렉션의 초기화
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		ms2.add(list);



	}


	private static void m2() {
		ArrayList<String> list = new ArrayList<String>(); // 문자열배열

		// 1.요소 추가하기
		// - boolean add(T value)
		// - 배열의 맨 마지막에 추가하기 > Append Mode
		list.add("바나나");
		list.add("딸기");
		list.add("포도");
		list.add("귤");

	}



	private static void m1() {
		// 순수배열
		// - 타입 명시(int)
		// - 같이 명시
	}


} // EX56


class Cup {
	private String color;
	private int price;

	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}


}// Cup



class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;



	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}



} // Student



/*
 컬렉션 종류
 1. List 계열
  	- ArrayList
  	- LinkedList
  	- Queue
  	- Stack
  	- Vector(legacy)
  	
  	
 2. Set 계열
 	- HashSet
 	- TreeSet
 
 
 3. Map 계열
 	- HashMap
 	- TreeMap
 	- properties (legacy)
 	- HashTable (legacy)
 */


class Member {
	private int a;
	private String b;
	private int[] c;

	public Member() {
		a = 10;
		b = "홍길동";
		c = new int[5];
	}
}

