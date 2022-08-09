package com.test.java.question.obj.access;

public class Q01 {

	/*
	1번 문제 조건 (완료)
	Book 객체의 정보
	제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
	모든 멤버 변수의 접근 지정자는 private으로 한다.
	멤버 접근을 위한 Setter와 Getter를 정의한다.
	제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자)
	가격 : 읽기/쓰기, 0 ~ 1000000원
	저자 : 읽기/쓰기, 제한 없음
	페이지수 : 읽기/쓰기, 1~무제한
	출판사 : 쓰기 전용
	발행년도 : 읽기 전용(2019년)
	ISBN : 읽기/쓰기
	Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
	String info()
	클래스가 잘 설계되었는지 객체를 가지고 사용해본다.
	Book 객체 생성
	멤버 값 넣기 + 값 출력
	유효성 검사 테스트
	*/


	public static void main(String[] args) {

		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());

		// 쓰기 전용 > set
		// 읽기 전용 > get


	}// main
}// Q01


class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (checkTitle(title)) {
			this.title = title;
		} else {
			System.out.println("최대 50자 이내(한글, 영어, 숫자) 제목을 입력하세요.");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPublisher(String publisher) { // 쓰기전용
		this.publisher = publisher;
	}

	public String getPubYear() { // 읽기전용
		return pubYear;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	private boolean checkTitle(String title) {
		if (title.length() > 50) {
			return false;
		}
		for (int i = 0; i < title.length(); i++) {
			char c = title.charAt(i);
			if ((c < '가' || c > '힣') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')
					&& (c != ' ')) {
				return false;
			}
		}
		return true;
	}// checkTitle



	public String info() {
		StringBuilder sb = new StringBuilder();
		sb.append("제목 : " + this.title);
		sb.append("\r\n");
		sb.append(String.format("가격 : %,d원", this.price));
		sb.append("\r\n");
		sb.append("저자 : " + this.author);
		sb.append("\r\n");
		sb.append("출판사 : " + this.publisher);
		sb.append("\r\n");
		sb.append(String.format("발행년도 : %s년", this.pubYear));
		sb.append("\r\n");
		sb.append("ISBN : " + this.isbn);
		sb.append("\r\n");
		sb.append(String.format("페이지 : %,d장", this.page));

		return sb.toString();
	}
}



/*
 출력
 제목: 자바의 정석
 가격: 45,000원
 저자: 남궁성
 출판사: 도우출판
 발행년도: 2019년
 ISBN: 8994492038         
 페이지: 1,022장
 */

