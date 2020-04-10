package naver.binkug94;

public class Iteration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//image1.png,image2.png,image3.png를 번갈아가면서 3번씩 출력
//		int idx = 0;
//		
//		while(idx < 9) {
//
//			System.out.println("image"+(idx%3+1)+".png");
//
//			idx++;
//		}
		//image1.png,image3.png,image5.png를 번갈아가며 4번 출력
		
		int idx = 1;
		
//		while(idx<12) {
//			System.out.println("image"+(idx%3*2+1)+".png");
//			
//			idx++;
//		}
		
		while(idx<6) {
			System.out.println("사이즈"+(idx%5));
			idx++;
		}
	}
}
