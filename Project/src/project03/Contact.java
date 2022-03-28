package project03;

//프로젝트-3

//프로젝트-2 에서 정의한 Contact 클래스를 상속의 구조로 만들어 봅니다.
//
//1. Contact 클래스는 기본정보를 저장하고 기본 정보를 출력하는 메소드를 정의합니다.
//- 생성자를 통해 기본 정보들을 초기화 합니다.
//
//2. 그룹에 해당하는 정보들을 추가적으로 정의하는 새로운 클래스들을 정의합니다.
//회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 회사이름, 부서이름, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//② CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 거래처회사이름, 거래품목, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//3. SmartPhone 클래스의 배열을 다형성의 특징을 이용해서 상위 타입의 배열을 생성해서
//하위 클래스의 인스턴스를 저장하는 형태로 프로그램을 작성해봅시다.

public class Contact {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birthday;
	private String group;

	public Contact() {

	}

	public Contact(String name, String phoneNum, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void print() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("<" + name + "님의 연락처>");
		System.out.println("--------------------------------");
		System.out.println("NAME\t\t" + name);
		System.out.println("PHONE\t\t" + phoneNum);
		System.out.println("EMAIL\t\t" + email);
		System.out.println("ADDRESS\t\t" + address);
		System.out.println("B-DAY\t\t" + birthday);
		System.out.println("GROUP\t\t" + group + " 그룹");
	}
}
