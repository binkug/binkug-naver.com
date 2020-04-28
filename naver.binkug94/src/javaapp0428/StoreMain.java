package javaapp0428;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class StoreMain {

	public static void main(String[] args) {
		// 테이블 형태의 데이터 생성
		ArrayList<Store> list = new ArrayList<Store>();
		list.add(new Store("1","오물오물",4.8,11000,"오므라이스"));
		list.add(new Store("2","꾸물꾸물",3.2,12000,"감자튀김"));
		list.add(new Store("3","꼬물꼬물",4.9,18000,"치킨"));
		list.add(new Store("4","동글동글",3.5,28000,"피자"));
		
		//데이터 출력
		System.out.println("코드\t이름\t평점\t최소주문금액\t메뉴");
		
		for(Store store : list) {
			System.out.println(
					store.getCode()+"\t"+
					store.getName()+"\t"+
					store.getAverage()+"\t"+
					store.getMoinOrderMoney()+"\t"+"\t"+
					store.getMenu()
					);
			
		}
		ArrayList<LinkedHashMap<String,Object>>
		stores = new ArrayList<>();
		
		LinkedHashMap<String,Object> store = new LinkedHashMap<String, Object>();
		store.put("code","1");
		store.put("name","꿀꿀");
		store.put("average",4.5);
		store.put("MoinOrderMoney",120000);
		store.put("menu","돈까스");
		stores.add(store);
		
		for(LinkedHashMap<String, Object> map : stores) {
			Set<String>keys = map.keySet();
			for(String key: keys) {
				System.out.print(map.get(key)+"\t");
			}
		}
		
	}

}
