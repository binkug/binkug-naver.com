package anonymous1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anony1ex obj = new Anony1ex();
		obj.method();
		
		//Anony1 클래스를 상속 받는 Anonymous class
		Anony1 obj2 = new Anony1() {
			@Override
			public void method() {
				System.out.println("anonymous를 이용한 상속 구현");
				
			}
		};
		obj2.method();
	}

}
