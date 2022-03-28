package project09;

import java.io.Serializable;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

public class Contact implements Serializable {
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