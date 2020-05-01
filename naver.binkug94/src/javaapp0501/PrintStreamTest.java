package javaapp0501;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (PrintStream ps = new PrintStream("./buf.txt")){
			ps.write("버퍼를 이용한 기록".getBytes());
			ps.flush();
		} catch (Exception e) {
			// TODO: handle exception
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		}
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./buf.txt"))){
			byte [] b = new byte [512];
			bis.read(b);
			System.out.println(new String(b));
		} catch (Exception e) {
			// TODO: handle exception
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		}
		
	}

}
