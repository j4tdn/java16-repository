package demo05;

public class Customer {
	//Mã khách hàng, họ tên, số điện thoại, địa chỉ
	private String id;
	private String cusName;
	private String phone;
	private String adress;
	
	public Customer() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
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

	public Customer(String id, String cusName, String phone, String adress) {
		super();
		this.id = id;
		this.cusName = cusName;
		this.phone = phone;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusName=" + cusName + ", phone=" + phone + ", adress=" + adress + "]";
	}
	
}
