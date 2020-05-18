package javaapp0518;

import java.util.List;
import java.util.Scanner;

public class CovidMain {

	public static void main(String[] args) {
		//데이터베이스 사용 객체를 생성
		CovidDAO dao = CovidDAO.sharedInstance();
		
		//키보드 입력개체 설정
		Scanner sc = new Scanner(System.in);
		
		//mainloop라고 이름을 붙인 이유는 내부에서 switch를 사용할 것이고 7번을 눌렀을때 반복문을 빠져나오기 위해서
		mainloop : while(true) {
			
			System.out.println("1.전체보기 2.2개씩보기 3.상세보기 4.대륙이나 국가로 검색 5.데이터삽입 6.데이터수정 7.데이터 삭제 8.종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			
			//여러개의 데이터를 저장하기 위한 변수
			List<CovidDTO> list = null;
			//하나의 데이터를 저장하기 위한 변수
			CovidDTO covid = null;
			//삽입,삭제,갱신의 결과를 정하기 위한 변수
			int result = -1;
			
			//covid 각각을 위한 변수
			int num = -1;
			String region = null;
			String nation = null;
			int pop = -1;
			int confirmcount = -1;
			int deathcount = -1;
			switch(menu) {
			
			case "1":
				System.out.println("전체보기");
				list = dao.allselect();
				//System.out.printf("%2s%5s%10s\n","번호","국가","확진자수");
				for(CovidDTO c : list) {
					System.out.println(c.getNum()+".지역 :"+c.getRegion()+"-"+c.getNation()+"\n 감염자수 : "+c.getConfirmcount());
					//System.out.printf("%2s%5s%10d\n",c.getNum(),c.getNation(),c.getConfirmcount());
				}
				System.out.println("아무키나 입력하시면 메뉴로 넘어갑니다.");
				break;
				
			case "2":
				System.out.println("2개씩보기");
				
				break;
				
			case "3":
				list = dao.allselect();
				for(CovidDTO c : list) {
					System.out.println(c.getNum()+".지역 :"+c.getRegion()+"-"+c.getNation()+"\n 감염자수 : "+c.getConfirmcount());
					//System.out.printf("%2s%5s%10d\n",c.getNum(),c.getNation(),c.getConfirmcount());
				}
				System.out.println("상세보기 조회할 번호 : ");
				try {
					String temp = sc.nextLine();
					num = Integer.parseInt(temp);
					
					covid = dao.selectOne(num);
					
					if(covid ==null) {
						System.out.println("데이터가 없습니다.");
					}else {
						System.out.println(covid);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("정상적인 번호를 입력하세요!");
					System.err.println(e.getMessage());
					break;
				}

				
				
				break;
				
			case "4":
				System.out.println("대륙이나 국가로 검색");
				break;
				
			case "5":
				System.out.println("데이터삽입");
				break;
				
			case "6":
				System.out.println("데이터수정");
				break;
				
			case "7":
				System.out.println("삭제");
				break;
				
			case "8":
				System.out.println("종료");
				break mainloop;
				
			default : 
				System.out.println("선택한 메뉴가 없습니다 다시 선택해주세요");
				break;
			}
			
		}
		
		
		sc.close();
		
	}

}
