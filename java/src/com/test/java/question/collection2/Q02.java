package com.test.java.question.collection2;

public class Q02 {
	public static void main(String[] args) {


		// 배열 생성
		MySet list = new MySet();

		// 추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		// 개수
		System.out.println(list.size());

		// 삭제
		list.remove("아무개");

		// 개수
		System.out.println(list.size());

		// 탐색 + 읽기
		while (list.hasNext()) {
			System.out.println(list.next());
		}

		// 초기화
		list.clear();
		System.out.println(list.size());



	}// main
}// Q02


/*
출력
3 //System.out.println(list.size());

//삭제
2

//탐색 + 읽기
홍길동 
하하하 

0 //초기화 
 */
