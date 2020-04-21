package naver.binkug94;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2행짜리 3열 배열 만들기
		int [ ] [] score = {{112,277,279},{233,592,751}};
		
		//배열 요소 1개에 접근 : 배열이름 [행번호][열번호]
		System.out.println(score[0][2]);
		//데이터 개수 파악
		System.out.println("ar : "+score.length);
		System.out.println("ar[0] : "+score[0].length);
		System.out.println("ar[1] :"+score[1].length);
		
		//모든 데이터를 열 우선으로 접근
		//행의 개수 찾기

		int cntRow = score.length;
		for(int i=0;i<cntRow;i++) {
			//각 행에 해당하는 배열의 데이터 개수 찾기(열개수)
			int cntCol = score[i].length;
			for(int j=0;j<cntCol;j++) {
				System.out.println(score[i][j]);
			}
		}
		System.out.println("=========================");
		//2개의 반복문이 있는 경우 순서를 바꾸면 행과열이 교체된다.
		int cntCol = score[0].length;
		for(int j=0;j<cntCol;j++) {
			for(int i=0;i<cntRow;i++) {
				System.out.println(score[i][j]);
				
			}
		}
		
//		System.out.println("=================구구단");
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%2d*%2d=%2d",i,j,i*j);
//			}
//		}
//		for(int j=1;j<=9;j++) {
//			for(int i=2;i<=9;i++) {
//				System.out.printf("%2d*%2d=%2d",j,i,i*j);
//			}
//		}
		
		//합계 구하기
		int sum = 0;
		
		int [] sumRow = new int [score.length];
		
		int [] sumCol = new int[score[0].length];
		
		//전체 데이터 합계
		//전체 데이터를 순회하면서 데이터를 sum에 더하면 딥니다.
		//전체 데이터가 6개이고 2행 3열인 경우에 하나의 반복문으로 전체 데이터를 접근
		//이차원 배열을 만들어야 하는 경우 일차원 배열로 만들고 아래 접근 방법을 이용해서 행단위 구분을 하기도 합니다.
		
		for(int i=0;i<6;i++) {
			//행번호는 열의 개수로 나눈 몫
			//열번호는 열의 개수로 나눈 나머지
			sum = sum + score[i/3][i%3];
		}
		System.out.println("합계 : "+sum);
		
		//행 단위 합계 구하기
		//하나의 행을 열 번호를 변경해가면서 접근하도록 하고 그 데이터들을 행의 합계에 저장
		
		for(int i=0;i<cntRow;i++) {
			for(int j=0;j<cntCol;j++) {
				sumRow[i] = sumRow[i] + score[i][j];
			}
		}
		//행의 합계 배열의 내용을 출력
		int len = sumRow.length;
		for(int i=0;i<len;i++) {
			System.out.println("행의 합계는 : "+sumRow[i]);
		}
		
		//열의 합계 구하기
		for(int j=0;j<cntCol;j++) {
			for(int i=0;i<cntRow;i++) {
				sumCol[j] = sumCol[j] + score[i][j];
			}
		}
		len = sumCol.length;
		for(int i=0;i<len;i++) {
			System.out.println("열의 합계는 : "+sumCol[i]);
		}
	}
	

}
