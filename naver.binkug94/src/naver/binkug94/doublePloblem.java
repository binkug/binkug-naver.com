package naver.binkug94;

public class doublePloblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int idx = 0;
		int a = 1;

		

		//실수를 가지고 산술 연산을 실행하면 잘못된 결과가 나올 수 있다.
		while (idx<1000) {
			sum = sum + 0.1;
			idx++;
			
		}
		
		System.out.println(sum);
		
	}
		//산술 연산을 할 때 되도록이면 소수가 있는 실수는 사용하지 않는 것이 바람직하다.
		//실수는 정확하게 표현하지 못하는 경우가 있어서 잘못된 결과를 리턴할 수 있습니다.
	/*
		 정확한 계산을 위해서는 정수로 변환해서 계산을 하던가 아니면 각 자리를 나눠어서 계산을
		 하는데 대부분 언어는 이러한 작업으로 자동으로 해주는 클래스나 함수를 제공한다.
	*/
	
	
}
