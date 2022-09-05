package ex05;

public class Customer {
	String customerID;
	String name;
	String phoneNumber;
	String address;

	public Customer() {

	}

	public Customer(String customerID, String name, String phoneNumber, String address) {
		this.customerID = customerID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Customer [customerID=" + customerID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
}
