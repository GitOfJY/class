package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class EX67_Sort {
	public static void main(String[] args) {

		// 문자 코드값 빼기, compareTo
		// System.out.println("A".compareTo("A")); 0
		// System.out.println("A".compareTo("B")); -1
		// System.out.println("A".compareTo("C")); -2
		// System.out.println("C".compareTo("A")); 2

		// m1();
		m2();


	} // main



	private static void m2() {

		ArrayList<Integer> nums = new ArrayList<Integer>();

		nums.add(1);
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(3);

		System.out.println(nums);

		// Case 1.
		Collections.sort(nums);

		System.out.println(nums);


		// Case 2.
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		System.out.println(nums);

		// Case 3.
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});

		System.out.println(nums);

	} // m2()



	private static void m1() {

		// TODO 밑에 오류있는데 모르겠음 나중에 확인 (2022. 4. 6. 오후 2:27:03)

		String[] names = {"홍길동", "아무개", "하하하", "호호호", "테스트"};

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		// [아무개, 테스트, 하하하, 호호호, 홍길동]

		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 내림차순 o2-o1
				return o2.compareTo(o1);
			}

		});

		System.out.println(Arrays.toString(names));
		// [홍길동, 호호호, 하하하, 테스트, 아무개]



		Calendar[] dates = new Calendar[5];
		// 아직 Calendar 0개, 객체 담을 방5개 만든 것 뿐

		// Calendar 객체 생성
		for (int i = 0; i < dates.length; i++) {
			dates[0] = Calendar.getInstance();
		}

		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, 2);
		dates[2].add(Calendar.DATE, 5);
		dates[3].add(Calendar.DATE, 1);
		dates[4].add(Calendar.DATE, 4);

		// 이 배열은 Arrays.toString 덤프하면 못 알아봄

		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}

		Arrays.sort(dates);

		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();

		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {

				// return (int) (o2.getTimeInMillis() - o1.getTimeInMillis());
				return o2.compareTo(o1);
			}
		});

		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();



	}// m1()

}// EX67
