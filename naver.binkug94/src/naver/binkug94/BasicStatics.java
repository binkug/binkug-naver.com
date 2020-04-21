package naver.binkug94;

public class BasicStatics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {80,60,72,69,50,69,90,12};
		//60이 넘는 데이터의 합계,개수,평균을 구하기
		//평균은 소수 첫째 자리에서 반올림해서 정수로 저장
		
		//데어의 개수를 len에 저장
		int len = data.length;
		//합계를 저장할 변수
		int sum = 0;
		//데이터 개수를 저장할 변수 
		int cnt = 0;
		int avg = 0;
		for(int i=0;i<len;i++) {
			//60이 넘는 경우에 데이터를 더한다
			if(data[i]>=50) {
				sum = sum + data[i];
				cnt = cnt+1;
				
			}

		}
		if(cnt==0) {
			System.out.println("점수가 존재하지 않습니다.");
		}else {
			avg = (int) ((double)sum/cnt);
			
		}
		System.out.println("60이상의 합계는 :"+sum);
		System.out.println("데이터의 개수 : "+cnt);
		System.out.println("평균은 : "+avg);
		//최대 최소 구하기
		//데이터가 0에서 100사이라고 가정한 경우
		//int max = 0;
		//int min = 1;
		//데이터 범위를 모를 경우 - 첫번째 데이터로 초기화
		int max = data[0];
		int min = data[0];
		
		for(int i=0;i<len;i++) {
			//최대값보다 데이터가 더 크면 데이터를 최대값에 대입
			if(max<data[i]) {
				max = data[i];
			}
			//최소값보다 데이터가 더 작으면 데이터를 최소값에 대입
			if(min>data[i]) {
				min = data[i];
			}
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소 값 : "+min);
		
		//최대값을 가진 데이터의 인덱스를 찾기
		//최대값을 저장할 변수와 최대값의 인데그를 저장할 변수를 생성
		//max = 0;
		//int idx = -1;
		
		//존재하는 데이터로 max를 초기화할 때는 인덱스도 존재하는 값으로 초기롸를 해야 한다.
		max = data[0];
		int idx = 0;
		
		for(int i=0;i<len;i++) {
			if(max<data[i]) {
				max = data[i];
				idx = i;
			}
		}
		System.out.println(max+"의 위치는 : "+idx);
		
		//72의 가장 가까운 수 찾기
		//가장 가까운 수를 찾을 때는 거리를 계산해서 거리의 최소값을 찾아야한다.
		//거리는 양수만 나와야한다.
		//실제 알고리즘에서는 거리를 제곱해서 사용합니다
		//이것 때문에 분산이나 표준편차도 제곱을 한다.
		
		min = 100000000; //최소 값을 아주 큰 값으로 초기화
		//거리의 최소값을 저장하기 위한 변수
		int distanceMin = 100000000;
		//거리의 최소값 위치를 저장할 인덱스
		idx = -1;
		for(int i=0;i<len;i++) {
			//거리계산
			int distance = 66 - data[i];
			//거리가 음수이면 양수로 변환
			if(distance<0) {
				distance = -distance;
			}
			//거리의 최소값보다 작은 거리를 만나면 
			if(distanceMin>distance) {
				//거리를 거리의 최소값에 대입
				distanceMin = distance;
				//데이터를 min에 대입
				min = data[i];
				//인덱스를 idx에 대입
				idx = i;
			}
		}
		System.out.println("66와 가장 가까운 값: "+min);
	}

}
