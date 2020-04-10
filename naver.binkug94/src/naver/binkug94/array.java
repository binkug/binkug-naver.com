package naver.binkug94;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		문자열 저장
		문자열은 0개 이상 문자의 집합
		문자열 리터럴은 " "안에 기재
		' ' : A라는 문자
		" " : A라는 문자열 
		문자열 자료형은 String
		문자열 저장 방법
		String 변수명 = "문자열";
		문자열 + 문자열은 문자열을 이어 붙인다.
		문자열 + 숫자는 숫자를 문자열로 변경해 이어 붙인다.
		ex) "10" + 30 = 1030으로 표기 된다.
		
		*/
		
		/*
		 리터럴을 저장하는 방법 
		 리터럴은 한 번 저장하고 다음부터는 재사용을 한다.
		 
		 ex) int a = 10;
		 10이라는 데이터가 저장되어 있는지 확인하고 저장되어 있으면 저장된 해시코드(위치)를
		 a와 매핑하고 저장된 것이 없으면 저장하고 그 때의 해시코드를 a와 매핑
		 
		 */
		int a = 10;
		int b = 10;
		int c = 20;
		
		System.out.println("a의 해시코드 : "+System.identityHashCode(a));
		System.out.println("b의 해시코드 : "+System.identityHashCode(b));
		System.out.println("c의 해시코드 : "+System.identityHashCode(c));
		
	}

}
