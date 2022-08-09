package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EX28_String {
	public static void main(String[] args) throws Exception {

		/*
		문자열, String 
		- JDK 제공하는 문자열 조작 기능
		- 문자열의 실체  
		
		문자열 메소드는 다 기억하는게 좋음 > 빈도수가 높음
		 */

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		// m14();
		// m15();

		/*
		 String
		 1. length() > 문자열 길이
		 2. charAt(index) > 문자 추출
		 3. indexOf(search, index), lastIndexOf 
		 4. trim() > 공백제거
		 5. toUpperCase(), toLowerCase() > 대소문자 변환
		 6. startsWith(word), endsWith(word) > 패턴검색
		 7. substring(begin, end) > 문자열 추출
		 8. contains(word) > 문자열 검색
		 9. replace(old, new) > 문자열 치환
		 */

	}// main


	private static void m15() {

		// 문자열 분리
		// - String[] split(String delimiter)
		// - 문자열을 구분자를 기준으로 쪼개는 메소드

		String name = "홍길동,아무개,하하하,강호동,유재석";
		String[] list = name.split(","); // 구분자는 사라진다.

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		String[] list1 = name.split("무개");

		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}


		String txt = "홍길동입니다.";
		char[] clist = txt.toCharArray();
		System.out.println(Arrays.toString(clist));

		char[] clist2 = new char[txt.length()];
		for (int i = 0; i < clist2.length; i++) {
			clist2[i] = txt.charAt(i);
		}
		System.out.println(Arrays.toString(clist2));

	}


	private static void m14() {

		// 문자열 치환(바꾸기)
		// - String replace(String old, String new)
		// - 문자열의 일부를 다른 문자열로 교체하는 메소드

		String txt = "안녕하세요. 홍길동입니다. 저를 홍길동이라고 부르세요.";
		System.out.println(txt.replace("홍길동", "아무개"));
		// 안녕하세요. 아무개입니다. 저를 아무개이라고 부르세요.

		String content = "게시판에 글을 작성합니다. 바보야";
		String word = "바보";

		// Masking : 게시판에 글을 작성합니다. **야
		System.out.println(content.replace("바보", "**"));

		txt = "     하나     둘     셋     ";
		System.out.printf("[%s]\n", txt); // [ 하나 둘 셋 ]
		System.out.printf("[%s]\n", txt.trim()); // [하나 둘 셋]
		System.out.printf("[%s]\n", txt.replace(" ", "")); // [하나둘셋]

		// replace로 무언가를 제거하고 싶으면 ""(빈문자열)로 교체하면 된다.
		System.out.printf("[%s]\n", txt.replace("하나", "")); // [ 둘 셋 ]

	}



	private static void m13() {

		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.contains("홍길동")); // true
		System.out.println(txt.contains("아무개")); // false

		System.out.println(txt.indexOf("홍길동") > -1);
		System.out.println(txt.indexOf("아무개") > -1);
	}



	private static void m12() {

		// 문자열 추출
		// - String substring(int beginIndex, int ednIndex)
		// - String substring(int beginIndex)
		// - beginIndex : 포함(inclusive)
		// - endIndex : 미포함(exclusive)

		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3, 7)); // 라마바사
		System.out.println(txt.substring(5, 6));
		// "바" > 자료형 > String > 보통 사용
		System.out.println(txt.charAt(5));
		// '바' > 자료형 > char > 문자 코드값이 필요할 때

		// 정형화된 데이터
		String jumin = "950322-2014785";

		// 성별
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");

		// 몇년생?
		System.out.println(jumin.charAt(0) + jumin.charAt(1)); // 110 > char'9'(57) + char'5'(53)
																// int(문자코드 값 합)
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); // 95 > 문자코드 값 합 방지
		System.out.println(jumin.substring(0, 2)); // 95

		// 몇월생?
		System.out.println(jumin.substring(2, 4));

		// 몇일생?
		System.out.println(jumin.substring(4, 6));


		// 파일경로
		String path = "C:\\class\\JavaTest\\Hello.java";
		// 1.파일명 추출 : Hello.java
		int index = path.lastIndexOf("\\"); // 22
		System.out.println(index); // 17
		String filename = path.substring(index + 1);
		// String filename = path.substring(index + 1, path.length());
		System.out.println(filename); // Hello.java

		// 2. Hello.java
		// > 확장자 없는 파일명 추출 > Hello
		// 파일명에 Hel.lo.java "." 사용할 수 있음 > lastIndexOf 사용
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension); // Hello

		// 3. 확장자만 추출
		String extension = filename.substring(index);
		System.out.println(extension); // .java


	}



	private static void m11() {

		// 왼쪽 -> 오른쪽 검색
		// - int indexOf(char)
		// - int indexOf(String)
		// - int indexOf(char, int)
		// - int indexOf(String, int)

		// 오른쪽 -> 왼쪽 검색 (찾는 방향이 다름)
		// - int lastIndexOf(char)
		// - int lastIndexOf(String)
		// - int lastIndexOf(char, int)
		// - int lastIndexOf(String, int)

		String txt = "홍길동 자바 공부 홍길동";
		System.out.println(txt.indexOf("홍길동")); // 0
		System.out.println(txt.indexOf("홍길동", 0 + 3)); // 10
		System.out.println(txt.lastIndexOf("홍길동")); // 10
		System.out.println(txt.lastIndexOf("홍길동", 9)); // 0

	}


	private static void m10() {

		// 패턴 검색
		// - boolean startsWith(String word)
		// - boolean endsWith(String word)

		String txt = "자바 오라클 프로그래밍";
		System.out.println(txt.startsWith("자바")); // true
		System.out.println(txt.startsWith("오라클")); // false

		String name = "홍길동";
		System.out.println(name.startsWith("홍")); // true
		System.out.println(name.charAt(0) == '홍'); // true
		System.out.println(name.indexOf('홍') == 0); // true
		System.out.println();

		System.out.println(txt.endsWith("프로그래밍")); // true
		System.out.println(txt.endsWith("밍")); // true

		System.out.println(name.endsWith("동")); // true
		System.out.println(name.endsWith("석")); // false
		System.out.println(name.charAt(name.length() - 1) == '동'); // true
		System.out.println(name.indexOf('동') == name.length() - 1); // true
		System.out.println();


		// 파일 경로(파일명)
		String path = "C:\\class\\java\\JavaTest\\EX28_String.java";

		// 해당 경로의 파일이 자바 소스파일입니까? > 확장자(파일 이름 마지막 .뒤에있는 키워드) 검사
		if (path.endsWith(".java")) {
			System.out.println("자바입니다.");
		} else {
			System.out.println("자바가 아닙니다.");
		}

		String img = "dog.jpg";
		// img = img.toLowerCase();
		// 별로 추천하지 않은 방법 > 아래 조건에 사용되는 목적 이외에 영구적으로 반환
		// 원본을 훼손하는 행동

		// 해당 파일이 이미지 파일입니까? >jpg, jpeg, gif, png
		if (img.endsWith(".jpg") || img.endsWith("gif") || img.endsWith("png")) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("다른 종류 파일");
		}

		// 대소문자 구분 없애기 > 모두 소문자로 바꿈
		if (img.toLowerCase().endsWith(".jpg") || img.toLowerCase().endsWith("gif")
				|| img.toLowerCase().endsWith("png")) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("다른 종류 파일");
		}


	}



	private static void m9() {

		// 문자열 대소문자 변경 기능
		// - String toUpperCase() > 문자열의 모든 문자를 대문자로 변경
		// - String toLowerCase() > 문자열의 모든 문자를 소문자로 변경

		String content = "오늘 수업하는 과목은 Java입니다.";
		String word = "java";

		// System.out.println(content.toUpperCase());
		// 오늘 수업하는 과목은 JAVA입니다.
		// System.out.println(word.toUpperCase());
		// JAVA


		// 대소문자 구분(Case Sensitive)
		// - 정확도 높음
		// - 검색률 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 있음");
		} else {
			System.out.println("결과 없음");
		} // 결과없음



		// 대문자 구분 안함 (Case insensitive)
		// - 검색율 높음
		// - 정확도 낮음
		// 메소드 체인
		// - 코딩 패턴 중 하나 > 패턴 > 패러다임 > 함수형 프로그래밍
		// - 문자열.메소드().메소드().메소드()
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 있음");
		} else {
			System.out.println("결과 없음");
		} // 결과있음



	} // m9



	private static void m8() {

		// 게시판 글쓰기 > 금지어

		String word = "바보";
		String content = "안녕하세요. 멍청이야, 저는 자바를 배우는 바보학생입니다. 메롱"; // 사용자 입력

		/*
		if (content.indexOf(word) > -1) {
			// 금지어를 발견
			System.out.println("금지어 발견");
		} else {
			System.out.println("글쓰기 진행");
		}*/


		// TODO 이 부분 이해가 안감, 다시 확인하기 (2022. 3. 23. 오후 5:11:09)
		String[] words = {"바보", "멍청이", "메롱"};

		for (int i = 0; i < words.length; i++) {
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견");
				// break;
			}
		}
		System.out.println("완료");


		// 주민등록번호 '-'
		String jumin = "950501-2012541";


		if (jumin.charAt(6) == '-') {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}


		if (jumin.indexOf('-') == 6) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}


	}// m8



	private static void m7() {

		// 문자열 검색 (******)
		// - 문자열내에서 원하는 문자(열)을 검색 > 발견한 위치(index) 반환
		// - 처음 만난 검색의 위치를 반환한 뒤 종료 (뒤에 반복되는 검색어는 검색 안함)
		// - int indexOf(char c)
		// - int indesOf(String s)
		// - int indesOf(char c, int beginIndex)
		// - int indesOf(String s, int beginIndex)

		String txt = "안녕하세요. 홍길동입니다.";

		int index = -1;
		index = txt.indexOf('하');
		System.out.println(index); // 2

		index = txt.indexOf('홍');
		System.out.println(index); // 7

		index = txt.indexOf('강');
		System.out.println(index); // -1

		index = txt.indexOf("홍길동");
		System.out.println(index); // 7 > 첫번째 문자의 위치 반환

		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 네 홍길동입니다.";

		index = txt.indexOf("홍길동");
		System.out.println(index); // 7, 첫번째 홍길동

		// index = txt.indexOf("홍길동", 10);
		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // 22, 두번째 홍길동

		// index = txt.indexOf("홍길동", 25);
		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // 32, 세번째 홍길동



	}



	private static void m6() {

		// 문자열 공백 제거
		// - String trim()
		// - 문자열에 존재하는 공백(Whitespace) > 엔터, 스페이스, 탭, 개행을 제거하는 메소드
		// - 문자열의 시작과 끝에 존재하는 공백 문자를 제거한다.
		// - 불필요하거나 사용자 실수로 생긴 공백 제거

		String txt = "     하나     둘     셋    ";
		System.out.printf("[%s]\n", txt); // [ 하나 둘 셋 ]
		System.out.printf("[%s]\n", txt.trim()); // [하나 둘 셋]

	}



	private static void m5() {
		// 951005-1021457
		// - 중간에 '-' 반드시 입력

		String jumin = "951005-1021457";
		if (isValidJumin(jumin)) {
			System.out.println("올바른 주민번호");

			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}

		} else {
			System.out.println("올바르지 않은 주민번호");
		}

	}



	private static boolean isValidJumin(String jumin) {
		if (jumin.charAt(6) == '-') {
			return true;
		} else {
			return false;
		}

	}



	private static void m4() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 회원가입
		// - 이름 입력 > 길이(2~5자) + 한글만 가능

		System.out.print("이름 : ");
		String name = reader.readLine();

		if (isValid(name)) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("올바르지 않은 이름");
		}

	}



	private static boolean isValid(String name) {
		// 올바르지 않은 것 찾기 > 검사가 따로따로 있음
		if (name.length() < 2 || name.length() > 5) { // 1. 첫번째 검사
			return false;
		}

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c < '가' || c > '힣') { // 2. 두번째 검사
				return false;
			}
		}

		return true;



	}

	private static boolean isValid2(String name) {
		// 올바른 것 찾기

		// 코드 위상 > 들여쓰기 증가

		// 길이검사
		if (name.length() >= 2 && name.length() <= 5) {

			// 한글검사
			for (int i = 0; i < name.length(); i++) {
				char c = name.charAt(i);

				if (c >= '가' && c <= '힣') {
					// return true; > 1글자만 확인 후 검사 끝
					// 올바르지 않은 것을 찾아야하는데 올바른 것을 찾았을 때 가독성 떨어짐
				} else {
					return false;
				}
			}
			return true; // 입력 문자 모두가 한글인게 확인된 위치
		} else {
			return false;
		}

	}



	private static void m3() throws Exception {

		// 아이디 입력 > 올바른 아이디 검사
		// - 영어 소문자로만 구성
		// 잘못된 것을 찾는것이 좋은 알고리즘

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아이디 입력 : ");
		String id = reader.readLine();
		for (int i = 0; i < id.length(); i++) {

			char c = id.charAt(i);
			// 굳이 숫자로 안 바꿔도 문자 코드값 비교 가능
			if (c < 'a' || c > 'z') {
				// 영어소문자가 아니냐?
				System.out.println("잘못된 문자가 발견되었습니다.");
				break;
			}
		}

		System.out.println("종료");


		/*
		String a = "A";
		char b = 'A';
		System.out.println((int)a); > 불가능, 값형과 참조형 형변환 불가능 
		System.out.println((int)b); > 가능, 값형 끼리라 형변환 가능
		*/
	}



	private static void m2() {

		// 문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메소드
		// - zero-based Index

		String txt = "안녕하세요. 홍길동입니다.";

		char c = txt.charAt(3);
		System.out.println(c); // 세 출력
		c = txt.charAt(7);
		System.out.println(c); // 홍 출력
		c = txt.charAt(13);
		System.out.println(c);

		// c = txt.charAt(14);
		// StringIndexOutOfBoundsException > 문자열에서 첨자가 벗어났다.
		// System.out.println(c);

		// 마지막 문자
		c = txt.charAt(txt.length() - 1);
		System.out.println(c);

	}



	private static void m1() throws Exception {

		// 문자열(String) <=> 문자(char)
		// 문자열 = 문자의 집합

		// 문자열 없는 언어 > 문자 배열 > String == char[]
		// 문자열 조작 기능 == 배열 조작 기능 유사

		// 문자열 길이
		// - 문자열을 구성하는 문자의 개수(글자수)
		// - int length()

		int[] nums = {10, 20, 30};
		System.out.println(nums.length); // 프로퍼티(변수)

		String str = "홍길동입니다.";
		System.out.println(str.length()); // 메소드

		char[] clist = {'홍', '길', '동', '입', '니', '다', '.'};
		System.out.println(clist.length);

		System.out.println("아무개입니다.".length());
		System.out.println("English, 한글, 123, !@#".length());

		// 요구사항 : 사용자 입력 > 문자수?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장 입력 : ");
		String statement = reader.readLine();

		System.out.printf("입력한 문장은 %d개의 문자로 구성되었습니다.\n", statement.length());


		// 유효성검사
		// - 이름 입력
		// - 2~5자 이내
		if (statement.length() >= 2 && statement.length() <= 5) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름은 2자~5자 이내 입력");
		}


	}// m1


}// class
