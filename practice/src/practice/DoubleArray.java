package practice;

public class DoubleArray {

	public static void main(String[] args) {
		
		int [][] ar = new int[5][5];
		int cnt = 1;
		for(int i=0; i<5; i=i+1){
			for(int j=0; j<5; j=j+1){
				ar[i][j] = cnt;
				cnt = cnt + 1;
			}
		}
		//하나의 반복문으로 ar의 모든 요소를 출력
		

		int [] k = new int[25];
		cnt = 101;
		for(int i=0; i<25; i=i+1){
			k[i] = cnt;
			cnt = cnt + 1;
		}
		//k의 모든 내용을 ar에 순서대로 대입해서 출력
	}

}
