package network;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {

	public static void main(String[] args) {
		
		try {
			//멀티 캐스트를 위한 소켓
			MulticastSocket ms = new MulticastSocket(9999);
			//그룹에 참여
			ms.joinGroup(InetAddress.getByName("ff01:0:0:0:0:0:0:175"));
			
			System.out.println("대기중...");
			while (true) {
				byte [] data = new byte[1024];
				//데이터 받기
				DatagramPacket dp = new DatagramPacket(data, 1024);
				ms.receive(dp);
				
				//전송 받은 메세지 출력
				String msg = new String(data);
				System.out.println(msg.trim());
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
