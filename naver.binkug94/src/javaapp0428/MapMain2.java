package javaapp0428;

import java.util.HashMap;


public class MapMain2 {

	public static void main(String[] args) {
		//2차원 배열 -배열의 배열
		//프로축구 선수들의 팀별 선수 명단을 데이터로 작성
		String [] chelsea = {"체흐","드록바","램파드"};
		String [] manutd = {"반데사르","긱스","루니"};
		String [] mancity = {"조하트","아게로","야야투레"};
		String [] arsnal = {"외질","앙리","슈제츠니"};
		
		
		//이차원배열 생성
		//배열에는 비교가 가능한 데이터만 저장하기 ㄸ문에 데이터이외의 정보를 저장하지 못해서 이차원 배열을 이용하는
		//경우 배열의 특성을 출력할 수 없다.
		String [][] players = {chelsea, manutd, mancity,arsnal};
		
		for(int i=0;i<players.length;i++) {
			
			if(i==0) {
				System.out.printf("%2s","첼시 :");
			}else if (i==1) {
				System.out.printf("%2s","맨유 :");
			}else if (i==2) {
				System.out.printf("%2s","맨시티 :");
			}else if(i==3) {
				System.out.printf("%2s","아스날 :");
			}
			String [] temp = players[i];
			for(String imsi : temp) {
				System.out.printf("%5s",imsi);
			}
			System.out.printf("\n");
			
			//배열을 하나로 묶어 줄 때는 Map을 만들어서
			//배열의 특징과 데이터를 저장하고 Map의 배열을 만들어주는 것이 좋다.
		}
		System.out.printf("\n");

		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("team", "첼시:");
		map1.put("player", chelsea);
		
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "맨유:");
		map2.put("player", manutd);
		
		HashMap<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "맨시티:");
		map3.put("player", mancity);
		
		HashMap<String, Object> map4 = new HashMap<String, Object>();
		map4.put("team", "아스날:");
		map4.put("player", arsnal);
		
		HashMap [] epl = {map1,map2,map3,map4};
		
		for(HashMap map : epl) {
			
			System.out.printf("%5s", map.get("team"));
			
			//출력 이외의 작업을 할 때는 원래 자료형으로 형 변환해서 사용해야 한다.
			String [] player = (String [])map.get("player");
			try {
				for(String p : player) {
					System.out.printf("%5s",p);
				
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("\n");
			}
		}

}




