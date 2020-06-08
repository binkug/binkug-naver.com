package threadEx;

public class Customer extends Thread{
	//공유자원을 소비하는 메소드
	public synchronized void get() {
		//사용할 자원이 없으면 대기
		if(ShareData.list.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//스레드로 동작할 메소드
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				
				Thread.sleep(500);
				
				get();
				
				System.out.println("Data"+i+"생산");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
