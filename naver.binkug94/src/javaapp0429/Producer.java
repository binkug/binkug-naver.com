package javaapp0429;

public class Producer extends Thread{
	
	public synchronized void put(String data) {
		
		ShareData.list.add(data);
		//wait 중인 스레드 중에서 1개를 깨워서 실행하도록 해주는 메소드
		notifyAll();
		
	}
	
	//스레드로 동작할 메소드
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				
				Thread.sleep(500);
				
				put("Data"+i);
				
				System.out.println("Data"+i+"생산");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
