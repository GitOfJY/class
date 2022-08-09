package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class EX58_Queue {
	public static void main(String[] args) {


		// Queue
		// - 선입선출
		// Queue > 인터페이스 > 객체 만들 수 없음 > 껍데기 역할
		Queue<String> queue = new LinkedList<String>();
		// 알맹이는 linkedlist지만 사용법은 queue

		// 1. 요소 추가하기
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");

		// 2. 요소 개수
		// - int size()
		System.out.println(queue.size()); // 3

		// 3. 요소 읽기(=꺼내기)
		System.out.println(queue.poll()); // 빨강, deque()
		System.out.println(queue.size()); // 2

		System.out.println(queue.poll()); // 파랑
		System.out.println(queue.size()); // 1

		System.out.println(queue.poll()); // 노랑
		System.out.println(queue.size()); // 0

		System.out.println(queue.poll()); // null > stack이랑 다르게 오류나지 않음
		System.out.println(queue.size()); // 0

		// 4. 비었는지?
		System.out.println(queue.size() == 0);
		System.out.println(queue.isEmpty());

		// 5. 요소 확인
		queue.add("주황");
		System.out.println(queue.peek());
		System.out.println(queue.size());

		// 6.
		queue.clear();
		System.out.println(queue.size());

	}// main
}// EX58
