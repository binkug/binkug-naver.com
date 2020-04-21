package java0417my;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Member mem = new Member();
		System.out.println(mem.getId());
		
		Member mem2 = new Member();
		mem2.setId("1234");
		mem2.setName("qwe");
		mem2.setPw("456");
		
		//매개변수가 있는 생성자를 호출해서 인스턴스를 생성
		Member mem3 = new Member("12345","qwer","789");
		
		
	}

}
