package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//데이터베이스 연동 메소드를 소유한 클래스
public class GoodDAO {
	
	//싱글톤 패턴 디자인 - 객체를 1개만 생성할 수 있도록 만드는 패턴
	//외부에서 생성할 수 없도록 생성자를 private으로 
	private GoodDAO() {}
	
	//만들어진 객체의 참조를 저장하기 위한 변수
	private static GoodDAO goodDAO = null;
	
	//객체가 필요 없으면 만들어서 리턴하고 있으면 있는 것을 리턴하도록 하는 객체 사용을 위한 메소드
	public static GoodDAO sharedInstance() {
		
		if(goodDAO==null) {
			goodDAO = new GoodDAO();
		}
		return goodDAO;
	}
	
	//메소드 들에서 공통으로 사용할 변수
	private Connection con;
	private PreparedStatement pstmt;
	
	private void connection () {
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe","user04","user04");
		} catch (Exception e) {
			System.err.println("연결 실패");
			System.out.println(e.getMessage());
		}
	}
	
	private void close() {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println("연결 해제실패");
			System.out.println(e.getMessage());
		}
	}
	
	//전체 데이터를 가져오는 메소드
	//select는 where 절을 확인해서 매개변수를 생성
	//select * from goods;
	//list를 리턴할 때는 인스턴스를 만들고 데이터를 추가한 후 리턴
	//여러 개의 데이터를 가져올 때는 데이터가 없는 경우 size가 0이다.
	public List<Map<String,Object>> selectGood(){
		//리턴할 데이터 생성
		//여러 개 일 때는 생성자를 호출해서 인스턴스를 생성
//		List<Good> list = new ArrayList<Good>();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		//데이터베이스 연결
		connection();
		
		//sql 실행 객체 생성
		try {
			pstmt = con.prepareStatement("select * from goods order by code");
			//sql 실행
			ResultSet rs = pstmt.executeQuery();
			//데이터가 여러개
			while(rs.next()) {
				//행 단위 작업
				Map<String, Object> map = new HashMap<>();
//				Good imsi = new Good();
//				//code 열의 값을 문자열로 읽어서 imsi에 저장
//				imsi.setCode(rs.getString("code"));
//				imsi.setManufacture(rs.getString("Manufacture"));
//				imsi.setName(rs.getNString("name"));
//				imsi.setPrice(rs.getInt("price"));
//				imsi.setReceivedate(rs.getDate("receivedate"));
				map.put("code", rs.getString("code"));
				map.put("name", rs.getString("name"));
				map.put("manufacture",rs.getString("manufacture"));
				map.put("price", rs.getInt("price"));
				map.put("receivedate",rs.getDate("receivedate"));
				
				//list에 삽입
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("전체 데이터 조회 실패");
			e.printStackTrace();
		}
		
		//데이터베이스 연결 해제
		close();
		
		
		return list;
		
	}
	
	//code를 가지고 데이터를 찾아오는 메소드
	//code는 기본키
	//select * from goods where code = ?
	//하나의 행만 리턴하는 경우에는 데이터가 없으면 null을 리턴
	public Good selectOneGoods(String code){
		
		Good good = null;
		//데이터베이스 연결
		connection();
		
		//sql 실행 객체 생성
		try {
			pstmt = con.prepareStatement("select * from goods where trim(code) = ?");
			pstmt.setString(1, code);
			
			//sql 실행
			ResultSet rs = pstmt.executeQuery();
			//데이터가 2개 이상 나올 수 없으므로 if 로 처리
			if(rs.next()) {
				good = new Good();
				good.setCode(rs.getString("code"));
				good.setManufacture(rs.getString("Manufacture"));
				good.setName(rs.getNString("name"));
				good.setPrice(rs.getInt("price"));
				good.setReceivedate(rs.getDate("receivedate"));
			}
			
			
		} catch (Exception e) {
			System.err.println("선택 데이터 조회 에러");
			e.printStackTrace();
		}
		close();
		return good;
		
	}
	//데이터를 삽입하는 메소드
	//삽입이나 수정은 매개변수가 DTO 아니면 Map
	//-1이 리턴되면 실패 0이 리턴되면 조건에 맞는 데이터가 없음 양수가 리턴되면 작업을 수행했다
	public int insertGood(Good good) {
		
		int result = -1;
		connection();
		try {
			pstmt = con.prepareStatement("insert into goods(code, name, manufacture, price, receivedate)"
					+ " values (?,?,?,?,?)");
			
			pstmt.setString(1, good.getCode());
			pstmt.setString(2,good.getName());
			pstmt.setString(3, good.getManufacture());
			pstmt.setInt(4, good.getPrice());
			pstmt.setDate(5, good.getReceivedate());
			
			result = pstmt.executeUpdate();
			
			if(result == -1) {
				System.out.println("데이터 삽입 실패");
			}else if(result == 0) {
				System.out.println("조건에 맞지 않습니다");
			}else {
				System.out.println("데이터 삽입 성공!");
			}
		} catch (Exception e) {
			System.err.println("데이터 삽입 에러");
			e.printStackTrace();
		}
		close();
		return result;
	}
	//삽입과 수정은 똑같아서 메소드 명만 바꿔 만들면 된다.
	public int updateGood(Good good) {
		
		int result = -1;
		connection();
		try {
			pstmt = con.prepareStatement("update goods set name = ?, manufacture = ?, price = ? where trim(code)= ?");
			

			pstmt.setString(1,good.getName());
			pstmt.setString(2, good.getManufacture());
			pstmt.setInt(3, good.getPrice());
			pstmt.setString(4, good.getCode());
			
			result = pstmt.executeUpdate();
			
			if(result == -1) {
				System.out.println("데이터 수정 실패");
			}else if(result == 0) {
				System.out.println("조건에 맞지 않습니다");
			}else {
				System.out.println("데이터 수정 성공!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			System.err.println("데이터 업데이트 에러");
			e.printStackTrace();
		}
		close();
		return result;
	}
	//삭제하는 메소드
	//삭제는 대부분 기본키만으로 수행한다.
	public int deleteGood(String code) {
		
		int result = -1;
		connection();
		try {
			pstmt = con.prepareStatement("delete from goods where trim(code) = ?");
			pstmt.setString(1, code);
			
			result = pstmt.executeUpdate();

			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("데이터 삭제 에러");
			System.out.println(e.getMessage());
		}
		
		close();
		return result;
	}

	//매개변수가 name 이나 manufacture에 포함된 데이터를 조회하는 메소드 
	//List, DTO 나 MAP,Scala(기본형,String ,Date)
	public List<Good> search(String word){
		//리스트는 생성해서 리턴
		
		 List<Good> list = new ArrayList<Good>();
		 connection();
		 try {
			 //대소문자 구분을 하지않는 검색은 sql에서도 대문자나 소문자로 바꾸고 프로그램에서도 대문자나 소문자로 변경해야 된다.
			 pstmt = con.prepareStatement("select * from goods where upper(name) like ? or upper(manufacture) like ? ");
			 pstmt.setString(1, "%"+word.toUpperCase()+"%");
			 pstmt.setString(2, "%"+word.toUpperCase()+"%");
			 
			 ResultSet rs = pstmt.executeQuery();
			 while(rs.next()) {
				 Good good = new Good();
				 good.setCode(rs.getString("code"));
				 good.setName(rs.getString("manufacture"));
				 good.setManufacture(rs.getString("manufacture"));
				 good.setPrice(rs.getInt("price"));
				 good.setReceivedate(rs.getDate("receivedate"));
				 
				 list.add(good);
			 }
			 rs.close();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("데이터 검색 에러");
			System.out.println(e.getMessage());
		}
		 close();
		return list;
		
		
		
	}
	
	
}
