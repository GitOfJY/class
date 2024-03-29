package com.test.java.collection;

import java.util.Stack;

public class EX57_Stack {
	public static void main(String[] args) {

		/*
		
		자료구조(컬렉션)
		 - 데이터를 저장하는 공간의 구조
		 - ex) 배열 > 선형 구조
		 - 물리적인 특징
		 - 추상적인 특징
		
		
		ADT
		 - Abstract Data Type, 추상적 자료형
		 - Stack, Queue
		 - 물리적인 특성을 가지는것이 아니라 사용법이 특성을 가진다.
		
		Stack
		 - 후입선출
		 - LIFO, Last Input First Output
		 - 저장소에 나중에 들어간 요소가 먼저 나온다.
		 - ex) 메모리 구조(Stack), 되돌리기(Ctrl+z), 다시하기(Ctrl+Y)
		 
		Queue
		 - 선입선출
		 - FIFO, First Input First Output
		 - 저장소에 먼저 들어간 요소가 먼저 나온다.
		 - ex) 줄서기
		 
		 */

		// m1();
		m2();



	}// main



	private static void m2() {

		Stack<String> stack = new Stack<String>();

		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");

		// 5. 요소 확인하기(읽기 + 삭제 불가능 + 안꺼낸다)
		System.out.println(stack.peek()); // 노랑
		System.out.println(stack.peek()); // 노랑

	}// m2()



	private static void m1() {

		Stack<String> stack = new Stack<String>();

		// 후입선출
		// 1. 요소 추가하기
		// - T push(T value)
		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");


		// 2. 요소 개수 확인
		// - int size()
		System.out.println(stack.size()); // 3


		// 3. 요소 읽기(꺼내기 == 삭제하기)
		// - T pop()
		System.out.println(stack.pop()); // 노랑 꺼내기 > 삭제
		System.out.println(stack.size()); // 2

		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());


		// 4. 스택이 비어있는지?
		System.out.println(stack.size() == 0); // true
		System.out.println(stack.isEmpty()); // true


		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		// System.out.println(stack.pop()); > 더 이상 데이터 없는데 pop > 에러
		// EmptyStackException - if this stack is empty.


	}// m1()


}// EX57
