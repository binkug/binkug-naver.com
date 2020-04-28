package javaapp0427;

import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//LinkedList<String> list = new LinkedList<>(); 안의 내용을 변경할 필요 없이 
		//여기의 ArrayList 나 LinkedList 혹은 Stack와 같은 걸 바꿔주기만 하면 된다.
		list.add("김규남");
		list.add("고창희");
		list.add("김동욱");
		list.add("성경만");
		list.add(3, "바보"); //3번째 데이터 추가
		
		//데이터 삭제
		list.remove("성경만");
		
		//위치를 가지고삭제
		list.remove(1);
		
		System.out.println(list);
		
		//데이터 전체를 순회(순서대로 하나씩 접근)
		for(String temp : list) {
			System.out.printf(temp+"\t");
		}
		System.out.printf("\n");
		//인덱스를 이용한 접근 - 짝수번째나 홀수번째를 골라내서 접근 가능
		int size = list.size();
		for(int i=0;i<size;i++) {
			System.out.printf(list.get(i)+"\t");
		}
	}

}
