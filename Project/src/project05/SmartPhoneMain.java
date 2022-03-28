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
			String userChoice = s.checkStr("메뉴를 선택해주세요.\n> ");
			int userChoiceInt = Integer.parseInt(userChoice);

			if (userChoiceInt == Menu.INSERT) {
				if (s.numOfContact < s.cArr.length) {
					System.out.println("================================");
					System.out.println("1. 일반 연락처 등록");
					System.out.println("2. [직장 동료] 연락처 등록");
					System.out.println("3. [거래처] 연락처 등록");
					System.out.println("================================");
					String contactType = s.checkStr("연락처 타입을 선택해주세요.\n> ");
					int contactTypeInt = Integer.parseInt(contactType);
					s.insert(s.numOfContact, contactTypeInt);
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

			} else if (userChoiceInt == Menu.EXIT) {
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
					if (userChoiceInt == Menu.PRINT_ALL) {
						s.printAll();
					} else if (userChoiceInt == Menu.SEARCH) {
						s.search();
					} else if (userChoiceInt == Menu.UPDATE) {
						s.update();
					} else if (userChoiceInt == Menu.DELETE) {
						s.delete();
					}
				}
			}
		}
	}

}
