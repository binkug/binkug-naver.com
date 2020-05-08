package practice;

public class BinaryDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10진수를 2진수 10자리로 표현
		int decimal = 23; 
		String binary = "";
		while (true) {
			int mok = decimal / 2; //몫
			int nmg = decimal % 2; //나머지
			//나머지는 binary에 저장
			binary = nmg + binary;
			//몫이 0이면 종료
			if(mok==0) {
				break;
			}
			//몫을 deciaml에 대입해서 몫을 가지고 계속 작업
			decimal = mok;
			
		}
		
		for(int i=0;i<10-binary.length();i++) {
			System.out.print("0");
		}
		System.out.println(binary);
	}

}
