package com.test.java.question.File2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Q01 {
	public static void main(String[] args) {

		/* 
		1번 문제
		요구사항 : 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오. 
		조   건 : '유재석' → '메뚜기'
				  저장할 파일명: 이름수정_변환.dat
		출   력 : 변환 후 다른 이름으로 저장하였습니다.
		*/

		changeName();

	}// main


	private static void changeName() {

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\이름수정.dat"));

			String line = null;

			while ((line = reader.readLine()) != null) {
				if (line.contains("유재석")) {
					line = line.replace("유재석", "메뚜기");
					// 교체 후 파일에서는 왜 안바뀌는거지?

					// write 해야함
				}
			}
			System.out.println(line);
			reader.close();



		} catch (

		Exception e) {
			System.out.println("Q01");
			e.printStackTrace();
		}



		// changeFname();

		System.out.println("변환 후 다른 이름으로 저장하였습니다.");



	} // changeName()



	private static void changeFname() {

		File file = new File("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\이름수정.dat");
		File file2 = new File("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\이름수정_변환.dat");

		if (file.exists()) {
			boolean result = file.renameTo(file2);
			System.out.println(result);
		}
	} // chaneFname();



}// Q01


