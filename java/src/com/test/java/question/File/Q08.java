package com.test.java.question.File;

import java.io.File;

public class Q08 {
	public static void main(String[] args) {


		/*
		요구사항 : 내용물이 있는 'delete' 폴더를 삭제하시오.
		조   건 : 재귀 메소드 사용
				 삭제된 파일과 자식 폴더 개수를 출력하시오.
		출   력 : 폴더를 삭제했습니다. 
				 삭제된 폴더는 3개이고, 파일은 6개입니다.
		*/


		q08sol();


	} // main



	private static void q08sol() {
		File dir = new File("C:\\class\\java\\file\\파일_디렉토리_문제\\폴더 삭제\\delete");
		deleteDirectory(dir);
	}

	private static void deleteDirectory(File dir) {

		// 1.
		File[] list = dir.listFiles();

		// 2.
		for (File f : list) {
			if (f.isFile()) {
				f.delete();
			}
		}

		// 3.
		for (File d : list) {
			if (d.isDirectory()) {
				deleteDirectory(d); // 재귀
			}
		}

		// 여기까지 도달 > dir 빈 폴더
		dir.delete();


	}



} // Q08
