package com.test.java.question.collection;

public class Q03 {
	public static void main(String[] args) {


		// 배열 생성
		MyQueue queue = new MyQueue();

		// 추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		// 읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		// 개수
		System.out.println(queue.size());

		// 확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		// 크기 조절
		queue.trimToSize();

		// 초기화
		queue.clear();
		System.out.println(queue.size());



	} // main
} // Q03

/*
출력

빨강 //System.out.println(queue.poll());
노랑 //System.out.println(queue.poll());
파랑 //System.out.println(queue.poll());

2 //System.out.println(queue.size());

//확인
주황 //System.out.println(queue.peek());
주황 //System.out.println(queue.peek());
2 //System.out.println(queue.size());

0 //초기화
 
 */
