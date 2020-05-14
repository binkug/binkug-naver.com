package javaapp0513;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;



public class GoodMain {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 클래스");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		//키보드로 부터 입력바기 위한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//GoodaDAO 인스턴스 생성
		//인터페이스 혹은 참조?가 아닌 경우 자기 자신을 리턴 하는 메소드를 확인한다.
		GoodDAO dao = GoodDAO.sharedInstance();
		mainloop: while(true) {
			System.out.println("메뉴 입력: 1.전체데이터 보기 2.코드로 데이터 조회 3.데이터 삽입 4.데이터 수정 5.데이터삭제 6.검색 7.종료 ");
			String menu = sc.nextLine();
			
			//switch 구문 내에서 사용할 변수
			String code = null;
			Good good = null;
			List<Good> list = null;
			int result = -1;
			
			
			switch(menu) {
				case "1":
					System.out.println("전체 데이터 출력");
//					list = dao.selectGood();
//					for(Good g : list) {
//						System.out.println(g.getCode().trim()+":"+g.getName()+" "+g.getPrice()+"원 "+" 원산지:"+g.getManufacture()+" 입고일 :"+g.getReceivedate());
//					}
					List<Map<String,Object>> maplist = dao.selectGood();
					
					for(Map g : maplist) {
						//System.out.println(g.get("code")+"\t"+g.get("name")+"\t"+g.get("price")+"원");
						Set<String> keyset = g.keySet();
						for(String key : keyset) {
							System.out.print(g.get(key)+"\t");
						}
						System.out.println();
					}

					break;
					
				case "2":
					//코드 1개 입력 받기
					System.out.println("코드로 데이터 조회");
					code = sc.nextLine();
					
					//DAO 메소드 호출
					good = dao.selectOneGoods(code);
					
					if(good== null) {
						System.out.println("코드에 해당하는 데이터가 없습니다");
					}else {

						System.out.println(good);
					}
					
					break;
					
				case "3":
					
					System.out.println("데이터 삽입");
					code = sc.nextLine();
					good = dao.selectOneGoods(code.toLowerCase());
					//코드에 해당하는 데이터가 없으면
					if(good == null) {
						System.out.println("이름 입력 : ");
						String name = sc.nextLine();
						System.out.println("원산지 입력 : ");
						String manufacture = sc.nextLine();
						System.out.println("가격 입력 ");
						String temp =sc.nextLine();
						int price = Integer.parseInt(temp);
						Date receivedate = new Date(System.currentTimeMillis()); 
						
						good = new Good();
						good.setCode(code);
						good.setManufacture(manufacture);
						good.setName(name);
						good.setPrice(price);
						good.setReceivedate(receivedate);
						
						//sql 실행
						result = dao.insertGood(good);
						
						if(result >0) {
							System.out.println("데이터 삽입 성공");
						}else {
							System.out.println("데이터 삽입 실패");
						}
					}else {
						//코드에 해당하는 데이터가 있으면
						System.out.println("이미 존재하는 코드입니다.");
					}
					
					break;
					
				case "4":
					System.out.println("데이터 수정");
					
					while(true) {
						System.out.println("수성할 코드를 입력");
						code = sc.nextLine();
						good = dao.selectOneGoods(code.toLowerCase());
						System.out.println(good);
						if(good !=null) {
							
							System.out.println("수정할 이름 입력 : ");
							String name = sc.nextLine();
							good.setName(name);
							
							System.out.println("수정할 원산지 입력 : ");
							String manufacture = sc.nextLine();
							good.setManufacture(manufacture);
							//숫자 데이터는 되도록이면 문자열로 받은 후 정수로 변환하는 것을 권장
							System.out.println("수정할 가격 입력 ");
							String temp =sc.nextLine();
							int price = Integer.parseInt(temp);
							good.setPrice(price);
							
							result = dao.updateGood(good);
							
							if(result>0) {
								System.out.println("데이터 수정 성공");
							}else if(result == 0) {
								System.out.println("조건에 맞는 데이터 없음");
							}else {
								System.out.println("데이터 수정을 다시 해 주세요");
							}

							break;
							
						}else {
							System.out.println("수정할 수 없는 코드입니다.");
						}
						
						System.out.println(good);
					}
					
					break;
					
				case "5":

//					list = dao.selectGood();
					System.out.println("삭제 할 목록");
					for(Good g : list) {
						System.out.println(g.getCode().trim()+":"+g.getName()+" "+g.getPrice()+"원 "+" 원산지:"+g.getManufacture()+" 입고일 :"+g.getReceivedate());
					}
					
					System.out.print("삭제할 코드를 입력해주세요");
					code = sc.nextLine();
					good = dao.selectOneGoods(code.toLowerCase());
					if(good ==null) {
						System.out.println("없는 코드입니다.");
					}else {
						//대화 상자를 출력해서 묻기
						int r = JOptionPane.showConfirmDialog(null, "정말로 삭제하냐","삭제",JOptionPane.YES_NO_OPTION);
						System.out.println(r);
						if(r == 0) {
							//데이터 삭제
							result = dao.deleteGood(code);
							System.out.println(result);
							if(result > 0) {
								JOptionPane.showMessageDialog(
									null, "삭제 성공");
							}
						}
					}
					
					
					break;
				case "6":
					
					System.out.print("이름이나 원산지를 입력 : ");
					String word = sc.nextLine();
					
					List<Good> search = dao.search(word);
					
					for(Good g : search) {
						System.out.println(g);
					}
					
					break;
				case "7":
					System.out.println("종료");
					break mainloop;
					
				default : 
					System.out.println("잘못된 메뉴를 선택하셨습니다");
					break;
			}
		}
		
		//사용이 끝나면 키보드 연결 해제
		sc.close();
	}

}
