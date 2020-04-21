package java0417my;

public class TableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 Row 데이터를 저장할 배열을 생성
		// 1개의 자료형 [] 배열이름 = new 1개의 자료형[개수];
		Row[] data = new Row[3];
		data[0] = new Row();
		data[0].setName("아아");
		
		data[1] = new Row();
		data[1].setName("가나");
		
		data[2] = new Row();
		data[2].setName("다라");
		
		//배열의 데이터 출력
		for(int i=0;i<data.length;i++) {
			
			Row imsi = data[i];
			System.out.println(imsi.getNum()+" : "+imsi.getName());
			
		}
		
		
		

	}

}
