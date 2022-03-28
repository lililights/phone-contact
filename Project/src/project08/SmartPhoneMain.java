package project08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//프로젝트-8

//프로젝트-7 에서 List<E>에 저장된 인스턴스들을 직렬화 하고 역 직렬화 하는 프로그램을 만들어 봅시다.
//==========================
//연락처 관리프로그램
//1. 연락처 입력
//2. 연락처 검색
//3. 연락처 수정
//4. 연락처 삭제
//5. 연락처 전체 리스트 보기
//6. 파일 저장
//7. 파일 로드
//8. 종료
//==========================
//1. 파일 저장 메뉴와 파일 읽어오기 기능을 추가합시다.
//2. 프로그램이 시작할 때 파일 읽어오기.

public class SmartPhoneMain {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);

		SmartPhone s = new SmartPhone();

		s.checkLoad();
		while (true) {
			System.out.println("================================");
			System.out.println(Menu.INSERT + ". 새 연락처 등록");
			System.out.println(Menu.PRINT_ALL + ". 연락처 전체 출력");
			System.out.println(Menu.SEARCH + ". 연락처 검색");
			System.out.println(Menu.UPDATE + ". 연락처 수정");
			System.out.println(Menu.DELETE + ". 연락처 삭제");
			System.out.println(Menu.SAVE + ". 연락처 목록 저장");
			System.out.println(Menu.LOAD + ". 연락처 목록 불러오기");
			System.out.println(Menu.EXIT + ". 프로그램 종료");
			System.out.println("================================");
			int userChoice = s.checkUserChoice("메뉴를 선택해주세요.\n> ", 1, 8);

			if (userChoice == Menu.INSERT) {
				System.out.println("================================");
				System.out.println("1. 일반 연락처 등록");
				System.out.println("2. [직장 동료] 연락처 등록");
				System.out.println("3. [거래처] 연락처 등록");
				System.out.println("================================");
				int contactType = s.checkUserChoice("연락처 타입을 선택해주세요.\n> ", 1, 3);
				s.add(s.insert(s.list.size(), contactType));

			} else if (userChoice == Menu.EXIT) {
				System.out.println("--------------------------------");
				System.out.println("연락처 프로그램을 종료합니다.");
				System.out.println("--------------------------------");
				scanner.close();
				break;

			} else if (userChoice == Menu.SAVE) {
				s.save();
			} else if (userChoice == Menu.LOAD) {
				s.load();
			} else {
				if (s.list.isEmpty()) {
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
