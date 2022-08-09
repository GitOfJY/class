package com.test.java.question.String;

public class Q08 {
	public static void main(String[] args) throws Exception {


		/*
		8번 문제 
		요구사항  : 영단어를 입력받아 분리하시오.
		조건     : 합성어를 입력한다.
				  합성어는 파스칼 표기법으로 입력한다.
				  출력은 각 단어를 공백으로 구분한다.
		입력 		: 단어: StudentName
		출력     : 결과: Student Name
		
		아스키코드로 대문자 찾기 > 공백 붙이고 입력
		뭔가 이상한데 모르겠음
		
		*/

		String inputWord = "StudentName";
		String[] words = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
				"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		System.out.println(inputWord.indexOf(words[0]));
		System.out.println(inputWord.indexOf(words[1]));

		for (int i = 0; i < 26; i++) {
			if (inputWord.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견");
				break;
			} else {
				System.out.println("금지어 못 발견");
			}
		}



	} // main

} // class

// char배열 변환 > 새로운 배열선언 > 대문자인지 아닌지 > 스트링+공백추가
// 첫문자가 대문자일때 문제
// 다른 방법 있음
