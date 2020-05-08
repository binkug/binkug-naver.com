package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1 = "ABCCBA";
		String msg2 = "ABCCBA";
		
		//문자열의 길이를 len에 대입
		int len = msg1.length();
		//boolean flag = false;
		int i;
		//절반이 되는 지점까지
		//아래처럼 작성을 하게되면 if의 조건을 만족하면 반복문을 중단하기 때문에 if의 조건을 만족하지 않아다는 것을 반복문을 끝까지 수행하지 않았다라는 것이다.
		//이 경우 반복문을 끝까지 수행하면 i의 값은 len/2 입니다.
		for(i=0;i<len/2;i++) {
			//앞에서 글자를 가져오기 뒤에서 글자를 가져와서 비교
			//2개의 글자가 다르면 반복문을 중단
			if(msg1.charAt(i) != msg1.charAt(len-i-1)) {
				//flag = true;
				break;
			};
		}
		if(i==len/2) {
		//if(flag==false) {
			System.out.println("팰린드롬");
		}else {
			System.out.println("펠린드롬 아님");
		}
	}

}
