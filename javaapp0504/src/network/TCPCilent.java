package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//소켓 만들기 - 자기 IP는 실제 IP를 적어도 되고
			//127.0.0.1이라고 해도된다.
			InetAddress addr = InetAddress.getByName("192.168.0.84");
			Scanner sc = new Scanner(System.in);
			while(true) {
				//소켓 연결
				Socket socket = new Socket(addr,10004);
				//전송할 메세지 입력
				System.out.println("메세지 : ");
				String msg = sc.nextLine();
				
				//메세지 전송
				PrintWriter pw = new PrintWriter(socket.getOutputStream()); 
				pw.print(msg);
				pw.flush();
				pw.close();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String receiveMsg = br.readLine();
				System.out.println(receiveMsg);
				br.close();
				//socket.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
