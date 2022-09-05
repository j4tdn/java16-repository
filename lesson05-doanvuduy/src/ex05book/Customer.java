package ex05book;

public class Customer {
	private int customerId;

	public Customer(int customerId, String name, String numberPhone, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.numberPhone = numberPhone;
		this.address = address;
	}

	private String name;
	private String numberPhone;
	private String address;

	public Customer() {

	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", numberPhone=" + numberPhone + ", address="
				+ address + "]";
	}

}
//ma nh, ho ten ,sdt ,dia chi