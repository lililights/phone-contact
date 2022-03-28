package project09;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

@SuppressWarnings("serial")
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
