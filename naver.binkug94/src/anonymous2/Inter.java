package anonymous2;


//인터페이스
//final 상수와 추상 메소드를 소유한 개체
//변수는 만들면 상수가 되고 메소드는 모양만 만들어야 한다.
//default를 붙이면 내용이 있는 메소드를 만들 수 있고 이 메소드는 필요에 따라 재정의 합니다.
//하나의 클래스에 여러개의 인터페이스를 implements 할 수 있다.
//사용하는 이유는 템플릿 메소드 패턴이나 다형성 구현.

//템플릿 메소드 패턴은 모양을 만들고 내용을 구현하는 것이고
//템플릿 메소드 패턴일 경우 Starcraft -> StarcraftImp1

//다형성은 동일한 코드가 대입된 인스턴스에 따라 다르게 반응하는 것.
//다형성일 경우
//Starcraft -> Zerg , Starcraft -> Protoss, Starcraft ->Terran 여러개가 있지만 실제로 사용하는 것은 한개이고 각 각의 상속은 1:1 상속이다
public interface Inter {
	
	public void method();
}
