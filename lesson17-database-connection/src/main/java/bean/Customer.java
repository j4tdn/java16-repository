package bean;

public class Customer {
	private Integer id;
	private String name;
	private String phone;
	private String address;
	private String account;
	private String password;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, String phone, String address, String account, String password) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.account = account;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", account="
				+ account + ", password=" + password + "]";
	}
	
	
}
