package project01;

import java.util.Scanner;

//프로젝트-1

//아래 이미지는 우리가 흔히 볼 수 있는 스마트폰에 이름, 전화번호, 이메일 등과 같은 연락처 정보를 저장하는 애플리케이션 화면입니다.
//아래 데이터들을 저장하고, 데이터를 출력하는 메소드를 가지는 클래스 Contact를 정의해봅시다.
//01
//저장 정보
// 이름, 전화번호, 이메일, 주소, 생일, 그룹
//기능
// 위 데이터를 출력하는 기능
//추가 요구 사항
// 변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다.
//변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
//변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
// 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다.
// 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다.
//실행 과정
// main()메소드를 정의합니다.
// 연락처 데이터를 저장하는 인스턴스를 생성합니다.
// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
// 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
// 인스턴스의 출력메소드를 다시 실행합니다.

public class ContactMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("=====================================================");
		System.out.println("<연락처 데이터를 저장하는 인스턴스를 생성>");
		System.out.println("=====================================================");

		System.out.print("이름을 입력해주세요.\n> ");
		String name = scanner.nextLine();
		System.out.print("연락처를 입력해주세요.\n> ");
		String phoneNum = scanner.nextLine();
		System.out.print("이메일을 입력해주세요.\n> ");
		String email = scanner.nextLine();
		System.out.print("주소를 입력해주세요.\n> ");
		String address = scanner.nextLine();
		System.out.print("생년월일을 입력해주세요.\n> ");
		String birthday = scanner.nextLine();
		System.out.print("그룹을 입력해주세요.\n> ");
		String group = scanner.nextLine();

		Contact c = new Contact(name, phoneNum, email, address, birthday, group);

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력>");
		System.out.println("=====================================================");

		System.out.println("이름: " + c.getName());
		System.out.println("연락처: " + c.getPhoneNum());
		System.out.println("이메일: " + c.getEmail());
		System.out.println("주소: " + c.getAddress());
		System.out.println("생년월일: " + c.getBirthday());
		System.out.println("그룹: " + c.getGroup());

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<생성된 인스턴스의 정보 출력 메소드를 호출>");
		System.out.println("=====================================================");

		c.print();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정>");
		System.out.println("=====================================================");

		update(c);

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<인스턴스의 출력메소드를 다시 실행>");
		System.out.println("=====================================================");

		c.print();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		scanner.close();
	}

	public static void update(Contact c) {
		System.out.print("이름을 입력해주세요.\n> ");
		c.setName(scanner.nextLine());
		System.out.print("연락처를 입력해주세요.\n> ");
		c.setPhoneNum(scanner.nextLine());
		System.out.print("이메일을 입력해주세요.\n> ");
		c.setEmail(scanner.nextLine());
		System.out.print("주소를 입력해주세요.\n> ");
		c.setAddress(scanner.nextLine());
		System.out.print("생년월일을 입력해주세요.\n> ");
		c.setBirthday(scanner.nextLine());
		System.out.print("그룹을 입력해주세요.\n> ");
		c.setGroup(scanner.nextLine());
	}
}