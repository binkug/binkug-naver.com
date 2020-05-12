package javaapp0512JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user24","user24");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into item("
					+ "num, name, marufacture,price,receivedate)"
					+ " values(?,?,?,?,?)"
					);

			pstmt.setInt(1, 4);
			pstmt.setString(2, "포테이토칩");
			pstmt.setString(3, "농심");
			pstmt.setInt(4, 1300);
			Date date = new Date(System.currentTimeMillis());
			pstmt.setDate(5, date);
			
			//select 구문일 때는 eqcuteQuery로 실행하고 ResultSet으로 받음
			int result = pstmt.executeUpdate();
			//5.결과 사용
			if(result>0) {
				System.out.println("insert 성공!");
			}else {
				System.err.println("insert 실패");
			}
			
			//사용한 인스턴스 연결 해제
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
