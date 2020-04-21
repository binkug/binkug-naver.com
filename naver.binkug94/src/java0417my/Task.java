package java0417my;

public class Task {
	
	public void noRecuresionFibo(int n) {
		int fibo = -1;
		
		for(int i=0;i<=n;i++) {
			
//			return fibo;
		}
		
	}
	
	public int recursiveFibo(int n) {
		
		//재귀를 이용한 피보나치 수열의 값
		//첫번쨰와 두번째는 1
		//그 이외의 경우는 n-1번째와 n-2번째의 합
		if(n==1 || n==2) {
			return 1;
		}else {
			return recursiveFibo(n-1)+recursiveFibo(n-2);
		}
		

		
	}
}
