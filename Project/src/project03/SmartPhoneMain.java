package project03;

import java.util.Scanner;

//프로젝트-3

//프로젝트-2 에서 정의한 Contact 클래스를 상속의 구조로 만들어 봅니다.
//
//1. Contact 클래스는 기본정보를 저장하고 기본 정보를 출력하는 메소드를 정의합니다.
//- 생성자를 통해 기본 정보들을 초기화 합니다.
//
//2. 그룹에 해당하는 정보들을 추가적으로 정의하는 새로운 클래스들을 정의합니다.
//회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 회사이름, 부서이름, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//② CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 거래처회사이름, 거래품목, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
//3. SmartPhone 클래스의 배열을 다형성의 특징을 이용해서 상위 타입의 배열을 생성해서
//하위 클래스의 인스턴스를 저장하는 형태로 프로그램을 작성해봅시다.

public class SmartPhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SmartPhone s = new SmartPhone();

		System.out.println("--------------------------------");
		System.out.println("[직장]타입의 연락처를 등록합니다.");
		System.out.println("--------------------------------");
		System.out.print("이름을 입력해주세요.\n> ");
		String name1 = scanner.nextLine();
		System.out.print("연락처를 입력해주세요.\n> ");
		String phoneNum1 = scanner.nextLine();
		System.out.print("이메일을 입력해주세요.\n> ");
		String email1 = scanner.nextLine();
		System.out.print("주소를 입력해주세요.\n> ");
		String address1 = scanner.nextLine();
		System.out.print("생년월일을 입력해주세요.\n> ");
		String birthday1 = scanner.nextLine();
		System.out.print("그룹을을 입력해주세요.\n> ");
		String group1 = scanner.nextLine();
		System.out.print("회사명을 입력해주세요.\n> ");
		String myCompany1 = scanner.nextLine();
		System.out.print("부서를 입력해주세요.\n> ");
		String department1 = scanner.nextLine();
		System.out.print("직급을 입력해주세요.\n> ");
		String position1 = scanner.nextLine();

		s.cArr[s.numOfContact] = new CompanyContact(name1, phoneNum1, email1, address1, birthday1, group1,
				myCompany1, department1, position1);
		s.numOfContact++;
		s.printAll();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("[거래처]타입의 연락처를 등록합니다.");
		System.out.println("--------------------------------");
		System.out.print("이름을 입력해주세요.\n> ");
		String name2 = scanner.nextLine();
		System.out.print("연락처를 입력해주세요.\n> ");
		String phoneNum2 = scanner.nextLine();
		System.out.print("이메일을 입력해주세요.\n> ");
		String email2 = scanner.nextLine();
		System.out.print("주소를 입력해주세요.\n> ");
		String address2 = scanner.nextLine();
		System.out.print("생년월일을 입력해주세요.\n> ");
		String birthday2 = scanner.nextLine();
		System.out.print("그룹을을 입력해주세요.\n> ");
		String group2 = scanner.nextLine();
		System.out.print("회사명을 입력해주세요.\n> ");
		String customerCompany2 = scanner.nextLine();
		System.out.print("거래품목을 입력해주세요.\n> ");
		String item2 = scanner.nextLine();
		System.out.print("직급을 입력해주세요.\n> ");
		String position2 = scanner.nextLine();

		s.cArr[s.numOfContact] = new CustomerContact(name2, phoneNum2, email2, address2, birthday2, group2,
				customerCompany2, item2, position2);
		s.numOfContact++;
		s.printAll();

		scanner.close();
	}

}
