package naver.binkug94;

public class op2 {

	public static void main(String[] args) {
		int a = 0;
		int time = 87600;
		int hour = time/3600; //�ð�
		int minute = (time-hour * 3600)/60; //��
		//int second = (time-hour * 3600 - minute * 60); //��
		int second = time % 60; // �����Ͱ� ���������� �ڵ尡 �ξ� ª������.
		while (true) {
			int mod = a%3;
			
			if(mod==0) 
				System.out.println("����");
			
			else if(mod==1) 
				System.out.println("����");
			
			else if (mod==2) 
				System.out.println("��");
			
			try {
				
				Thread.sleep(3000);
				
			} catch (Exception e) {	}
			
			a++;
		}
		
		
		
	}

}
