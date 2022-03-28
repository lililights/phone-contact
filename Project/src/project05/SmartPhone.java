package project05;

import java.util.Scanner;

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

public class SmartPhone {
	Scanner scanner = new Scanner(System.in);
	Contact[] cArr;
	int numOfContact;

	public SmartPhone() {
		cArr = new Contact[10];
		numOfContact = 0;
	}

	public void insert(int index, int contactType) {
		String name = checkStr("이름을 입력해주세요.\n> ");
		String phoneNum = checkPhoneNum("연락처를 입력해주세요.\n> ", index);
		String email = checkStr("이메일을 입력해주세요.\n> ");
		String address = checkStr("주소를 입력해주세요.\n> ");
		String birthday = checkStr("생년월일을 입력해주세요.\n> ");
		String group = checkStr("그룹을 입력해주세요.\n> ");

		switch (contactType) {
		case 1:
			cArr[index] = new Contact(name, phoneNum, email, address, birthday, group);
			break;
		case 2:
			String myCompany = checkStr("회사명을 입력해주세요.\n> ");
			String department = checkStr("부서를 입력해주세요.\n> ");
			String position = checkStr("직급을 입력해주세요.\n> ");
			cArr[index] = new CompanyContact(name, phoneNum, email, address, birthday, group, myCompany, department,
					position);
			break;
		case 3:
			String customerCompany = checkStr("회사명을 입력해주세요.\n> ");
			String item = checkStr("거래품목을 입력해주세요.\n> ");
			position = checkStr("직급을 입력해주세요.\n> ");
			cArr[index] = new CustomerContact(name, phoneNum, email, address, birthday, group, customerCompany, item,
					position);
			break;
		}
	}

	public String checkStr(String message) {
		String str;
		while (true) {
			System.out.print(message);
			str = scanner.nextLine().trim();
			if (str.length() < 1) {
				System.out.println("(공백은 입력하실 수 없습니다.)");
			} else {
				break;
			}
		}
		return str;
	}

	public void printOne(int index) {
		Contact c = cArr[index];
		c.print();
	}

	public void printAll() {
		for (int i = 0; i < numOfContact; i++) {
			Contact c = cArr[i];
			c.print();
		}
		System.out.println("================================");
		System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
		scanner.nextLine();
	}

	public void update() {
		String name = checkStr("수정할 연락처의 이름을 입력하세요.\n> ");
		int index = searchIndex(name);

		if (index == -1) {
			System.out.println("--------------------------------");
			System.out.println("해당 이름의 연락처 정보가 없습니다.");
			System.out.println("--------------------------------");
		} else {
			System.out.println("--------------------------------");
			System.out.println(name + "님의 연락처를 수정합니다.");
			System.out.println("--------------------------------");

			int contactType = 0;
			if (cArr[index] instanceof CompanyContact) {
				contactType = 2;
			} else if (cArr[index] instanceof CustomerContact) {
				contactType = 3;
			} else {
				contactType = 1;
			}
			insert(index, contactType);

			System.out.println("--------------------------------");
			System.out.println(name + "님의 연락처 정보가 변경되었습니다.");
			System.out.println("--------------------------------");
		}
		System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
		scanner.nextLine();
	}

	public void delete() {
		String name = checkStr("삭제할 연락처의 이름을 입력하세요.\n> ");
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
		System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
		scanner.nextLine();
	}

	public void search() {
		String name = checkStr("검색할 연락처의 이름을 입력하세요.\n> ");

		if (searchIndex(name) == -1) {
			System.out.println("--------------------------------");
			System.out.println("해당 이름의 연락처 정보가 없습니다.");
			System.out.println("--------------------------------");
		} else {
			printOne(searchIndex(name));
			System.out.println("================================");
		}
		System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
		scanner.nextLine();
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

	private String checkPhoneNum(String message, int index) {
		String phoneNum = null;

		while (true) {
			System.out.print(message);
			phoneNum = scanner.nextLine();
			phoneNum = phoneNum.trim();
			if (phoneNum.equals("")) {
				System.out.println("(공백은 입력하실 수 없습니다.)");
			} else if (checkDup(phoneNum, index)) {
				System.out.print("(이미 등록된 연락처 입니다.)\n> ");
			} else {
				break;
			}
		}
		return phoneNum;
	}

	private boolean checkDup(String phoneNum, int index) {
		boolean checkDup = false;

		for (int i = 0; i < numOfContact; i++) {
			if (cArr[i].getPhoneNum().equals(phoneNum)) {
				if (i == index) {
					checkDup = false;
					break;
				} else {
					checkDup = true;
					break;
				}
			}
		}
		return checkDup;
	}
}
