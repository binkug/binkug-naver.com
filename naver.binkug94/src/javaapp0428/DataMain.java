package javaapp0428;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataMain {

	public static void main(String[] args) {
		//2019.01.28일을 Calendar 클래스의 인스턴스로 생성
		GregorianCalendar meetDay = new GregorianCalendar(2018,12,28);
		//년도만 가져오기
		System.out.println(Calendar.YEAR);
		//Date로 변환
		Date date = new Date(meetDay.getTimeInMillis());
		System.out.println(date);
		
		//현재 날짜 및 시간 만들기
		GregorianCalendar today = new GregorianCalendar();
		
		//날짜 차이 계산
		long gap = today.getTimeInMillis() - meetDay.getTimeInMillis();
		gap = gap / 1000;
		gap = gap / 86400;
		
		System.out.println("만난지"+gap+"일 째");
	}

}
