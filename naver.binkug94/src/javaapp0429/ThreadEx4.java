package javaapp0429;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadEx4 implements Runnable {
	public int result = 0;
	public int idx = 0;
	
	static ReentrantLock lock = new ReentrantLock();
	//idx를 10000번 증가시키면서 result 에 더하는 메소드
   	public void sum() {
		for(int i=0; i<10000; i=i+1) {
			lock.lock();
			//synchronized(this) {
			idx = idx + 1;
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				
			}
			result = result + idx;
			//}
			lock.lock();
		}
	}

	@Override
	public void run() {
		sum();
	}
	

	
}




