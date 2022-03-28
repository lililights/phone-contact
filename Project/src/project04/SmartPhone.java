package project04;

import java.util.Scanner;

//프로젝트-4 

//프로젝트-3 에서 구현한 상속 구조를 기초로 Contact 클래스를 추상클래스로 만들어봅시다.
//1. ShowData인터페이스에 추상 메소드 void showData() 정의되어 있는 구조
//2. Contact클래스가 ShowData인터페이스를 상속하면서 추상 메소드를 보유하는 관계로 생성
//3. Contact클래스는 추상 메소드를 가지고 있어 추상클래스가 되는 형태로 정의
//4. SmartPhone클래스에 있는 배열의 타입이 추상클래스로 되어도 문제가 없는 것을 확인

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
