package naver.binkug94;

public class overflow_underflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 10.376;
		//���� ���ڸ� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ����
		
		int result = (int)(d1+0.5);
		System.out.println("result : "+result);
		
		//���� ù° �ڸ� �ø�
		//�������� ������ ����-1 / �������絥���� ����
		int count = 116;
		double pageCnt = 10.0;
		result = (int) (count/pageCnt + pageCnt-1/pageCnt);
		System.out.println("result : "+result);
		
		//short�� -32768 ~ 32767 ���� ���� ����
		
		short s1 = (short)32770;
		
		System.out.println("s1 : "+s1);
		
		short s2 = (short)-32769;
		
		System.out.println("s2�� ���� : "+s2);
		
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
