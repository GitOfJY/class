package com.test.java.question.collection;

import java.util.ArrayList;

public class Q01 {
	public static void main(String[] args) {

		ArrayList<String> list2 = new ArrayList<String>();
		// 밑에꺼랑 같이 비교하면서 테스트

		MyArrayList list = new MyArrayList();

		list.add("홍길동");
		list.add("아무개");
		list.add("테스트");

		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println();

		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println(list.size());

		System.out.println();

		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		list.add(1, "호호호");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		if (list.indexOf("홍길동") > -1) {
			System.out.println("홍길동 있음");
		} else {
			System.out.println("홍길동 없음");
		}

		System.out.println();

		list.clear();
		System.out.println(list.size());

	}
}
