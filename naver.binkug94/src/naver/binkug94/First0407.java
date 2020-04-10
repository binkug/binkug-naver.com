package naver.binkug94;

public class First0407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//나이를 Main Memory에 저장
		int num = 50;
		
		//키를 저장 - 키는 소수 첫째자리까지 저장
		double num2 = 0.2;
		
		//어떤 변수에 true를 저장
		//boolean은 다른 것과 구분하기 위해서 이름 앞에 is를 붙이는 것을 권장
		boolean isAb = true;
		
		num = 40;
		// num의 값을 출력
		System.out.println("num의 숫자는 "+num);
		
		
		//char은 숫자를 저장하고 있다가 출력할 때만 숫자에 해당하는 문자를 출력
		char alpha = 99;		
		System.out.println(alpha);
		
		
		//22억 이상의 정수는 long를 쓴다.
		long n = 2200000000L;
		
		
		//덧샘 한 결과를 byte에 저장
		//강제 형 변환을 이용해서 해결
		byte b1 = 10;
		byte b2 = 13;
		
		byte b3 = (byte) (b1+b2);
		
		System.out.println(b3);
		
		//double의 경우 정수와 정수로 나눌경우 3.0이 나오기 때문에 하나를 double로 바꿔줘서 실수로 만들고 계산을 하게 한다.
		
		double d = (double)10/3;
		
		System.out.println("d : "+d);
	}

}
