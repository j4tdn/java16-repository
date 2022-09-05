package ex05;

public class Customer {
	private int idCustomer;
	private String fullName;
	private String phone;
	private String address;
	
	public Customer() {
		
	}

	public Customer(int idCustomer, String fullName, String phone, String address) {
		
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return "Customer [idCustomer=" + idCustomer + ", fullName=" + fullName + ", phone=" + phone + ", address="
				+ address + "]";
	}
	

}
