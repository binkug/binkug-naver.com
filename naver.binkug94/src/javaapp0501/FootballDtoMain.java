package javaapp0501;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FootballDtoMain {

	public static void main(String[] args) {
		// MovieDto 클래스의 인스턴스 2개를 생성
		FootballDTO dto = new FootballDTO(1,"박지성","14","윙어");
		FootballDTO dto2 = new FootballDTO();
		
		dto2.setNum(10);
		dto2.setTitle("맨유");
		dto2.setDirector("퍼거슨");
		dto2.setActor("루니");
		
		
		
		
		ArrayList<FootballDTO> list = new ArrayList<FootballDTO>();
		list.add(dto2);
		list.add(dto);
		
		//오늘 날짜를 문자열로 만들기
		Date date = new Date();
		//날짜를 원하는 포맷의 문자열로 만들어주는 인스턴스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		
		//파일에 기록
		//ObjectOutputStream
		//FileOutputStream 인스턴스를 이용해서 생성
		//파일의 경로를 가지고 생성
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(today+".dat"))){
			
			//파일에 기록
			oos.writeObject(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
