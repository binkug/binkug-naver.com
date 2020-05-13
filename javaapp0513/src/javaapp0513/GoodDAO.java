package javaapp0513;

import java.util.ArrayList;
import java.util.List;

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
	
	//전체 데이터를 가져오는 메소드
	//select는 where 절을 확인해서 매개변수를 생성
	//select * from goods;
	//list를 리턴할 때는 인스턴스를 만들고 데이터를 추가한 후 리턴
	//여러 개의 데이터를 가져올 때는 데이터가 없는 경우 size가 0이다.
	public List<Good> selectGood(){
		
		List<Good> list = new ArrayList<Good>();
		
		
		
		return list;
		
	}
	
}
