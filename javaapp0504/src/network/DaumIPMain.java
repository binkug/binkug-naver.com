package network;



import java.net.InetAddress;

public class DaumIPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress [] daum = InetAddress.getAllByName("www.daum.net");
			//InetAddress daum = InetAddress.getByName("www.daum.net");
			//System.out.println(daum);
			for(InetAddress imsi : daum) {
				System.out.println(imsi);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
