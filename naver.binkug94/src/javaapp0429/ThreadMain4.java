package javaapp0429;

public class ThreadMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx4 obj = new ThreadEx4();
		Thread th = new Thread(obj);
		th.start();
		Thread th2 = new Thread(obj);
		th2.start();
		try {
			Thread.sleep(13100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(obj.result);
	}

}
