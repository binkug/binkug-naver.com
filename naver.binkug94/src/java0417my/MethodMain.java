package java0417my;

public class MethodMain {

	public static void main(String[] args) {
		//MethodClass의
		//static void  callByValue(int) 메소드를 호출해서 사용
		//static이 붙었으면 인스턴스 생성이 필요없다.
		//매개변수는 정수 1개
		//리턴 type는 void
		int n = 10;
		MethodClass.callByValue(n);
		//callByValue에 메소드안에 있는 것은 바뀌지만 이 곳에 있는 n은 바뀌지 않는다. 
		System.out.println("n : "+n);
		
		int [] ar = {20,23,30};
		//메소드에게 배열을 넘겨주었다
		//배열의 내용은 바뀜
		MethodClass.callByRefernce(ar);
		
		System.out.println("ar[0]: "+ar[0]);
		
		//MethodClass의 int sum1(int) 메소드 호출
		MethodClass mc = new MethodClass();
		//리턴 타입이 정수이므로 결과를 정수 변수에 저장
		int result = mc.sum1(1000);
		//결과를 출력
		System.out.println("합계 : "+result);
		
		
		//재귀는 메소드의 수행이 종료되기전에 다시 메소드를 호출하기 때문에
		//메모리를 많이 사용해서 메모리 부족이 일어남
		int result2 = mc.sum2(1000);
		
		System.out.println("합계 : "+result2);
		
	}

}
