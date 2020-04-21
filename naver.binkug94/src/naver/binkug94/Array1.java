package naver.binkug94;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알파벳(String) 배열을 생성
		//초기 값을 가지고 생성
		String [] alphabet = {"A","B","C","D","E","F"};
		
		//배열 이름을 출력 - 해시코드가 출력
		System.out.println("alphabet hashcode : "+alphabet);
		//첫번째 요소 출력
		System.out.println("배열 첫번째는 :"+alphabet[0]);
		//요소 전체를 출력
		for(int i=0;i<=5;i++) {
			System.out.println("배열의 전체는 : "+"\n"+alphabet[i]);
		}
		System.out.println("배열의 길이는 : "+alphabet.length);
		//배열이 생성되기 전에 속성을 호출하면 NullpointException
		

	}

}
