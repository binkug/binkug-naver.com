package javaapp0501;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CharacterBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./ch.txt")))){
			
			while(true) {
			//한줄을 읽어서 읽은줄이 null이면 종료
				//그렇지 않으면 계속 읽
				
				String msg = br.readLine();
				if(msg ==null) {
					break;
				}
				System.out.println(msg);
			}

			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
