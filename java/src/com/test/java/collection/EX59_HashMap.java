package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class EX59_HashMap {
	public static void main(String[] args) {

		/*
		
		ArrayList
		- 요소 접근 > 첨자(index) 사용
		- 순서가 있는 데이터 집합(방 번호 == 요소의 순서)
		- ex) 강의실 6개 > 1강의실, 2강의실, ... 6강의실
		- 스칼라 배열(Scalar Array)
		- 요소 일괄 접근 > 루프 (for)
		- 요소끼리 구분이 불편하다. > 식별자만 가지고 판단 힘들다. > 식별자가 숫자라서
		- 첨자(index)는 유일하다.
		- 값(value)은 중복이 가능하다. > 방 번호가 유일하기 때문에 값은 중복 가능
		
		HashMap
		- 요소 접근 > 키(key) 사용
		- 순서가 없는 데이터 집합 > 방번호 없음
		- ex) 강의실 6개 > 햇님반, 달님반, 별님반, ... 지구반
		- 요소끼리 구분이 용이하다. > 식별자가 의미있는 단어
		- 요소 일괄 접근 불가능 > 루프 X
		- 요소 > 키(key) + 값(value) > 키와 값을 한쌍으로 하는 데이터 구조
		- 키(key)는 유일하다.(***)
		- 값(value)은 중복이 가능하다.(***) > 키가 유일하기 때문에 값은 중복이 가능하다.
		 
		 */


		// - String : key 자료형
		// - Integer : value의 자료형
		// 방의 이름을 문자열로 적고 그 방안에는 숫자를 넣는다.
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // 숫자배열

		// 점수 입력(국어, 영어, 수학)


		// 1. 요소 추가
		// - V put(K key, V value)
		map.put("국어", 100);
		// int 국어 = 100;
		// 국어 != 데이터, 식별자(방의 이름일 뿐)
		map.put("영어", 90);
		map.put("수학", 80);


		// 2. 요소 개수
		// - int size()
		System.out.println(map.size()); // 3


		// 3. 요소 읽기
		// - V get(K key)
		System.out.println(map.get("국어")); // 100
		System.out.println(map.get("영어")); // 90
		System.out.println(map.get("수학")); // 80


		// 4. 일괄 탐색 > for > 불가능


		// 5. 요소 수정
		// - V put(K key, V value) > 입력과 구분할 수 없다.
		map.put("국어", 99); // 추가(x) 수정(o) >
		System.out.println(map.get("국어")); // 100 > 99 수정


		// 6. 요소 검색
		// - boolean containsKey(K key)
		// - boolean containsValue(V value)

		// 배열 안에 국어 점수가 있나?
		System.out.println(map.containsKey("국어")); // true
		System.out.println(map.containsKey("사회")); // false

		// 어떤 과목인지는 모르는데 90점 맞은 과목이 있나?
		System.out.println(map.containsValue(90)); // true
		System.out.println(map.containsValue(100)); // false


		// 7. 요소 삭제
		// - V remove(K key)
		map.remove("국어");
		System.out.println(map.size()); // 2


		// map > 없는 키 요구하면 에러 대신 null 반환
		System.out.println(map.get("과학")); // null


		// 8. 요소 초기화
		map.clear();

		// map.isEmpty()> 배열이 비어있는지 아닌지 확인
		System.out.println(map.isEmpty()); // true


		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("빨강");
		a1.add("노랑");
		a1.add("파랑");

		System.out.println(a1.get(0)); // 페이지 번호 > 데이터 접근

		HashMap<String, String> a2 = new HashMap<String, String>();
		// 방 이름 : red, 데이터 : 빨강
		a2.put("red", "빨강");
		a2.put("yellow", "노랑");
		a2.put("blue", "파랑");

		// Map == 사전 구조 > Dictionary 구조
		System.out.println(a2.get("red")); // 단어 > 데이터 접근


		// toString() 재정의(override) > 덤프
		System.out.println(a1);
		// [빨강, 노랑, 파랑]
		System.out.println(a2);
		// {red=빨강, blue=파랑, yellow=노랑}


	}// main

}// EX59
