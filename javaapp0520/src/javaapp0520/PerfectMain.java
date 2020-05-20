package javaapp0520;

public class PerfectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//완전수 : 자신을 제외한 약수의 합이 자신과 동일한 수
		//6 : 1,2,3,6 - 1+2+3=6 완전수
		//2부터 1000까지 완전수의 개수 : 3
		
		
		//개수를 구할 변수
		int cnt = 0;
		//swift는 i++가 없다!
		//2부터 1000까지
		for(int i=2; i<=1000; i=i+1) {
			//나누어 떨어지는 수 : 자신을 제외하는 경우에는 1부터 자신/2 까지만 확인하면된다.
			
			//합을 구할 변수
			int sum = 1;
			for(int j=2;j<=i/2;j=j+1) {
				if(i % j == 0) {
					sum = sum + j;
				}
			}
			//완전 수 인지 확인
			if(i==sum) {
				cnt = cnt+1;
				System.out.println(i);
			}
		}
		System.out.println("완전수 개수 : "+cnt);
	}

}
