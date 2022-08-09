package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		/*
		6번 문제 (완료)
		요구사항  : 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		조건	    : String test(int kor, int eng, int math)
				  평균 점수 60점 이상은 '합격'이다.
				  평균 점수 60점 미만은 '불합격'이다.
				  과락: 한 과목 이상 40점 미만이면 불합격이다.
		입력     : 국어 : 80 
				  영어 : 75 
				  수학 : 60
		출력     : 합격입니다.
		입력     : 국어 : 55 
				  영어 : 35 
				  수학 : 60 
		출력     : 불합격입니다.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 :");
		String input1 = reader.readLine();
		int kor = Integer.parseInt(input1);

		System.out.print("영어 :");
		String input2 = reader.readLine();
		int eng = Integer.parseInt(input2);

		System.out.print("수학 :");
		String input3 = reader.readLine();
		int math = Integer.parseInt(input3);

		String result = test(kor, eng, math);
		System.out.println(result);


	}

	public static String test(int kor, int eng, int math) {
		int average = (kor + eng + math) / 3;
		String result =
				(kor >= 40 && eng >= 40 && math >= 40) ? average >= 60 ? "합격" : "불합격" : "과락";
		return result + "입니다.";
	}
}
