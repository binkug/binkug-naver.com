package java0417my;

public class Member {
	
	static {
		System.out.println("한번만 실행");
	}
	
	{
		System.out.println("인스턴스가 만들어질때마다 실행");
	}
	
	//이러한 애들을 프로퍼티라고 하는데 값을 대입하지 않으면
	//숫자는 0 boolean은 false 그리고 나머지는 null이 된다.
	private String id;
	private String pw;
	private String name;
	
	//눈에 보이지는 않지만 자바가 생성해주는 생성자
	//매개변수는 없고 상위 클래스의 생성자를 호출하는 생성자
	//이렇게 매개변수가 없는 생성자를 default constructor라고 합니다.
	//생성자는 리턴 타입이 없고 이름은 클래스이름과 같아야 합니다.
	public Member() {
		super();
		//프로퍼티에 기본값을 설정
		id ="123";
		pw = "123";
		name = "123";
	}

	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
