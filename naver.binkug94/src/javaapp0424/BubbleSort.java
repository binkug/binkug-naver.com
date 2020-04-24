package javaapp0424;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {76,12,56,78,34,15};
		//size = 데이터 개수 - ar.length
		int size = ar.length;
		//회전수 - 최대 데이터 개수 -1 회전
		boolean flag = false;
		for(int i=0;i<size-1;i++) {
			//첫번째부터 n-1번째까지 1개씩 줄이면서
			for(int j=0;j<size-i-1;j++) {
				//현재 위치의 데이터와 다음 위치의 데이터를 비교해서
				//다음 데이터가 더 작으면 2개의 데이터의 값을 교체
				if(ar[j] >ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		
		for(int temp : ar ) {
			System.out.printf(temp +"\t");
		}
	}

}
