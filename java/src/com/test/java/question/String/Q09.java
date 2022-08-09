package com.test.java.question.String;

public class Q09 {
	public static void main(String[] args) throws Exception {
		/*
		9번 문제 
		요구사항  : 금지어를 마스킹 처리 하시오.
		조건     : 금지어 : 바보, 멍청이
		입력 		: 너랑 안놀아 바보야!!
		출력     : 너랑 안놀아 **야!!
				  금지어를 1회 마스킹했습니다.
		입력 		: 그것도 모르다니 멍청이;
		출력     : 그것도 모르다니 ***;
				  금지어를 1회 마스킹했습니다.
		입력 		: 잘 생각해봐 바보 멍청이 
		출력     : 잘 생각해봐 ** ***
				  금지어를 2회 마스킹했습니다.
		 */
		// String content = "게시판에 글을 작성합니다. 바보야";
		// String word = "바보";

		// Masking : 게시판에 글을 작성합니다. **야
		// System.out.println(content.replace("바보", "**"));

		String content = "잘 생각해봐 바보 멍청이";
		String word1 = "바보";
		String word2 = "멍청이";


		for (int i = 0; i < word1.length(); i++) {
			if (content.indexOf(word1) > -1) {
				System.out.println("금지어 발견");
				// break;
			}
		}
		System.out.println("완료");

		/*
		 String[] words = {"바보", "멍청이", "메롱"};
		
		for (int i = 0; i < words.length; i++) {
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견");
				// break;
			}
		}
		System.out.println("완료");
		
		 
		 */


	}
}

//
