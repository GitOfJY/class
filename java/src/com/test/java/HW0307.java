package com.test.java;

/*
 * 0307 과제 (변수 만들기)
 * 구글드라이브 - 날짜별로 폴더 만들기 - 파일 제출
 * 각 자료형(9개) 별로 변수 10개 > 문장으로 출력하시오.
 * sampel 양식으로 총 90개 출력
 * sample.
 * 1) 주변의 데이터 검색 - 나이 몸무게 키 등등 - 내 키 (180.5)
 * 2) 1의 데이터가 자바의 어떤 자료형에 적합한지? > 매칭 > 정수vs실수 + 길이 > double
 * 3) 2의 자료형으로 변수 선언하기
 * double height;
 * 4) 3의 변수로 데이터 대입(자료형에 맞는 리터럴 표기법)
 * height = 180.5;
 * 5) 문장으로 만들어서 출력
 * System.out.println("제 키는 + " + height + "cm입니다.") > 제 키는 180.5cm입니다.
 */


public class HW0307 {

	public static void main(String[] args) {
		// a. byte (-128~127)

		byte a1, b1;
		a1 = 3;
		b1 = 5;
		System.out.println(a1 + "+" + b1 + "=" + (a1 + b1) + "입니다.");

		byte day2 = 10;
		System.out.println("내일은 " + day2 + "일 입니다.");

		byte limit3;
		limit3 = 127;
		System.out.println("byte의 마지막 크기는 " + limit3 + "입니다.");

		byte size4_1 = -128, size4_2 = 127;
		System.out.println("byte의 크기는 " + size4_1 + "에서 " + size4_2 + "까지 입니다.");

		byte cake5 = 2;
		System.out.println("책상 위에 케이크가 " + cake5 + "개 있습니다.");

		byte major_book6, story_book6;
		major_book6 = 5;
		story_book6 = 3;
		System.out.println("책장에는 전공책 " + major_book6 + "권과 이야기책 " + story_book6 + "권이 있습니다.");

		byte olive_oil7, grape_oil7;
		olive_oil7 = 1;
		grape_oil7 = 2;
		System.out.println("주방에는 올리브유 " + olive_oil7 + "병과 포도씨유 " + grape_oil7 + "개가 있다.");

		byte baby_teeth8 = 3;
		System.out.println("아기의 입에 치아 " + baby_teeth8 + "개가 자랐다.");

		byte orange9 = 15;
		System.out.println("나무에 오렌지가 " + orange9 + "개가 열렸다.");

		byte grade10_1 = 30, grade10_2 = 32;
		System.out.println("1학년은 " + grade10_1 + "명이고 2학년은 " + grade10_2 + "명이다.");

		// b. short (-23768~32767)

		short day1;
		day1 = 3650;
		System.out.println("10년은 " + day1 + "일 입니다.");

		short town2;
		town2 = 1000;
		System.out.println("섬마을에는 " + town2 + "가구가 있습니다.");

		short reward3;
		reward3 = 30000;
		System.out.println("이번 대회 상금은 " + reward3 + "만원입니다.");

		short apple4;
		apple4 = 350;
		System.out.println("올해는 사과 " + apple4 + "개를 수확했습니다.");

		short apply5_1 = 500, apply5_2 = 20;
		System.out.println(apply5_1 + " * " + apply5_2 + " = " + apply5_1 * apply5_2);

		short student6, choco6;
		student6 = 300;
		choco6 = 5;
		System.out.println("학생 " + student6 + "명에게 초콜렛 " + choco6 + "개를 나눠주려면 " + student6 * choco6
				+ "개가 필요합니다.");

		short benefit7;
		benefit7 = 10000;
		System.out.println("총 수익은 " + benefit7 + "원이고 세금은 " + (benefit7 * 3.3) + "원 입니다.");

		short concert8;
		concert8 = 2000;
		System.out.println("이번 콘서트 인원은 " + concert8 + "명 입니다.");

		short add9_1, add9_2;
		add9_1 = 365;
		add9_2 = 2000;
		System.out.println(add9_1 + "+" + add9_2 + "=" + (add9_1 + add9_2));

		short price10;
		price10 = 10000;
		System.out.println("그 물건은 개당 " + price10 + "원 입니다.");

		// c. int (-21억~21억)

		int height1;
		height1 = 170;
		System.out.println("그 여자의 키는 " + height1 + "cm 입니다.");

		int size2;
		size2 = 230;
		System.out.println("내 신발 사이즈는 " + size2 + "입니다.");

		int anniversary_month3 = 10, anniversary_day3 = 10;
		System.out.println("개교 기념일은 " + anniversary_month3 + "월 " + anniversary_day3 + "일 입니다.");

		int a4 = 64;
		char small_a4 = (char) a4;
		System.out.println(a4 + "는 " + small_a4 + "와 같습니다.");

		int baby5 = 4;
		System.out.println("우리집 강아지는 " + baby5 + "마리의 새끼를 낳았다.");

		int month6 = 3, day6 = 9;
		System.out.println("2022년 대선은 " + month6 + "월 " + day6 + "일 입니다.");
		System.out.printf("2022년 대선은 %d월 %d일 입니다.\n", month6, day6);

		int floor7;
		floor7 = 3;
		System.out.println("이 건물은 " + floor7 + "층 입니다.");

		int contest8;
		contest8 = 3;
		System.out.println("이번 대회는 " + contest8 + "종류 입니다.");

		int zoo9;
		zoo9 = 10;
		System.out.println("동물원에는 " + zoo9 + "종류의 동물들이 있습니다.");

		int score10, subject10;
		score10 = 100;
		subject10 = 4;
		System.out.println("중간고사에서 " + subject10 + "과목을 " + score10 + "점을 받았습니다.");

		// d. long (-922경~922경)

		long bank1;
		bank1 = 100000000;
		System.out.println("은행에서 " + bank1 + "원 대출 받았습니다.");

		long money2;
		money2 = 30000000;
		System.out.println("빌린 돈 " + money2 + "원의 이자는 " + (money2 * 0.1) + "원 입니다.");

		long population3;
		population3 = 500000000;
		System.out.println("이 나라의 인구는 " + population3 + "명 입니다.");

		long disease4;
		disease4 = 300000;
		System.out.println("오늘 확진자 수는 " + disease4 + "명 입니다.");

		long hour5 = 1, minute5 = 60, second5 = 3600;
		System.out.println(hour5 + "시간은 " + minute5 + "분이고 " + second5 + "초 입니다.");

		long year6, year6_1;
		year6 = 1;
		year6_1 = 10;
		System.out.println(year6 + "년은 " + (year6 * 365) + "일이고 " + year6_1 + "년은 "
				+ (year6_1 * 365) + "일 입니다.");

		long ap_length7 = 10000, floor_length7 = 200;
		System.out.println("아파트는 " + ap_length7 + "m 이고 한 층에 길이는 " + floor_length7 + "m로 총 "
				+ (ap_length7 / floor_length7) + "층 입니다.");

		long tree_height8;
		tree_height8 = 300;
		System.out.println("제일 오래된 나무의 길이는 " + tree_height8 + "m 입니다.");

		long day9;
		day9 = 360;
		System.out.println("결혼 6주년 즉 " + (day9 * 6) + "일 입니다.");

		long performanceFee10;
		performanceFee10 = 1000000;
		System.out.println("그 사람의 1회 방송 출연료는 " + performanceFee10 + "원 입니다.");


		// e. float

		float pie1 = 3.14f;
		System.out.println("보통 pi는 " + pie1 + "로 근사해서 사용합니다.");

		float handSize2 = 7.8f;
		System.out.println("손가락 중 가장 긴 손가락은 " + handSize2 + "cm 정도 입니다.");

		float treeBlock3 = 1.5f;
		System.out.printf("나무 블럭 %f가 필요하다.\n", treeBlock3);

		float height4 = 8.8f;
		System.out.printf("나와 당신은 %f cm만큼 키 차이가 납니다.\n", height4);

		float price5_1 = 500.1f, price5_2 = 5001f;
		System.out.println("떡 1개의 가격은 " + price5_1 + "이고 10개의 가격은 " + price5_2 + "입니다.");

		float hair6 = 0.05f;
		System.out.println("머리카락은 하루에 " + hair6 + "만큼 자랍니다.");

		float eyeRight7 = 1.5f, eyeLeft7 = 1.0f;
		System.out.println("오른쪽 눈의 시력은 " + eyeRight7 + "이고 왼쪽 눈의 시력은 " + eyeLeft7 + "입니다.");

		float productError8 = 3.11f;
		System.out.println("길이가 " + productError8 + "cm보다 크면 불량입니다.");

		float eyelash9 = 2.5f;
		System.out.println("속눈썹의 길이는 평균 " + eyelash9 + "cm정도 입니다.");

		float airpodLength10 = 5.7f;
		System.out.println("새로 나온 에어팟은 " + airpodLength10 + "cm만큼 작아졌습니다.");


		// f. double

		double intLimit1;
		intLimit1 = 2100000000;
		System.out.println("double은 int의 최대값인 " + intLimit1 + "보다 큽니다.");

		double tenYearHour2;
		tenYearHour2 = 360 * 10 * 24;
		System.out.println("10년은 " + tenYearHour2 + "시간 입니다.");

		double treeGrowUp3;
		treeGrowUp3 = 100 * 100;
		System.out.println("나무는 1년에 100m씩 자라고 100년이 지나면 " + treeGrowUp3 + "만큼 자랍니다.");

		double cakeCalorie4 = 10000;
		System.out.println("이 케이크의 칼로리는 " + cakeCalorie4 + "칼로리 입니다.");

		double totalLength5;
		totalLength5 = 5000000;
		System.out.println("저기 보이는 탑의 총 길이는 " + totalLength5 + "m 입니다.");

		double afterBirth6;
		afterBirth6 = 365 * 27;
		System.out.printf("태어난지 %f일이 지났다.\n", afterBirth6);

		double rain7;
		rain7 = 365 * 0.03;
		System.out.println("우리 지역은 1년에 3퍼센트 즉" + rain7 + "일 동안 비가 옵니다.");

		double plusearg8_1, plusearg8_2;
		plusearg8_1 = 300000;
		plusearg8_2 = 500000;
		System.out.println(plusearg8_1 + " * " + plusearg8_2 + " = " + (plusearg8_1 * plusearg8_2));

		double eatDay9 = 1000;
		System.out.println("곰이 " + eatDay9 + "일동안 마늘을 먹었습니다.");

		double winPrice10;
		winPrice10 = 100000000;
		System.out.println("이번 대회의 상금은 " + winPrice10 + "원 입니다.");

		// g. char
		char day1_g;
		day1_g = '수';
		System.out.println("내가 좋아하는 요일은 " + day1_g + "요일 입니다.");

		char alphabet2;
		alphabet2 = 'Q';
		System.out.println("내 이름은 " + alphabet2 + "으로 시작합니다.");


		char next_day3;
		next_day3 = '3';
		System.out.println("내일은 " + next_day3 + "일입니다.");

		char birth_month4, birth_day4;
		birth_month4 = '6';
		birth_day4 = '3';
		System.out.println("내 생일은 " + birth_month4 + "월" + birth_day4 + "일 입니다.");

		char order5;
		order5 = 'A';
		System.out.println("B 전에 알파벳은 " + order5 + "입니다.");

		char order6_1 = 'C', order6_2 = 'D';
		System.out.println(order6_1 + " 다음 글자는 " + order6_2 + "입니다.");
		// System.out.printf("%d 다음 글자는 %d 입니다.\n", order6_1, order6_2);

		char spell7_1, spell7_2, spell7_3;
		spell7_1 = 'a';
		spell7_2 = 'n';
		spell7_3 = 't';
		System.out.println(spell7_1 + "와 " + spell7_2 + "와 " + spell7_3 + "를 조합하면 \'ant\'입니다. ");

		char alphabet8_1 = 'a', alphabet8_2 = 'c';
		System.out.println(alphabet8_1 + "와 " + alphabet8_2 + "사이에는 b가 있다.");

		char body9;
		body9 = '손';
		System.out.println("손가락은 " + body9 + "에 있습니다.");

		char num10_1 = '1', num10_2 = '2', num10_3 = '3';
		System.out.println(num10_1 + "+" + num10_2 + "=" + num10_3 + "입니다.");


		// h. boolean

		boolean flag1 = true;
		System.out.println("boolean 중 참은 " + flag1 + "입니다.");

		boolean flag2 = false;
		System.out.println("boolean 중 거짓은 " + flag2 + "입니다.");

		boolean flag3 = true;
		System.out.println("비트의 1은 " + flag3 + " 입니다.");

		boolean flag4 = false;
		System.out.println("비트의 2는 " + flag4 + " 입니다.");

		boolean x5 = true;
		System.out.println("boolean : " + x5);

		boolean y6 = true;
		System.out.println("boolean : " + y6);

		boolean result7 = true;
		int num1 = 7;
		int num2 = 9;
		result7 = (num1 == num2);
		System.out.println("Result : " + result7);

		boolean result8 = true;
		result8 = (num1 >= num2);
		System.out.println("Result : " + result8);

		boolean result9 = true;
		result9 = (num1 < num2);
		System.out.println("Result : " + result9);

		boolean result10 = true;
		result10 = (num1 != num2);
		System.out.println("Result : " + result10);


		// i. String

		String food1;
		food1 = "apple";
		System.out.println("내가 좋아하는 과일은 " + food1 + "입니다.");

		String month2;
		month2 = "6월";
		System.out.println("내 생일은 " + month2 + "입니다.");

		String season3;
		season3 = "fall";
		System.out.println("내가 좋아하는 계절은 " + season3 + "입니다.");

		String sex4;
		sex4 = "여자";
		System.out.println("성별은 " + sex4 + "입니다.");

		String actor5 = "who1", singer5 = "who2";
		System.out.println(actor5 + "가 " + singer5 + "와 함께 협업했다.");

		String place6, drink6;
		place6 = "바다";
		drink6 = "사이다";
		System.out.println("이번 여름에는 " + place6 + "에서 " + drink6 + "을 마실거야.");

		String mom7, dad7 = "푸들", baby7;
		mom7 = "말티즈";
		baby7 = "말티푸";
		System.out.println(mom7 + "와 " + dad7 + "사이에서 " + baby7 + "가 태어났다.");

		String dog8, cat8;
		dog8 = "강아지";
		cat8 = "고양이";
		System.out.println("당신은 " + dog8 + "와 " + cat8 + " 중에서 어떤 동물을 더 좋아하냐?");

		String company9;
		company9 = "SAMSUNG";
		System.out.println("A회사가 " + company9 + "를 합병했다.");

		String coffee10 = "아메리카노", latte10 = "바닐라라떼";
		System.out.println("나는 " + coffee10 + "로 너는 " + latte10 + "를 주문했다.");
		System.out.printf("나는 %s로 너는 %s를 주문했다.", coffee10, latte10);

	}

}
