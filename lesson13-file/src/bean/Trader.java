package bean;

import java.io.Serializable;

public class Trader implements DataRow, Serializable {
	
	private static final long serialVersionUID = -5752661833933419087L;
	
	private Integer id;
	private String name;
	private String address;
	
	public Trader() {
		// TODO Auto-generated constructor stub
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

	public Trader(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toLine() {
		return "[" + getId() + "], "
				   + getName() +", " 
				   + getAddress();
		
	}


	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
