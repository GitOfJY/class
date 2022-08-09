package com.test.java.obj.stereo;

public class EX52_Generic {
	public static void main(String[] args) {

		/*
		클래스 종류 
		 1. 클래스
		 2. 인터페이스
		 3. 추상 클래스
		 4. enum
		 5. 제네릭 클래스
		 
		
		제네릭, Generic
		1. 제네릭 클래스 > 0
		2. 제네릭 메소드 
		 
		
		요구사항 : 클래스 설계
		1. 멤버 변수 선언 > int
		2. 멤버 변수 중심으로 여러가지 행동을 하는 메소드 선언
		
		추가사항 : String을 중심으로 하는 클래스를 추가 설계
		추가사항 : boolean을 중심으로 하는 클래스를 추가 설계
		추가사항 : double을 중심으로 하는 클래스를 추가 설계
		추가사항 : Calendar를 중심으로 하는 클래스를 추가 설계
		추가사항 : 무한대 ... > 요구할때마다 클래스 다시 설계 > 현실성 떨어짐
		
		문제점 > 해결방안
		1. Object 클래스 > 오래된 방식
		2. 제네릭 클래스 > 최신 방식, 제네릭을 조금 더 권장
		 */



		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1.toString()); // data=10
		System.out.println(n1.getData() * 2); // 20
		System.out.println();


		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString()); // data=홍길동
		System.out.println(s1.getData().length()); // 3
		System.out.println();


		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString()); // data=true
		System.out.println(b1.getData() ? "참" : "거짓"); // 참
		System.out.println();


		WrapperObject n2 = new WrapperObject(20);
		System.out.println(n2.toString()); // data=20
		System.out.println((int) n2.getData() * 2); // 40, 다운캐스팅
		System.out.println();


		WrapperObject s2 = new WrapperObject("홍길동");
		System.out.println(s2.toString()); // data=홍길동
		System.out.println(((String) s2.getData()).length()); // 3
		System.out.println();



		WrapperObject b2 = new WrapperObject(false); // 범용(만능) > 사용할때 다운캐스팅
		System.out.println(b2.toString()); // data=false
		System.out.println((boolean) b2.getData() ? "참" : "거짓"); // 거짓
		System.out.println();


		Wrapper<Integer> n3 = new Wrapper<Integer>(20); // 범용(만능) > 바로 사용가능
		System.out.println(n3.toString()); // data=20
		System.out.println(n3.getData() * 2); // 40
		System.out.println();

		Wrapper<String> s3 = new Wrapper<String>("홍길동");
		System.out.println(s3.toString()); // data=홍길동
		System.out.println(s3.getData().length());
		// 3 > 범용 클래스 역할 + 전용 클래스 사용법
		System.out.println();

		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString()); // data=true
		System.out.println(b3.getData() ? "참" : "거짓"); // 참
		System.out.println();



	}// main
}// EX52



class WrapperInt {
	private int data; // 클래스의 중심이 되는 데이터

	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}


}// WrapperInt



class WrapperString {
	private String data; // 클래스의 중심이 되는 데이터

	public WrapperString(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
} // WrapperString



class WrapperBoolean {
	private boolean data; // 클래스의 중심이 되는 데이터

	public WrapperBoolean(boolean data) {
		this.setData(data);
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
} // WrapperBoolean



class WrapperObject {
	private Object data; // 클래스의 중심이 되는 데이터

	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
} // WrapperObject



class Wrapper<T> {

	private T data; // 클래스의 중심이 되는 데이터

	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {

		return "data=" + this.data;
	}

}


