package project06;

//프로젝트-6 

//프로젝트-5 에서 구현한 구조를 기초로 예외처리를 해봅시다.
//
//1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리합시다.
//2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다.
//3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다.

public class CustomerContact extends Contact {
	String customerCompany;
	String item;
	String position;

	public CustomerContact(String name, String phoneNum, String email, String address, String birthday, String group,
			String customerCompany, String item, String position) {
		super(name, phoneNum, email, address, birthday, group);
		this.customerCompany = customerCompany;
		this.item = item;
		this.position = position;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("COMPANY\t\t" + customerCompany);
		System.out.println("ITEM\t\t" + item);
		System.out.println("POSITION\t" + position);
	}

	public String getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
