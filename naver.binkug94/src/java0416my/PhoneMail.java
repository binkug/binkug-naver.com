package java0416my;

public class PhoneMail {

	public static void main(String[] args) {
		
		//Phone 클래스의 인스턴스를 생성
		Phone ph = new Phone();
		ph.setNum(1);
		ph.setName("백승훈");
		ph.setPhoneNumber("010-9494-7721");
		ph.setEmail("binkug@naver.com");
		//name을 가져와서 출력을 할때는 
		System.out.println("넘버 : "+ph.getNum());
		System.out.println("이름 : "+ph.getName());
		System.out.println("핸드폰 번호 : "+ph.getPhoneNumber());
		System.out.println("이메일 : "+ph.getEmail());
		
		
		//Phone 클래스에 만든 static 메소드 호출
		//static 메소드는 클래스 이름으로 호출
		Phone.staticMethod();
	}

}
