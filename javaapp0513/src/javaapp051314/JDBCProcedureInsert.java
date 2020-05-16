package javaapp051314;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCProcedureInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user04","user04");
			//메뉴얼 commit으로 설정
			con.setAutoCommit(false);
			
			//3.실행 객체를 생성
			CallableStatement cstmt = con.prepareCall("{call insert_dept_proc(?,?,?)}");
			
			cstmt.setInt(1, 2);
			cstmt.setString(2, "설계");
			cstmt.setString(3, "독도");
			//4.실행
			int result = cstmt.executeUpdate();
			//5.결과 사용
			if(result >= 1) {
				System.out.println("Procedure insert 성공!");
			}else {
				System.err.println("Procedure insert 실패..");
			}
			
			cstmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
