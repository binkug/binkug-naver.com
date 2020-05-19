package javaapp0518;

public class CovidDTO {
	private int num;
	private String region;
	private String nation;
	private int pop;
	private int confirmcount;
	private int deathcount;

	@Override
	public String toString() {
		return "Covid19DTO [num=" + num + ", region=" + region + ", nation=" + nation + ", pop=" + pop
				+ ", confirmcount=" + confirmcount + ", deathcount=" + deathcount + "]";
	}

	// DB 연동을 하기 때문에 더이상 생성자를 생성 할 필요가 없다.
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public int getConfirmcount() {
		return confirmcount;
	}

	public void setConfirmcount(int confirmcount) {
		this.confirmcount = confirmcount;
	}

	public int getDeathcount() {
		return deathcount;
	}

	public void setDeathcount(int deathcount) {
		this.deathcount = deathcount;
	}

}
