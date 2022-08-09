package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	/*
	3번 문제 (완료)
	요구사항  : 문자 1개를 입력받아 아래와 같이 출력하시오.
	조건	    : f, F → Father
			  m, M → Mother
			  s, S → Sister
			  b, B → Brother
			  유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
	입력     : 문자 : f 
	출력     : Father
	입력     : 문자 : F 
	출력     : Father
	입력     : 문자 : s 
	출력     : Sister
	입력     : 문자 : a
	출력     : 입력한 문자가 올바르지 않습니다.
	
	어쩔수없이 if 따로 4개 받기, 스트링으로 해보고 안되면 int로 하기
	
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String alphabet = reader.readLine();

		if (alphabet.equals("s") || alphabet.equals("S")) {
			System.out.println("Sister");
		} else if (alphabet.equals("f") || alphabet.equals("F")) {
			System.out.println("Father");
		} else if (alphabet.equals("m") || alphabet.equals("M")) {
			System.out.println("Mother");
		} else if (alphabet.equals("b") || alphabet.equals("B")) {
			System.out.println("Brother");
		} else {
			System.out.println("'s', 'S', 'f', 'F', 'm', 'M', 'b', 'B' 중에서 입력해주세요.");
		}



		/*
		int numAlphabet = alphabet.charAt(0);
		// s=115, S=83, b=98, B=66, m=109, M=77, f=102, F=70
		
		if (numAlphabet == 115) {
			System.out.println("Sister");
		} else if (numAlphabet == 83) {
			System.out.println("Sister");
		} else if (numAlphabet == 98) {
			System.out.println("Brother");
		} else if (numAlphabet == 66) {
			System.out.println("Brother");
		} else if (numAlphabet == 109) {
			System.out.println("Mother");
		} else if (numAlphabet == 77) {
			System.out.println("Mother");
		} else if (numAlphabet == 102) {
			System.out.println("Father");
		} else if (numAlphabet == 70) {
			System.out.println("Father");
		} else {
			System.out.println("'s', 'S', 'f', 'F', 'm', 'M', 'b', 'B' 중에서 입력해주세요.");
		}
		
		
		// string으로 받아서 (alphabet == "f") 이런식으로 확인 가능한지?
		// ()안에 &&로 연결하면 true/false가 아니라 불가능한건가? 컴파일 오류는 안뜨는데 오작동
		
		
		if (alphabet == "f" && alphabet == "F" && alphabet == "s" && alphabet == "S"
				&& alphabet == "m" && alphabet == "M" && alphabet == "b" && alphabet == "B") {
			if (alphabet == "f") {
				System.out.println("Father");
			} else if (alphabet == "F") {
				System.out.println("Father");
			}
			if (alphabet == "s") {
				System.out.println("Sister");
			} else if (alphabet == "S") {
				System.out.println("Sister");
			}
			if (alphabet == "m") {
				System.out.println("Mother");
			} else if (alphabet == "M") {
				System.out.println("Mother");
			}
			if (alphabet == "b") {
				System.out.println("Brother");
			} else if (alphabet == "B") {
				System.out.println("Brother");
			}
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		
				if (alphabet == "f" && alphabet == "F" && alphabet == "s" && alphabet == "S"
						&& alphabet == "m" && alphabet == "M" && alphabet == "b" && alphabet == "B") {
					if (alphabet == "f" || alphabet == "F") {
						System.out.println("Father");
					} else if (alphabet == "m" || alphabet == "M") {
						System.out.println("Mother");
					} else if (alphabet == "s" || alphabet == "s") {
						System.out.println("Sister");
					} else if (alphabet == "b" || alphabet == "B") {
						System.out.println("Brother");
					}
				} else {
					System.out.println("입력한 문자가 올바르지 않습니다."); } }
				*/

	}
}
