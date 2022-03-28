package project06;

import java.util.Scanner;

import project05.Menu;

//프로젝트-6 

//프로젝트-5 에서 구현한 구조를 기초로 예외처리를 해봅시다.
//
//1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리합시다.
//2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다.
//3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다.

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
				if (s.numOfContact < s.cArr.length) {
					System.out.println("================================");
					System.out.println("1. 일반 연락처 등록");
					System.out.println("2. [직장 동료] 연락처 등록");
					System.out.println("3. [거래처] 연락처 등록");
					System.out.println("================================");
					int contactType = s.checkUserChoice("연락처 타입을 선택해주세요.\n> ", 1, 3);

					s.insert(s.numOfContact, contactType);
					s.numOfContact++;
					System.out.println("--------------------------------");
					System.out.println("등록이 완료되었습니다.");
					System.out.println("--------------------------------");
					System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
					scanner.nextLine();

				} else {
					System.out.println("--------------------------------");
					System.out.println("등록 가능한 최대 인원은 " + s.cArr.length + "명 입니다.");
					System.out.println("--------------------------------");
					System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
					scanner.nextLine();
				}

			} else if (userChoice == Menu.EXIT) {
				System.out.println("--------------------------------");
				System.out.println("연락처 프로그램을 종료합니다.");
				System.out.println("--------------------------------");
				scanner.close();
				break;

			} else {
				if (s.numOfContact == 0) {
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
