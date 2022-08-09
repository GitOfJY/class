package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EX61_HashSet {
	public static void main(String[] args) {

		/*
		
		1. List
			- 순서가 있는 데이터 집합(*****)
			- 첨자(방번호)
			- 데이터 중복을 허용한다.
		
		2. Set
		- 순서가 없는 데이터 집합
		- 식별자가 없다. > 방과 방을 구분할 수 없다.
		- 데이터 중복을 허용하지 않는다.(*****)
		
		3. Map
			- 순서가 없는 데이터 집합
			- 키 + 값 (*****)
			- 데이터 중복을 허용한다.
		 
		*/

		// m1();
		// m2();
		// m3();
		// m4();
		m5();


	}// main


	private static void m5() {

		// HashSet의 탐색(읽기)
		// - 방을 구분할 수 있는 방법이 없어서 > 식별자 x
		// - Iterator 사용 > 컬렉션 탐색 도구의 일종

		HashSet<String> set = new HashSet<String>();

		set.add("마우스");
		set.add("키보드");
		set.add("모니터");
		set.add("노트북");
		set.add("패드");

		Iterator<String> iter = set.iterator();
		// System.out.println(iter.next()); // 모니터
		// System.out.println(iter.next()); // 노트북
		// System.out.println(iter.next()); // 키보드
		// System.out.println(iter.next()); // 마우스
		// System.out.println(iter.next()); // 패드

		// System.out.println(iter.next()); > error


		// System.out.println(iter.hasNext()); // true
		// Set 안에 가져올 데이터가 있나?
		// System.out.println(iter.next()); // 모니터
		// 가져와라

		// System.out.println(iter.hasNext());
		// System.out.println(iter.next());

		// System.out.println(iter.hasNext());
		// System.out.println(iter.next());

		// System.out.println(iter.hasNext());
		// System.out.println(iter.next());

		// System.out.println(iter.hasNext());
		// System.out.println(iter.next());

		// System.out.println(iter.hasNext()); false
		// System.out.println(iter.next()); error


		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		// 방번호는 없지만 순차적으로 접근 가능
		// 내부적으로 순서 없음


	} // m5()



	private static void m4() {


		// p1과 p3의 상태가 동일함 > 다른 사람 (new 따로따로)
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("아무개", 25);
		Person p3 = new Person("홍길동", 20);
		Person p4 = new Person("홍길동", 28);


		// 값형의 비교는 ==로 한다.
		// 문자열 포함 모든 참조형의 비교는 equals()로 한다. > 문자열 포함
		System.out.println(p1.equals(p3)); // false

		System.out.println(p1.hashCode()); // 1556956098
		System.out.println(p3.hashCode()); // 1252585652


		// ** p1과 p3를 같은 사람으로 취급하고 싶다. > 어떻게 해야 하는지? > string을 바꾸고 hashcode 비교
		System.out.println(p1.equals(p3)); // true
		System.out.println(p1.hashCode()); // 498603628
		System.out.println(p3.hashCode()); // 498603628


		// *** HashSet이 중복값을 체크할 때 equals()와 hashCode() 메소드를 사용한다.
		HashSet<Person> set = new HashSet<Person>();

		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("테스트", 28));


		set.add(new Person("홍길동", 25));
		set.add(new Person("홍길동", 20));
		boolean result = set.add(new Person("홍길동", 20));
		System.out.println(result); // false

		System.out.println(set); // 홍길동20 1개만 출력


	} // m4()



	private static void m3() {

		// HashSet 안에 객체가 있을 경우
		HashSet<Person> set = new HashSet<Person>();

		set.add(new Person("홍길동", 20)); // 1
		set.add(new Person("아무개", 25));
		set.add(new Person("테스트", 28));


		set.add(new Person("홍길동", 25)); // 2 > 1,2은 동명이인
		set.add(new Person("홍길동", 20)); // 3 > 1,3은 ? > 내부 데이터는 동일하지만 다른 사람


		Person p = new Person("하하하", 20); // 참조변수 뺀 것 뿐
		set.add(p);

		Person p2 = new Person("하하하", 20);
		set.add(p2);
		// (이름/나이) 똑같아도 add 따로 하면 다른 것으로 인식

		Person p3 = new Person("호호호", 25);
		set.add(p3);
		set.add(p3);
		// "호호호" 2번 add > 1번 출력
		// "홍길동" "하하하" vs "호호호" 차이 > new의 호출 횟수 (객체 생성 횟수)
		// new 호출 > 붕어빵 찍어냄 > 쌍둥이! 같은 것 아님


		// Set은 객체를 취급할 때 > 메모리의 생성된 인스턴스를 구분한다.(주소값을 구분한다.)
		System.out.println(set); // 1,3 > HashSet 반응? > 다른 사람으로 인식


		// 같은 객체인지 궁금할 때 > hashCode()
		System.out.println(p.hashCode()); // 1252585652
		System.out.println(p2.hashCode()); // 2036368507

		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1.hashCode()); // 54150062
		System.out.println(s2.hashCode()); // 54150062 > 메모리에는 "홍길동" 1개만 생성된다. 완전히 똑같음


	} // m3()



	private static void m2() {

		// 로또 번호 > 중복되지 않는 난수 생성
		// 중복되지 않는 > Set 사용


		// Case 1.
		ArrayList<Integer> lotto = new ArrayList<Integer>();


		for (int i = 0; i < 6; i++) {

			boolean flag = false;
			int n = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto.get(j) == n) {
					flag = true;
					break;
				}
			}


			if (flag) {
				// 중복이 된 경우
				i--;
			} else {
				// 중복이 안 된 경우
				lotto.add(n);
			}


		}

		System.out.println(lotto);



		// Case 2.
		HashSet<Integer> lotto2 = new HashSet<Integer>();

		while (lotto2.size() < 6) {
			int n = (int) (Math.random() * 45) + 1;
			lotto2.add(n); // Set 추기(내부적으로 중복값 허용하지 않는다.)
		}

		System.out.println(lotto2);



	} // m2()



	private static void m1() {


		// Collection > List, Set

		ArrayList<String> list = new ArrayList<String>();

		HashSet<String> set = new HashSet<String>();


		// 요소 추가하기
		list.add("사과");
		list.add("바나나");
		list.add("딸기");

		set.add("사과");
		set.add("바나나");
		set.add("딸기");


		// 요소 개수
		System.out.println(list.size());
		System.out.println(set.size());


		// 덤프
		System.out.println(list);
		// [사과, 바나나, 딸기]
		System.out.println(set);
		// [사과, 바나나, 딸기]


		// 요소 추가하기
		list.add("바나나");
		System.out.println(list.add("바나나")); // true
		System.out.println(list);
		// [사과, 바나나, 딸기, 바나나]

		set.add("바나나");
		System.out.println(set.add("바나나")); // false
		System.out.println(set);
		// [사과, 바나나, 딸기] > Set은 중복값을 가질 수 없다.


		// 요소 삭제
		list.remove(1);
		list.remove("바나나"); // 방 번호, 데이터로 직접 지울 수 있음

		set.remove("바나나"); // 데이터로 삭제하는 방법밖에 없음
		System.out.println(set); // [사과, 딸기]


	} // m1()



}// EX61



class Person {

	private String name;
	private int age;

	public Person() {
		this("", 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int hashCode() {

		// 원래 자신의 메모리 주소값을 반환
		// p1 > "홍길동" 20 > "홍길동20" > 100
		// p2 > "아무개" 25 > "아무개25" > 200
		// p3 > "홍길동" 20 > "홍길동20" > 100 (같은 문자열이기 때문에 hashcode가 같음)

		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		// p1.equals(p3)
		// this == obj
		// return 나의 해시코드 == 오브젝트(매개변수)의 해시코드
		return this.hashCode() == obj.hashCode();
	}



} // Person
