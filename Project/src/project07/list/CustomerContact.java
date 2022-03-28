package project07.list;

//프로젝트-7 

//지금까지 진행한 Project는 배열을 이용해서 연락처를 저장했습니다.
//이번 Project에서는 컬렉션 프레임워크를 이용해서 연락처 인스턴스를 저장하도록 프로그램을 만들어 봅시다.
//
//1. List<E>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//2. HashSet<E>을 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//3. HashMap<K,V>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.

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
