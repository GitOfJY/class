package com.test.java.question.File;

import java.io.File;

public class Q10 {
	public static void main(String[] args) {

		/*
		 요구사항 : 아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
		 조   건 : 1차 : 직원 이름으로 폴더 생성
				  2차 : 년도별로 폴더 생성
				  3차 : 각 파일을 직원 > 년도 폴더에 이동 
		 출   력 : 분류가 완료되었습니다.
		 */

		q10();

	}// main



	private static void q10() {
		File dir = new File("C:\\Users\\user\\Desktop\\파일_디렉토리_문제\\직원");
		File[] list = dir.listFiles();

		for (File file : list) {
			if (file.isFile()) {
				String filename = file.getName();

				// Parsing : 의미있는 부분들을 쪼개는 작업

				filename = filename.replace("__", "_"); // 정규화
				String[] temp = filename.split("_");
				// 0 - 직원이름
				// 1 - 년도

				File newDirectory =
						new File(dir.getAbsolutePath() + "\\" + temp[0] + "\\" + temp[1]);
				newDirectory.mkdirs();

				File moveFile = new File(newDirectory.getAbsolutePath() + "\\" + file.getName());
				file.renameTo(moveFile);
				System.out.println("이동");

			}
		}



	}
}// Q10
