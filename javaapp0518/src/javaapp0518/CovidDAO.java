package javaapp0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	//여러 메소드에서 공통으로 사용할 변수
	//java.sql 패키지의 클래스를 import
	private Connection con;
	private PreparedStatement pstmt;
	
	private void connection() {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baek","root","123456789");
			//System.out.println("데이터베이스 연결 성공!");
		}catch (Exception e) {
			System.err.println("데이터베이스 연결 실패");
			System.err.println(e.getMessage());
		}
		
	}
	
	//데이터베이스 연결 객체를 정리 해주는 메소드
	private void close() {
		try {
			if(pstmt !=null) {
				pstmt.close();
			}
			if(con != null) {
				con.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("데이터베이스 종료 실패");
			System.err.println(e.getMessage());

		}
	}
	
	//전체보기를 위한 메소드
	//조회는 몇열의 데이터를 몇행으로 조회하는지
	//where 절이 있는지 확인
	public List<CovidDTO> allselect(){
		List<CovidDTO> list = new ArrayList<CovidDTO>();
		
		connection();
		
		try {
			pstmt = con.prepareStatement("select * from covid19");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//list 개별 요소 인스턴스를 생성
				CovidDTO covid = new CovidDTO();
				//인스턴스의 내부 요소를 채우기
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region"));
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));
				
				//list에 추가
				list.add(covid);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
		
		close();
		
		return list;
		
	}
	
	//상세보기를 위한 메소드
	//select * from 테이블이름 where 기본키 = ?
	public CovidDTO selectOne(int num) {
		//하나의 행이 리턴되는 경우는 인스턴스를 데이터를 가져왔을 때 생성
		CovidDTO covid = null;
		
		connection();
		
		try {
			pstmt = con.prepareStatement("select * from covid19 where num = ?");
			pstmt.setInt(1, num);
			//sql 실행
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				covid = new CovidDTO();
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region"));
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));
				
			}

		} catch (Exception e) {
			System.err.println("선택 데이터 조회 에러");
			System.out.println(e.getMessage());
		}
		
		close();
		return covid;
		
	}
	
	
}
