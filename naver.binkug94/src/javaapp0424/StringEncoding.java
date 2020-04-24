package javaapp0424;

public class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hangul = "한글 문자열";
		try {
			byte [] bytes = hangul.getBytes("utf-8");
			//바이트 배열을 문자열로 변환

			String str = new String(bytes,"euckr");
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
