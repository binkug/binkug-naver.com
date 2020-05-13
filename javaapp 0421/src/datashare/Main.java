package datashare;

public class Main {

	public static void main(String[] args) {
		// 클래스의 인스턴스 2개 생성
		Tjoeun obj1 = new Tjoeun();
		Tjoeun obj2 = new Tjoeun();
		
		// noShare는 인스턴스 프로퍼티이므로 변경해도 다른 인스턴스에는 아무런 영향이 없다.
		obj1.noShare = "안녕 obj2";
		System.out.println(obj2.noShare);
		
		
		obj1.msg = "이번에는 공유가능";
		System.out.println(obj2.msg);
		
		obj1.globalChange();
		System.out.println(GlobalClass.globalMsg);
		
		Singleton s1 = Singleton.sharedIntance();
		Singleton s2 = Singleton.sharedIntance();
		
		// 2개의 인스턴스가 동일한 지 확인하는 방법은 해시코드 이용
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		Singleton.sharedIntance().sharedVariable = "Singleton";
		
		
		Parent p = new Parent();
		
		// Fields Summary 사용법 -> (Class name).
		System.out.println(Thread.MAX_PRIORITY);
		
		int result = Math.max(20, 30);
		System.out.println(result);
	}

}
