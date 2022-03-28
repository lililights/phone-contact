package project02;

import java.util.Scanner;
import project01.Contact;

//프로젝트-2

//프로젝트-1 에서 정의한 Contact 클래스를 기반으로 아래 요구사항을 추가해서 프로그램을 작성 합니다.
//
//1. SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다.
//① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
//2. main()메소드를 아래의 요구조건을 정의해봅니다.
//① SmartPhone 클래스의 인스턴스를 생성합니다.
//② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
//③ 10번 반복해서 배열에 추가합니다.
//④ 배열의 모든 요소를 출력합니다.
//⑤ 배열의 모든 요소를 검색합니다.
//⑥ 배열의 요소를 삭제해 봅시다.
//⑦ 배열의 요소를 수정해 봅시다.

public class SmartPhone {
	Scanner scanner = new Scanner(System.in);
	Contact[] cArr;
	int numOfContact;

	public SmartPhone() {
		cArr = new Contact[10];
		numOfContact = 0;
	}

	public void insert(int index) {
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

		cArr[index] = new Contact(name, phoneNum, email, address, birthday, group);
	}

	public void printOne(int index) {
		Contact c = cArr[index];
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("<" + c.getName() + "님의 연락처>");
		System.out.println("--------------------------------");
		System.out.println("NAME\t\t" + c.getName());
		System.out.println("PHONE\t\t" + c.getPhoneNum());
		System.out.println("EMAIL\t\t" + c.getEmail());
		System.out.println("ADDRESS\t\t" + c.getAddress());
		System.out.println("B-DAY\t\t" + c.getBirthday());
		System.out.println("GROUP\t\t" + c.getGroup() + " 그룹");
	}

	public void printAll() {
		for (int i = 0; i < numOfContact; i++) {
			printOne(i);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public void update() {
		System.out.println("수정할 연락처의 이름을 입력하세요.");
		System.out.print("> ");
		String name = scanner.nextLine();

		if (searchIndex(name) == -1) {
			System.out.println("--------------------------------");
			System.out.println("해당 이름의 연락처 정보가 없습니다.");
			System.out.println("--------------------------------");
		} else {
			System.out.println("--------------------------------");
			System.out.println(name + "님의 연락처를 수정합니다.");
			System.out.println("--------------------------------");
			insert(searchIndex(name));
			System.out.println("--------------------------------");
			System.out.println(name + "님의 연락처 정보가 변경되었습니다.");
			System.out.println("--------------------------------");
		}
	}

	public void delete() {
		System.out.println("삭제할 연락처의 이름을 입력하세요.");
		System.out.print("> ");
		String name = scanner.nextLine();

		int index = searchIndex(name);
		if (index == -1) {
			System.out.println("--------------------------------");
			System.out.println("해당 이름의 연락처 정보가 없습니다.");
			System.out.println("--------------------------------");
		} else {
			for (int i = index; i < numOfContact - 1; i++) {
				cArr[i] = cArr[i + 1];
			}
			numOfContact--;
			System.out.println("--------------------------------");
			System.out.println(name + "님의 연락처가 삭제 되었습니다.");
			System.out.println("--------------------------------");
		}
	}

	public void search() {
		System.out.println("검색할 연락처의 이름을 입력하세요.");
		System.out.print("> ");
		String name = scanner.nextLine();

		if (searchIndex(name) == -1) {
			System.out.println("--------------------------------");
			System.out.println("해당 이름의 연락처 정보가 없습니다.");
			System.out.println("--------------------------------");
		} else {
			printOne(searchIndex(name));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

	private int searchIndex(String name) {
		int index = -1;

		for (int i = 0; i < numOfContact; i++) {
			if (cArr[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
}
