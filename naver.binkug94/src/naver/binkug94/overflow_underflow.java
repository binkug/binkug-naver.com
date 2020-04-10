package naver.binkug94;

public class overflow_underflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 10.376;
		//위의 숫자를 소수 첫째 자리에서 반올림해서 저장
		
		int result = (int)(d1+0.5);
		System.out.println("result : "+result);
		
		//소주 첫째 자리 올림
		//페이지당 데이터 개수-1 / 페이지당데이터 개수
		int count = 116;
		double pageCnt = 10.0;
		result = (int) (count/pageCnt + pageCnt-1/pageCnt);
		System.out.println("result : "+result);
		
		//short는 -32768 ~ 32767 까지 저장 가능
		
		short s1 = (short)32770;
		
		System.out.println("s1 : "+s1);
		
		short s2 = (short)-32769;
		
		System.out.println("s2의 값은 : "+s2);
		
		int a = 0;
		
		int result1 = ++a + ++a;
		
		int temp1 = a++;
		int temp2 = ++a;
		int result2 = temp1 + temp2;
		System.out.println("result : "+ result1); 
		System.out.println("result 2 : "+result2);
		System.out.println(temp1+":"+temp2);
		
	}

}
