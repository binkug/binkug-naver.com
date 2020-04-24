package javaapp0424;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 100;
		Integer y = 200;
		
		//인스터스를 문자열로 변환 - toString 호출
		//프로그래밍 언어마다 이러한 메소드가 존재
		String msg1 = x.toString();
		String mag2 = y.toString();
		
		//문자열과 문자열 결합
		String msg = x.toString() + y.toString();
		
		System.out.println(msg);
		
		//x : 100 y:  200로 출력
		//숫자는 5자리로 표현
		//되도록이면 변수에 저장하고 출력
		//지금은 콘솔에 출력하기 떄문에 printf를 이용하지만
		//gui 프로그램에서는 뷰에 텍스트를 설정하기 때문에
		//문자열 데이터를 대입하는 구조로 출력을 한다.
		msg = String.format("x:%5d y:%5d",x,y);
		System.out.println("\n"+msg);
		
		System.out.printf("x:%5d y:%5d",x,y);
	}

}
