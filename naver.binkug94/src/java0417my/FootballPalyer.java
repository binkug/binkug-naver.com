package java0417my;

public class FootballPalyer {
	
	private String name;
	private String team;
	private int number;
	
	//전체 제목으로 사용할 변수를 생성
	//전체가 공통된 이름을 사용하기 때문에 static을 붙이고 변경할 수 없도록 final을 붙인다.
	private static final String title ="축구 선수 명단";
	
	//프로퍼티를 private으로 만들어서 인스턴스가 사용할 수 없기 떄문에 
	//인스턴스가 사용할 수 있도록 접근자 메소드를 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static String getTitle() {
		return title;
	}
	
	//이름,팀이름,등번호를 받아서 set 하는 메소드
	
	public void setProperty(String name,String team,int number) {
		//메소드의 매개변수가 name,team,number
		//프로퍼티 이름도 name,team,number 
		//메소드안에서 지역 변수가 아닌 프로퍼티를 가져올 때는 this.을 붙여 가져오면 된다.
		//this를 생략하면 메소드 안에서 찾고 없으면 프로퍼티로 갑니다.
		this.name = name;
		this.team = team;
		this.number = number;
	}
	//이름과 팀만 입력 받고 등번호는 결정하는 상태를 설정하는 메소드
	//위에 String name,String team이 존재
	//String int를 매개변수로 받는 setProperty 이런 경우를 MethodOverloading이라고 한다.
	public void setProperty(String name,String team) {
		this.name=name;
		this.team=team;
		this.number = 6;
	}
	
	public void display() {
		System.out.println("이름: "+name+" 팀: "+team+" 등번호: "+number);
	}

	
	

}
