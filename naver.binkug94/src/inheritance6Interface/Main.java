package inheritance6Interface;

public class Main {
	public static void main(String [] arg) {
		//인터페이스도 변수 선언 가능
		Inter1 obj = new InterImp1();
		Inter2 obj2 = new InterImp1();
		obj2.method2();
		obj.method();

	}
}
