package javaapp0428;

import java.util.ArrayList;
import java.util.Random;

import java0417my.PalyerMain;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random 인스턴스 만들기 -seed를 동적으로 설정
//		Random r  = new Random();
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt());
//		//seed를 1로 고정
//		
//		Random r1  = new Random(1);
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt());
//		//0-44사이의 숫자를 리턴
//		System.out.println(r.nextInt(45));
//		System.out.println(r.nextInt(45));
//		//주사위 게임
//		System.out.println(r.nextInt(6)+1);
//		
		String [] monster = {"라투","오미크론","다크스펙터","나즈"};
		ArrayList<String> player = new ArrayList<String>();
		player.add("맨유");
		player.add("첼시");
		player.add("아스날");
		player.add("맨시티");
		player.add("토트넘");
		
		Random r1  = new Random();
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(player.get(r1.nextInt(player.size())));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		//위으 배열의 데이터를 1초마다 랜덤하게 출력
		//10번만 수행
		Random r  = new Random();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(monster[r.nextInt(monster.length)]);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}

}
