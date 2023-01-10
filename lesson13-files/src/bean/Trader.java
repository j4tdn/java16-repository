package bean;

import java.io.Serializable;

public class Trader  implements DataRow, Serializable{
	private static final long serialVersionUID = -5752661833933419087L;
	
	private Integer id;
	// save as normal, don't want to save it in serialize(file/data)
	// name --> un-save
	// get --> null
	private transient String name;
	
	private String address;
	
	private String email;

	public Trader() {
	}

	public Trader(Integer id, String name, String address, String email) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toLine() {
		
		return "[" + getId() + "], " 
				+ getName() + ", "
				+ getAddress();
	}

	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}

	

}
