package threadEx;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx ex1 = new ThreadEx();
		ThreadEx ex2 = new ThreadEx();
		//일반 프로세스 형태로 호출
//		ex1.run();
//		ex2.run();
		
		//스레드로 실행
		ex1.start();
		ex2.start();
	}

}
