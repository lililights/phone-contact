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
