package baek;

public class Test1 {

	public static void main(String[] args) {
		
		int [] arr = {17,20,30,15,29};
		//데이터를 전부 출력
		int size = arr.length;
		System.out.print("정렬 전 :");
		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+" ");
			System.out.printf("%3d",arr[i]);
		}
		System.out.println("");
		
		//선택정렬
		//첫번째부터 마지막 바로 이전 데이터까지
		for(int i=0;i<size-1;i++) {
			//뒤에 있는 모든 데이터 - 비교점
			for(int j=i+1;j<size;j++) {
				//비교되는 데이터가 더 작으면
				if(arr[i]>arr[j]) {
					//데이터를 교환
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.print("정렬 후 :");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d",arr[i]);
		}

	}
}
