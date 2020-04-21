package datashare;

public class Main {

	public static void main(String[] args) {
		//클래스의 인스턴스 2개 생성
		Share sh = new Share();
		Share sh2 = new Share();

		//noshare는 인스턴스 프로퍼티 이므로 변경해도 다른 인스턴스에는 아무런 영향이 없다.
		sh.noShare = "안녕 sh2";
		System.out.println(sh2.noShare);
		
		sh.msg = "메롱";
		System.out.println(sh2.msg);

		System.out.println(GlobalClass.global);
		
		Singleton s1 = Singleton.sharedInstance();
		Singleton s2 = Singleton.sharedInstance();
		
		//2개의 인스턴스가 동일한 지 확인할 때는 해시코드를 확인
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		Singleton.sharedInstance().sharedVaridable = "Singleton";
		Parent p = new Parent();
	}

}
