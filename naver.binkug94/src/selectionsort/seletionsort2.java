package selectionsort;

public class seletionsort2 {

	public static void main(String[] args) {
		int[] ar = { 30, 20, 40, 50, 10 };
		// 데이터 출력
		int size = ar.length;
		// 정렬 전 출력
		System.out.printf("정렬 전: ");
		for (int i = 0; i < size; i += 1) {
			System.out.printf("%5d", ar[i]);
		}
		System.out.printf("\n");

		// 선택 정렬
		// 첫번째부터 마지막 바로 이전 데이터까지
		for (int i = 0; i < size - 1; i += 1) {
			// 뒤에 있는 모든 데이터 - 비교점
			for (int j = i + 1; j < size; j = j + 1) {
				// 비교되는 데이터가 더 작으면
				if(ar[i] < ar[j]) {
					// 데이터를 교환
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}
		}
		// 데이터 출력
		size = ar.length;
		// 정렬 후 출력
		System.out.printf("정렬 후: ");
		for (int i = 0; i < size; i += 1) {
			System.out.printf("%5d", ar[i]);
		}
		System.out.printf("\n");

	}

}
