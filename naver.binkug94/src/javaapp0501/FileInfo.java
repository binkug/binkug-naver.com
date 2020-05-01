package javaapp0501;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일에 대한 정보를 리턴해주는 File 인스턴스 생성
		File file = new File("C:\\Users\\30404\\Desktop\\0429.txt");
		
		//파일의 마지막 수정 날짜 확인 - epoch time
		long lastModified = file.lastModified();
		//epoch time을 Date로 변환
		Date date = new Date(lastModified);
		System.out.println("마지막 수정 일 : "+date);
		//파일의 크기 확인
		//키로 바이트로 표시 할려면 1024로 나눠주고 MB로 표시 할 경우 두배를 나눠주면 된다.
		long length = file.length();
		System.out.println("파일 크기는 : "+length/1024+"KB");
	}

}
