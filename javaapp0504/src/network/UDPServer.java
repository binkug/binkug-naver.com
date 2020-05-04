package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		
		try {
			DatagramSocket ds = new DatagramSocket(8080);
			while(true) {
				System.out.println("서버 대기중...");
				//받을 데이터를 저장할 배열
				byte [] data = new byte[1024];
				//데이터 받기
				DatagramPacket dp = new DatagramPacket(data, 1024);
				ds.receive(dp);
				//ds.receive(new DatagramPacket(data, 1024)); <ㅡ 이런식으로 사용할 수 있다.
				
				//보낸 곳의 주소와 내용 출력
				System.out.println("보낸 곳 : "+dp.getAddress().getHostAddress());
				//바이트 배열을 문자열로 만들기
				String msg = new String(data);
				System.out.println("보낸 메세지: "+msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
