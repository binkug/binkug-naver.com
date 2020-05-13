package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user04","user04");
			//System.out.println("접속 성공");
			
			PreparedStatement pstmt = con.prepareStatement("insert into dept(deptno, dname, loc) values(?,?,?)");
			
			pstmt.setInt(1, 59);
			pstmt.setString(2,"분석");
			pstmt.setString(3, "의정부");
			//결과 사용
			//삽입은 성공한 경우 1이상의 정수가 리턴된다.
			int result = pstmt.executeUpdate();
			
			if(result >= 1) {
				System.out.println("insert 성공");
			}else {
				System.out.println("insert 실패");
			}
			//6.사용이 끝난 객체정리
			pstmt.close();
			con.close();
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
