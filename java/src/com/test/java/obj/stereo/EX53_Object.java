package com.test.java.obj.stereo;

import java.util.Calendar;
import java.util.Date;

public class EX53_Object {
	public static void main(String[] args) {

		// 업캐스팅
		SSS s1 = new SSS();
		SSS s2 = new TTT(); // 업캐스팅 발생, 자식인 t를 s에 대입


		// Object 변수는 이 세상 모든것들을 담을 수 있다. > 장점
		Object o1 = new Object();
		Object o2 = new SSS(); // 가능, 업캐스팅
		Object o3 = new TTT(); // 가능, 업캐스팅, 손자>할아버지

		Date d4 = new Date();
		Object o4 = new Date();
		o4 = Calendar.getInstance();
		// 오브젝트는 date > calendar 수정 불가!
		// 처음 설정한 date(자료형)로만 수정 가능

		Object o5 = Calendar.getInstance();
		// Object o6 = new BufferedReader(new InputStramReader(System.in));
		Object o7 = new G304();


		// Object 변수
		// 1. 모든걸 담을 수 있다.
		// 2. 처음에 무언가를 담으면 그 자료형만을 담는다. 수정 불가 (*****)


		// Object 장점
		// 1. 모든걸 담을 수 있다.


		// Object 단점
		// 1. 다운 캐스팅이 종종 필요하다.
		// 2. 다운 캐스팅 과정에서 원래 자료의 자료형을 유추하기 힘들다.
		System.out.println(o4); // Object o4 > Date에서 Calendar 변경했는데 알 수 없음
		// Date temp = (Date)04; 사용하기 전 다운케스팅, 에러(캘린더로 바꾼 코드를 못 봄)

		System.out.println(d4); // Date d4

		// o7.click(); > 오류, 오브젝트라 다운캐스팅 꼭 필요
		((G304) o7).click();



		// 모든 자료형을 object에 담을 수 있는 이유 > 업캐스팅
		// 업캐스팅 > 상속관계에 있는 클래스끼리
		Object o10 = new SSS();

		// 박싱(Boxing) - 오토 박싱
		// > 값형 데이터를 자동으로 객체로 만드는 작업
		Object o11 = 100;
		// object 와 숫자 100이 상속?
		// 숫자 값형 데이터를 어떻게 참조형 변수에 넣는가?
		// 참조형 변수 = 값형 데이터; > 아님, 껍데기만 그렇게 보이는 것
		// 참조형 변수 = 객체 > 실제, new Integer() 객체 넣은 것
		// Object o11 = new Integer(100);



		System.out.println(o11);
		System.out.println(o11.toString()); // 자동으로 toString 호출
		// System.out.println(o11*2); > o11에는 숫자 100이 들어있지만 주소값임

		// 언박싱(UnBoxing)
		// > Object 변수에 들어있는 값형 데이터를 원래 값형으로 자료형을 변환하는 작업
		System.out.println((int) o11 * 2);
		System.out.println((Integer) o11 * 2);
		// 값형과 참조형은 형변환 불가능
		// 형변환이 아니고 object안에 데이터 꺼내라, 일종의 다운캐스팅


		int a = 10; // 비용 보통
		Object b = 20; // 비용 비쌈

		// 아직까지는 비용 따지지 말고 골고루 많이 사용해보기


	}// main
}// EX53


class SSS { // extends Object
} // SSS


class TTT extends SSS {
} // TTT
