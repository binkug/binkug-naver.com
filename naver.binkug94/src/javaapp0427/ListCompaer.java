package javaapp0427;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompaer {

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList와 LinkedList를 생성
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> li = new LinkedList<String>();
		
		
		
		al.add("바보");
		al.add("바보");
		al.add("바보");
		al.add("바보");
		al.add("바보");
		
		li.add("바보");
		li.add("바보");
		li.add("바보");
		li.add("바보");
		li.add("바보");
		//1번째 자리에 send 문자열을 10만개 삽입하고 시간을 측정
		long start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			al.add(1,"second");
		}
		//속도 측정
		long end = System.nanoTime();
		System.out.println("ArrayList : "+(end-start));
		
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			li.add(1,"second");
		}
		end = System.nanoTime();
		System.out.println("LinkedList : "+(end-start));
		
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			al.get(1);
		}
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end-start));
		
		for(int i=0;i<100000;i++) {
			li.get(1);
		}
		end = System.nanoTime();
		System.out.println("LinkedList : "+(end-start));
		
		
		
		
		
		
	}
	
	
	

}
