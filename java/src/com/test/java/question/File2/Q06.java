package com.test.java.question.File2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q06 {
	public static void main(String[] args) {


		/*
		요구사항 : 모든 괄호가 서로 짝이 맞는지 검사하시오.
		조건    : 대상 괄호: (), {}
			     Stack 사용
		출력    : 올바른 소스입니다.
		출력    : 올바르지 않은 소스입니다.	
		
		1. 1줄씩 읽고 () 찾아 스택에 넣기
		2. for 문 > 스택에서 1이랑 맨끝 찾아서 () 짝 확인하기
		3. {} 마찬가지 반복
		
		*/

		findBracket();

	}// main

	private static void findBracket() {

		try {
			// stack 리스트 만들기 (), {} 따로 만들기
			Stack<String> firstStack = new Stack<>();
			Stack<String> secondStack = new Stack<>();


			// 파일 읽기
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\자바소스.java"));

			String line = null;


			// 문장에서 () 찾아서 스택에 넣기
			while ((line = reader.readLine()) != null) {
				if (line.equals("(")) {
					firstStack.push("(");
				} else if (line.equals(")")) {
					firstStack.push(")");
				} else if (line.equals("{")) {
					secondStack.push("{");
				} else if (line.equals("}")) {
					secondStack.push("}");
				}

			}

			// 짝 맞는지 확인하기
			// ( > ) (()())()
			// (0 (1 2) (3 4) 5) (6 7)
			// (0 1) (2 3) 4) (5 6)
			// 0) (1 2) 3) (4 5)
			// 2 3 4 5 6 7
			// 2 발견 > 4,6 건너뛰고 7에서 발견
			int finishNum = 0;
			int finishSize = firstStack.size();


			while (!firstStack.empty()) {

				if (firstStack.equals("(")) {
					firstStack.peek();
					finishNum++;
					int count = 0;
					while (firstStack.indexOf(")") % 2 == 0) {
						count++;
					}
					for (int j = 0; j < count; j++) {
						firstStack.peek();
					}
				}

			}

			// 무한 루프 탈출
			if (finishNum == finishSize / 2) {
				System.out.println("올바르지 않은 소스입니다.");
			} else {
				System.out.println("올바른 소스입니다.");
			}

			reader.close();



		} catch (Exception e) {
			System.out.println("Q06.findBracket");
			e.printStackTrace();
		}

	}

}// Q06
