package naver.binkug94;

import java.util.Scanner;

public class switchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
		
		if (score >=60) {
			System.out.println("�հ��Դϴ�.");
		}else if (score < 60) {
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println("����.");
		
		sc.close();
	}
}
