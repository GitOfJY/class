package com.test.java.question.collection;

public class Q02 {
	public static void main(String[] args) {

		// 배열 생성
		MyStack stack = new MyStack();

		// 추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		// 읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		// 개수
		System.out.println(stack.size());

		// 확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());


		// 크기 조절
		stack.trimToSize();

		// 초기화
		stack.clear();
		System.out.println(stack.size());



	}// main

}// Q02



/*
출력

검정 //System.out.println(stack.pop());
주황 //System.out.println(stack.pop());
파랑 //System.out.println(stack.pop());

2 //System.out.println(stack.size());

//확인
노랑 //System.out.println(stack.peek());
노랑 //System.out.println(stack.peek());
2 //System.out.println(stack.size());

0 //초기화
*/
