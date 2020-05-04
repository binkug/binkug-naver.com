package javaapp0501;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class LogMain {

	public static void main(String[] args) {
		
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\30404\\git\\binkug-naver.com\\naver.binkug94\\test.txt")))) {
//			//IP를 중복없이 저장하기 위한 Set을 생성
//			HashSet<String> set = 
//				new HashSet<>();
//			while (true) {
//				String lin = br.readLine();
//				//데이터가 null 일 경우 중지
//				if(lin ==null) {
//					break;
//				}
//				//읽은 데이터가 있으면 출력
//				//System.out.println(lin);
//				
//				//공백 기준으로 문자열 분할
//				String [] data = lin.split("a");
//
//				//분할된 데이터 중에서 첫번째 데이터만 출력
//				//System.out.println(data[0]);
//				set.add(data[0]);
//			}
//			for(String ip : set) {
//				System.out.println(ip);
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
		try (BufferedReader rr = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\\\Users\\\\30404\\\\git\\\\binkug-naver.com\\\\naver.binkug94\\\\test.txt")))){

			while (true) {
			String line = rr.readLine();
			//데이터가 null 일 경우 중지
			if(line ==null) {
				break;
			}
			
			}
		}
		
				
			 catch (Exception e) {
			// TODO: handle exception
		}
	}

}
