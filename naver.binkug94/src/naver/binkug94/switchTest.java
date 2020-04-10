package naver.binkug94;

import java.util.Scanner;

public class switchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >=60) {
			System.out.println("합격입니다.");
		}else if (score < 60) {
			System.out.println("불합격입니다.");
		}
		System.out.println("종료.");
		
		sc.close();
	}
}
