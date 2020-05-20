package javaapp0518;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//DAO 데이터 베이스 작업을 처리하기 위한 클래스
//데이터베이스와 관련된 작업만 처리
//데이터를 가공하거나 생성하거나 하는 작업은 하지 않음.
public class CovidDAO {
	// 싱글톤 패턴(인스턴스를 1개만 생성할 수 있도록 하는 패턴)을 위한 코드
	// Back-End Programmer를 주력으로 하고자 하는 경우에는 객체 지향 디자인 패턴을 학습

	// 클래스가 로드될 때 1번만 수행되는 코드
	// 제일 먼저 실행되는 코드
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {

			System.err.println("드라이버 클래스로드 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// 생성자가 private 이므로 외부에서 인스턴스 생성을 못함
	private CovidDAO() {

	}

	private static CovidDAO covidDAO;

	// 외부에서 생성된 인스턴스를 사용할 수 있도록 리턴해주는 메소드
	public static CovidDAO sharedInstance() {
		// static 변수이므로 null을 대입하지 않는 이상
		// 맨 처음에만 null이고 이후에는 null이 될 수 없음
		if (covidDAO == null) {
			covidDAO = new CovidDAO();
		}
		return covidDAO;
	}
	// java Server 개발에는 Spring을 많이 사용하는데 spring이 자동으로 클래스를
	// Singleton pattern으로 디자인 해 줍니다.

	// 여러 메소드에서 공통으로 사용할 변수
	// java.sql 패키지의 클래스를 import
	private Connection con;
	private PreparedStatement pstmt;

	private void connection() {

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/baek?userUnicode=true&characterEncoding=utf8", "root", "123456789");
			// System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e) {
			System.err.println("데이터베이스 연결 실패");
			System.err.println(e.getMessage());
		}

	}

	// 데이터베이스 연결 객체를 정리 해주는 메소드
	private void close() {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("데이터베이스 종료 실패");
			System.err.println(e.getMessage());

		}
	}

	// 전체보기를 위한 메소드
	// 조회는 몇열의 데이터를 몇행으로 조회하는지
	// where 절이 있는지 확인
	public List<CovidDTO> allselect() {
		List<CovidDTO> list = new ArrayList<CovidDTO>();

		connection();

		try {
			pstmt = con.prepareStatement("select * from covid19");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// list 개별 요소 인스턴스를 생성
				CovidDTO covid = new CovidDTO();
				// 인스턴스의 내부 요소를 채우기
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region").trim());
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));

				// list에 추가
				list.add(covid);

			}


			rs.close();
			//현재 날짜를 포함한 파일 경로를 만들기
			//sql 인스턴스 생성
			Date today = new Date(System.currentTimeMillis());
			//현재 디렉토리에 오늘날짜.log 문자열 생성
			String filepath = "./" + today.toString() + ".log";
			try(PrintWriter pw = new PrintWriter(new FileOutputStream(filepath,true))){
				java.util.Date date = new java.util.Date();
				pw.print(date.toString()+","+"전체보기"+"\n");
				pw.flush();
			}
			
			Date curdate = new Date(System.currentTimeMillis());
			String filename = "./"+curdate.toString()+".dat";
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename,true))){
				Log log = new Log();
				log.setDate(new java.util.Date());
				log.setTask("전체보기");
				oos.writeObject(log);
				oos.flush();
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());

		}
		
		
		close();

		return list;

	}

	// 상세보기를 위한 메소드
	// select * from 테이블이름 where 기본키 = ?
	public CovidDTO selectOne(int num) {
		// 하나의 행이 리턴되는 경우는 인스턴스를 데이터를 가져왔을 때 생성
		CovidDTO covid = null;

		connection();

		try {
			pstmt = con.prepareStatement("select * from covid19 where num = ?");
			pstmt.setInt(1, num);
			// sql 실행
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				covid = new CovidDTO();
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region"));
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));
				
				

			}


			//현재 날짜를 포함한 파일 경로를 만들기
			//sql 인스턴스 생성
			Date today = new Date(System.currentTimeMillis());
			//현재 디렉토리에 오늘날짜.log 문자열 생성
			String filepath = "./"+today.toString()+".log";
			
			try(PrintWriter pw = new PrintWriter(new FileOutputStream(filepath,true))){
				java.util.Date date = new java.util.Date();
				pw.print(date.toString()+","+"상세보기"+"\n");
				pw.flush();
			}
			
		} catch (Exception e) {
			System.err.println("선택 데이터 조회 에러");
			System.out.println(e.getMessage());
		}
		
		close();
		return covid;

	}

	// covid19 테이블에서 가장 큰 num을 찾아오는 메소드
	// select max(num) from covid19
	// 테스를 할 때는 public으로 바꾼후 테스트를 하고 테스트가 다 끝나면 private로 바꿔준다
	private int maxNum() {
		// 데이터가 없을 때는 번호가 0이 있다고 가정
		int result = 0;

		try {
			pstmt = con.prepareStatement("select max(num) from covid19");
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// select의 첫번째 컬럼의 값을 정수로 result에 저장
				result = rs.getInt(1);
			} else {

			}
		} catch (Exception e) {
			System.err.println("가장 큰 번호 가져오기 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return result;

	}

	// 3 데이터를 삽입하는 메소드
	// insert into 테이블이름 컬럼이름 나열
	// values 값을 나열
	// 특별한 경우가 아니면 컬럼은 2개 이상
	// select를 제외한 모든 sql의 실행은 영향 받은 행의 개수를 리턴
	// int쪽은 sql의 결과가 와야한다.
	public int insert(CovidDTO covid) {
		
		//Serializable 된 데이터 읽어오기
		Date today1 = new Date(System.currentTimeMillis());
		String filename = "./"+today1.toString()+".dat";
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename))){
			Log log = (Log) oos.readObject();
			System.out.println(log);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 여기서 -1은 의미없는 값으로 삽입 실패를 의미하는 값
		// 어떤 음수라도 가능 0은 조심
		int result = -1;
//		int num = this.maxNum()+1;
		connection();
		int num = this.maxNum() + 1;
		try {
			// sql 실행 객체 생성
			// sql문의 경우 where 절에서만 대소문자 구분을 해야 한다.
			pstmt = con.prepareStatement("insert into covid19 (num, region, nation,pop, confirmcount, deathcount)"
					+ " values (?,?,?,?,?,?)");
			// 이 경우는 번호를 입력 받은 경우
			// pstmt.setInt(1, covid.getNum());
			// 번호를 자동으로 +1 되게 만드는 방법
			// pstmt.setInt(1, num);
			pstmt.setInt(1, num);
			pstmt.setString(2, covid.getRegion());
			pstmt.setString(3, covid.getNation());
			pstmt.setInt(4, covid.getPop());
			pstmt.setInt(5, covid.getConfirmcount());
			pstmt.setInt(6, covid.getDeathcount());

			result = pstmt.executeUpdate();
			
			//현재 날짜를 포함한 파일 경로를 만들기
			//sql 인스턴스 생성
			Date today1 = new Date(System.currentTimeMillis());
			//현재 디렉토리에 오늘날짜.log 문자열 생성
			String filepath = "./"+today1.toString()+".log";
			
			try(PrintWriter pw = new PrintWriter(new FileOutputStream(filepath,true))){
				java.util.Date date = new java.util.Date();
				pw.print(date.toString()+","+"삽입"+"\n");
				pw.flush();
			}

		} catch (Exception e) {
			// 자신이 알아볼 수 있는 예외 메세지를 출력
			System.err.println("삽입 에러");
			// 프로그램이 주는 예외 메세지를 출력
			System.out.println(e.getMessage());
			// 위의 2개 작업은 파일이나 데이터베이스에 기록하고 주석처리

			// 예외 발생 지점 찾기
			e.printStackTrace();
		}
		close();
		return result;
	}

	// 데이터를 삭제하는 메소드
	// 리턴타입은 정수
	// 매개변수는 기본키
	public int delete(int num) {
		int result = -1;
		connection();
		try {
			pstmt = con.prepareStatement("delete from covid19 where trim(num) = ?");
			// 데이터 바인딩
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("삭제 에러");
			// 프로그램이 주는 예외 메세지를 출력
			System.out.println(e.getMessage());
			// 위의 2개 작업은 파일이나 데이터베이스에 기록하고 주석처리

			// 예외 발생 지점 찾기
			e.printStackTrace();
		}

		return result;

	}

	// 데이터 수정을 위한 메소드
	public int updateCovid(CovidDTO covid) {
		int result = -1;

		connection();
		try {
			pstmt = con.prepareStatement(
					"update covid19 set region = ?, nation = ?, pop = ?, confirmcount = ?, deathcount = ?"
							+ " where num = ?");

			pstmt.setString(1, covid.getRegion());
			pstmt.setString(2, covid.getNation());
			pstmt.setInt(3, covid.getPop());
			pstmt.setInt(4, covid.getConfirmcount());
			pstmt.setInt(5, covid.getDeathcount());
			pstmt.setInt(6, covid.getNum());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// 자신이 알아볼 수 있는 예외 메세지를 출력
			System.err.println("업데이트 에러");
			// 프로그램이 주는 예외 메세지를 출력
			System.out.println(e.getMessage());
			// 위의 2개 작업은 파일이나 데이터베이스에 기록하고 주석처리
		}

		close();
		return result;
	}

	public List<CovidDTO> searchCovid(String word) {
		List<CovidDTO> list = new ArrayList<CovidDTO>();
		connection();

		try {
			// 검색할때 글쓴이 혹은 내용 혹은 글 제목으로 바꿀려면 where 에 있는 region nation을 db에 글쓴이 내용 글제목으로 바꿔주면
			// 된다.
			pstmt = con.prepareStatement("select * from covid19 where region like ? or nation like ?");
			pstmt.setString(1, "%" + word.toUpperCase() + "%");
			pstmt.setString(2, "%" + word.toUpperCase() + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				CovidDTO covid = new CovidDTO();
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region"));
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));

				list.add(covid);
			}
		} catch (Exception e) {
			System.err.println("업데이트 에러");
			// 프로그램이 주는 예외 메세지를 출력
			System.out.println(e.getMessage());
			// 위의 2개 작업은 파일이나 데이터베이스에 기록하고 주석처리
			// 예외 발생 지점 찾기
			e.printStackTrace();
		}
		close();
		return list;
	}

	public int getCount() {

		int result = -1;

		connection();

		try {

			pstmt = con.prepareStatement("select count(*) from covid19");

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				result = rs.getInt("count(*)");

			}

			rs.close();

		} catch (Exception e) {

			System.out.println("데이터 개수 세기 실패");

			System.out.println(e.getMessage());

			e.printStackTrace();

		}

		close();

		return result;

	}

	// 페이지 번호와 페이지당 데이터 개수를 받아서 페이지 번호에 해당하는 데이터를 조회하는 메소드
	// 실제 업무인 경우는 검색어가 포함됩니다.
	public List<CovidDTO> pageCovid(int pageno, int pagecnt) {

		List<CovidDTO> list = new ArrayList<CovidDTO>();
		connection();

		try {

			pstmt = con.prepareStatement("select * from covid19 limit ?,?");
			pstmt.setInt(1, pagecnt * (pageno - 1));
			pstmt.setInt(2, pagecnt);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				CovidDTO covid = new CovidDTO();
				covid.setNum(rs.getInt("num"));
				covid.setNation(rs.getString("nation"));
				covid.setRegion(rs.getString("region"));
				covid.setPop(rs.getInt("pop"));
				covid.setConfirmcount(rs.getInt("confirmcount"));
				covid.setDeathcount(rs.getInt("deathcount"));

				list.add(covid);

			}

		} catch (Exception e) {

			System.out.println("데이터 개수 세기 실패");

			System.out.println(e.getMessage());

			e.printStackTrace();

		}
		close();
		return list;
	}

}
