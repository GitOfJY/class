package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	/*
	2번 문제 (완료)
	요구사항  : 학생의 국어 점수를 입력받아 성적을 출력하시오.
	조건	    : 90 ~ 100 : A
			  80 ~  89 : B
			  70 ~  79 : C
			  60 ~  69 : D
			  0 ~   59 : F
			  유효성 검사를 하시오.(점수 : 0 ~ 100점 이내)
	입력     : 점수 : 85
	출력     : 입력한 85점은 성적 B입니다.
	입력     : 점수 : 55
	출력     : 입력한 55점은 성적 F입니다.
	입력     : 점수 : 123 
	출력     : 점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
	
	2.29 
	평년 2.28일까지 있는해
	윤년 2.29일까지 있는 해
	윤달 음력 > 간헐적 같은 달 2번 반복
	윤초? 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("점수 : ");
		int score = Integer.parseInt(reader.readLine());

		scoreGrade(score);
	}

	public static void scoreGrade(int score) {

		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				System.out.printf("입력한 %d점은 성적 A입니다.", score);
			} else if (score >= 80 && score <= 89) {
				System.out.printf("입력한 %d점은 성적 B입니다.", score);
			} else if (score >= 80 && score <= 89) {
				System.out.printf("입력한 %d점은 성적 C입니다.", score);
			} else if (score >= 70 && score <= 79) {
				System.out.printf("입력한 %d점은 성적 D입니다.", score);
			} else if (score <= 59) {
				System.out.printf("입력한 %d점은 성적 F입니다.", score);
			}
		} else {
			System.out.println("점수는 0~100사이로 입력하세요.");
		}
	}

}
