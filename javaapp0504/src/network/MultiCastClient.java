package network;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MultiCastClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("닉네임 :");
			String nickName = sc.nextLine();
			
			//메세지 보낼 곳의 IP주소
			InetAddress ip = InetAddress.getByName("ff01:0:0:0:0:0:0:175");
			//보낼 곳의 포트 번호
			int port = 9999;
			MulticastSocket ms = new MulticastSocket();
			while(true) {
				System.out.println("보낼 메세지:");
				String msg = sc.nextLine();
				msg = nickName + ":"+ msg;
				
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip,port);
				ms.send(dp);
			}

		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
