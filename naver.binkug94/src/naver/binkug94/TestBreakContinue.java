package naver.binkug94;

import java.util.Scanner;

public class TestBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//root가 아닌 데이터를 입력할 때까지
		//계속 입력받기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		//무한반복
		while (true) {
			System.out.println("아이디 입력");
			String id = sc.nextLine();
			if(id.equals("root")==true) {
			break;
			}
		}
		
		System.out.println("사용 가능한 아이디 입니다.");
		//스캐너 사용 종료
		
		
		int idx = 0;

		for(idx=0;idx<6;idx++) {
			
			System.out.println("1~45의 숫자를 입력해주세요 :");
			num = sc.nextInt();
			if(num <1 || num >45) {
				System.out.println("번호를 다시 입력해주세요");
				idx--;
				continue;
			}
			System.out.println(idx+1 + "번째"+num);
		}
		System.out.println("종료");
		
		sc.close();
	}

}
