package java0416my;

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 클래스이 인스턴트를 생성
		Student stu = new Student();
		//인스턴트를 이용해서 프로퍼티 접근
		stu.num = 1;
		stu.name = "백승훈";
		
		//다른 인스턴스생성
		Student stu2 = new Student();
		stu2.num = 2;
		stu2.name = "주빈";
		
		//클래스 안에 static 없이 만들어진 변수는 인스턴트마다 별도로 생성 - 프로퍼티라고 한다.
		System.out.println(stu.name);
		System.out.println(stu2.name);
	}

}
