package project07.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import project06.BadInputException;

//프로젝트-7 

//지금까지 진행한 Project는 배열을 이용해서 연락처를 저장했습니다.
//이번 Project에서는 컬렉션 프레임워크를 이용해서 연락처 인스턴스를 저장하도록 프로그램을 만들어 봅시다.
//
//1. List<E>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//2. HashSet<E>을 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//3. HashMap<K,V>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.

public class SmartPhone {
	Scanner scanner = new Scanner(System.in);
	List<Contact> list;

	public SmartPhone() {
		list = new ArrayList<>();
	}

	public void add(Contact c) {
		list.add(c);
		System.out.println("--------------------------------");
		System.out.println("등록이 완료되었습니다.");
		System.out.println("--------------------------------");
		System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
		scanner.nextLine();
	}

	public Contact insert(int index, int contactType) {
		String name = checkName();
		String phoneNum = checkPhoneNum(index);
		String email = checkEmail();
		String address = checkStr("주소를 입력해주세요.\n> ");
		String birthday = checkBirthday();
		String group = checkStr("그룹을 입력해주세요.\n> ");

		if (contactType == 1) {
			return new Contact(name, phoneNum, email, address, birthday, group);
		} else if (contactType == 2) {
			String myCompany = checkStr("회사명을 입력해주세요.\n> ");
			String department = checkStr("부서를 입력해주세요.\n> ");
			String position = checkStr("직급을 입력해주세요.\n> ");
			return new CompanyContact(name, phoneNum, email, address, birthday, group, myCompany, department,
					position);
		} else if (contactType == 3) {
			String customerCompany = checkStr("회사명을 입력해주세요.\n> ");
			String item = checkStr("거래품목을 입력해주세요.\n> ");
			String position = checkStr("직급을 입력해주세요.\n> ");
			return new CustomerContact(name, phoneNum, email, address, birthday, group, customerCompany, item,
					position);
		}
		return null;
	}

	public void printOne(int index) {
		Contact c = list.get(index);
		c.print();
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Contact c = list.get(i);
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
			if (list.get(index) instanceof CompanyContact) {
				contactType = 2;
			} else if (list.get(index) instanceof CustomerContact) {
				contactType = 3;
			} else {
				contactType = 1;
			}

			list.set(index, insert(index, contactType));

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
			list.remove(index);
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

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	private void checkBadInput(boolean checkStr) throws BadInputException {
		if (checkStr) {
			BadInputException e = new BadInputException();
			throw e;
		}
	}

	private String checkName() {
		String name;

		while (true) {
			try {
				System.out.print("이름을 입력해주세요.\n> ");
				name = scanner.nextLine().trim();
				checkBadInput(!(name.matches("^[가-힣a-zA-Z]+$")));
				break;
			} catch (BadInputException e) {
				System.out.println(e.getMessage());
			}
		}
		return name;
	}

	private String checkPhoneNum(int index) {
		String phoneNum;
		int noticeCode = 0;
		while (true) {
			try {
				System.out.print("전화번호를 입력해주세요. (예: 010-9999-8888)\n> ");
				phoneNum = scanner.nextLine().trim();
				checkBadInput(!(phoneNum.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$")));
				noticeCode = 1;
				checkBadInput(checkDup(phoneNum, index));
				break;
			} catch (BadInputException e) {
				if (noticeCode == 1) {
					System.out.println("(이미 등록된 연락처 입니다.)");
					noticeCode = 0;
				} else {
					System.out.println(e.getMessage());
				}
			}
		}
		return phoneNum;
	}

	private boolean checkDup(String phoneNum, int index) {
		boolean checkDup = false;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNum().equals(phoneNum)) {
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

	private String checkEmail() {
		String email;
		while (true) {
			try {
				System.out.print("이메일을 입력해주세요. (예: address@email.com)\n> ");
				email = scanner.nextLine().trim();
				checkBadInput(!(email.matches("\\w+@\\w+\\.\\w+")));
				break;
			} catch (BadInputException e) {
				System.out.println(e.getMessage());
			}
		}
		return email;
	}

	private String checkBirthday() {
		String birthday;
		while (true) {
			try {
				System.out.print("생년월일을 입력해주세요. (예: 1999년 1월 1일)\n> ");
				birthday = scanner.nextLine().trim();
				checkBadInput(!(birthday.matches("^\\d{4}년( ?)\\d{1,2}월( ?)\\d{1,2}일$")));
				break;
			} catch (BadInputException e) {
				System.out.println(e.getMessage());
			}
		}
		return birthday;
	}

	private String checkStr(String message) {
		String str;
		while (true) {
			try {
				System.out.print(message);
				str = scanner.nextLine().trim();
				checkBadInput(str.length() < 1);
				break;
			} catch (BadInputException e) {
				System.out.println(e.getMessage());
			}
		}
		return str;
	}

	public int checkUserChoice(String message, int min, int max) {
		int userChoiceI;

		while (true) {
			try {
				System.out.print(message);
				String userChoiceS = scanner.nextLine().trim();
				if (!(userChoiceS.matches("^[0-9]+$")) || Integer.parseInt(userChoiceS) < min
						|| Integer.parseInt(userChoiceS) > max) {
					checkBadInput(true);
				}
				userChoiceI = Integer.parseInt(userChoiceS);
				break;

			} catch (BadInputException e) {
				System.out.println(e.getMessage());
			}
		}
		return userChoiceI;
	}
}
