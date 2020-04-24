package javaapp0424;

public class ArrayMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] data = {"3000","2000","-","4000"};
		int sum = 0;
		for(String i : data) {
			//문자열을 정수로 변환해서 sum에 더하기
			try {
				sum = sum+Integer.parseInt(i);
				String mg = String.format("더하기 하는중:%d", sum);
				System.out.println(mg);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		//출력할 메세지 설정
		String msg = String.format("합계:%d", sum);
		System.out.println(msg);
	}

}
