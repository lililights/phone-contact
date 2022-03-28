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

public class LoadThread extends Thread {
	SmartPhone s;

	public LoadThread(SmartPhone s) {
		this.s = s;
	}

	@Override
	public void run() {
		File newDir = new File("Contact.ser");

		if (!newDir.exists()) {
			System.out.println("--------------------------------");
			System.out.println("저장된 연락처 목록이 없습니다.");

		} else {
			try {
				synchronized (this) {
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("Contact.ser"));
					s.list = (ArrayList) in.readObject();
					in.close();
				}
				if (!(s.list.isEmpty())) {
					System.out.println("--------------------------------");
					System.out.println("저장된 연락처 목록을 성공적으로 불러왔습니다.");

				} else {
					System.out.println("--------------------------------");
					System.out.println("저장된 연락처 목록이 없습니다.");
				}

			} catch (Exception e) {
				System.out.println("--------------------------------");
				System.out.println("연락처 목록 불러오기에 실패하였습니다.");
			}
		}
	}

}