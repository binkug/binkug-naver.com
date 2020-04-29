package javaapp0429;

public class ThreadMain3 {

	public static void main(String[] args) {
		
		ThreadEx3 ex = new ThreadEx3();
		ex.start();
		
		
		try {
			Thread.sleep(3000);
			//ex에 InterruptedException을 발생시킴
			//스레드 수행 내용에서 구문이 종료되면 스레드도 종료
			ex.interrupt();
		} catch (Exception e) {

		}
	}

}
