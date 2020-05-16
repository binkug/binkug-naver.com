package javaapp051314;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDeptSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user04","user04");
			//3.SQL 실행 객체 생성
			PreparedStatement pstmt = con.prepareStatement("select * from dept where deptno = ? order by deptno");
			pstmt.setInt(1, 10);
			//4.sql 실행
			ResultSet rs = pstmt.executeQuery();
			//5. 결과 사용
			
			if(rs.next()) {
				//각 행마다 작업
				//하나만 조회를 할 경우 반복문이 필요 없어서  do while을 사용할 필요가 없다.
//				do {
					//deptno의 값을 정수로 읽어서 deptno에 저장
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					
					System.out.println(deptno +"의  부서 이름은 : "+dname+" 일하는 장소는 : "+loc);
//				}while(rs.next());
			}else {
				System.out.println("데이터 조회 실패!");
			}			
			//6.사용이 끝난 객체 정리
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
