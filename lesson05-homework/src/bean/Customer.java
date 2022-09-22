package bean;

public class Customer {
	private String CustomerId;
	private String name;
	private String phone;
	private String address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String name, String phone, String address) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
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
		return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ "]";
	}

}
