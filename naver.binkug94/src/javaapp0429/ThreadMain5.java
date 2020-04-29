package javaapp0429;

public class ThreadMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer th1 = new Producer();
		th1.start();
		
		Customer th2 = new Customer();
		th2.start();
	}

}
