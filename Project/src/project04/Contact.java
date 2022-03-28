package project04;

//프로젝트-4 

//프로젝트-3 에서 구현한 상속 구조를 기초로 Contact 클래스를 추상클래스로 만들어봅시다.
//1. ShowData인터페이스에 추상 메소드 void showData() 정의되어 있는 구조
//2. Contact클래스가 ShowData인터페이스를 상속하면서 추상 메소드를 보유하는 관계로 생성
//3. Contact클래스는 추상 메소드를 가지고 있어 추상클래스가 되는 형태로 정의
//4. SmartPhone클래스에 있는 배열의 타입이 추상클래스로 되어도 문제가 없는 것을 확인

public class Contact extends ContactAbs {

	public Contact() {
		super();
	}

	public Contact(String name, String phoneNum, String email, String address, String birthday, String group) {
		super(name, phoneNum, email, address, birthday, group);
	}

	@Override
	public void showData() {
		System.out.println("=====================================================");
		System.out.println("추상 메소드 완성");
		System.out.println("=====================================================");
		System.out.println();

		// SmartPhone클래스에 있는 배열의 타입이 추상클래스로 되어도 문제가 없는 것을 확인

		// 이렇게 추상메소드를 완성해야 인스턴스 생성이 가능한데
		// 어떻게 해야 추상클래스를 배열의 타입으로 쓸 수 있는건지 모르겠습니다.
	}

	@Override
	public void print() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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