package java0417my;



public class MethodClass {

	public static void  callByValue(int value) {
		System.out.println("메소드 내의 value 초기값 : "+value);
		
		value = value + 1;
		System.out.println("메소드 내의 value 변화 : "+value);
	}
	
	//매개변수가 참조형인 메소드 : call by reference
	public static void callByRefernce(int [] ar) {
		System.out.println("ar[0]: "+ar[0]);
		ar[0] = ar[0]+1;
		System.out.println("ar[0]: "+ar[0]);
		

	}
	
	//1부터 n가지의 합계를 구해서 리턴해주는 메소드
	//static이 없으므로 인스턴스를 이용해서 호출
	//정수 1개를 매개변수로 받고 정수를 리턴
	public int sum1(int n) {
		
		int tot = 0;
		for(int i=0;i<=n;i++) {
			tot = tot+i;
			
		}
		
		return tot;
		
	}
	
	//재귀를 이용한 1-n까지 합계
	public int sum2(int n) {
		//종료 시점을 생성
		//1까지의 합계는 1
		if(n==1) {
			return 1;
		}
		return n+sum2(n-1);
	}
}
