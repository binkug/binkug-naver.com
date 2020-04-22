package testing;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {17  , 20,   30,   15,   29};
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					a = arr[i];
					arr[i]=arr[j];
					arr[j] = a;
				}
				/* 올림차순
				 * if(arr[i]>arr[j]) {
					a = arr[i];
					arr[i]=arr[j];
					arr[j] = a;
				}
				 */
			}
			
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
