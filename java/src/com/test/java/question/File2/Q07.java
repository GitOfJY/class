package com.test.java.question.File2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {
	public static void main(String[] args) {

		/*
		 요구사항 : 직원들의 지각과 조퇴를 카운트하시오.
		 조건    : 출근 : 오전 9시
				  퇴근 : 오후 6시
		 출력    : [이름]    [지각]    [조퇴] 
				  홍길동      4회       0회 
				  아무개      0회       0회 
				  하하하      2회       3회 
				  
				  
				  1. 파일 읽고 , 기준으로 나누기
				  2. 메소드 지각 체크
				  2. 메소드 조퇴 체크
				  3. 프린트
				  
		 */

		timeCheck();


	}// main


	private static void timeCheck() {


		try {


			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\출결.dat"));

			String line = null;

			while ((line = reader.readLine()) != null) {


				// , 스플릿 리스트로 만들기
				String[] peopleList = line.split(",");
				ArrayList<String> totalList = new ArrayList<String>(Arrays.asList(peopleList));


				// 이름 > 이 이름만 모으기 > HashSet 인데 왜 중복제거 안돼
				// HashSet<String> personalList = new HashSet<String>();
				// personalList.add(totalList.get(1));
				// System.out.println(personalList);

				ArrayList<String> personalList = new ArrayList<String>();
				personalList.add(totalList.get(1));
				System.out.println(personalList);

				// 지각, 조퇴 횟수
				int lateNum = 0;
				int outNum = 0;


				for (int i = 0; i < personalList.size(); i++) {


					if (totalList.get(1) == personalList.get(i)) {
					}

				}


			}

			reader.close();



		} catch (Exception e) {
			System.out.println("Q07.timeCheck");
			e.printStackTrace();
		}

	}


}// Q07


// 2018-8-8,하석게,8:16,16:13
