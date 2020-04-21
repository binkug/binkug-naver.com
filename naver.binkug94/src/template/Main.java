package template;

public class Main {

	public static void main(String[] args) {
		Service ser = new ServiceImp1();
		
		boolean result = ser.ticketing("root", "1234");
		
		if(result==true) {
			System.out.println("티켓 구입 성공");
		}else {
			System.out.println("티켓 구입 실패");
			
		}
		
	}

}
