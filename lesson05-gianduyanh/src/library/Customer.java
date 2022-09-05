package library;

public class Customer {

	private int codecustomer;
	private String name;
	private String phone;
	private String email;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int codecustomer, String name, String phone, String email) {
		super();
		this.codecustomer = codecustomer;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getCodecustomer() {
		return codecustomer;
	}

	public void setCodecustomer(int codecustomer) {
		this.codecustomer = codecustomer;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [codecustomer=" + codecustomer + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
