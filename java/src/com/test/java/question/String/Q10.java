package com.test.java.question.String;

public class Q10 {
	public static void main(String[] args) throws Exception {


		/*
		10번 문제 
		요구사항  : 입력받은 금액을 한글로 출력하시오.
		조건     : 입력 범위(원): 0 ~ 99,999,999
		입력 		: 금액(원): 120 
		출력     : 일금 일백이십원
		입력 		: 금액(원): 53216
		출력     : 일금 오만삼천이백일십육원
		입력 		: 금액(원): 12345678 
		출력     : 일금 일천이백 삼십사만오천 육백칠십팔원
		
		length로 3 6 9 자리로 끊기
		replace 메소드로 만들기 > 숫자를 한글로
		if문으로 a백b십c원 / d십e천f만 / g천h백
		알바벳 자리에 숫자 대입 > 숫자/한글로 변환
		
		
		 */

		String input = "12345678";


		if (input.length() > 6) {
		} else if (input.length() <= 6 && input.length() > 3) {

		} else {

		}

	} // main

	public static String numToKor(String result) {
		result = result.replace("1", "일");
		result = result.replace("2", "이");
		result = result.replace("3", "삼");
		result = result.replace("4", "사");
		result = result.replace("5", "오");
		result = result.replace("6", "육");
		result = result.replace("7", "칠");
		result = result.replace("8", "팔");
		result = result.replace("9", "구");

		return result;
	}


} // class



/*
  
 printf라서 결과값 반환이 안됨 > (숫자 한글) 변환에서 막힘, replace 사용 안됨 
 
public static void changeKor() {
	String input = "12345678";
	if (input.length() == 8) {
		System.out.printf("%s천%s백%s십%s만%s천%s백%s십%s원", input.charAt(0), input.charAt(1),
				input.charAt(2), input.charAt(3), input.charAt(4), input.charAt(5),
				input.charAt(6), input.charAt(7));
	} // 8
	else if (input.length() == 7) {
		System.out.printf("%s백%s십%s만%s천%s백%s십%s원", input.charAt(0), input.charAt(1),
				input.charAt(2), input.charAt(3), input.charAt(4), input.charAt(5),
				input.charAt(6));
	} // 7
	else if (input.length() == 6) {
		System.out.printf("%s십%s만%s천%s백%s십%s원", input.charAt(0), input.charAt(1),
				input.charAt(2), input.charAt(3), input.charAt(4), input.charAt(5));
	} // 6
	else if (input.length() == 5) {
		System.out.printf("%s만%s천%s백%s십%s원", input.charAt(0), input.charAt(1), input.charAt(2),
				input.charAt(3), input.charAt(4));
	} // 5
	else if (input.length() == 4) {
		System.out.printf("%s천%s백%s십%s원", input.charAt(0), input.charAt(1), input.charAt(2),
				input.charAt(3));
	} // 4
	else if (input.length() == 3) {
		System.out.printf("%s백%s십%s원", input.charAt(0), input.charAt(1), input.charAt(2));
	} // 3
	else if (input.length() == 2) {
		System.out.printf("%s십%s원", input.charAt(0), input.charAt(1));
	} // 2
	else if (input.length() == 1) {
		System.out.printf("%s원", input.charAt(0));
	} // 1
} // chageKor
*/
