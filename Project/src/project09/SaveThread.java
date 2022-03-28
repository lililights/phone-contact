package project09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

public class SaveThread extends Thread {
	SmartPhone s;

	public SaveThread(SmartPhone s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			synchronized (this) {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Contact.ser"));
				out.writeObject(s.list);
				out.close();
			}
			System.out.println("--------------------------------");
			System.out.println("연락처 목록이 성공적으로 저장되었습니다.");

		} catch (IOException e) {
			System.out.println("--------------------------------");
			System.out.println("연락처 목록 저장에 실패하였습니다.");
		}
	}

}