package ex05;

public class User {
	int id;
	String name;
	String phone;
	String addrees;
	public User() {
		
	}
	
	public User(int id, String name, String phone, String addrees) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.addrees = addrees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getAddrees() {
		return addrees;
	}
	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}
	

}
