package com.test.java.question.File;

import java.io.File;

public class Q04 {
	public static void main(String[] args) {

		/*
		요구사항 : 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
		조   건 : '001'부터 3자리 형식으로 붙이시오.
		리 소 스 : 폴더 > 음악 파일
				 파일 다운로드 
		출   력 : [001]1도 없어 - Apink (에이핑크).mp3 
			     [002]11 (Prod. 다이나믹듀오) - Wanna One (워너원) - 남바완.mp3 
			   	 [003]134340 - 방탄소년단.mp3
			 	 ..
			 	 [100]花요일 (Blooming Day) - EXO-CBX (첸백시).mp3
		 */

	}// main


	private static void changeName() {

		// 폴더명 바꾸기
		// 폴더명 뒤에 바꾸는게 모르겠음
		File dir = new File("C:\\class\\java\\file\\할일");
		File dir2 = new File("C:\\class\\java\\file\\todo");

		boolean result = dir.renameTo(dir2);
		System.out.println(result);

	} // m10()



}// Q04
