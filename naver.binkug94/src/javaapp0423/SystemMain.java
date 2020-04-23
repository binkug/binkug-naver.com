package javaapp0423;

import java.io.IOException;

public class SystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello java를 10만번 출력하는데 걸리는 시간
		//Hello java를 10만번 출력
		//시간 측정 - 테스트를 해주는 프로그램을 이용하기도 함
		long start = System.nanoTime();
		for(int i=0;i<=10000;i++) {
			System.out.println(i);
		}
		
		long end = System.nanoTime();
		long result = end - start;
		System.out.println(result);
		String javaVer = System.getProperty("java.version");
		System.out.println(javaVer);
		
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("notepad.exe");
		} catch (IOException e) {

			e.printStackTrace();
		}
		//mac : rt.exec("open/System/Applications/TextEdit.app");
	}

}
