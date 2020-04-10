package naver.binkug94;

public class Iteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("---------------");
		
		//출발점
		int index = 0;
		while (index < 3) { // ( )괄호안에 종료점을 쓴다.
			System.out.println("배고프네?");
			//중간에 수행할 내용
			index = index + 1;
		}
		System.out.println(index); //3에서 멈추기 때문에 3이라는 숫자가 나온다.
		
		//image1.png,image2.png,image3.png,image4.png를 순서대로 출력하도록 while을 작성
		
//		int idx = 1;
//		
//		while (idx<5) {
//			System.out.println("image"+idx+".png");
//			idx = idx+1;
//		}
		
		int idx1 = 0;
		
		while (idx1<9) {

			System.out.println("image"+(idx1%4+1)+".png");
			idx1 = idx1+1;

		}
		
		int pageNum = 0;
		
		while (pageNum<9) {
			System.out.println("http://www.hani.co.kr/arti/ISSUE/273/list"+(pageNum+1)+".html");
			pageNum++;
		}
	}

}
