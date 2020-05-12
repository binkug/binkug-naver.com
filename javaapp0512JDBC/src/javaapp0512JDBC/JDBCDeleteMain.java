package javaapp0512JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user24","user24");

			PreparedStatement pstmt = con.prepareStatement("delete from item"
					+ " where num = ?");
			pstmt.setInt(1, 3);

			
			//select 구문일 때는 eqcuteQuery로 실행하고 ResultSet으로 받음
			int result = pstmt.executeUpdate();
			//5.결과 사용
			if(result>0) {
				System.out.println("삭제 성공!");
			}else if(result == 0) {
				System.out.println("데이터가 없습니다.");
			}
			else {
				System.err.println("삭제 실패");
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
