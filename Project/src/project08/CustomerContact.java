package project08;

//프로젝트-8

//프로젝트-7 에서 List<E>에 저장된 인스턴스들을 직렬화 하고 역 직렬화 하는 프로그램을 만들어 봅시다.
//==========================
//연락처 관리프로그램
//1. 연락처 입력
//2. 연락처 검색
//3. 연락처 수정
//4. 연락처 삭제
//5. 연락처 전체 리스트 보기
//6. 파일 저장
//7. 파일 로드
//8. 종료
//==========================
//1. 파일 저장 메뉴와 파일 읽어오기 기능을 추가합시다.
//2. 프로그램이 시작할 때 파일 읽어오기.

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
