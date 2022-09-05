package ex05;

public class Customer {
	private String idCustomer;
	private String name;
	private String phone;
	private String address;

	public Customer() {
		super();
	}

	public Customer(String idCustomer, String name, String phone, String address) {
		super();
		this.idCustomer = idCustomer;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
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

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ "]";
	}

}
