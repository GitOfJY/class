package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		5번 문제 (완료)
		요구사항  : 자판기 프로그램을 구현하시오.
		*/

		vendingMc();

	} // main

	private static void vendingMc() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;

		while (loop) {
			System.out.println("==============");
			System.out.println("     자판기    ");
			System.out.println("==============");
			System.out.println("1. 콜라    : 700원");
			System.out.println("2. 사이다   : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("-----------------");
			System.out.print("금액 투입(원) : ");
			int input = Integer.parseInt(reader.readLine());
			System.out.println("-----------------");
			System.out.print("음료 선택(번호) : ");
			String sel = reader.readLine();

			if (sel.equals("1")) {
				System.out.println("+ 콜라를 제공합니다.");
				System.out.printf("+ 잔돈 %d원을 제공합니다. \n", input - 700);
				System.out.println();
				System.out.print("계속 하시려면 엔터를 입력하세요.");
				String enter1 = reader.readLine();
			} else if (sel.equals("2")) {
				System.out.println("+ 사이다를 제공합니다.");
				System.out.printf("+ 잔돈 %d원을 제공합니다. \n", input - 600);
				System.out.println();
				System.out.print("계속 하시려면 엔터를 입력하세요.");
				String enter1 = reader.readLine();
			} else if (sel.equals("3")) {
				System.out.println("+ 비타500을 제공합니다.");
				System.out.printf("+ 잔돈 %d원을 제공합니다. \n", input - 500);
				System.out.println();
				System.out.print("계속 하시려면 엔터를 입력하세요.");
				String enter1 = reader.readLine();
			} else {
				loop = false;
			}

		} // while
	}// method
}// class
