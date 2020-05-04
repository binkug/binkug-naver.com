package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				//보낼 메시지 입력
				System.out.print("전송할 메시지:");
				String msg = sc.nextLine();
				
				//데이터 전송하기 위한 패킷을 생성
				InetAddress addr = 
					InetAddress.getByName(
						"192.168.0.83");
				DatagramPacket dp = 
					new DatagramPacket(
						msg.getBytes(),
						msg.getBytes().length,
						addr, 10004);
				//보내는 소켓을 생성
				DatagramSocket ds = 
					new DatagramSocket();
				//보내기
				ds.send(dp);
			}

		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
