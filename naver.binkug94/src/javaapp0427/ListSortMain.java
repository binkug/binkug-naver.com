package javaapp0427;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		//정수 데이터를 저장할 수 있는 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(19);
		list.add(28);
		list.add(24);
		list.add(8);
		list.add(26);
		list.add(17);
		
	   //데이터를 오름차순 정렬
		list.sort(new Comparator<Integer>() { // < >안에는 자료형을 써넣어준다.

			@Override
			public int compare(Integer o1, Integer o2) {
				//숫자 데이터의 경우는 앞의 데이터에서 뒤의 데이터를
				//뺄샘한 결과를 리턴하면 오름차순 정렬
				return o1 - o2;
			}
			
		});
		//결과 확인
		System.out.println(list);
		
		
		
		//문자열을 저장하는 ArrayList를 생성
		ArrayList<String> list1 = new ArrayList<String>();
		
		//데이터를 추가 
		
		list1.add("가");
		list1.add("아");
		list1.add("사");
		list1.add("파");
		list1.add("카");
		list1.add("나");
		
		list1.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});;
		System.out.println(list1);
		

	}

}
