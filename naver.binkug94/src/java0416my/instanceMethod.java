package java0416my;

public class instanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 as = new Student3();
		as.num = 1;
		as.name = "메롱";
		//매개변수가 정수 3개인 메소드 호출
		as.sub(80, 24, 14);
		//위의 내용을 출력하는 메소드를 출력
		int tot = as.sum();
		double avg = tot / 3.0;

		as.disp();
		
		System.out.println("total : "+tot+" / "+"avg : "+avg);

	}

}
