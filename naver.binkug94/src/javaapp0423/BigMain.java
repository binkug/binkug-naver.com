package javaapp0423;

import java.math.BigDecimal;

public class BigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal b1 = new BigDecimal("20");
		BigDecimal b2 = new BigDecimal("20");
		
		BigDecimal result = b1.add(b2);
		
		int n = result.intValue();
		System.out.println("값은 : "+n);
		
	}

}
