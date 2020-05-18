package javaapp0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//DAO 데이터 베이스 작업을 처리하기 위한 클래스
//데이터베이스와 관련된 작업만 처리
//데이터를 가공하거나 생성하거나 하는 작업은 하지 않음.
public class CovidDAO {
	//싱글톤 패턴(인스턴스를 1개만 생성할 수 있도록 하는 패턴)을 위한 코드
	//Back-End Programmer를 주력으로 하고자 하는 경우에는 객체 지향 디자인 패턴을 학습
	
	//클래스가 로드될 때 1번만 수행되는 코드
	//제일 먼저 실행되는 코드
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			
			System.err.println("드라이버 클래스로드 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//생성자가 private 이므로 외부에서 인스턴스 생성을 못함
	private CovidDAO() {
		
	}
	
	
	private static CovidDAO covidDAO;
	
	//외부에서 생성된 인스턴스를 사용할 수 있도록 리턴해주는 메소드
	public static CovidDAO sharedInstance() {
		//static 변수이므로 null을 대입하지 않는 이상
		//맨 처음에만 null이고 이후에는 null이 될 수 없음
		if(covidDAO == null) {
			covidDAO = new CovidDAO();
		}
		return covidDAO;
	}
	//java Server 개발에는 Spring을 많이 사용하는데 spring이 자동으로 클래스를
	//Singleton pattern으로 디자인 해 줍니다.
	
	private Connection con;
	private PreparedStatement pstmt;
	
	private void connection() {
		
		try {
			con = DriverManager.getConnection("");
		}catch (Exception e) {
			System.err.println("연결실패");
			System.err.println(e.getMessage());
		}
		
	}
}
