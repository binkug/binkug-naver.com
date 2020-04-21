package java0417my;


//프로퍼티와 생성자 그리고 접근자 메소드 만들기
public class Row {
	//번호와 이름을 저장하기 위한 프로퍼티
	private int num;
	private String name;
	private static int sequence = 1;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getSequence() {
		return sequence;
	}
	public static void setSequence(int sequence) {
		Row.sequence = sequence;
	}
	//생성자 - 매개변수가 없는 생성자와 매개변수가 있는 생성자
	
	public Row () {
		super();
		num = sequence;
		sequence = sequence+1;
		
	}
	
	public Row(int num, String name) {
		super();
		this.num = num;
		this.name = name;
		num = sequence;
		sequence = sequence+1;
	}
	
	
}
