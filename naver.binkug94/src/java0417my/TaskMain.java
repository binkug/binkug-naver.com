package java0417my;

public class TaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TaskClass 클래스에 존재하는
		//static int noRecuresionFibo(int n)사용
		int result = 0;
		
		
		
		Task obj = new Task();
		result = obj.recursiveFibo(9);
		System.out.println("9번쨰 숫자 : "+result);
		
		result = obj.recursiveFibo(99);
		System.out.println("10번쨰 숫자 : "+result);
		
	}

}
