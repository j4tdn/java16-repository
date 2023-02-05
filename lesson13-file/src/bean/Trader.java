package bean;

import java.io.Serializable;

public class Trader implements DataRow, Serializable {

	private static final long serialVersionUID = 8516937031934685309L;
	private Integer id;
	
	//Ex05--> không muốn lưu trong serialize
	//name--> không lưu vào
	// khi lấy/ get ra--> là null
	
	private transient String name;
	private String adress;
	private String email;

	public Trader() {
		// TODO Auto-generated constructor stub
	}

	public Trader(Integer id, String name, String adress,String email) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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
				   + getName() 
				   + getAdress()
				   + getEmail();
	}

	@Override
	public String toString() {
		return "Ex02FileWriterAsObjects [id=" + id + ", name=" + name + ", adress=" + adress  +", email=" + email+ "]";
	}
}


