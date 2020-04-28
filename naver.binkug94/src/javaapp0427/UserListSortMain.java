package javaapp0427;

import java.util.ArrayList;
import java.util.Comparator;

public class UserListSortMain {

	public static void main(String[] args) {
		// 데이터 여러개 저장하는 ArrayList를 생성
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(new Data(1,"백승훈","012","관악구","binkug@naver.com",
				
				"1994-03-29"));
		list.add(new Data(2,"주빈","01234","서대문구","ritutu@gamil.com",
				
				"1994-07-01"));
		list.add(new Data(3,"송종보","01234","송파구","qweqweg@naver.com",
				
				"1994-04-18"));
		
		list.sort(new Comparator<Data>() {

			@Override
			
			//phone의 오름차순으로 정렬하고
			//phone이 똑같다면 이름의 오름차순으로 정렬
			public int compare(Data o1, Data o2) {
				// 넘버를 가지고 하고싶으면 getNum()을 불러와서 하고
				//이름으로 하고 싶으면 getName으로 불러와서 compareTo()로 비교를 하면 된다.
				if(o1.getPhone().compareTo(o2.getPhone()) == 0) {
					
				}else {
					return o2.getName().compareTo(o1.getName());
				}
				return o1.getPhone().compareTo(o2.getPhone());



			}
		});
		
		for(Data data : list) {
			System.out.println(data);
		}
	}

}
