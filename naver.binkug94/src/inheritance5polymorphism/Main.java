package inheritance5polymorphism;

import datashare.Protoss;
import datashare.Starcraft;
import datashare.Terran;
import datashare.Zerg;

public class Main {

	public static void main(String[] args) {
		
		Starcraft star = new Zerg();
		star.attack();
		
		star = new Protoss();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		//


//		Zerg zg = new Zerg();
//		zg.attack();
//		Protoss pr = new Protoss();
//		pr.attack();
//		Terran tr = new Terran();
//		tr.attack();

	}

}
