package java0416my;

public class Student3 {
	public int num;
	public String name;
	public int kor;
	public int mat;
	public int eng;
	
	//3개의 정수를 받아서 kor mat eng에 대입하는 메소드
	
	public int sum() {
		int tot = kor+mat+eng;
		return tot;
	}
	
	public void sub(int kor1,int mat1,int eng1) {
		kor = kor1;
		mat = mat1;
		eng = eng1;
	}
	
	
	//데이터를 출력하는 메소드
	
	public void disp() {
		System.out.println("번호 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+mat);
		System.out.println("영어 : "+eng);
	}
}
