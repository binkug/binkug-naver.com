package java0417my;

public class PalyerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootballPalyer fp = new FootballPalyer();
		FootballPalyer fp1 = new FootballPalyer();
		FootballPalyer fp2 = new FootballPalyer();
		FootballPalyer fp3 = new FootballPalyer();
		
		fp2.setProperty("램파드", "첼시", 8);
		fp.setName("제시린가드");
		fp.setTeam("맨유");
		fp.setNumber(14);
		fp1.setName("스티븐제라드");
		fp1.setTeam("리버풀");
		fp1.setNumber(8);
		fp3.setProperty("포그바","맨유" );
		
		
		fp1.display();
		fp.display();
		fp2.display();
		fp3.display();
		
		
	}

}
