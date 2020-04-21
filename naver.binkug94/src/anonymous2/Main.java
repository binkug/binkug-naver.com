package anonymous2;

public class Main {

	public static void main(String[] args) {
		//인터페이스를 구현한 인스턴스를 바로 만들어서 사용
		
		Inter interImp1 = new Inter() {
			
			@Override
			public void method() {
				System.out.println("출력출력출력");
				
			}
		};
		interImp1.method();

	}

}
