package com.test.java.question.obj.access;

public class Q04 {
	public static void main(String[] args) {


		/*
		4번 문제 조건 
		Employee 객체의 정보
		이름, 부서, 직책, 연락처, 직속상사
		모든 멤버 변수의 접근 지정자는 private으로 한다.
		멤버 접근을 위한 Setter와 Getter를 정의한다.
		이름 : 읽기/쓰기, 한글 2~5자 이내
		부서 : 읽기/쓰기, 영업부, 기획부, 총무부, 개발부, 홍보부
		직잭 : 읽기/쓰기, 부장, 과장, 대리, 사원
		연락처 : 읽기/쓰기, 010-XXXX-XXXX 형식 확인
		직속상사 : 읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
		Employee 객체 메소드
		void info() : 직원 정보 확인 
		*/


		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); // 직속 상사 없음

		e1.info();


		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); // 직속 상사 e1(홍길동)

		e2.info();



	} // main
} // Q01


class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.equals("영업부") || department.equals("기획부") || department.equals("총무부")
				|| department.equals("개발부") || department.equals("홍보부"))
			this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (department.equals("부장") || department.equals("과장") || department.equals("대리")
				|| department.equals("사원") || department.equals("홍보부"))

			this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}

	public void info() {

	}

}// Employ


/*
 출력
 [홍길동]
- 부서: 홍보부
- 직위: 부장
- 연락처: 010-1234-5678
- 직속상사: 없음

 [아무개]
- 부서: 홍보부
- 직위: 사원
- 연락처: 010-2541-8569
- 직속상사: 홍길동(홍보부 부장)
*/
