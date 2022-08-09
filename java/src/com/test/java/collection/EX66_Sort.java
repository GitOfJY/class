package com.test.java.collection;

import java.util.Arrays;
import java.util.Comparator;

public class EX66_Sort {
	public static void main(String[] args) {

		// 1. 직접 구현 > 정렬 알고리즘 구현
		// 2. JDK 제공 기능


		Integer[] nums = {1, 5, 2, 4, 3};

		// 오름차순
		System.out.println(Arrays.toString(nums));

		// Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));


		// 내림차순 > 지원 안함 > 직접 구현(반 조립)
		// > Comparator

		// 인터페이스를 매개변수로 요구 > 인터페이스를 구현한 객체를 달라는 뜻
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));

		// mc1의 가치?
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));
		// 이 메소드를 사용할 일이 있나? > 없다.

		// 익명 클래스 객체?
		// Comparator<Integer> c = new Comparator<Integer<(){} > 클래스 안 만들어도 됨
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		System.out.println(Arrays.toString(nums));



	} // main
} // EX66


class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		// 01 vs 02
		// 오름차순
		// 1. o1 더 크면 > 양수반환
		// 2. o2 더 크면 > 음수반환
		// 3. 같으면 0

		// if (o1>o2) {return 1;}
		// else if (o1<o2) {return -1;}
		// else {return 0;}

		// 내림차순
		// 1. o1 더 크면 > 음수반환
		// 2. o2 더 크면 > 양수반환
		// 3. 같으면 0

		return o2 - o1;
		// return o1-o2; > 오름차순
		// return o2-o1; > 내림차순

	}

}
