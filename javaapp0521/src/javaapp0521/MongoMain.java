package javaapp0521;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoMain {

	public static void main(String[] args) {
		// MongoDB 접속
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		//MongoDB안의 mymongo 데이터베이스 접속
		MongoDatabase mymongo = mongoClient.getDatabase("mymongo");
		//mymongo 안의 users 라는 컬렉션 가져오기
		MongoCollection<Document> users = mymongo.getCollection("users");
		//System.out.println(users);
		
		//1.전체 데이터 가져오기
		//전체 데이터를 저장할 List를 생성
//		List<Document> list = new ArrayList<>();
//		//전체데이터를 커서로 리턴해주는 메소드를 수행
//		//커서 : 데이터의 모임을 순서대로 순회할 수 있도록 해주는 포인터
//		//iterrator,enumerator,cursor,빠른열거(for-each)가 유사
//
//		MongoCursor<Document> cursor = users.find(new BasicDBObject(map)).iterator();
//
//		
//		//데이터를 순회하면서 list에 하나씩 추가
//		while(cursor.hasNext()) {
//			list.add(cursor.next());
//			System.out.println(list);
//		}
//		//전부 사용 했으므로 사용 종료
//		cursor.close();
//		
//		//데이터 출력
//		for(Document document : list) {
//			System.out.println(
//					document.get("id")+":"+document.get("password"));
//		}
		
		// 2.조건에 의한 검색
		// 조건에 맞는 데이터를 저장할 List를 생성
//		List<Document> list = new ArrayList<>();
//		Map<String, Object> map = new HashMap<>();
//		//전체데이터를 커서로 리턴해주는 메소드를 수행
//		//커서 : 데이터의 모임을 순서대로 순회할 수 있도록 해주는 포인터
//		//iterrator,enumerator,cursor,빠른열거(for-each)가 유사
//		map.put("id", "root");
//		MongoCursor<Document> cursor = users.find(new BasicDBObject(map)).iterator();
//
//		
//		//데이터를 순회하면서 list에 하나씩 추가
//		while(cursor.hasNext()) {
//			list.add(cursor.next());
//			System.out.println(list);
//		}
//		//전부 사용 했으므로 사용 종료
//		cursor.close();
//		
//		//데이터 출력
//		for(Document document : list) {
//			System.out.println(
//					document.get("id")+":"+document.get("password"));
//		}
		
		//3.데이터 삽입
		//삽입할 데이터 생성
//		Document document = new Document();
//		document.put("id", "ggangpae1");
//		document.put("password", "cyberadam");
//		
//		users.insertOne(document);
		
		//4.데이터 삭제
//		Document document = new Document();
//		document.put("id", "ggangpae1");
//		document.put("password", "cyberadam");
//		
//		users.deleteOne(document);
		
		//5.데이터 수정
		Document where = new Document();
		where.put("id", "user01");

		Document set = new Document();
		set.put("$set", new Document(
			"password", "1111"));

		users.updateOne(where, set);
	}

}
