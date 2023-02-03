package bean;

import java.io.Serializable;
import java.util.Objects;

public class Trader implements DataRow, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4328870004937558808L;
	private Integer id;
	private transient String name; // save as normal, dont wanna save it in serialized data
	private String address;	
	private String email;
	
	public Trader() {
		// TODO Auto-generated constructor stub
	}
	
	public Trader(Integer id, String name, String address, String email) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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
	
	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader other = (Trader) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toLine() {
		// TODO Auto-generated method stub
		return "[" + this.getId() + "], " + this.getName() + ", " + this.getAddress();
	}
	
	
}
