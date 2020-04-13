package naver.binkug94;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int a=0;a<3;a++) {
//			
//			for(int i=0;i<a+1;i++) {
//				
//				System.out.print("*");
//			}
//			
//		System.out.print("\n");
//		
//		}
//		
//		for(int j=0;j<2;j++) {
//		
//			for(int b=0;b<2-j;b++) {
//			
//				System.out.print("*");
//			}
//		
//			System.out.print("\n");
//		}
//		
//		/*
// 		*,**,***,****,***** 데이터의 개수가 1씩 늘어납니다.
//
// 		1*i 변화량을 하고 첫번째 i를 대입해서 개수가 맞는 지 계산을 하고 계산을 해서 개수가 맞지 않으면 개수가 맞도록 더하기나 빼기를 해준다.
//		 */
//		//별  1 3 5 7 9 만들기
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=i*2;j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		
//		//역순으로 별 만들기
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=4-i;j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		// 별이 1 2 3 2 1로 될때 
		//이렇게 반복 구조 안에서 패턴이 변경 되는 경우에는 패턴이 변경되는 지점에서 분할을 해서 해결한다.
		//복잡한 문제가 주어지면 해결할 수 있는 단위로 분할을 하고 분할을 해서 해결한 후 하나로 합치면 된다.
		for(int i=0;i<=4;i++) {
			//3번째 줄까지 적용할 내용
			if(i<=2) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
			}else {
				//나머지 줄에 적용할 내용
				for(int j=0;j<=4-i;j++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		//한 줄에 공백을 출력하고 별을 출력하는 형태가 같이 존재
		//반복문을 2개 사용한다.
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=3-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<=4;i++) {
			if(i<=2) {
				for(int j=0;j<=3-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0;j<=i-1;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=4-i;j++) {
					System.out.print("*");
				}
			}
			
			System.out.print("\n");
		}

	}

}






// 이번주 문제 - 한글과 컴퓨터 코딩 테스트 문제
//    0   앞에 공백 4개
//  1   2  앞에 공백 3개 중간 공백 1개
// 3     4  앞에 공백 2개 중간 공백 3개
//5        6 앞에 공백 1개 중간 공백 5개
//789012345  공백없이 숫자 9개
// 숫자는 0부터 9까지 진행하고 다시 0으로 돌아와야 합니다.
// 첫번째와 마지막은 예외 형태로 구현해야 합니다.

