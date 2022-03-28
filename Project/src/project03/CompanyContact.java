package project03;

//프로젝트-3

//프로젝트-2 에서 정의한 Contact 클래스를 상속의 구조로 만들어 봅니다.
//
//1. Contact 클래스는 기본정보를 저장하고 기본 정보를 출력하는 메소드를 정의합니다.
//- 생성자를 통해 기본 정보들을 초기화 합니다.
//
//2. 그룹에 해당하는 정보들을 추가적으로 정의하는 새로운 클래스들을 정의합니다.
// 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 회사이름, 부서이름, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//② CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 거래처회사이름, 거래품목, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//3. SmartPhone 클래스의 배열을 다형성의 특징을 이용해서 상위 타입의 배열을 생성해서
// 하위 클래스의 인스턴스를 저장하는 형태로 프로그램을 작성해봅시다.

public class CompanyContact extends Contact {
	String myCompany;
	String department;
	String position;

	public CompanyContact(String name, String phoneNum, String email, String address, String birthday, String group,
			String myCompany, String department, String position) {
		super(name, phoneNum, email, address, birthday, group);
		this.myCompany = myCompany;
		this.department = department;
		this.position = position;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("COMPANY\t\t" + myCompany);
		System.out.println("DEPARTMENT\t" + department);
		System.out.println("POSITION\t" + position);
	}

	public String getMyCompany() {
		return myCompany;
	}

	public void setMyCompany(String myCompany) {
		this.myCompany = myCompany;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
