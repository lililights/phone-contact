package project06;

//프로젝트-6 

//프로젝트-5 에서 구현한 구조를 기초로 예외처리를 해봅시다.
//
//1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리합시다.
//2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다.
//3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다.

public class Contact {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birthday;
	private String group;

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
		System.out.println("================================");
		System.out.println("<" + this.getName() + "님의 연락처>");
		System.out.println("--------------------------------");
		System.out.println("NAME\t\t" + this.getName());
		System.out.println("PHONE\t\t" + this.getPhoneNum());
		System.out.println("EMAIL\t\t" + this.getEmail());
		System.out.println("ADDRESS\t\t" + this.getAddress());
		System.out.println("B-DAY\t\t" + this.getBirthday());
		System.out.println("GROUP\t\t" + this.getGroup() + " 그룹");
	}
}