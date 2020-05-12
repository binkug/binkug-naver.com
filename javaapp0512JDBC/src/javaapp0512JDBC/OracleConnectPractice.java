package javaapp0512JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;




public class OracleConnectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//오라클 드라이버 클래스 로드
			//예외가 발생하면 오라클 드라이버 파일을 프로젝트의 build path를 하지 않았거나 드라이버 클래스 이름이 틀린거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 클래스 로드 성공");
			
			//데이터베이스 접속
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user24","user24");
			//System.out.println("접속 성공");
			
			//데이터삽입
//			PreparedStatement pstmt = con.prepareStatement("INSERT INTO ITEM("
//					+ "num, name, marufacture, price, receivedate)"
//					+ " values(5, '배', '나주', 15000, sysdate-2)");
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("삽입 성공");
//			}else {
//				System.out.println("삽입 실패");
//			}
			PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO ITEM("
					+ "num, name, marufacture, price, receivedate)"
					+ " values(?, ?, ?, ?, ?)");
			int result = pstmt2.executeUpdate();
			pstmt2.setInt(1, 5);
			pstmt2.setString(2, "오징어");
			pstmt2.setString(3, "동해");
			pstmt2.setInt(4, 15000);
			//오늘 날짜를 갖는 java.sql.Date 인스턴스 만들기
			Date date = new Date(System.currentTimeMillis());
			pstmt2.setDate(5, date);
			if(result>0) {
				System.out.println("업데이트 성공");
			}else {
				System.err.println("업데이트 실패");
			}
			
			pstmt2.close();
			//데이터베이스 접속 해제
			con.close();
			
		
		} catch (Exception e) {
			System.err.println("드라이버 클래스 로드 실패");
			System.err.println(e.getMessage());
		}
			
	}

}
