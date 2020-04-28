package javaapp0428;

import java.util.Scanner;
import java.util.TreeSet;

public class LottoSet {

	public static void main(String[] args) {
		// treeSet : 중복된 데이터 없이 정렬해서 데이터를 저장하는 자료구조
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (lotto.size()<6) {
			try {
				System.out.print("정수 입력 (1~45) : ");
				String input = sc.nextLine();
				int su = Integer.parseInt(input);
				
				if(su <1 || su > 45) {
					System.out.println("1~45 사이의 숫자를 입력하세요");
					continue;
				}
				
				boolean result = lotto.add(su);
				if(result == false) {
					System.out.println("중복된 데이터 입니다.");
				}
			} catch (Exception e) {
				System.out.println("정수를 입력하세요!");
			}

			
			
		}
		
		System.out.println(lotto);

	}

}
