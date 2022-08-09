package com.test.java.question.File;

import java.io.File;
import java.util.ArrayList;

public class Q09 {
	public static void main(String[] args) {

		/*
		요구사항 : 폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
		조   건 : 자식 폴더내의 파일도 모두 검색하시오.
				 부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
		출   력 : [파일명]      [크기]     [파일이 들어있는 폴더]
				  aaa.exe    57KB    AAA 
				  bbb.exe    50KB    BBB 
				  ccc.dat    41KB    AAA 
				  ddd.txt    20KB    CCC 
				   ..
		*/


		q09();



	}// main



	private static void q09() {
		File dir = new File("C:\\Users\\user\\Desktop\\파일_디렉토리_문제\\파일 제거");
		ArrayList flist = new ArrayList<File>();
		
		
		searchFile(dir, flist);
		
		//크기순 정렬 > 버블정렬 이용
		for (int i=0; i<flist.size()-1; i++) {
			for (int j=0; j<flist.size()-i-1; j++) {
				if (flist.get(j).length() < flist.get(j+1).length())
				{File temp = flist.get(j);
				flist.set(j,flist.get(j+1);
				flist.set(j+1, temp);
						}
			}
		}
		
		for (File f : flist) {
			System.out.printf(f.getParent() + ">" + f.getName());
		}

	} // q09()

	private static void searchFile(File dir, ArrayList<File> flist) {
		File[] list = dir.listFiles();

		for (File f : list) {
			if (f.isFile()) {
				flist.add(f);
			}
		}

		for (File d : list) {
			if (d.isDirectory()) {
				searchFile(d, flist);
			}
		}
	}



}// Q09
