package com.test.java;

import java.util.Arrays;

public class EX27_Array {
	public static void main(String[] args) {
		// 다차원 배열
		// - 배열의 차원


		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		m7();


	} // main



	private static void m7() {
		// 문제 설명
		// 5x5 2차원 int 배열 (성적제외)

		int[][] nums = new int[5][5];


		// 데이터 입력, 문제 풀때는 length말고 상수로 쓰기
		// 문제의 요구사항에 따라 i와 j 수정
		int n = 1; // 루프 변수 대신
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = n;
				n++;
			}
		}


		// 데이터 출력, printf로 출력,
		// 수정 금지
		// 행 i, 열 j
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}


	}



	private static void m6() {

		// 배열의 검색
		// - 집합에서 원하는 항목을 검색

		String[] member = {"홍길동", "유재석", "박나래", "정형돈", "박명수", "이광수", "김종국", "노홍철", "강호동", "하하"};

		// 요소 검색 > 결과 (반환값)
		// 1. boolean
		// 2. index



		// 1. boolean
		// 변수값의 초기값 > 실패하거나 아무일도 안일어났을때 가져야될 값으로 초기화한다.
		// > 피해가 가장 적을 것 같다고 생각하는 값
		boolean result = false;
		String search = "이광수"; // 검색할 회원명

		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(search)) {
				result = true; // 찾음
				break; // 불필요한 회전 중단
			}
		}

		if (result) {
			System.out.println(search + ": 발견");
		} else {
			System.out.println(search + ": 없음");
		}



		// 2. index
		int index = -1; // 발견된 위치, 방번호가 절대 될 수 없는 값 설정

		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(search)) {
				index = i; // 찾은 위치 > i
				break; // 불필요한 회전 중단
			}
		}

		System.out.println(search + "의 위치: " + index);


		System.out.println(contains(member, search)); // true
		System.out.println(indexOf(member, search)); // 5


	}

	// 단위화, 모듈화, 기능화 > 가독성, 재사용성 높아짐
	public static boolean contains(String[] member, String search) {
		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(search)) {
				return true; // return을 만나는 순간, 메소드 종료
				// return은 제어문 뿐만 아니라 메소드 자체 종료
				// break는 제어문 종료
			}
		}
		return false;
	}

	public static int indexOf(String[] member, String search) {
		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(search)) {
				return i;
			}
		}
		return -1;
	}


	private static void m5() {

		// 베열 삽입/삭제 (배열의 크기는 변하지 않는다.)
		// java.question.array007
		// [5, 6, 1, 3, 2, 0, 0, 0, 0, 10]
		// [5, 6, 0, 3, 2, 0, 0, 0, 10, 10] X
		// [5, 6, 3, 2, 0, 0, 0, 0, 10, 0] O

		int[] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 10};
		int index = 2;
		System.out.println(Arrays.toString(nums));
		// 원본 [5, 6, 1, 3, 2, 0, 0, 0, 0, 10]

		// Left Shift. 좌측 시프트 > for 증가
		for (int i = index; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}

		System.out.println(Arrays.toString(nums));
		// [5, 6, 3, 2, 0, 0, 0, 0, 10, 10]

		nums[nums.length - 1] = 0;
		System.out.println(Arrays.toString(nums));
		// [5, 6, 3, 2, 0, 0, 0, 0, 10, 0]

	}



	private static void m4() {

		// 베열 삽입/삭제 (배열의 크기는 변하지 않는다.)
		// java.question.array007
		// [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		// [5, 6, 100, 3, 2, 0, 0, 0, 0, 0] X
		// [5, 6, 100, 1, 3, 2, 0, 0, 0, 0] O

		int[] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int index = 2; // 삽입 위치
		int value = 100; // 삽입 값
		System.out.println(Arrays.toString(nums));

		// Right Shift, 우측 시프트 > for 감소
		for (int i = nums.length - 2; i >= index; i--) {
			nums[i + 1] = nums[i]; // 이동
		}
		System.out.println(Arrays.toString(nums));
		// [5, 6, 1, 1, 3, 2, 0, 0, 0, 0]

		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		// [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]



	}



	private static void m3() {

		// 속도 체크 > 어느 부분에서 빨라지고 느려지는지 원인 분석
		long begin = System.currentTimeMillis();// tick
		long begin1 = System.nanoTime();

		// 중복되지 않는 임의의 숫자 6개를 만드시오.
		// java.question.array006
		// 회전수 예측 가능 > for, 회전수 예측 불가능 > while

		int[] lotto = new int[6];
		boolean isDuplicate = false;

		for (int i = 0; i < lotto.length; i++) {
			int n = (int) (Math.random() * 45) + 1;
			// 생성한 난수를 배열에 넣기 전 > 기존의 숫자와 중복되는지 검사
			for (int j = 0; j < i; j++) {
				// 기존의 숫자들
				if (lotto[j] == n) {
					// 중복되는 숫자}
					isDuplicate = true;
					i--; // 이 회차를 한번 더 실행 > 빈칸이 생기지 않게 하기 위해서
					// 중복된 숫자 발생 > 이번 회차 삭제하고 똑같은 방번호 다시
					break;
				}
			}

			if (!isDuplicate) {
				lotto[i] = n;
			}
			isDuplicate = false;
		}

		// Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); // 덤프

		long end = System.currentTimeMillis();// tick
		long end1 = System.nanoTime();
		System.out.println(end - begin); // 소요시간
		System.out.println(end1 - begin1 + "ns");
	}



	private static void m2() {

		// 다차원 배열의 초기화 리스트
		// 1차원 배열
		int[] nums1 = {10, 20, 30};

		// 2차원 배열
		// new int[2][3]
		int[][] nums2 = {{10, 20, 30}, {40, 50, 60}};

		// 3차원 배열
		// new int[2][2][3]
		int[][][] nums3 = {{{10, 20, 30}, {40, 50, 60}}, {{70, 80, 90}, {100, 110, 0}}};

		/*
		int[][][] nums4 = 
			{
				{
					{10, 20, 30}, 
					{40, 50, 60}
				}, 
				{						
					{70, 80, 90},
					{100, 110, 0}
				}
			}; 
		*/



	}

	private static void m1() {
		// 1차원 배열
		int[] nums1 = new int[3];

		// 2차원 배열(테이블)
		int[][] nums2 = new int[2][3]; // 2(행), 3(열)

		// 3차원 배열
		int[][][] nums3 = new int[2][2][3]; // 2(면), 2(행), 3(열)

		// 배열 요소 접근(방번호 메기기)
		// 1차원 배열
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;

		// 2차원 배열 > 차원 2개 > 첨자 2개
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;

		// 3차원 배열 > 차원 3개 > 첨자 3개
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;

		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;

		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;

		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;

		// 배열 탐색(+조작)
		// - 1차원 배열 > 단일 for문
		// - 2차원 배열 > 2중 for문
		// - 3차원 배열 > 3중 for문

		// 1차원 배열
		for (int i = 0; i < nums1.length; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();

		for (int i = 0; i < nums1.length; i++) {
			System.out.printf("%5d", nums1[i]);
		}
		System.out.println();
		System.out.println();


		// 2차원 배열
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("nums2[%d][%d]=%d\n", i, j, nums2[i][j]);
			}
		}

		System.out.println();


		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[0].length; j++) {
				System.out.printf("%5d", nums2[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();


		// 3차원 배열
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
				}
			}
		}
		System.out.println();


		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums3[0].length; j++) {
				for (int k = 0; k < nums3[0][0].length; k++) {
					System.out.printf("%5d", nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();


		/*
		 다차원 배열의 길이 (= 방 개수)
		 1차원 배열 
		 new int[3];
		 System.out.println(nums1.length); 확인
		 
		 
		 2차원 배열
		 new int[2][3]
		 System.out.println(nums2.length); > 2(가장 고차원) 출력
		 System.out.println(nus2[0].length); > 3 출력
		 
		 
		 3차원 배열
		 new int[2][2][3]
		 System.out.println(nums3.length); > 면의 개수
		 System.out.println(nums3[0].length); > 행의 개수
		 System.out.println(nums3[0][0].length); > 열의 개수
		 */

	}// m1


} // class
