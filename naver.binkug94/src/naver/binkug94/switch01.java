package naver.binkug94;

import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �޾Ƽ� �Է�
		//1�̸� �ѽ� 2�̸� �߽� 3�̸� �Ͻ�
		//������ ���� �߸��� �Է��̶�� ���
		//switch�� �̿��ؼ� ó��
		
		//���α׷��� �б� ���� �ϱ� ���ؼ� ��� ����
		final String KOREA = "1";
		final String CHINA = "2";
		final String JAPAN = "3";

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴��� �Է��ϼ���.");
		System.out.print("1.�ѽ� 2.�߽� 3.�Ͻ�   :  ");
		
		String menu = sc.nextLine();

		
		switch (menu) {
		case KOREA:
			System.out.println("�ѽ�");
			break;
		case CHINA:
			System.out.println("�߽�");
			break;
		case JAPAN:
			System.out.println("�Ͻ�");
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			break;
		}

		
		if (menu.equals(KOREA)) {
			System.out.println("�ѽ�");
		}else if (menu.equals(CHINA)) {
			System.out.println("�߽�");
		}else if (menu.equals(JAPAN)) {
			System.out.println("�Ͻ�");
		}else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		
		if (menu.equals(KOREA)) {
			System.out.println("�ѽ�");
		}
		if (menu.equals(CHINA)) {
			System.out.println("�߽�");
		}
		if (menu.equals(JAPAN)) {
			System.out.println("�Ͻ�");
		}
		if (menu.equals(KOREA) && menu.equals(CHINA) && menu.equals(JAPAN)) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		
		//��ĳ�� �ݱ�
		sc.close();
	}
	

}
