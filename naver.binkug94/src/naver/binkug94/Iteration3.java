package naver.binkug94;

public class Iteration3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습 3 배열의 데이터 합계를 구해서 출력하고 평균을 소수 2째자리에서 반올림해서 소수1째 자리까치 출력
		
		int [] ar = {30,40,21,17,22,76,53};
		
		int idx = 0;
		int sum = 0;
		double avg = 0;
		do {
			
			sum = sum + ar[idx];
			idx++;
		}while(idx<6);
		avg = (sum / 7.0);
		//직접 반올림을 구현하고자 할 때는 반올림할 자리를 소수 첫째 자리로 보내고 0.5를 더한다.
		//위 숫자를 정수로 변환해서 소수를 버립니다.
		//반올림할 자리를 소수 첫째자리로 보내고 +0.5
		avg = avg * 10 +0.5;
		//정수로 변환해서 소수를 버림
		avg = (int)avg;
		//반대 작업을 한다.
		avg = avg / 10;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);

		//평균을 구하는ㄷ ㅔ 10의 자리 반올림을 한다.
		


	}

}
