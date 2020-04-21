package datashare;

public class Parent {
	public String parentVar;
	
	//Parent 클래스 안에서  child 클래스의 인스턴스를 생성
	//이런 경우를  has a 관계라고 하고 포함관계라고 한다.
	public Child child;
	
	public Parent() {
		parentVar = "부모의 데이터";
		child = new Child(parentVar);
		child.childVar = "부모에서 자식을 설정";
		child.disp();
		
	}
}
