package chap07.company2;

public class Manager extends Employee {
	//직급을 정할 프로퍼티
	private String position; // 직책
	//매개변수가 있는 생성자
	public Manager() {
		super("A0000", "noname", "대기발령");
	}
	// 매개변수 4개를 갖는 생성자
	public Manager(String empNo, String name, String part, String position) {
		//상위 클래스의 생성자 호출
		super(empNo, name, part);
		this.position = position;
	}

	public String addStr() {
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
}

