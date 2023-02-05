package bean;

public class User {
	private String id;
	private String name;
	private double DTB;
	private boolean gender;
	
	public User(String id, String name, double dTB, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		DTB = dTB;
		this.gender = gender;
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

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		DTB = dTB;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", DTB=" + DTB + ", gender=" + (gender==true ? "Nam" : "Nu") + "]";
	}
	
	
	
	
}
