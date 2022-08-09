package com.test.java.question.File2;

import java.io.File;

public class Q02 {
	public static void main(String[] args) {

		/*
		2번 문제
		요구사항 : 숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
		조   건 : 0 → 영, 1 → 일 ... 9 → 구
				 저장할 파일명: 숫자_변환.dat
		출   력 : 변환 후 다른 이름으로 저장하였습니다.
		*/


	}// main


	private static void changeNumToKor() {

		try {



		} catch (Exception e) {
			System.out.println("Q02.changeNumToKor");
			e.printStackTrace();
		}


	} // changeNumToKor()



	private static void numToKor(String line) {
		if (line.contains("0")) {
			line = line.replace("0", "영");
		} else if (line.contains("1")) {
			line = line.replace("1", "일");
		} else if (line.contains("2")) {
			line = line.replace("2", "이");
		} else if (line.contains("3")) {
			line = line.replace("3", "삼");
		} else if (line.contains("4")) {
			line = line.replace("4", "사");
		} else if (line.contains("5")) {
			line = line.replace("5", "오");
		} else if (line.contains("6")) {
			line = line.replace("6", "육");
		} else if (line.contains("7")) {
			line = line.replace("7", "칠");
		} else if (line.contains("8")) {
			line = line.replace("8", "팔");
		} else if (line.contains("9")) {
			line = line.replace("9", "구");
		}

	} // numToKor


	private static void changeFname() {

		File file = new File("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\숫자.dat");
		File file2 = new File("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\숫자_변환.dat");

		if (file.exists()) {
			boolean result = file.renameTo(file2);
			System.out.println(result);
		}
	} // chaneFname();



}// Q02
