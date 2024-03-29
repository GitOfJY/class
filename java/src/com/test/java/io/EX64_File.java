package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EX64_File {
	public static void main(String[] args) {



		// m1();
		// m2();
		// m3();
		m4();

	}// main


	private static void m4() {

		ArrayList<User> list = new ArrayList<User>();

		// 매개변수 전달 방식
		// 값형 > call by value
		// 참조형 > call by reference
		load(list);

		for (User u : list) {
			System.out.printf("%s.%s(%d세)\n", u.getNo(), u.getName(), u.getAge());
		}

		System.out.println();



		// 데이터 수정
		// - 나이가 많은 사람을 표시
		// - 홍길동 > 홍길동(*)

		for (User u : list) {
			if (u.getAge() >= 22) {
				System.out.printf("%s.%s(%d세)\n", u.getNo(), u.getName(), u.getAge());
			}
		}


		for (User u : list) {
			if (u.getAge() >= 22) {
				u.setName(u.getName() + "(*)");
			}
		}

		// System.out.println(list);

		// 대이터 삭제 > 컬렉션 삭제
		list.remove(2);

		// 메모리(배열) > 텍스트 파일 반영 > 덮어쓰기
		save(list);



	}



	private static void save(ArrayList<User> list) {

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.MEMBER));

			// User 1개 > 1,홍길동,20 > writer.write()

			for (User u : list) {

				writer.write(String.format("%s,%s,%d\n", u.getNo(), u.getName(), u.getAge()));
			}

			writer.close();



		} catch (Exception e) {
			System.out.println("EX64_File.save");
			e.printStackTrace();
		}

	}


	private static void load(ArrayList<User> list) {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.MEMBER));
			String line = null;
			while ((line = reader.readLine()) != null) {

				// 1,홍길동,20
				String[] temp = line.split(",");

				// 텍스트 파일 1줄 > User 객체 1개
				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]));
				list.add(user);


			}

		} catch (Exception e) {
			System.out.println("EX64_File.load");
			e.printStackTrace();
		}

	} // load


	private static void m3() {

		// 파일 읽기
		try {

			// 데이터 파일 구조 > Scheme(스키마)

			// CSV
			// 번호,이름,나이
			// 1,홍길동,20


			BufferedReader reader = new BufferedReader(new FileReader(Data.MEMBER));

			String line = null;

			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] temp = line.split(",");
				System.out.printf("%s. %s(%s세)\n", temp[0], temp[1], temp[2]);
			}

			reader.close();

			// 22세 이상 목록 다시 출력
			// System.out.println(reader.readLine());


			// 스트림 객체 다시 생성 > 생성 직후 커서는 BOF에 위치
			reader = new BufferedReader(new FileReader(Data.MEMBER));


			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] temp = line.split(",");

				if (Integer.parseInt(temp[2]) >= 22) {
					System.out.printf("%s. %s(%s세)\n", temp[0], temp[1], temp[2]);

				}



			}

			reader.close();


		} catch (Exception e) {
			System.out.println("EX64_File.m3");
			e.printStackTrace();
		}



	}



	private static void m2() {

		// 파일 수정
		// 1. 기존 내용을 출력한다. > 읽기
		// 2. 내용의 일부를 수정한다.
		// 3. 저장한다.


		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.EDIT));
			System.out.println("[현재 내용]");
			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}


			reader.close();

			Scanner scan = new Scanner(System.in);
			System.out.println("[수정 내용]");
			String input = scan.nextLine();



			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.EDIT));
			writer.write(input);

			writer.close();

			System.out.println("수정완료");

		} catch (Exception e) {
			System.out.println("EX64_File.m2");
			e.printStackTrace();
		}



	}



	private static void m1() {

		// 읽고 쓰는 파일의 위치
		// 1. 프로젝트 폴더 외부
		// 2. 프로젝트 폴더 내부
		// - 관리 용이
		// - 프로젝트 위치 이동 > 파일 같이 이동

		try {

			/*
			
			콘솔 명령어
			
			C:\\Users\\user> _
			현재위치 > 프롬프트
			
			
			1. dir 
				- 현재 디렉토리의 목록(내용물) 보여주세요.
			2. cd
				- change directory
				- cd 자식폴더명
				- cd ..
			
			
			자원 경로 표현법
			1. 절대 경로
				- 기준점 : 절대 위치
				- ex) 홍길동, A5열에 앉아 있는 사람
				- C;\class\java\data.txt
				
			2. 상대 경로
				- 기준점 : 상대 위치
				- ex) 나, 내 앞에 앉아 있는 사람
				- .\data.txt
				- .\file\member.txt
			
			*/



			File file = new File("data\\data.txt"); // 현재 폴더 > 상대 경로
			// File file = new File(".\\data\\data.txt");


			System.out.println(file.getAbsolutePath());
			// C:\class\java\JavaTest\. > 절대경로
			System.out.println(file.getPath());
			// . > 상대경로, File 생성때 표현을 그대로 반환


			// 파일 수정하기
			// - 파일 입출력에는 수정이라는 행동이 없다.
			// - 덮어쓰기로 구현한다.



			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.write("테스트");
			writer.close();
			System.out.println("종료");

		} catch (Exception e) {
			System.out.println("EX64_File.m1");
			e.printStackTrace();
		}



	} // m1()



}// EX64_File



class User {

	// 번호, 이름, 나이
	// 1, 홍길동, 20

	private String no;
	private String name;
	private int age;

	public User(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;



	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



} // User
