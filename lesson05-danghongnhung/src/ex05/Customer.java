package ex05;

public class Customer {
	private String idCustomer;
	private String fullname;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}

	public Customer(String idCustomer, String fullname, String phoneNumber, String address) {
		this.idCustomer = idCustomer;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Informaiton Customer : idCustomer=" + idCustomer + ", Fullname=" + fullname + ", PhoneNumber=" + phoneNumber
				+ ", Address=" + address + ": ";
	}
	
	
	
	
	
}
