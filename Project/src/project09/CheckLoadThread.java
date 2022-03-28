package project09;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

public class CheckLoadThread extends Thread {
	SmartPhone s;

	public CheckLoadThread(SmartPhone s) {
		this.s = s;
	}

	@Override
	public void run() {
		File newDir = new File("Contact.ser");

		if (newDir.exists()) {
			try {
				synchronized (this) {
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("Contact.ser"));
					s.list = (ArrayList) in.readObject();
					in.close();
				}
			} catch (Exception e) {
				System.out.println("--------------------------------");
				System.out.println("연락처 목록 불러오기에 실패하였습니다.");
				System.out.println("--------------------------------");
				System.out.print("메뉴로 돌아가려면 엔터를 누르세요.");
				s.scanner.nextLine();
			}
		}
	}

}