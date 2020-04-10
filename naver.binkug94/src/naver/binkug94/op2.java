package naver.binkug94;

public class op2 {

	public static void main(String[] args) {
		int a = 0;
		int time = 87600;
		int hour = time/3600; //시간
		int minute = (time-hour * 3600)/60; //분
		//int second = (time-hour * 3600 - minute * 60); //초
		int second = time % 60; // 위에것과 동일하지만 코드가 훨씬 짧아졌다.
		while (true) {
			int mod = a%3;
			
			if(mod==0) 
				System.out.println("가위");
			
			else if(mod==1) 
				System.out.println("바위");
			
			else if (mod==2) 
				System.out.println("보");
			
			try {
				
				Thread.sleep(3000);
				
			} catch (Exception e) {	}
			
			a++;
		}
		
		
		
	}

}
