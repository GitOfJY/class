package com.test.java.question.File;

import java.io.File;
import java.util.HashSet;

public class Q07 {
	public static void main(String[] args) {

		/*
		요구사항 : MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
		조   건 : 중복 파일을 찾아내시오.
		리 소 스 : 폴더 > 동일 파일
				 파일 다운로드
		출   력 : BAAM - 모모랜드 (MOMOLAND).mp3 
				 Dejavu - 볼빨간사춘기.mp3 
			  	 SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
				 ..
		 */

		// q07sol1();



	}// main


	private static void q07sol1() {
		File dirA = new File("c:\\class\\java\\file\\파이_디렉토리_문제\\동일파일\\MusicA");
		File dirB = new File("c:\\\\class\\\\java\\\\file\\\\파이_디렉토리_문제\\\\동일파일\\\\MusicB");

		String[] listA = dirA.list();
		String[] listB = dirB.list();


		for (String s1 : listA) {
			for (String s2 : listB) {
				if (s1.equals(s2)) {
					System.out.println(s1);
					break;
				}
			}
		}
	}



	private static void q07sol2() {


		File dirA = new File("c:\\class\\java\\file\\파이_디렉토리_문제\\동일파일\\MusicA");
		File dirB = new File("c:\\\\class\\\\java\\\\file\\\\파이_디렉토리_문제\\\\동일파일\\\\MusicB");

		String[] listA = dirA.list();
		String[] listB = dirB.list();


		HashSet<String> list1 = new HashSet<String>();
		HashSet<String> list2 = new HashSet<String>();

		for (String s : listA) {
			list1.add(s);
		}
		for (String s : listB) {
			list2.add(s);
		}

		list1.retainAll(list2);
		System.out.println(list1);

	}


}// Q07


/*
 q07sol2 추가 메소드
 
 // HashSet 이용 > 중복값
		// 1. 수업 중 기능 사용
		// 2. 안 배운 기능도 추가 사용

		// set > 집합 > 교집합, 합집합, 차집합
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();

		set1.add("빨강");
		set1.add("주황");
		set1.add("노랑");
		set1.add("파랑");
		set1.add("검정");

		set2.add("빨강"); // 중복
		set2.add("주황"); // 중복
		set2.add("분홍");
		set2.add("녹색");
		set2.add("검정"); // 중복

		// set1.addAll(set2);
		// System.out.println(set1);
		// 합집합 [검정, 주황, 녹색, 빨강, 분홍, 노랑, 파랑]

		// set1.retainAll(set2);
		// System.out.println(set1);
		// 교집합 [검정, 주황, 빨강]

		set1.removeAll(set2);
		System.out.println(set1);
		// 차집합 [노랑, 파랑]

 
 
 */
