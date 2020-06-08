package threadEx;

public class ThreadMain6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			ThreadEx5 th = new ThreadEx5();
			th.start();
		}
	}

}
