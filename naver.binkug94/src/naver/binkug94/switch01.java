package naver.binkug94;

import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수를 받아서 입력
		//1이면 한식 2이면 중식 3이면 일식
		//나머지 경우는 잘못된 입력이라고 출력
		//switch를 이용해서 처리
		
		//프로그램을 읽기 좋게 하기 위해서 상수 선언
		final String KOREA = "1";
		final String CHINA = "2";
		final String JAPAN = "3";

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 입력하세요.");
		System.out.print("1.한식 2.중식 3.일식   :  ");
		
		String menu = sc.nextLine();

		
		switch (menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}

		
		if (menu.equals(KOREA)) {
			System.out.println("한식");
		}else if (menu.equals(CHINA)) {
			System.out.println("중식");
		}else if (menu.equals(JAPAN)) {
			System.out.println("일식");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		if (menu.equals(KOREA)) {
			System.out.println("한식");
		}
		if (menu.equals(CHINA)) {
			System.out.println("중식");
		}
		if (menu.equals(JAPAN)) {
			System.out.println("일식");
		}
		if (menu.equals(KOREA) && menu.equals(CHINA) && menu.equals(JAPAN)) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		//스캐너 닫기
		sc.close();
	}
	

}
