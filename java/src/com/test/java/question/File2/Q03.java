package com.test.java.question.File2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q03 {
	public static void main(String[] args) {

		/*
		3번 문제 (완료)
		요구사항  : 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		조    건 : 합격 조건: 3과목 평균 60점 이상
				 과락 조건: 1과목 40점 미만
		데 이 터  : //이름,국어,영어,수학
				    홍길동,50,60,70
				    아무개,100,80,50
				    하하하,98,48,56
		출   력  : [합격자] 
				  홍길동 
				  하하하 
				  아무개 
		
				  [불합격자] 
				  호호호 
				  후후후 
		
		0. 합격/불합격 array list 만들기
		1. buff > 1줄 읽기 > list 만들기 > 과락 메소드 확인 > 평균 확인 메소드
		2. 과락 확인 메소드 (return boolean 만들기) > 불합격 리스트 추가
		3. 평균 확인 메소드 > 합격 리스트
		4. 출력
		
		*/

		finalCheck();


	} // main


	private static void finalCheck() {


		try {


			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\성적.dat"));

			String line = null;

			// 중복 없애기 > HashSet
			HashSet<String> passList = new HashSet<String>();
			HashSet<String> failList = new HashSet<String>();


			while ((line = reader.readLine()) != null) {


				// , 스플릿 > 점수 int 리스트로 만들기
				String[] scoreList = line.split(",");
				ArrayList<String> list = new ArrayList<String>(Arrays.asList(scoreList));


				// 학생 이름 따로 변수로 받고 리스트에서 제거
				String studentName = list.get(0);
				list.remove(0);


				// 과락 확인
				for (int i = 0; i < list.size(); i++) {
					if (Integer.parseInt(list.get(i)) < 40) {
						failList.add(studentName);
						break;
					}
				}

				// 평균 점수 확인
				int avg = 0;

				for (int i = 0; i < list.size(); i++) {
					avg += Integer.parseInt(list.get(i));
				}

				if ((avg / 3) >= 60) {
					for (int i = 0; i < list.size(); i++) {
						passList.add(studentName);
					}
				} else {
					failList.add(studentName);
				}

			}
			reader.close();



			// 합/불 차집합 > 과락/평균 확인
			passList.removeAll(failList);
			System.out.println("[합격자]");
			System.out.println(passList);
			System.out.println("[불합격자]");
			System.out.println(failList);

			// 마지막 1줄 출력 미완성


		} catch (Exception e) {
			System.out.println("Q03.finalCheck");
			e.printStackTrace();
		}



	} // finalCheck()



}// Q03
