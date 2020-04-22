package data;

public class ObjectMain {

	public static void main(String[] args) {
		// 자바에서 기본으로 제공되기 때문에 별도의 처리 필요없이 직접 값을 입력(코드는 길어짐)
		Data data1 = new Data();
		data1.setNum(1);
		int [] ar = { 10, 20, 30 };
		data1.setAr(ar);
		
		// 생성자를 만들면 아래와 같이 매개변수 값을 줄 떄 코드가 간결해짐
		Data data2 = new Data(1, ar);
		
		//System.out.println(data2.getNum());
		//System.out.println(data2.getAr());
		
		//System.out.println(data2.getData());
		
		// 출력하는 메소드에 인스턴스를 대입하면
		// toString()을 호출해서 결과를 출력
		System.out.println(data1);
		System.out.println(data2);
		
		//data1과 data2는 내용이 같음
		//2개의 데이터는 내용이 같지만 각각 new를 호출했기 때문에 별도의 메모리 영역을 할당받음
		//==로 비교하면 메모리 영역의 위치를 비교하므로 false
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		
		// data1이 저장하고 있는 참조를 data3에 복사
		Data data3 = data1;
		// data3이 자신의 내용을 변경하면 data1의 것도 변경
		data3.setNum(2);
		System.out.println(data1.getNum());
	
		
		// 데이터를 복제해서 대입
		Data data4 = data1.clone();
		System.out.println("===== 복제해서 내용 같은 =====");
		System.out.println(data1);
		System.out.println(data4);
		
		// data4의 내용을 변경해도 data1이 변경되지 않음
		data4.setNum(3);
		data4.getAr()[1] = 10000;
		System.out.println("===== 변경해도 영향없음? =====");
		System.out.println(data1);
		System.out.println(data4);
		
		// 깊은 복사 시 data4의 배열(참조형)도 clone 적용
		String str = "Hello object";
		System.out.println(str.toUpperCase());
		// Object 타입의 변수에는 어떤 데이터든 저장 가능
		Object obj = str;
		// 사용을 할 때는 원래의 자료형으로 강제 형 변환해서 사용
		System.out.println(((String)obj).toUpperCase());
		
	}
	

	
}




