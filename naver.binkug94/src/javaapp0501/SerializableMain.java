package javaapp0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) {
		//파일에 인스턴스 단위로 기록
		//이 클래스에서만 읽을 수 있다.
//		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos.dat"))) {
//			
//			//dto 클래스의 인스턴스를 생성
//			DTO dto = new DTO("asd1","끌끌",5.2);
//			//파일에 기록
//			oos.writeObject(dto);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./oos.dat"))) {
			DTO dto = (DTO) ois.readObject();
			System.out.println(dto);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
