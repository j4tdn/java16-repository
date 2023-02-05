package bean;

public class Trader implements DataRow {
	private Integer id;
	private String name;
	private String  address;
	
	public Trader() {
		// TODO Auto-generated constructor stub
	}

	public Trader(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.address = city;
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

	public void setAddress(String city) {
		this.address = city;
	}

	@Override
	public String toLine() {
		return "[" + getId() + "], " + getName() + ", " + getAddress();
	}
	
	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", city=" + address + "]";
	}	
	
	
}
