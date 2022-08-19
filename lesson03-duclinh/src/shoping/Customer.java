package shoping;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String adress;

	public Customer() {
	}

	public Customer(String id, String name, String phone, String adress) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + "]";
	}
	
}
