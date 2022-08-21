package bean;
/**
 * Builder Pattern
 */
public class Userdetail {
	private String firstname;
	private String lastname;
	private int age;
	private String phone;
	private String address;
	
	public Userdetail() {};
	
	public String getFirstname() {
		return firstname;
	}
	public Userdetail withFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public String getLastname() {
		return lastname;
	}
	public Userdetail withLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Userdetail withAge(int age) {
		this.age = age;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public Userdetail withPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Userdetail withAddress(String address) {
		this.address = address;
		return this;
	}
	
	
}
