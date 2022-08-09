package com.test.java.question.File2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {

		/*
		4번 문제 (완료)
		요구 사항 : 이름을 입력받아 회원 정보를 검색 후 출력하시오.
		입력     : 이름: 홍길동
		출력     : [홍길동] 
				  번호: 33 
				  주소: 서울시 강남구 역삼동 
				  전화: 010-2345-6789 
		*/

		printInfo();

	}// main

	private static void printInfo() {

		try {


			// 입력받기
			Scanner scan = new Scanner(System.in);
			System.out.print("이름:");
			String inputName = scan.nextLine();


			// 파일 읽기
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\0405과제\\파일_입출력_문제\\단일검색.dat"));


			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] scoreList = line.split(",");
				ArrayList<String> list = new ArrayList<String>(Arrays.asList(scoreList));

				if (list.get(1).equals(inputName)) {
					System.out.println("[" + list.get(1) + "]");
					System.out.printf("번호: %s \n", list.get(0));
					System.out.printf("주소: %s \n", list.get(2));
					System.out.printf("전화: %s \n", list.get(3));
				}
			}
			reader.close();



		} catch (Exception e) {
			System.out.println("Q04.printInfo");
			e.printStackTrace();
		}
	}



}// Q04
