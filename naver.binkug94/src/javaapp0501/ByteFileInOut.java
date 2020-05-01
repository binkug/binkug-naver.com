package javaapp0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileInOut {

	public static void main(String[] args) {
		
		//파일에 기록하 스트림 변수 
		FileOutputStream fos = null;
		try {
			//예외가 발생할 가능성이 있는 코드
			//파일에 바이트 단위로 기록할 스트림 생성
			fos = new FileOutputStream("./test.txt");
			String msg = "Hello ByteStream";
			fos.write(msg.getBytes());
			fos.flush();
			
		} catch (Exception e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
			
		}finally {
			
			try {
				//무조건 수행되는 코드
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//파일의 내용을 바이트 단위로 읽기
		//try ~ resources
		//try() 안에서 생성한 것은 close를 호출하지 않아도 자동으로 close가 호출 된다.
		try(FileInputStream fis = new FileInputStream("./test.txt")) {
			
			//파일 내용을 바이트 단위로 읽기
			byte [] b = new byte[1024];
			int len = fis.read(b);
			if(len == -1) {
				System.out.println("데이터가 없습니다.");
			}else {
				//한글은 3byte이다.
				System.out.println(new String(b));
				System.out.println("??");
			}
			
		} catch (Exception e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		}
	}

}
