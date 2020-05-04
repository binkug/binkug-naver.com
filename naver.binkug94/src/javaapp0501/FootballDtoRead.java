package javaapp0501;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FootballDtoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("2020-05-01.dat"))){
			ArrayList<FootballDTO> list = (ArrayList<FootballDTO>) ois.readObject();
			
			for(FootballDTO dto : list) {
				System.out.println(dto);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
