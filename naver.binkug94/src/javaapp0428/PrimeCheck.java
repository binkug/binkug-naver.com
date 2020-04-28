package javaapp0428;

public class PrimeCheck {

	public static void main(String[] args) {
		// 2부터 1000까지에서 소수의 개수 구하기
		//소수(prime) : 2부터 자신의 절반이 되는 숫자까지 나누어 
		//나누어 떨어지지 않으면 소수
		
		//데이터 개수를 저장할 변수
		int count = 0;
		
		for(int i=2;i<=1000;i++) {
			boolean flag = false;
			//2부터 자신의 절반이 되는 숫자까지
			for(int j=2;j<=Math.sqrt(i);j++) {
				//나누어 떨어진 ㄱㅇ우
				if(i%j==0) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				System.out.printf("%4d",i);
				count++;
			}

		}
		System.out.printf("\n");
		System.out.println("소수 갯수는 : "+count);

	}

}
