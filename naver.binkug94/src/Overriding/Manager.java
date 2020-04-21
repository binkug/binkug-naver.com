package Overriding;

public class Manager extends Employee{
	private String position;
	public Manager(String empNo, String name, String part) {
		super("0001", "non", "wait");
	
	}
	
	// 매개변수 4개를 갖는 생성자
	public Manager(String empNo, String name, String part, String position) {
		//상위 클래스의 생성자 호출
		super(empNo, name, part);
		this.position = position;
	}
	
	
	//Method Overriding
	public String resultStr() {
		//상위 클래스에 만든 resultStr()을 호출
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
	
}
