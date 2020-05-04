package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class AppleHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//html을 다운로드 받을 주소 만들기
			URL url = new URL("https://www.apple.com/kr/");
			
			//연결개체 만들기
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//연결 옵션 만들기
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//문자열을 받기 위한 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
