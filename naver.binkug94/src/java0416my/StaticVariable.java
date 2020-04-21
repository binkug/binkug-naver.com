package java0416my;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2();
		Student2 stu2 = new Student2();
		
		//static 뱐수를 인스턴스를 이용해서 접근하면 경고가 뜬다 되도록이면 클래스 이름으로 접근하는게 좋다
		stu.name ="승훈1";
		stu2.name = "주빈1";
		//stu.schName = "진광";
		//stu2.schName = "해사";
		Student2.schName = "메롱";
		
		System.out.println(stu.schName+" : "+stu.name);
		System.out.println(stu2.schName+" : "+stu2.name);
	}

}
