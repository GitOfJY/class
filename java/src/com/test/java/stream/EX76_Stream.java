package com.test.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import com.test.data.Data;
import com.test.data.User;

public class EX76_Stream {
	private void mian() {

		/*
		
		스트림, Stream > 최근에 JavaScript에서도 유사하게 제공 > 복습!
		- 데이터 소스로부터 탐색/조작 가능한 도구
		- list.stream().forEach()
		
		
		파이프, pipe
		- 스트림 객체 메소드
		
		1. 중간 파이프
			- 반환값 > 스트림
			
		2. 최종 파이프
			- 반환값 > 스트림 x > void, 다른 자료형
		
			
		필터링
		- filter()
		- 중간처리 파이프
		- 앞의 스트림에서 조건에 맞는 요소만 남기고 맞지 않는 요소는 버린다.
		  > 조건에 맞는 요소만 남아있는 스트림 반환
		
		  
		처리
		- forEach()
		- 최종처리 파이프
		- 앞의 스트림의 요소를 최종 처리하는 메소드
		
		
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
		m10();


	}// main



	private void m10() {

		List<Integer> list = Data.getIntList(10);
		System.out.println(list);

		System.out.println();
		System.out.println();


		list.stream().filter(n -> n >= 50).peek(n -> System.out.printf("@" + n))
				.filter(n -> n % 2 == 1).peek(n -> System.out.printf("#" + n))
				.forEach(n -> System.out.println(n));

		// peek : 그 요소가 어디까지 도달하는지 확인 가능



	} // m10()



	private void m9() {

		List<Integer> list = Data.getIntList();

		// 총합
		System.out.println(list.stream().mapToInt(n -> n).sum());

		System.out.println(list.stream().mapToInt(n -> n).average().getAsDouble());

		System.out.println(Data.getUserList().stream().filter(u -> u.getGender() == 1)
				.mapToInt(u -> u.getHeight()).average().getAsDouble());

	} // m9()



	private void m8() {

		// 값형인데 null 사용하기 위해 > optional


		List<Integer> list = Data.getIntList();

		// 최대 최소?
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		System.out.println(list.stream().max((a, b) -> a - b));
		System.out.println(list.stream().min((a, b) -> a - b));


		// list.clear();
		// Optional<Integer> result = list.stream().max((a, b) -> a - b);
		// System.out.println("최댓값: " + result);
		// optional.empty


		// Optional<Integer> result = list.stream().max((a, b) -> a - b);
		// System.out.println("최댓값: " + result.get());
		// 최댓값 : 99 (get 메소드 통해서 숫자만 출력)
		// list.clear(); > result가 null > 에러


		Optional<Integer> result = list.stream().max((a, b) -> a - b);
		if (result.isPresent()) {
			System.out.println("최댓값: " + result.get());
		} else {
			System.out.println("빈배열");
		}


		// "문자열".indexOf("문");

		// 지역 변수
		// - 값형 + 참조형 > 초기화를 하지 않으면 사용 불가능

		// 멤버 변수
		// - 생성자가 무조건 초기화를 해버린다.
		// - 값형 > 0, 0, 0, false
		// - 참조형 > null

		// 값형(Value Type) : null을 가질 수 없다.
		// int a = null; 불가능 > 값형은 의도적으로 빈공간을 넣을 수 없다.
		// 참조형 : null을 가질 수 있다.
		// Calendar c = null; 가능 > 참조형은 의도적으로 빈공간을 넣을 수 있다.

		// int a;
		// System.out.println(a); > The local variable c may not have been initialized

		// Calendar c;
		// System.out.println(c); > The local variable c may not have been initialized

		Test t = new Test();
		System.out.println(t.a); // 0
		System.out.println(t.b); // false
		System.out.println(t.c); // null

		User temp = getUser();

		// Optional<T> : 값형이 null을 가질 수 없는 특성을 보완하기 위해 만들어진 자료형



		Optional<User> maxUser =
				Data.getUserList().stream().max((u1, u2) -> u1.getAge() - u2.getAge());
		System.out.println(maxUser);

	}



	private static int getNum() {

		boolean condition = true;
		if (condition) {
			return 100;
		}

		return 0;
		// return null; 불가능 > 값형이라서
	}



	private static User getUser() {

		boolean condition = true; // or false

		if (condition) {
			return new User();
		}

		// 조건을 만족하지 않으면 아무것도 return하기 싫을 때 > null 반환
		// User > 참조형이기 때문에 null 반환 가능
		return null;


	}



	private void m7() {


		// 집계, Reduce
		// - count(), max(), min(), sum(), avg()
		// - 최종처리 파이프
		// - 요소들을 가공해서 축소하는 작업, 통계값

		System.out.println(Data.getIntList().stream().count());
		// Stream has already been operatord upon or closed
		// Stream<User> stream = Data.getUserList().stream();
		// System.out.println("총 인원 수 : " + stream.count());
		// System.out.println("총 남자 수 : " + stream.filter(u -> u.getGender() == 1).count());

		List<User> list = Data.getUserList();

		System.out.println("총 인원 수 : " + list.stream().count());
		System.out.println("총 남자 수 : " + list.stream().filter(u -> u.getGender() == 1).count());
		System.out.println("총 여자 수 : " + list.stream().filter(u -> u.getGender() == 2).count());

		System.out.println(Data.getIntList().stream().distinct().count());

	}



	private void m6() {

		// 매칭
		// - allMatch(), anyMatch(), noneMatch()
		// - 최종처리 파이프
		// - 스트림 요소들이 제시하는 조건을 만족 유무 판단
		// a. boolean allMatch(Predicate) : 모든 요소가 조건을 100% 만족
		// b. boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는지
		// c. boolean noneMatch(Predicate) : 모든 요소가 조건ㅇ르 0% 만족 (불만족)

		int[] nums = {2, 4, 6, 8, 10};

		// 요구사항 : 배열안에 짝수만 들어있는지?
		boolean result = false;

		for (int n : nums) {
			if (n % 2 == 1) {
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println("홀수 발견");
		} else {
			System.out.println("짝수만 존재");
		}


		// allMatch() > && 연산자 성질
		// 1. nums안에 각 요소를 Predicate에 넣어서 검사해라
		// 2. 모든 요소가 true 반환 > 자신도 true
		// 3. 일부 요소가 false 반환 > 자신은 false
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == 0));
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == 0));


		// anuMatch() > || 연산자 성질
		// 1. nums안에 각 요소를 Predicate에 넣어서 검사해라
		// 2. 모든 요소가 true 반환 > 자신도 true
		// 3. 일부 요소가 false 반환 > 자신은 false
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0));


		// 이상형 > user + 175cm이상 + 65kg이상 + anyMatch
		result = Data.getUserList().stream().filter(u -> u.getGender() == 1)
				.anyMatch(u -> u.getHeight() >= 175 && u.getWeight() >= 65);


		if (result) {
			System.out.println("이상형이 있습니다.");
			Data.getUserList().stream().filter(u -> u.getGender() == 1)
					.filter(u -> u.getHeight() >= 175).filter(u -> u.getWeight() >= 65)
					.forEach(u -> System.out.println(u));
		} else {
			System.out.println("이상형이 없습니다.");
		}

	}



	private void m5() {
		Data.getUserList().stream().filter(user -> user.getGender() == 1)
				.map(user -> user.getWeight()).distinct()
				.forEach(weight -> System.out.println(weight));


		// 정렬
		// - sorted()
		// - 중간처리 파이프
		// - 배열, 컬렉션의 sort()와 사용법이 동일
		// a. 단일값 오름차순 > sort()
		// b. 단일값 내림차순 > sort(구현)
		// c. 복합값 오름차순, 내림차순 > sort(구현)

		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);

		nums.sort((a, b) -> a - b);
		nums.sort(Comparator.naturalOrder()); // 오름차순 정렬 객체
		nums.sort(Comparator.reverseOrder()); // 내림차순 정렬 객체
		System.out.println(nums);

		// Collecions.sort(nums);
		// Collections.sort(nums, 구현);


		// nums.stream().sorted()
		// nums.stream().sorted(구현)

		// 배열 정렬(x) > 스트림 정렬(o)
		// **** 스트림의 조작은 원본 배열 영향을 미치지 않는다.
		nums.stream().sorted().forEach(n -> System.out.println(n));

		System.out.println(nums);

		nums.stream().sorted((a, b) -> b - a).forEach(n -> System.out.println(n));

		Data.getIntList().stream().distinct().filter(n -> n % 2 == 0).sorted()
				.forEach(n -> System.out.println(n));

	} // m5()



	private void m4() {

		// 매핑
		// - map(), mapxxx()
		// - 중간처리 파이프
		// - 변환 작업에 사용한다.(***)
		// - map() > 앞의 스트림을 처리 후 다른 타입의 스트림을 반환
		// - distinct(), filter() > 앞의 스트림 처리 후 동일한 타입의 스트림을 반환


		List<String> list = Data.getStringList(10);
		System.out.println(list);


		list.stream() // Stream<String>
				.filter(word -> word.length() <= 3) // Stream<String>
				.forEach(word -> System.out.println(word));
		System.out.println();


		list.stream() // Stream<String> : 단어 스트림
				.map(word -> { // Stream<Integer> : 단어 길이 스트림
					return word.length();
				}).forEach(num -> System.out.println(num));
		System.out.println();


		list.stream().distinct().map(word -> word.length())
				.forEach(length -> System.out.println(length));
		list.stream().map(word -> word.length()).distinct().filter(length -> length >= 5)
				.forEach(length -> System.out.println(length));


		String[] names = {"홍길동", "홍재석", "테스트", "아무개", "하하하", "호호호", "후후후", "유재석", "박명수"};

		// mapping
		Arrays.stream(names).map(name -> name.substring(1))
				.forEach(name -> System.out.println(name));
		System.out.println();


		List<User> ulist = Data.getUserList();

		// map() -> 의도? : 원본 데이터를 다른 형태로 가공
		// ulist.stream()
		// .map(user -> user.getNma())
		// .map(user -> user.getHeiht()>=180 && user.getWeight()<=80)
		// .forEach(user -> System.out.println(user));



	} // m4



	private void m3() {

		// 중복제거
		// - distinct()
		// - 중간처리 파이프
		// - 앞의 스트림에서 중복 요소를 제거한다.
		// > 유일한 요소만 남아있는 스트림을 반환한다.
		// - Set의 성질과 유사하다.

		System.out.println(Data.getIntList().size());
		List<Integer> list = Data.getIntList();


		// 요구사항 : 위의 배열에서 중복값 제거
		// Case 1.
		Set<Integer> set = new HashSet<Integer>();

		for (int n : list) {
			set.add(n);
		}


		// Case 2.
		// - ArrayList -> (변환) -> HashSet
		Set<Integer> set2 = new HashSet<Integer>(list);


		// Case 3.
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println(list.stream().count());
		System.out.println(list.stream().distinct().count());


		String[] names = {"홍길동", "아무개", "하하하", "호호호", "후후후", "홍길동"};
		Arrays.stream(names).distinct().forEach(name -> System.out.println(name));


		List<Cup> clist = new ArrayList<Cup>();
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.WHITE, 300));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.BLUE, 500));
		clist.add(new Cup(Cup.BLACK, 600));
		clist.add(new Cup(Cup.WHITE, 700));
		clist.add(new Cup(Cup.RED, 800));
		clist.add(new Cup(Cup.BLUE, 900));
		clist.add(new Cup(Cup.YELLOW, 1000));
		clist.add(new Cup(Cup.YELLOW, 1100));


		// *** 기본적으로 같은 자료형(클래스)의 객체가 동일한 값(상태)을 가지더라도 다른 객체이다.
		// > 두 객체는 독립적으로 존재한다. (메모리 주소가 다르다.) == 쌍둥이 > 객체의 유일성


		clist.stream().forEach(cup -> System.out.println(cup));


		// Set, distinct() > 중복 객체 제거하려면?
		// 1. hashCode() 재정의
		// 2. equals() 재정의


	}



	private void m2() {
		Data.getStringList().stream().filter(word -> word.length() >= 5)
				.forEach(word -> System.out.println(word));
		System.out.println();


		Data.getUserList().stream().filter(user -> user.getWeight() >= 70)
				.filter(user -> user.getGender() == 1).filter(user -> user.getHeight() >= 180)
				.forEach(user -> System.out.println(user));



	} // m2()



	private void m1() {


		List<Integer> list = Data.getIntList(20);
		System.out.println(list);

		// 짝수만 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.printf("%4d", list.get(i));
			}
			System.out.println();



			for (int n : list) {
				if (n % 2 == 0) {
					System.out.printf("%4d", n);
				}
			}
			System.out.println();


			list.stream().forEach(n -> {
				if (n % 2 == 0) {
					System.out.printf("%4d", n);
				}
			});
		}
		System.out.println();



		// 1. list.stream() > 20개 숫자 탐색
		// 2. filter(조건) > 20개의 숫자를 조건 검사 > true 요소들만 가지고 새로운 stream 생성
		// 3. forEach(소비) > 짝수만 들어있는 Stream 소비

		list.stream().filter(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(n -> {
			System.out.printf("%4d", n);
		});

		System.out.println();


		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.printf("%4d", n));


		list.stream().filter(n -> n % 2 == 0 && n >= 50).forEach(n -> System.out.printf("%4d", n));
		System.out.println();


		list.stream().filter(n -> n % 2 == 0).filter(n -> n >= 50)
				.forEach(n -> System.out.printf("%4d", n));
		System.out.println();



	}



} // EX76_Stream


class Cup {

	public static final int BLACK = 1;
	public static final int WHITE = 2;
	public static final int RED = 3;
	public static final int YELLOW = 4;
	public static final int BLUE = 5;


	private int color;
	private int size;


	public Cup(int color, int size) {
		this.color = color;
		this.size = size;



	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return String.format("Cup [color=%s, size=%s]", color, size);
	}


	// 개발자의 의도대로 cup 객체를 비교하기 위해서
	// 1. hashCode() 재정의
	// 2. equals() 재정의


	@Override
	public int hashCode() {
		// 비교하려는 객체의 상태(멤버 변수값)을 가지고 해시코드 생성 + 변환

		return ("" + this.color + this.size).hashCode();
	}


	@Override
	public boolean equals(Object obj) {

		return this.hashCode() == obj.hashCode();

	}



} // Cup



class Test {

	public int a;
	public boolean b;

	public String c;

}
