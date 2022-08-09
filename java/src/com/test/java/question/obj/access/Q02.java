package com.test.java.question.obj.access;

public class Q02 {
	/*
	2번 문제 조건 (이름 필수값만 설정하면 완료)
	Note 객체의 정보
	크기, 표지 색상, 페이지수, 소유자이름, 가격
	모든 멤버 변수의 접근 지정자는 private으로 한다.
	멤버 접근을 위한 Setter와 Getter를 정의한다.
	크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
	표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
	페이지수 : 쓰기 전용, 10 ~ 200페이지 이내
	(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
	소유자이름 : 쓰기 전용, 한글 2~5자이내. 필수값
	가격 : Setter,Getter 구현 안함. 추후 info() 메소드에서 사용하기 위해 아래와 같은
	규칙으로 계산
	(+) 기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원)
	(+) 크기 변경 : A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
	(+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
	(+) 페이지수 변경 : 페이지 당 x 10원 추가
	Note 객체의 정보를 확인하기 위한 메소드를 구현한다.
	String info()
	Note가 잘 설계되었는지 객체를 가지고 사용해본다.
	Note 객체 생성 → 값 넣기 + 값 출력 등
	 */

	public static void main(String[] args) {


		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());



	} // main



} // Q02



class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;


	// 크기 > 쓰기전용 > A3, A4, A5, B3, B4, B5
	public void setSize(String size) {
		if ((size == "A3") || (size == "A4") || (size == "A5") || (size == "B3") || (size == "B4")
				|| (size == "B5")) {
			this.size = size;
		} else {
			System.out.println("크기는 A3, A4, A5, B3, B4, B5으로 입력하세요.");
		}
	}


	// 표지 색 > 쓰기전용 > 검정색, 흰색, 노란색, 파란색
	public void setColor(String color) {
		if ((color == "검정색") || (color == "흰색") || (color == "노란색") || (color == "파란색")) {
			this.color = color;
		} else {
			System.out.println("색깔은 검정색, 흰색, 노란색, 파란색으로 입력하세요.");
		}
	}

	// 페이지 > 쓰기전용 > 10 ~ 200페이지 이내
	// (+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		} else {
			System.out.println("10 ~ 200페이지 이내 페이지수를 입력하세요.");
		}
	}


	// 소유자이름 > 쓰기전용 > 한글 2~5자이내. 필수값
	public void setOwner(String owner) {
		if (checkName(owner)) {
			this.owner = owner;
		} else {
			System.out.println("주인 없는 노트");
			return;
		}
		// 필수값인걸 어떻게 표현하지?
	}


	public String pageState(int page) {
		if (page >= 10 && page <= 200) {
			return "얇은";
		}
		if (page <= 50) {
			return "보통";
		} else {
			return "두꺼운";
		}
	} // pageState



	public String info() {
		int basicPrice = 500;

		// size 추가요금
		if (this.size == "A3") {
			basicPrice += 400;
		} else if (this.size == "A4") {
			basicPrice += 200;
		} else if (this.size == "B3") {
			basicPrice += 500;
		} else if (this.size == "B4") {
			basicPrice += 300;
		} else {
			basicPrice += 100;
		}


		// 색깔 추가요금
		if (this.color == "검정색") {
			basicPrice += 100;
		} else if (this.color == "노란색") {
			basicPrice += 200;
		} else {
			basicPrice += 200;
		}

		// 페이지 추가요금
		basicPrice += (this.page - 10) * 10;


		StringBuilder sb = new StringBuilder();
		sb.append("■■■■■■ 노트 정보 ■■■■■■");
		sb.append("\r\n");
		sb.append("소유자 : " + this.owner);
		sb.append("\r\n");
		sb.append("특성 : " + this.color + " " + pageState(this.page) + " " + this.size + " 노트");
		sb.append("\r\n");
		sb.append(String.format("가격 : %,d원", basicPrice));
		sb.append("\r\n");
		sb.append("■■■■■■■■■■■■■■■■■■■■■■");
		sb.append("\r\n");

		return sb.toString();


	} // info



	// 소유자이름 : 쓰기 전용, 한글 2~5자이내. 필수값
	private boolean checkName(String name) {
		if (name.length() < 2 || name.length() > 5) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if ((c < '가' || c > '힣') && (c != ' ')) {
				return false;
			}
		}
		return true;
	}// checkName



} // Note



/*
출력
■■■■■■ 노트 정보 ■■■■■■
소유자 : 홍길동
특성 : 노란색 얇은 B4노트
가격 : 1,150원
■■■■■■■■■■■■■■■■■■■■■■

■■■■■■ 노트 정보 ■■■■■■
주인 없는 노트
■■■■■■■■■■■■■■■■■■■■■■
*/
