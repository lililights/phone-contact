package project07.hashSet;

import java.util.Scanner;

import project05.Menu;

//프로젝트-7 

//지금까지 진행한 Project는 배열을 이용해서 연락처를 저장했습니다.
//이번 Project에서는 컬렉션 프레임워크를 이용해서 연락처 인스턴스를 저장하도록 프로그램을 만들어 봅시다.
//
//1. List<E>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//2. HashSet<E>을 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.
//3. HashMap<K,V>를 이용해서 저장 및 관리하는 프로그램을 만들어 봅시다.

public class SmartPhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SmartPhone s = new SmartPhone();

		while (true) {
			System.out.println("================================");
			System.out.println(Menu.INSERT + ". 새 연락처 등록");
			System.out.println(Menu.PRINT_ALL + ". 연락처 전체 출력");
			System.out.println(Menu.SEARCH + ". 연락처 검색");
			System.out.println(Menu.UPDATE + ". 연락처 수정");
			System.out.println(Menu.DELETE + ". 연락처 삭제");
			System.out.println(Menu.EXIT + ". 프로그램 종료");
			System.out.println("================================");
			int userChoice = s.checkUserChoice("메뉴를 선택해주세요.\n> ", 1, 6);

			if (userChoice == Menu.INSERT) {
				System.out.println("================================");
				System.out.println("1. 일반 연락처 등록");
				System.out.println("2. [직장 동료] 연락처 등록");
				System.out.println("3. [거래처] 연락처 등록");
				System.out.println("================================");
				int contactType = s.checkUserChoice("연락처 타입을 선택해주세요.\n> ", 1, 3);
				s.add(s.insert(contactType));

			} else if (userChoice == Menu.EXIT) {
				System.out.println("--------------------------------");
				System.out.println("연락처 프로그램을 종료합니다.");
				System.out.println("--------------------------------");
				scanner.close();
				break;

			} else {
				if (s.set.isEmpty()) {
					System.out.println("--------------------------------");
					System.out.println("등록된 연락처 정보가 없습니다.");
					System.out.println("--------------------------------");
					System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
					scanner.nextLine();
				} else {
					if (userChoice == Menu.PRINT_ALL) {
						s.printAll();
					} else if (userChoice == Menu.SEARCH) {
						s.search();
					} else if (userChoice == Menu.UPDATE) {
						s.update();
					} else if (userChoice == Menu.DELETE) {
						s.delete();
					}
				}
			}
		}
	}

}
