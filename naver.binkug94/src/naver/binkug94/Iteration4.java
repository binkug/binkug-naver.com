package naver.binkug94;

public class Iteration4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {700,600,500,430};
		
		int idx2 = 0;
		int sum2 = 0;
		double avg2 = 0;
		
		do {
			sum2 = sum2+array[idx2];
			idx2++;
			
		}while (idx2<4);
		
		System.out.println("합계: "+sum2);
		
		avg2 = sum2 /4;
		System.out.println("평균 :"+avg2);
		
		avg2 = (int)(avg2/100+0.5)*100;
		System.out.println("반올림 : "+avg2);
		
	}

}
