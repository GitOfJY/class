package com.test.java.question.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) {
		/*
		 요구사항 : 지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		 조   건 : D:\class\java\file\AAA\test.txt → D:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		          BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		 입   력 : 파일 이동을 실행합니다.
				  같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 
		 출   력 : y. 파일을 덮어썼습니다.
				  */



	}// main


	private static void moveFolder() throws Exception {

		// 폴더 이동
		File dir = new File("D:\\class\\java\\file\\AAA\\test.txt");
		File dir2 = new File("D:\\class\\java\\file\\BBB\\test.txt");
		System.out.println("파일 이동을 실행합니다.");


		boolean result = dir.renameTo(dir2);
		if (result) {
			System.out.println("완료했습니다.");
		} else {
			System.out.println("같은 이름을 가지는 파일이 이미 존재합니다.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("덮어쓸까요?(y/n)");
			String input = reader.readLine();

			if (input.equals("y")) {
				// 덮어쓰기 > 파일 삭제 > 새파일 생성하기? > 이렇게 풀어보기
				// 덮어쓰기 > 그냥 renameto? 이름+내용 다 바뀜
			} else if (input.equals("n")) {

			}
		}



	} // m11()

}// Q03
