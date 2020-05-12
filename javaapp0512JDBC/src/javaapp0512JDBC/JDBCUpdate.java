package javaapp0512JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.데이터베이스 접속 인스턴스 생성
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user24","user24");

		PreparedStatement pstmt = con.prepareStatement(""
				+ "UPDATE ITEM " + 
				" SET name = ?, marufacture = ?, price = ?" + 
				" WHERE num = ?");
		pstmt.setString(1, "허니버터칩");
		pstmt.setString(2, "해태");
		pstmt.setInt(3, 1500);
		pstmt.setInt(4, 5);
		
		//select 구문일 때는 eqcuteQuery로 실행하고 ResultSet으로 받음
		int result = pstmt.executeUpdate();
		//5.결과 사용
		if(result>0) {
			System.out.println("업데이트 성공!");
		}else if(result == 0) {
			System.out.println("데이터가 없습니다.");
		}
		else {
			System.err.println("업데이트 실패");
		}
		
		//사용한 인스턴스 연결 해제
		pstmt.close();
		con.close();
	}catch (Exception e) {
		System.err.println(e.getMessage());
		// TODO: handle exception
		}
		
	}
	
}
