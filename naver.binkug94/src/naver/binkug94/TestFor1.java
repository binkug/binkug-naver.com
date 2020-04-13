package naver.binkug94;

public class TestFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 반복문을 이용해서 출력
		//1부터 5까지 반복
		//0,2,4,6,8을 출력
		for(int i=1;i<11;i++) {
			System.out.print(i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//3,6,9 만들기
		for(int a=1;a<10;a++) {
			if(a%3==0) {
				System.out.println(a);
			}
		}
		
		//0,2,4,6,8 만들기
		for(int b=0;b<9;b= b+2) {
			System.out.print(b);
		}
		
		//9,8,7,6,5,4,3,2,1 만들기
		for(int c=9;c>=0;c--) {
			System.out.println(c);
		}
		
		//0,1,2,3 출력하기
		for(int a=0;a<4;a++) {
			int abc =a%3;
			System.out.println(abc);
		}
		
		//0,0,1,1,2,2 반복
		for(int a=0;a<9;a++) {
			int abcd = a/3;
			//나머지를 구하면 값이 제한이 된다
			int abc = abcd%3;
			System.out.print(abc);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
				//3의 배수를 만나면 반복문이 종료
				//break;
				
				//3의 배수가 되면 아래로 내려가지않고
				//다음 반복을 수행
				//1,2 ,4,5 ,7,8, 10
			}
			System.out.println(i);
		}
		
	}

}
