package ex05;

public class Customer {
	private String IdCustomer;
	private String Name;
	private String PhoneNumber;
	private String Adress;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String IdCustomer, String Name, String PhoneNumber ,String Adress) {
		this.IdCustomer=IdCustomer;
		this.Name=Name;
		this.PhoneNumber=PhoneNumber;
		this.Adress=Adress;
	}
	public String getIdCustomer() {
		return IdCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		IdCustomer = idCustomer;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	@Override
	public String toString() {
		return "Customer [IdCustomer=" + IdCustomer + ", Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", Adress="
				+ Adress + "]";
	}
	

}
