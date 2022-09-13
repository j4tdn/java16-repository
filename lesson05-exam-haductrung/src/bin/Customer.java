package bin;

public class Customer {
	private String name;
	private String id;
	private String phone;
	private String Address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String id, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", phone=" + phone + ", Address=" + Address + "]";
	}
	

}
