package javaapp051314;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCProcedureSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user04","user04");
			CallableStatement cstmt = con.prepareCall("{call insert_dept_proc}");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
