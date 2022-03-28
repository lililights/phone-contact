package project05;

//프로젝트-5

//이번 Project에서는 메뉴를 두고 연락처의 입출력 및 관리가 프로그램이 종료되지 않고
//유지가 되도록 하는 프로그램을 만들어봅시다.
//
//1. 아래의 흐름이 유지가 되도록 메뉴를 무한반복 처리해 봅시다.
//==========================
//연락처 관리프로그램
//1. 연락처 입력
//2. 연락처 검색
//3. 연락처 수정
//4. 연락처 삭제
//5. 연락처 전체 리스트 보기
//6. 종료
//==========================
//2. 입력 또는 수정할 때 공백 문자열을 입력 받으면 다시 입력 받도록 흐름을 만들어봅시다.
//3. 입력할 때 전화번호가 같은 데이터가 입력되면 입력이 되지 않도록 흐름을 만들어봅시다.

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