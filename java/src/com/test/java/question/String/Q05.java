package com.test.java.question.String;

public class Q05 {
	public static void main(String[] args) {


		/*
		5번 문제 (완료)
		요구사항  : 특정 단어가 문장내에 몇회 있어있는지 수를 세시오.
		조건     : 대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
				  검색 문자열: String word = "길동";
		출력     : '길동'을 총 2회 발견했습니다.
		 */

		String word = "길동";
		String content = "안녕~ 길동아~ 잘가~ 길동아~";


		int count = 0;


		if (content.indexOf(word) > -1) {
			count += 1; // 첫번째 길동 발견
			int num = content.indexOf(word);
			int finalNum = content.lastIndexOf(word);

			for (int i = 0; num < finalNum; i++) {
				if (num > -1) {
					count += 1;
					num = content.indexOf("길동", num + 2) + 2;
				} else {
					break;
				}
			}
		}

		System.out.printf("'길동'을 총 %d회 발견했습니다.", count);
	}
}

// replace 길동 > 특수 문자 > 특수문자 count
// replace 사용 > 전체 문장 알아서 바꿔줌


