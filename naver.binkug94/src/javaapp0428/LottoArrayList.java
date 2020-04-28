package javaapp0428;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LottoArrayList {

	public static void main(String[] args) {
		//1부터 45까지의 숫자를 중복되지 않게 6개 입력받아서 
		//오름차순 정렬해서 출력
		//주석 처리를 한 부분은 배열로 로또 만드는 방법
		
		//int [] lotto = new int [6]; 배열식
		ArrayList<Integer> lotto = new ArrayList<>();
		
		//콘솔로부터 입력을 받을 수 있는 인스턴스를 생성
		Scanner sc = new Scanner(System.in);
		//데이터 개수를 저장
		//int size = lotto.length;

		for(int i=0;i<6;i++) {
			
			try {
				System.out.print("정수를 입력 : ");
				String input = sc.nextLine();
				lotto.add(Integer.parseInt(input));
				
				if(lotto.get(i) < 1 || lotto.get(i) > 45) {
					System.out.println("1부터 45사이의 숫자를 입력해 주세요");
					lotto.remove(i);
					i--;
					
					continue;
				}
				
				//중복 체크
				boolean flag = false;
				for(int j=0; j<=i-1; j++) {
					//동일한 데이터를 만나면 반복문 종료
					if(lotto.get(i) == lotto.get(j)) {
						flag = true;
						break;
					}
				}
				if(flag == true) {
					System.out.println("중복된 데이터 입니다.");
					lotto.remove(i);
					i = i-1;
					
				}
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요!");
				//정수가 아닌 데이터를 입력한 경우에 무효화
				lotto.remove(i);
				i = i-1;
				
			}

		}
		
		lotto.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		
		//배열의 데이터 출력
		for(int imsi : lotto) {

			System.out.printf(imsi+"\t");
		}
		sc.close();

	}

}
