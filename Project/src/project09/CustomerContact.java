package project09;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

@SuppressWarnings("serial")
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
