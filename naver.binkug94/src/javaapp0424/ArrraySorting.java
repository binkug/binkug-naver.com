package javaapp0424;

import java.util.Arrays;

public class ArrraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {30,20,50,60,10};
		//Arrays의 sort 메소드가 정렬을 해줌
		//배열만 대입하는 경우에는 데이터가 Comparable 인터페이스를 implements 한 경우만 가능
		Arrays.sort(ar);
		
		for(int i : ar) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		
		String [] br = {"박지성","루니","호날두","긱스","스콜스"};
		Arrays.sort(br);
		
		for(String i : br) {
			System.out.print(i+" ");
		}
	}

}
