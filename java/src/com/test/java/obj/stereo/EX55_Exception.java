package com.test.java.obj.stereo;

import java.io.BufferedReader;
import java.util.Scanner;

public class EX55_Exception {
	public static void main(String[] args) {

		/*
		예외, Exception
		- 컴파일때 발견 안되고 실행 중 발견되는 오류
		- 런타임 오류
		- 개발자가 미리 예측 o,x
		
		
		예외 처리, Exception Handling
		1. 전통적인 방식
			- 제어문 사용(조건문)
			
		2. 전용 처리 방식 > 권장은 하지만 혼용해서 사용
			- try catch(finally)문 사용
			
			
		if VS try
		- if문 : 사전에 미리 검사를 해서 사고가 안나게 처리
		- try문 : 일단 실행 > 감시 > 사고가 나면 그때 처리
		 */



		// control+1 > 메소드 자동 만들기
		// m1();
		// static 지우면 오류 > 객체 통해 접근 > this.m1(); > static 메소드인 main에서는 this 사용 불가
		// main > this 통해 객체 호출 불가능
		// 정적 메소드 안에서 정적 메소드 호출 > 원래 EX55_Exception.m1();인데 생략된 것
		// static 없는 메소드 > 객체 메소드(객체 안에있어서, heap) 있으면 정적 메소드(static 영역에 클래스 울타리 안)
		// 객체 메소드 접근 > 객체.메소드 호출
		// 정적 메소드 접근 > 클래스이름.메소드 호출
		// String result = m2();

		// static 없을 때 호출 법 > 굳이?
		// EX55_Exception ex = new EX55_Exception();
		// ex.m1();

		// m3();
		try {
			m4();
		} catch (Exception e) {
			e.printStackTrace();
		}
		m5();



	}// main


	private static void m5() {}

	private static void m4() throws Exception {
		// 예외 미루기
		// -해당 영역에서 예외 처리를 할만한 상황이 안되면 다른 곳으로 예외 처리의 책임을 떠 넘길 수 있다.
		// -throws Exception

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// unhandled exception type IOException
		String input = reader.readLine();
	}

	private static void m3() {

		try {
			int num = 10;
			System.out.println(100 / num); // ArithmeticException:
			// 에러 발생 > throw new ArithmeticException


			int[] nums = {10, 20, 30};
			System.out.println(nums[0]); // ArrayIndexOutOfBoundsException

			// Parent p = new Parent();
			// Child c;
			// c = (Child) p; //ClassCastException

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		} catch (ClassCastException e) {
			System.out.println("형변환 오류");
		} catch (Exception e) {

			// Exception > 모든 oooException의 부모 클래스
			e.printStackTrace();
		}



		// catch (Exception e) {
		// System.out.println("예외처리");
		// System.out.println(e.getMessage());
		// }
	}



	private static void m2() {

		// Exception 객체의 역할

		int num = 10;
		try {
			System.out.println(100 / num); // A
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}


		int[] nums = {10, 20, 30};
		try {
			System.out.println(nums[0]);
		} // B
		catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}



		// Parent p = new Parent();
		// Child c;
		// try {
		// c = (Child) p;} // C
		// catch (Exception e) {
		// System.out.println("형변환 오류");}
	}



	// 메소드가 자동으로 생성하면 header부분이 왜 이렇게 되는지?
	// 왜 private? > 안정성 때문
	// 왜 static? > main 메소드가 static이라서
	// 왜 void? > return값이 없어서
	// 왜 ()? > 호출하는 쪽에서 매개변수를 안 받아서
	private static void m1() {

		// 요구사항 : 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();

		// 전통적인 방식
		if (num != 0) {

			// 비즈니스 코드 (= 업무코드) > 주목적
			System.out.printf("100/%d = %d\n", num, 100 / num);
		} else {

			// 예외처리 코드
			System.out.println("0을 입력하지 마세요.");
		}


		/*
		if (num == 0) {
		System.out.println("0을 입력하지 마세요."); }
		else {
		System.out.printf("100/%d = %d\n", num, 100 / num);}
		> 문제는 없지만 비권장, 가독성 낮음
		 
		if (조건) {참 블럭 > 긍정적} 
		else {거짓 블럭 > 부정적} 
		 */


		// try문
		// - try : 비즈니스 코드 작성
		// - catch : 예외 처리 코드 작성

		// 조건?
		// 1. 일단 try내부의 코드 실행한다. > 업무 코드라서
		// 2. 아무 문제 없음
		// 3. 빠져나감 > catch 실행 안함

		// 1. 일단 try내부의 코드 실행한다. > 업무 코드라서
		// 2. 에러 발생
		// 3. 남아있는 업무코드의 실행을 중단
		// 4. 즉시 catch로 이동한다.
		// 5. catch 실행


		// try의 영역 > 예외가 발생할 것 같다고 예측가능한 최소한의 영역만 적용
		try {
			System.out.printf("100/%d = %d\n", num, 100 / num);
		} catch (Exception e) {
			System.out.println("0을 입력하지 마세요.");
			System.out.println(e.getMessage()); // / by zero
			e.printStackTrace();
			// at com.test.java.obj.stereo.EX55_Exception.m1(EX55_Exception.java:102)
			// at com.test.java.obj.stereo.EX55_Exception.main(EX55_Exception.java:31)

		} // finally {}

		// Exception e
		// - 예외 객체
		// - 예외가 발생한 상황에 대한 정보를 알려준다.



	}// m1


	// private static String m2() {
	// return null; }


}// EX55
