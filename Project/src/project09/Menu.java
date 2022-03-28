package project09;

//프로젝트-9

//파일 저장과 파일 로드 기능 구현 부분을 스레드로 구현해 봅시다.
//
//1. 파일 저장 메뉴와 파일 읽어오기 기능 구현 부분을 스레드로 처리해 봅시다.
//2. 스레드 처리 부분은 동기화도 처리합시다

public interface Menu {
	int INSERT = 1;
	int PRINT_ALL = 2;
	int SEARCH = 3;
	int UPDATE = 4;
	int DELETE = 5;
	int SAVE = 6;
	int LOAD = 7;
	int EXIT = 8;
}
