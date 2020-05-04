package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버 소켓 생성 - 192.168.0.51 : 9000
			ServerSocket ss = new ServerSocket(8900);
			while (true) {
				System.out.println("서버 대기중...");
				Socket socket = ss.accept();
				
				//전송된 메세지 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String msg = br.readLine();
				System.out.println("보낸 곳:"+socket.getInetAddress());
				System.out.println(msg);
				
				br.close();
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println("반사:"+msg);
				pw.flush();
				
				pw.close();
				socket.close();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
