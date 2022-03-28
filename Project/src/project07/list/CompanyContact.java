package project07.list;

//프로젝트-7 

//지금까지 진행한 Project는 배열을 이용해서 연락처를 저장했습니다.
//이번 Project에서는 컬렉션 프레임워크를 이용해서 연락처 인스턴스를 저장하도록 프로그램을 만들어 봅시다.
//
//1. List<E>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//2. HashSet<E>을 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//3. HashMap<K,V>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.

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
