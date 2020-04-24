package javaapp0424;

import java.util.Arrays;
import java.util.Comparator;

public class UserMainSort {

	public static void main(String[] args) {
		// UserData 3개를 저장
		UserDataSort [] ar = new UserDataSort [3];
		
		UserDataSort user1 = new UserDataSort();
		user1.setAge(27);
		user1.setName("배");
		user1.setSalary(160000);
		
		ar[0] = user1;
		//이런 방법이 있고
		
		//이런 방법도 있다.
		ar[1] = new UserDataSort();
		
		ar[1].setAge(19);
		ar[1].setName("주");
		ar[1].setSalary(178220);
		
		ar[2] = new UserDataSort();
		
		ar[2].setAge(25);
		ar[2].setName("뀨");
		ar[2].setSalary(1178220);
		
		//정렬
		//ar은 UserData의 배열이고 UserData는 Comparable 인터페이스가 impliements 되지 않아서
		//크기 비교하는 방법을 알지 못하기 때문
		
		
		Comparator<UserDataSort> cmp = new Comparator<UserDataSort>() {
			
			@Override
			public int compare(UserDataSort o1, UserDataSort o2) {

				//숫자는 뺄셈을 하면 되고 문자열 or 날짜는 compareTo를 사용하면 된다.
				return o1.getName().compareTo(o2.getName());
				//return o2.getAge()-o1.getAge(); 
			}
		};
		Arrays.sort(ar,cmp);
		
		//배열의 데이터 전부 출력
		for(UserDataSort i : ar) {
			System.out.println(i);
		}
	}

}
