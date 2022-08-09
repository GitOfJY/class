package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {
		/* 
		7번 문제 (완료)
		요구사항 : 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		조건    : 대문자와 소문자의 문자 코드값의 관계
		입력    : 문자 입력 : a
		출력    : 소문자 'a'의 대문자는 'A'입니다.
		입력    : 문자 입력 : g
		출력    : 소문자 'g'의 대문자는 'G'입니다.		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		String input1 = reader.readLine();	
		char small_arphabet = input1.charAt(0);
		int num_big_arphabet = (int)small_arphabet - 32;
		char big_arphabet = (char)num_big_arphabet;
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다. \n", small_arphabet, big_arphabet);
		
		System.out.print("문자 입력 : ");
		String input2 = reader.readLine(); //뒤에 바로 .charAt(0) 사용 가능
		char small_arphabet2 = input2.charAt(0);
		int num_big_arphabet2 = (int)small_arphabet2 - 32; //바로 라이브러리 사용 toLowCase
		char big_arphabet2 = (char)num_big_arphabet2;
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다. \n", small_arphabet2, big_arphabet2);
	}   //int로하고 마지막에 %c로 바꾸기
}

/*
 코딩 바로 시작 (x)
 무조건 설계 먼저하기. -> 문제를 풀기 위한 프로세스(넘버링)
 1. 라벨을 출력한다. > "소문자 입력 : "
 2. BufferdReader 생성한다. > throws Exception 적는다.
 3. 소문자를 입력받는다. > reader.readLine()
 4. 3의 반환값(문자열)을 받아서 char형으로 바꾼다. 입력값.charAt(0)
 5. 4의 char의 문자코드값을 얻는다. > 형변환
 6. 5의 문자 코드값에서 -32 > 대문자의 문자 코드값
 7. 6의 문자 코드값을 char 형변환한다. > casting 연산자 이용
 8. 콘솔에 "소문자 'a'의 대문자는 "A"입니다." 출력한다.
 "a" -> 'a' -> 97 -> "A"
 
 
 코드 작성 > Rework 검색 > help > market > Quick Search 설치
 control + shift + l > qucik search 단축기 > 확인
 [summary] 값형 형변환 = [summary] * 형변환 = [s* * 형변환 > * 활용해서 검색하기
 
 
 사용자 정의 태그(test tag) > 프로젝트 > 팀원끼리 약속
 window > preference > tag 검색 
 TODO  나중에 해야할 일 > 기능 개선, 일부 수정작업 등 기타 모든 일
 FIXME 나중에 수정할 내용(버그 발생)
 XXX   나머지

 문제풀이 다음날 : 코드리뷰
  - 코드 리뷰 : 작성된 코드를 리뷰
  - 목적
    1. 자신의 코드 상태 > 명확하게 인지
    2. 다른 사람의 코드 상태 > 
  - 형태
    1. 상급자 > 하급자 리뷰 > 검사
    2. 동급자 > 브레인스토밍
    3. 상급자 + 하급자 > 브레인스토밍
  - 방식 
  - 산출물 > 코드리뷰 > 제출
 */

