package javaapp0427;

public class Data {
	private int num;
	private String name;
	private String phone;
	private String address;
	private String email;
	private String birthday;
	
	
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + ", phone=" + phone + ", address=" + address + ", email=" + email
				+ ", birthday=" + birthday + "]";
	}
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data(int num, String name, String phone, String address, String email, String birthday) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.birthday = birthday;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	

	
}
