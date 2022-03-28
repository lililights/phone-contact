package project04;

import java.util.Scanner;

//프로젝트-4 

//프로젝트-3 에서 구현한 상속 구조를 기초로 Contact 클래스를 추상클래스로 만들어봅시다.
//1. ShowData인터페이스에 추상 메소드 void showData() 정의되어 있는 구조
//2. Contact클래스가 ShowData인터페이스를 상속하면서 추상 메소드를 보유하는 관계로 생성
//3. Contact클래스는 추상 메소드를 가지고 있어 추상클래스가 되는 형태로 정의
//4. SmartPhone클래스에 있는 배열의 타입이 추상클래스로 되어도 문제가 없는 것을 확인

public class SmartPhoneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Contact c = new Contact();
		c.showData();

		System.out.println("=====================================================");
		System.out.println("<3번 반복해서 배열에 추가>");
		System.out.println("=====================================================");

		SmartPhone s = new SmartPhone();

		for (int i = 0; i < 3; i++) {
			System.out.println("--------------------------------");
			System.out.println((i + 1) + "번째 연락처를 입력해주세요.");
			System.out.println("--------------------------------");
			s.insert(i);
			s.numOfContact++;
		}

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<배열의 모든 요소를 출력>");
		System.out.println("=====================================================");

		s.printAll();

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<배열의 모든 요소를 검색>");
		System.out.println("=====================================================");

		s.search();

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<배열의 요소를 삭제>");
		System.out.println("=====================================================");

		s.delete();
		s.printAll();

		System.out.println();
		System.out.println("=====================================================");
		System.out.println("<배열의 요소를 수정>");
		System.out.println("=====================================================");

		s.update();
		s.printAll();

		scanner.close();
	}
}
