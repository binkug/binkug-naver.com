package javaapp0423;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		//문자열 인스턴스를 생성 - 리터럴을 이용해서 생성
		String str = "메롱124010!@Taz";
		
		//문자열의 길이를 출력
		int len = str.length();
		System.out.println(len);
		
		//문자열 안에서 특정한 위치의 문자 cnffur
		char imsi = str.charAt(3);
		System.out.println(imsi);
		
		//star애 있는 모든 문자를 순서대로 출력
		//charAt과 Length를 이용
		//대문자 개수를 저장할 변수 설정
		int big = 0;
		int small = 0;
		int num =0;
		int st = 0;
		//소문자,숫자,기타문자의 개수
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
//			System.out.println(ch);
		//대문자 확인
			if(ch>='A'&&ch<='Z') {
				big++;	
				
			}else if(ch>='a'&&ch<='z') {
				small++;
				
			}else if(ch>='0'&&ch<='9') {
				num++;
			}else {
				st++;
			}
		}
		
		System.out.println("대문자 개수는 : "+big);
		System.out.println("소문자 개수는 : "+small);
		System.out.println("숫자 개수는 : "+num);
		System.out.println("기타부호 개수는 : "+st);
		
		//영문 대문자,소문자,숫자,특수문자가 한개 이상 있으면 사용가능한 비밀번호
		//4가지중 한가지라도 없으면 사용 불가능한 비밀번호
		
		
		//검색 기능을 만들때 활용한다.
		String os1 = "iOS";
		String os2 = "iOs";
		String os3 = "Windows";
		//위 3개의 문자열이 ios인지 확인
		System.out.println(os1.toLowerCase().equals("ios"));
		System.out.println(os2.toLowerCase().equals("ios"));
		System.out.println(os3.toLowerCase().equals("ios"));
		
	}

}
