package javaapp051314;

import java.sql.Date;

public class Good {
	private String code;
	private String name;
	private String manufacture;
	private int price;
	private Date receivedate;
	
	
	

	public Good(String code, String name, String manufacture, int price, Date receivedate) {
		super();
		this.code = code;
		this.name = name;
		this.manufacture = manufacture;
		this.price = price;
		this.receivedate = receivedate;
	}
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getReceivedate() {
		return receivedate;
	}
	public void setReceivedate(Date receivedate) {
		this.receivedate = receivedate;
	}
	
	
	@Override
	public String toString() {
		return "Good [code=" + code + ", name=" + name + ", manufacture=" + manufacture + ", price=" + price
				+ ", receivedate=" + receivedate + "]";
	}
	
	
}
