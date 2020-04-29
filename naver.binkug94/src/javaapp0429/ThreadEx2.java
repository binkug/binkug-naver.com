package javaapp0429;

public class ThreadEx2 extends Thread {

	//스레드로 동작할 메소드
	@Override //안해도 되는데 상위 클래스에 없는 메소드에 붙이면 에러
	public void run() {
		try {
			//0.5초마다 문자열을 출력
			for(int i=0;i<10;i++) {
				Thread.sleep(500);
				System.out.println(i);
			}
			System.out.println("야!");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
