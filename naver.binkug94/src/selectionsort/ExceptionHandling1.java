package selectionsort;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		try {
			int result = x / y;
			System.out.println("x/y= " + result);
		}catch(Exception e) {
			// 서버 개발자가 논리 에러를 파악하기 위함
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료.");

	}

}
