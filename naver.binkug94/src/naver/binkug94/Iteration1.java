package naver.binkug94;

public class Iteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�������");
		System.out.println("�������");
		System.out.println("�������");
		System.out.println("---------------");
		
		//�����
		int index = 0;
		while (index < 3) { // ( )��ȣ�ȿ� �������� ����.
			System.out.println("�������?");
			//�߰��� ������ ����
			index = index + 1;
		}
		System.out.println(index); //3���� ���߱� ������ 3�̶�� ���ڰ� ���´�.
		
		//image1.png,image2.png,image3.png,image4.png�� ������� ����ϵ��� while�� �ۼ�
		
//		int idx = 1;
//		
//		while (idx<5) {
//			System.out.println("image"+idx+".png");
//			idx = idx+1;
//		}
		
		int idx1 = 0;
		
		while (idx1<9) {

			System.out.println("image"+(idx1%4+1)+".png");
			idx1 = idx1+1;

		}
		
		int pageNum = 0;
		
		while (pageNum<9) {
			System.out.println("http://www.hani.co.kr/arti/ISSUE/273/list"+(pageNum+1)+".html");
			pageNum++;
		}
	}

}
