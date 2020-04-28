package javaapp0428;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	public static void main(String[] args) {
		// 날짜 서식은 SimpleDateFormat
		//2020년4월28일 오후 5시 47분 형식으로 출력
		Date date = new Date();
		
		//날짜 서식 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 EEE a hh시mm분");
		String msg = sdf.format(date);
		System.out.println(msg);
		
		//숫자 서식 만들기
		DecimalFormat df = new DecimalFormat("\u00A4 #,###");
		msg = df.format(1250600);
		System.out.println(msg);
	}

}
