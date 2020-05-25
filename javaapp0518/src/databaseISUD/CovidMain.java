package databaseISUD;

import java.util.List;
import java.util.Scanner;

public class CovidMain {

	public static void main(String[] args) {
		// 데이터베이스 사용 객체를 생성
		CovidDAO dao = CovidDAO.sharedInstance();

		// 키보드 입력개체 설정
		Scanner sc = new Scanner(System.in);

		// mainloop라고 이름을 붙인 이유는 내부에서 switch를 사용할 것이고 7번을 눌렀을때 반복문을 빠져나오기 위해서
		mainloop: while (true) {

			System.out.println("1.전체보기 2.2개씩보기 3.상세보기 4.대륙이나 국가로 검색 5.데이터삽입 6.데이터수정 7.데이터 삭제 8.종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();

			// 여러개의 데이터를 저장하기 위한 변수
			List<CovidDTO> list = null;
			// 하나의 데이터를 저장하기 위한 변수
			CovidDTO covid = null;
			// 삽입,삭제,갱신의 결과를 정하기 위한 변수
			int result = -1;

			// covid 각각을 위한 변수
			int num = -1;
			String region = null;
			String nation = null;
			int pop = -1;
			int confirmcount = -1;
			int deathcount = -1;
			String temp = null;
			switch (menu) {

			case "1":
				System.out.println("전체보기");
				list = dao.allselect();
				// System.out.printf("%2s%5s%10s\n","번호","국가","확진자수");
				for (CovidDTO c : list) {
					System.out.println(c.getNum() + ".지역 :" + c.getRegion() + "-" + c.getNation() + "\n 감염자수 : "
							+ c.getConfirmcount());
					// System.out.printf("%2s%5s%10d\n",c.getNum(),c.getNation(),c.getConfirmcount());
				}

				break;

			case "2":
				// 전체 데이터 개수 가져오기
				int cnt = dao.getCount();
				// System.out.println("데이터개수:" + cnt);
				// 페이지 수 만들기 - 페이지당 데이터 개수는 2
				int pagesu = (int) ((double) cnt / 2 + (double) (2 - 1) / 2);
				// System.out.println("페이지개수:" + pagesu);

				list = dao.pageCovid(1, 2);
				for (CovidDTO imsi : list) {
					System.out.println(imsi);
				}
				// 현재페이지 번호 저장
				int pageno = -1;
				while (true) {
					// 아무키나 누르고 Enter를 치면 종료
					// 그냥 Enter 치면 다음 페이지의 데이터도 가져와서 출력
					System.out.println("아무키나 누르면 종료");
					System.out.println("Enter만 누르면 다음페이지 데이터 가져오기");
					temp = sc.nextLine();
					if (temp.trim().length() == 0) {
						pageno = pageno + 1;
						if (pageno > pagesu) {
							System.out.println("더이상 가져올 데이터가 없음");
						} else {
							// pageno에 해당하는 데이터 가져오기
							List<CovidDTO> currentData = dao.pageCovid(pageno, 2);
							// 위의 데이터를 list에 추가
							list.addAll(currentData);
							// 출력

							// currentData를 넣지 않고 list를 넣는 이유는 그 전에 보여졌던 list가 사라지면 안되기 때문에
							for (CovidDTO imsi : list) {
								System.out.println(imsi);
							}
						}
					} else {
						break;
					}
				}

				break;

			case "3":
				list = dao.allselect();
				for (CovidDTO c : list) {
					System.out.println(c.getNum() + ".지역 :" + c.getRegion() + "-" + c.getNation() + "\n 감염자수 : "
							+ c.getConfirmcount());
					// System.out.printf("%2s%5s%10d\n",c.getNum(),c.getNation(),c.getConfirmcount());
				}
				System.out.println("상세보기 조회할 번호 : ");
				try {
					temp = sc.nextLine();
					num = Integer.parseInt(temp);

					covid = dao.selectOne(num);

					if (covid == null) {
						System.out.println("데이터가 없습니다.");
					} else {
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
				temp = sc.nextLine();
				list = dao.searchCovid(temp);
				if (list.size() == 0) {
					System.out.println("조회된 데이터가 없습니다");
				} else {
					for (CovidDTO imsi : list) {
						System.out.printf("%2d\t%10s\t%10s\t%10d\t%10d\n", imsi.getNum(), imsi.getRegion(),
								imsi.getNation(), imsi.getConfirmcount(), imsi.getDeathcount());
					}
				}
				break;

			case "5":
				// System.out.println("데이터삽입");
				// num을 입력
//				System.out.println("삽입할 번호 입력 : ");
//				temp = sc.nextLine();
//				num = Integer.parseInt(temp);
				// num이 존재하는지 조회
				// covid = dao.selectOne(num);
				try {
					// num이 존재하지 않을 경우
//					if(covid == null) {
					// 대륙과 국가를 입력받기
					System.out.println("대륙 : ");
					region = sc.nextLine();
					System.out.println("국가 : ");
					nation = sc.nextLine();

					// 인구수 확진자 수 사망자 수 입력받기
					System.out.println("인구수 : ");
					temp = sc.nextLine();
					pop = Integer.parseInt(temp);

					System.out.println("확진자수 : ");
					temp = sc.nextLine();
					confirmcount = Integer.parseInt(temp);

					System.out.println("사망자 수 : ");
					temp = sc.nextLine();
					deathcount = Integer.parseInt(temp);

					// 데이터베이스 메소드에 넘겨주기 위해서 입력 받은 데이터를 1개로 만들기
					covid = new CovidDTO();
					covid.setConfirmcount(confirmcount);
					covid.setDeathcount(deathcount);
					covid.setNation(nation);
					// covid.setNum(num);
					covid.setPop(pop);
					covid.setRegion(region);

					// 데이터베이스 메소드 호출
					result = dao.insert(covid);

					// 결과 사용
					if (result > 0) {
						System.out.println("데이터 삽입 성공");
					} else {
						System.err.println("데이터 삽입 실패");
					}

					// num이 존재하는 경우
//					}else {
//						System.out.println("이미 존재하는 번호 입니다.");
//					}
				} catch (Exception e) {
					System.err.println("잘못 입력 했습니다.!");
					System.err.println(e.getMessage());
				}
				break;

			case "6":

				System.out.println("수정할 번호 : ");
				num = sc.nextInt();
				sc.nextLine(); // enter를 가져가기 위해서 추가
				// 데이터 불러오기
				covid = dao.selectOne(num);

				if (covid == null) {
					System.out.println("없는 번호 입니다.");
				} else {
					// 대륙 입력 받기
					System.out.println("수정하지 않으려면 Enter를 누르시오");
					System.out.print("이전 대륙- " + covid.getRegion() + " 변경할 대륙 입력 : ");
					region = sc.nextLine();
					if (region.trim().length() == 0) {
						region = covid.getRegion();
					}

					System.out.println("수정하지 않으려면 Enter를 누르시오");
					System.out.print("이전 국가- " + covid.getNation() + " 변경할 국가 입력 : ");
					nation = sc.nextLine();
					if (nation.trim().length() == 0) {
						nation = covid.getNation();
					}

					System.out.println("수정하지 않으려면 Enter를 누르시오");
					System.out.print("이전 인구 수- " + covid.getPop() + " 변경할 인구 수 입력 : ");
					temp = sc.nextLine();

					if (temp.trim().length() == 0) {
						pop = covid.getPop();
					} else {
						pop = Integer.parseInt(temp);
					}

					System.out.println("수정하지 않으려면 Enter를 누르시오");
					System.out.print("이전 확진자 수- " + covid.getPop() + " 변경할  확진자 수 입력 : ");
					temp = sc.nextLine();

					if (temp.trim().length() == 0) {
						confirmcount = covid.getConfirmcount();
					} else {
						confirmcount = Integer.parseInt(temp);
					}

					System.out.println("수정하지 않으려면 Enter를 누르시오");
					System.out.println("이전 사망자 수- " + covid.getDeathcount() + " 변경할  사망자 수 입력 : ");
					temp = sc.nextLine();

					if (temp.trim().length() == 0) {
						deathcount = covid.getDeathcount();
					} else {
						deathcount = Integer.parseInt(temp);
					}

					// 입력받은 데이터를 하나로 만들기

					covid.setRegion(region);
					covid.setNation(nation);
					covid.setPop(pop);
					covid.setConfirmcount(confirmcount);
					covid.setDeathcount(deathcount);

					result = dao.updateCovid(covid);
					System.out.println(result);

					if (result > 0) {
						System.out.println(result);
						System.out.println("데이터 수정 성공");
					} else {
						System.out.println("데이터 수정 실패");
					}

				}

				break;

			case "7":

				list = dao.allselect();
				// System.out.printf("%2s%5s%10s\n","번호","국가","확진자수");
				for (CovidDTO c : list) {
					System.out.println(c.getNum() + ".지역 :" + c.getRegion() + "-" + c.getNation() + "\n 감염자수 : "
							+ c.getConfirmcount());
					// System.out.printf("%2s%5s%10d\n",c.getNum(),c.getNation(),c.getConfirmcount());
				}
				System.out.print("삭제할 번호:");
				temp = sc.nextLine();
				num = Integer.parseInt(temp);
				// 데이터의 존재 여부를 확인
				covid = dao.selectOne(num);
				if (covid == null) {
					System.out.println("삭제할 수 없는 번호입니다.");
				} else {
					// 정말로 삭제할 것인지 확인
					System.out.print("정말로 삭제(Y):");
					temp = sc.nextLine();
					// 영문을 입력받아서 비교
					// trim은 좌우 공백 제거
					// toUpperCase는 모두 대문자로 변경
					if (temp.trim().toUpperCase().equals("Y")) {
						// 삭제
						result = dao.delete(num);
						// 삭제 결과 사용
						if (result > 0) {
							System.out.println("삭제 성공");
						} else {
							System.out.println("삭제 실패");
						}
					}
				}
				break;

			case "8":
				System.out.println("종료");
				break mainloop;

			default:
				System.out.println("선택한 메뉴가 없습니다 다시 선택해주세요");
				break;
			}

		}

		sc.close();

	}

}
