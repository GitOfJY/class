package com.test.java;

public class EX11_Operator {
	public static void main(String[] args) {
		/*
		연산자, operator
		 - 수학 연산자와 동일
		 - 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후 연산(행동)의 결과를 돌려주는 요소
		 - 주로 기호를 많이 사용 + 단어도 많이 사용
		 
		1. 문장, Statement
		2. 표현식, Expression
		3. 연산자, Operator
		4. 피연산자, Operand
		5. 연산자 우선순위
		6. 연산자 연산방향
		 
		 
		 
		문장, Statement
		 - int sum = 10 + 20;
		 
		표현식, Expression
		 - 문장을 구성하는 최소 단위
		 - int sum
		 - 10 + 20
		 - sum = 30
		 - 10
		 - 20
		 - int (x) -> 단독으로 올 수 없기 때문에 표현식 아님
		 
		 
		 
		연산자, Operator
		- +
		- =
		
		피연산자, Operand
		- + : 10, 20
		- = : 30, sum
		
		
		
		연산자 종류
		 1. 행동
		  a. 산술 연산자
		  b. 비교 연산자
		  c. 논리 연산자
		  d. 대입 연산자
		  e. 증감 연산자
		  f. 조건 연산자
		  g. 비트 연산자
		  
		 2. 형태(피연산자 갯수)
		  a. 1항 연산자
		  b. 2항 연산자
		  c. 3항 연산자
		  
		  
		  
		산술 연산자
		- +, -, *, /, %(mod, 나머지)
		- 2항 연산자
		- 피연산자를 숫자형을 사진다.(정수, 실수)
		  
		 */
		 
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);  //몫
		//System.out.printf("%d % %d=%d\n", a, b, a%b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b); //나머지
		
		/*
		 Exception in thread "main" java.util.IllegalFormatFlagsException: Flags = ' '
	at com.test.java.EX11_Operator.main(EX11_Operator.java:67)
		에러 메세지 - 첫 줄, 마지막 줄 보기
		System.out.printf("%d % %d=%d\n", a, b, a%b); -> %를 형식문자 취급해서 에러
		%d % %d=%d\n > %d %% %d=%d\n (printf 사용할때만 적용)
		
		
		나누기 연산자 주의점
		- 나누기 피연산자가 1개 이상의 실수면 연산 결과가 실수이다. > 기억 x, 편협한 설명
		System.out.println(10 / 3);      정수/정수 > 3				   int   /int    -> int
		System.out.println(10.0 / 3.0);  실수/실수 > 3.33333333333   double/double -> double
		System.out.println(10.0 / 3);    실수/정수 > 3.33333333333   double/int    -> double
		System.out.println(10 / 3.0);    정수/실수 > 3.33333333333   int   /double -> double
		
		- 모든 산술 연산자의 결과 자료형은 두 피연산자의 자료형 중에서 더 크기가 큰 자료형으로 반환된다.
		- - + : 신경쓸것
		- - - : 신경쓸것
		- - * : 더욱 신경쓸것
		- - / : 적당히
		- - % : 적당히
		
		int c = 1000000000;
		int d = 2000000000;
		System.out.println(c+d);       -값    > int + int = int(overflow)
		System.out.println(long(c)+d); 30억   > long + int = long
		
		byte, short
		- byte, short 연산의 결과는 무조건 int형이다. > CPU 처리 단위(int)
		byte b1 = 10;
		byte b2 = 20;
		System.out.println(b1+b2); >byte + byte = int
		byte b3 = b1 + b2; > error, int를 byte로 명시적 형변환
		byte b3 = byte(b1 + b2); > byte를 int로 형변환 > 불편하기 때문에 byte와 short는 사용하지 않음
		
		
		
		비교 연산자
		- >, >=, <=, ==(equal), !=(not equal)
		- 2항 연산자
		- 피연산자들의 우위 비교하는 연산자
		- 피연산자는 숫자형을 가진다.
		- 연산의 결과가 반드시 boolean이다.
		 */
		
		a = 10;
		b = 3;
		System.out.printf("%d > %d = %b\n", a, b, a>b);
		System.out.printf("%d >= %d = %b\n", a, b, a>=b);
		System.out.printf("%d < %d = %b\n", a, b, a<b);
		System.out.printf("%d <= %d = %b\n", a, b, a<=b);
		System.out.printf("%d == %d = %b\n", a, b, a==b);
		System.out.printf("%d != %d = %b\n", a, b, a!=b);
		
		//요구사항 : 사용자의 나이 입력 > 원하는 나이 검사? 19세 이상 통과
		int age = 25;
		//A > B
		//A : 주체
		//B : 비교대상
		System.out.println(age >= 19); //권장
		System.out.println(19 <= age); //비권장
		
		
		
		/*
		논리 연산자
		 - &&(and), ||(or), !(not)
		 - 2항 연산자(&&,||), 1항 연산자(!)
		 - 피연산자의 자료형이 boolean이다.
		 - 연산의 결과가 boolean이다.
		 - 피연산자를 대상으로 정해진 규칙에 따라 정해진 값을 반환하는 연산자
		
		
		ex. 소개팅 > 남자 소개 > && 연산
		1. 키 180cm 이상
		2. 잘생길 것 
		
		 
		A && B ?
		T && T = T
		T && F = F
		F && T = F
		F && F = F
		 
		A || B ?
		T || T = T
		T || F = T
		F || T = T
		F || F = F
		 */
		
		boolean f1 = true;
		boolean f2 = false;
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		
		System.out.println(!true);
		System.out.println(!false);
		
		/*
		대입 연산자, 할당 연산자
		 - =
		 - +=, -=, /=, %= : 복합 대입 연산자
		 - LValue(변수) = RValue(상수, 변수)
		 - LValue와 RValue는 자료형이 동일해야 한다. > 다르다면 형변환 필요
		 - 대입 연산자는 모든 연산자들 중 연산자 우선 순위가 가장 낮다.
		
		연산자 우선 순위
		 - 하나의 문장에 속한 모든 연산자들은 실행 순서를 가진다.
		 - 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		 
		 int sum = 10 + 20 + 30;
		 연산자 3개 > 왼쪽부터 실행
		 System.out.println(sum);
		
		연산자 연산 방향
		 - 하나의 문장에 속한 동일한 종류의 연산자들은 실행 순서를 가진다.
		 - 대입 연산자, 증감 연산자 : 오른쪽 -> 왼쪽
		 - 나머지 연산자 : 왼쪽 -> 오른쪽
		 */
		
		int n = 10;
		//n이 가지는 값에 1을 더한다. > 누적
		n = n+1; //이름 없는 공간에 있는 11을 n 공간에 덮어쓰기
		System.out.println(n);
		n += 1; //n = n + 1 줄인 표현(약속, 복합관계대입연산자)
		System.out.println(n); //12출력
		
		n = n - 2;
		n -= 2;
		System.out.println(n); //8출력
		
		n = n * 2;
		n *= 2;
		System.out.println(n); //32출력
		
		n /= 4;
		System.out.println(n); //8출력
		
		n %= 4;
		System.out.println(n); //0출력
		
		n = 10 + n;
		n += 10; // (o)
		
		n = 5 - n;
		n -= 5; // (x)
		
		//-=, /=, %= 연산 순서가 중요하기 때문에 주의
		
		/*
		문자열 연산자(+)
		- 2항 연산자
		- 피연산자를 문자열로 가진다.
		- 연산의 결과로 두 문자열을 합친 문자열을 반환한다. 
		
		문자열   + 문자열 		 = 문자열
		문자열   + 비문자열(숫자) = 문자열
		비문자열 + 문자열 	 	 = 문자열
		비문자열 + 비문자열      = 산술 연산자
		*/
		
		//연산자 연산방향, 문자열 연산자, 산술 연산자
		System.out.println(100 + 200 + 300);     //600
		System.out.println(100 + 200 + "300");   //300 + "300" = 300300
		System.out.println(100 + "200" + 300);   //"100200" + 300 = 100200300
		System.out.println("100" + 200 + 300);   //100200300, 가장 헷갈려하는 부분
		System.out.println("100" + (200 + 300)); //100500
		
		
		/*
		 비교 연산자
		 - ==, != 에만 해당하는 것
		 */
		 
		int num1 = 100;
		int num2 = 100;
		int num3 = 200;
		int num4 = 50;
		num4 += 50;
		
		System.out.println(num1 == num2);
		System.out.println(num1 == num3);
		System.out.println(num1 == num4);
		 
		String txt1 = "홍길동";
		String txt2 = "홍길동";
		String txt3 = "아무개";
		String txt4 = "홍";
		txt4 = txt4 + "길동"; //문자열 누적
		
		System.out.println(txt1 == txt2); //true  > 우위비교 아니고 동등비교
		System.out.println(txt2 == txt3);
		System.out.println(txt2 == txt4); //false > 원인은 나중에
		//자바는 문자열을 대상으로 ==, != 연산자를 사용하면 절대로 안된다.
		
		System.out.println(txt1.equals(txt2));  //true
		System.out.println(txt1.equals(txt4));  //true .equals() 메소드 사용해야함
		System.out.println(!txt1.equals(txt4)); //not equal
		
		/*
		증감 연산자
		- ++, --
		- 1항 연산자, 단항 연산자
		- 피연산자는 숫자형을 가진다.
		- 누적 연산을 한다. 기존의 값에 1을 더하거나 뺀다.
		- 연산자와 피연산자의 위치를 바꿀 수 있다. > 연산자 우선 순위가 달라진다.
		- a. ++n : 전위 배치(전치) > 연산자 우선 순위가 가장 높음 (소괄호 제외)
		- b. n++ : 후위 배치(후치) > 연산자 우선 순위가 가장 낮음 
		*/
		
		n = 10;
		++n;
		n = n+1;
		n += 1; //모두 같은 표현
		System.out.println(n); //11출력
		
		//n = n-1;
		//n -= 1;
		//--n;
		
		n = 10;
		++n;
		System.out.println(n);
		
		n++; //연산 우선 순위가 변할 뿐 기능은 변하지 않음
		System.out.println(n);
		
		n = 10;
		int result = 0;
		//result = 10 + ++n; 연산자 3개 > =, +, ++ > 가독성이 낮아 요즘 사용 안함
		++n;
		result = 10 + n;
		System.out.println(result); //21 출력
		
		n = 10;
		result = 0;
		//result = 10 + n++;    				 > 가독성이 낮아 요즘 사용 안함
		result = 10 + n;   					   //> 증감연산자를 쪼갠 것
		n++;
		System.out.println(result); //20 출력 > 우선 순위 변경
		System.out.println(n);      //11 출력
		
		/*
		 result = 10 + n++; > 연산자 3개 : =, +, ++(후치) > 우선순위 변경
		 result = 10 + 10   > + 먼저 실행
		 result = 20        > 대입 연산자 실행
		 n = 11             > ++연산자 실행
		*/
		
		//증감 연산자를 다른 연산자와 함께 한 문장에서 사용하지 않는다. > 권장
	    
		int o = 10;
		System.out.println(--o - o--);
		System.out.println(o);
		
		/*
		조건 연산자
		- A ? B : C
		- ? : 
		- A, B, C : 피연산자
		- 3항 연산자 (유일)
		- A : boolean
		- B,C : 상수, 변수, 연산시, 메소드 > 값
		 */
		
		boolean flag = false;
		String fresult = flag ? "참" : "거짓";
		System.out.println(fresult);
		
		/*
		age 25; 여기서 왜 오류나냐??
		fresult = age >= 19? "통과" : "거절";
		System.out.println(fresult);
		*/
		
		//쇼핑몰 > 티셔츠 구매 > 색상 선택 (검정, 노랑, 파랑)
		String color = "노랑"; //색상 입력 요청
		fresult = (color.equals("검정") || color.equals("파랑") || color.equals("노랑")) ? "재고있음" : "재고없음";
		System.out.println(fresult);
		
		n = 10; //짝수 or 홀수?
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		//System.out.println((n % 2 == 0) ? "짝수" : "홀수"); > 헷갈리면 소괄호 사용
		
		int num = true ? 10 : 20;
		//int num = true ? 10 : "홍길동"; > 연산의 결과 자료형이 매번 달라진다 > false여서 "홍길동"이 출력되면 int 때문에 error
		//반드시 B와 C의 자료형이 동일해야 한다.
		
	}

}





//이클립스 업데이트 : window -> preference -> update -> 자동 체크 지우기
//이클립스 주석 밑줄 : 자동 스펠링 검사 window -> preference -> spelling -> 자동 체크 지우기



/*
클래스 이름 수정
클래스의 이름 = 파일의 이름
EX09_input = EX09_Input -> 오류
파일의 이름도 같이 수정해줘야함 (refactor -> rename 또는 F2)
변수 이름 일괄 수정
선택 후 Ctrl + 1
*/

