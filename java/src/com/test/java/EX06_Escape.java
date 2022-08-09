package com.test.java;

public class EX06_Escape {
	public static void main(String[] args) {
		
		/*
		내가 만든 프로그램을 다른 사람에게 준다 > 배포
		자바의 기본 배포 단위 > 소스 파일을 컴파일 결과물(*.class) > jar(자바 아카이브) > 자바 압축 파일
		프로젝트 선택 > export > 빌드보드 사용 후 열기 */
		
		
		int age;
		age = 20;
		System.out.println("안녕하세요. 저는 " + age + "살 입니다.");
		
		/*
		특수문자 > Escape Sequence
		- 컴파일러가 번역을 할 때, 미리 약속된 표현을 만나면 그 표현을 바로 출력하지 않고, 
		  약속에 따라 처리를 한 후 출력하는 구성 요소
		- 자료형 > char
		
		1. \n : new line, line feed, 개행문자
		   char c1 = '\n';
		   String c1 = "\n";
			
			요구사항 : "안녕하세요. 홍길동입니다." 출력해주세요.
			수정사항 : "안녕하세요." "홍길동입니다." 각각 다른 라인에 출력해주세요.
			- 문자열 리터럴에는 엔터를 넣을 수 없다.
			
			String msg = "안녕하세요. 홍길동입니다.";
			System.out.println(msg);
		    
		    String msg1 = "안녕하세요.";
		    String msg2 = "홍길동입니다.";
		    System.out.println(msg1);
		    System.out.println(msg2);
		    
		    String msg3 = "안녕하세요.\n홍길동입니다.";
		    
			System.out.println(); 빈줄 출력


		2. \r : carriage return
		   - 커서(캐럿)의 위치를 현재 라인의 맨앞(첫번째 열)으로 이동
		   - 키보드 > HOME 키
		    
		    msg = "안녕하세요.\r홍길동"; > 홍길동세요. 출력(덮어쓰기 모드)
		
		운영체제(os)에 따라 엔터
		- 윈도우 : \r\n
		- 멕 :  \r
		- 리눅스 : \n
		    
		    
		3. \t
		   - 탭문자, tab
		   - 탭? > 행동(o) > 지표(x) > 이미 정해져있는 위치를 표시한 요소
		   - 서식 작업(열 맞추기)
		    msg = "하나\t둘\t셋\t넷";
		    msg = "하나	둘	셋	넷"; > 잘 사용 안함, 편집기상에서 탭문자가 확인 불편함
		    
		    
		4. \b
		   - Backspace
		   - 콘솔에서 동작하지만 이클립스에서 동작하지않음
		    msg = "홍길동\b입니다."; > 홍길입니다. 출력
		   
		5. \", \', \\
		   - 이미 무언가를 하는 문자들을 의미없게 만드는 역할
		   
		     요구사항 : 화면 > 홍길동 : "안녕하세요."   
		     msg = "홍길동 : \"안녕하세요.\"";
		     
		     요구사항 : 수업 폴더의 경로를 알려주세요.
		     c:\class\java
		     String path = "c:\class\java";   > \ 때문에 오류 발생, invalid escape sequence
		     String path = "c:\\class\\java"; > 실제로는 \ 출력
		     
		     
		 주의사항1.
		 요구사항 : 변수 2개, 숫자 대입, 더하기 연산 > 연산과정과 결과를 출력하세요.
		 	 	  10 + 20 = 30
		  		int a = 10;
		  		int b = 20;
		  		System.out.println(a+"+"+b+"="+a+b);   > 10 + 20 = 1020 출력
		 	 	> 연산 방향 (왼쪽 -> 오른쪽)
		 	 	> 문자열 연산이기 때문에 10+20=1020 출력
		 	 	System.out.println(a+"+"+b+"="+(a+b)); > 10 + 20 = 30 출력
		 
		 주의사항2.
		 int num; > NULL 상태 (=/=0)
		 System.out.println("숫자 :" + num);
		 > the local variable may not have been initialized
		 > 변수 num 초기화 필요
		 - 자바 > 변수를 만들고 초기화를 하지 않으면 사용이 불가능하다.
		 - 현재 num은 NULL값을 가진다.
		 - 현재 NULL 상태입니다. 

		 */ 
	}
}
