package com.test.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EX62_File {

	// 누적 변수 > 모든 메소드에서 접근 가능해짐
	private static int count = 0;


	public static void main(String[] args) {

		/*
		
		1. 파일/디렉토리 조작
			- 윈도우 탐색기로 하는 행동 > 자바로 구현
			- 파일 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기 등
			- 폴더 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기 등
		2. 파일 입출력
			- 파일 > 읽기/쓰기 
			- 텍스트 입출력
			- 메모장, 이클립스 등
		
		*/


		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		m11();
		// m12();
		// m13();
		// m14();
		// m15();
		// m16();


		// 파일(폴더) > 생성, 이름 수정, 이동, 삭제
		// 폴더 > 내용 보기 (listFiles())
		// 재귀호출(폴더 탐색) (***)



	} // main


	private static void m16() {

		// List > 순서 존재 > 루프 사용 (방번호, Iterator)
		// Set > 순서 없음 > 루프 사용 (Iterator)
		// Map > 순서 없음 > 루프 사용 X

		// Map 루프 돌리는 방법
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
		map.put("five", "다섯");

		// HashSet(Class) > Set(Interface)
		Set<String> set = map.keySet(); // HashMap의 key들로만 구성된 set
		Collection<String> values = map.values(); // value들로만 구성된 collection


		Iterator<String> iter = set.iterator();

		// 향상된 for문 구조
		while (iter.hasNext()) {
			// System.out.println(iter.next()); // 소비(stack, queue 유사)
			String key = iter.next();
			System.out.println(key + ":" + map.get(key));

		}


	} // m16



	private static void m15() {

		// 폴더의 내용 보기 + 업무 추가
		// > 특정 폴더의 모든 파일 개수 세기

		// 파일 11,645, 폴더 2,455
		// 756MB (793,422,177 바이트)


		String path = "C:\\class\\eclipse";
		File dir = new File(path);

		if (dir.exists()) {

			countFile(dir);


			System.out.printf("총 파일 개수 : %,d개 \n", count);

		}

	} // m15()



	// 넘어온 폴더의 파일 개수 누적
	private static void countFile(File dir) {
		// 1. 목록 가져오기
		File[] list = dir.listFiles();

		// 2. 파일 개수
		for (File subfile : list) {
			if (subfile.isFile()) {
				// count++; > 파일 개수
				count += subfile.length(); // 파일의 사이즈 누적
			}
		}

		// 3. 자식 폴더 대상으로 1~2번 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				// count++; > 폴더 개수
				// 1~3번 반복
				countFile(subdir); // 재귀호출
			}
		}

	}



	private static void m14() {

		// 폴더의 내용 보기 + 업무 추가
		// > 특정 폴더의 모든 파일 개수 세기

		// 파일 11,645, 폴더 2,455
		// 756MB (793,422,177 바이트)


		String path = "C:\\class\\eclipse";
		File dir = new File(path);

		int count = 0; // 누적변수

		if (dir.exists()) {
			File[] list = dir.listFiles();

			for (File subfile : list) {
				if (subfile.isFile()) {
					count++;
				}
			}

			// 자식 폴더 접근
			for (File subdir : list) {

				if (subdir.isDirectory()) {
					// 자식 폴더 내용물
					File[] sublist = subdir.listFiles();
					for (File subsubfile : sublist) {
						if (subsubfile.isFile()) {
							count++;
						}
					}

					// 자식의 자식 폴더에 접근
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							// 손자 폴더의 내용물
							File[] subsublist = subsubdir.listFiles();

							for (File subsubsubfile : subsublist) {
								if (subsubsubfile.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}
		}

		System.out.printf("총 파일 개수 : %,d개 \n", count);

	} // m14()



	private static void m13() {

		// 폴더의 내용 보기

		File dir = new File("C:\\class\\eclipse");

		// 자식 파일명 + 자식 폴더명
		if (dir.exists()) {


			// String[] list = dir.list();

			// for (String f : list) {

			// 이름 사용 > File 객체 생성 > isFile(), isDirectory()
			// System.out.println(f);

			// File file = new File(dir.getAbsolutePath() + "\\" + f);
			// System.out.println(file.isFile()); // 파일 > true, 폴더 > false
			// System.out.println();

			// 자식 파일 + 자식 폴더 > File 배열
			// 위에 방법보다 주로 사용
			// File[] list = dir.listFiles();

			// for (File f : list) {
			// System.out.println(f.isDirectory());
			// System.out.println(f.getName());
			// }


			// 탐색기 느낌 출력
			File[] list = dir.listFiles();

			for (File d : list) {
				if (d.isDirectory()) {
					System.out.printf("[%s]\n", d.getName());
				}
			}

			for (File f : list) {
				if (f.isFile()) {
					System.out.printf("%s\n", f.getName());
				}
			}
		}



	} // m13()



	private static void m12() {

		// 폴더 삭제하기
		// - 빈폴더만 삭제 가능하다. > 직접 구현
		File dir = new File("C:\\class\\java\\file\\회원");

		if (dir.exists()) {
			boolean result = dir.delete();
			System.out.println(result);
		}

	} // m12()



	private static void m11() {

		// 폴더 이동
		File dir = new File("C:\\class\\java\\file\\todo");
		File dir2 = new File("C:\\class\\java\\move\\todo");

		boolean result = dir.renameTo(dir2);
		System.out.println(result);

	} // m11()



	private static void m10() {

		// 폴더명 바꾸기
		File dir = new File("C:\\class\\java\\file\\할일");
		File dir2 = new File("C:\\class\\java\\file\\todo");

		boolean result = dir.renameTo(dir2);
		System.out.println(result);

	} // m10()



	private static void m9() {

		// 요구사항 : 할일 > 날짜별 폴더 > "2022-01-01" ~ "2022-12-31"
		Calendar c = Calendar.getInstance();
		c.set(2022, 0, 1);
		// System.out.printf("%tF", c); // 폴더이름 "2022-01-01"
		// c.add(Calendar.DATE, 1);
		// System.out.printf("%tF", c); //2022-01-02
		// System.out.println(c.getActualMaximum(Calendar.DATE)); //31
		// System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		// 올해들어 몇일째 ? > 몇일로 끝나는지 365

		for (int i = 0; i < c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			String path = String.format("%tF", c);
			File dir = new File("C:\\class\\java\\file\\할일\\" + path);
			System.out.println(dir.mkdir());
			c.add(Calendar.DATE, 1);
		}

		System.out.println("종료");

	} // m9()



	private static void m8() {

		// 요구사항 : 회원 > 회원명으로 개인 폴더 생성
		// C:\class\java\file\회원
		String[] member = {"길동", "아무개", "하하", "호호", "후후"};
		for (int i = 0; i < member.length; i++) {
			String path = String.format("C:\\class\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			File dir = new File(path);
			dir.mkdir();
			System.out.println(dir.mkdir());
		}


	} // m8()



	private static void m7() {

		// 폴더 생성하기
		// File dir = new File("C:\\class\\java\\file\\aaa");


		// if (!dir.exists()) {
		// boolean result = dir.mkdir();
		// System.out.println(result);
		// } else {
		// System.out.println("같은 이름의 폴더가 존재합니다.");
		// }


		File dir = new File("C:\\class\\java\\file\\bbb\\ccc"); // dir.mkdir() > false
		if (!dir.exists()) {
			boolean result = dir.mkdirs(); // true
			System.out.println(result);
		} else {
			System.out.println("같은 이름의 폴더가 존재합니다.");
		}


	} // m7()


	private static void m6() {

		// 파일 삭제
		File file = new File("C:\\class\\java\\file\\data.txt");

		if (file.exists()) {
			// 휴지통 > 폴더 이동, 삭제 아님
			boolean result = file.delete(); // 진짜 삭제, 복구 방법 없음
			System.out.println(result);
		}


	} // m6()



	private static void m5() {

		// 파일 이동하기
		// - file\hello.txt > move\hello.txt

		File file = new File("C:\\class\\java\\file\\hello.txt");
		File file2 = new File("C:\\class\\java\\move\\hello.txt");
		// File file2 = new File("C:\\class\\java\\move\\hi.txt");

		if (file.exists()) {
			boolean result = file.renameTo(file2);
			System.out.println(result);
		}


	} // m5()



	private static void m4() {

		// 파일명 바꾸기
		// - hello.txt > hi.txt

		File file = new File("C:\\class\\java\\file\\hello.txt");
		File file2 = new File("C:\\class\\java\\file\\hi.txt");

		if (file.exists()) {

			// file(hello.txt) > file2(hi.txt)
			boolean result = file.renameTo(file2);
			System.out.println(result);
			// 이미 동일한 이름이 있는 경우 > false

		}


	} // m4()



	private static void m3() {

		// 파일 조작 > 생성, 복사(나중에), 이동, 파일명 수정, 삭제

		// 새파일 만들기
		File file = new File("C:\\class\\java\\file\\hello.txt");

		if (!file.exists()) {
			try {
				// 동일한 파일이 존재하면 새로 만들기 실패
				System.out.println(file.createNewFile()); // true, 파일 생성

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("동일한 파일이 존재합니다.");
		}



	} // m3()



	private static void m2() {

		// 폴더 > 정보
		// - 폴더(Folder), 디렉토리(Directory)

		// 경로
		final String PATH = "C:\\class\\java\\file";

		// 디렉토리 참조 객체
		// - 디렉토리(폴더)는 파일이다.
		File dir = new File(PATH);


		if (dir.exists()) {
			System.out.println("폴더 있음");
			System.out.println(dir.getName());
			// file
			System.out.println(dir.isFile());
			// false
			System.out.println(dir.isDirectory());
			// true

			System.out.println(dir.length());
			// 0 > 폴더 크기

			System.out.println(dir.getAbsolutePath());
			// C:\class\java\file
			System.out.println(dir.getPath());
			// C:\class\java\file

			System.out.println(dir.lastModified());
			// 1649031804548
			System.out.println(dir.isHidden());
			// false
			System.out.println(dir.getParent());
			// C:\class\java


		} else {
			System.out.println("폴더 없음");
		}



	} // m2()

	private static void m1() {

		// 파일 > 정보
		// C:\class\java\file 폴더 생성
		// C:\class\java\file\data.txt 텍스트 파일 생성

		// 자바에서 외부의 파일 접근
		// 1. 외부 파일을 참조하는 참조 객체 생성 > 대리인
		// 2. 참조 객체 조작 > 외부 파일에 적용

		// 경로
		final String PATH = "C:\\class\\java\\file\\data.txt";

		// 파일 참조 객체 > java.io.File
		// - file 객체 == data.txt
		File file = new File(PATH);

		System.out.println(file.exists()); // true

		if (file.exists()) {
			System.out.println("파일 있음");

			// 정보
			System.out.println(file.getName());
			// data.txt
			System.out.println(file.isFile());
			// true
			System.out.println(file.isDirectory());
			// false

			System.out.println(file.length());
			// 20 > 파일 크기(바이트)

			System.out.println(file.getAbsolutePath());
			// C:\class\java\file\data.txt
			System.out.println(file.getPath());
			// C:\class\java\file\data.txt

			System.out.println(file.lastModified());
			// 1649031841875
			System.out.println(file.isHidden());
			// false

			// tick > 년원일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified()); // c1을 수정
			System.out.printf("%tF %tT\n", c1, c1); // 2022-04-04 09:24:01

		} else {
			System.out.println("파일 없음");
		}


	} // m1()


} // EX62
