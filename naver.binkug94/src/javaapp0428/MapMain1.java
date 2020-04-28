package javaapp0428;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//해시 맵 인스턴스 생성
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		//데이터 저장
		map.put("name", "드록바");
		map.put("team", "첼시");
		map.put("position", "FW");
		map.put("backNum",11 );
		
		//데이터 꺼내오기
		System.out.println(map.get("name"));
		System.out.println(map.get("team"));
		
		//데이터 수정 - 존재하는 key에 데이터를 삽입하면 수정
		map.put("position", "CF");
		System.out.println(map.get("position"));
		
		//데이터 삭제
		map.remove("backNum");
		
		//toString 호출
		System.out.println(map);
		
		//Map의 전체 데이터 순회
		//key 전체를 Set로 리턴
		Set <String> keys = map.keySet();
		//Key 값을 이용해서 전체 데이터를 출력
		
		for(String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
	}
	

}
