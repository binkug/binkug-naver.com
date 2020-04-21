package naver.binkug94;

public class ArrayEtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = new int [20];
		//1부터 20까지 숫자로 배열의 값을 대입
		for(int i=0;i<20;i++) {
			ar[i] = i+1;
		}
		//한줄에 5개씩 출력
		for(int i=0;i<20;i++) {
			System.out.printf("%02d\t",ar[i]);
			
			//5개 출력할 때 마다 줄 바꿈
			if(i%5==4) {
				System.out.printf("\n");
			}
		}
		/*
		 * System.out.print
		 */
		
	}

}
