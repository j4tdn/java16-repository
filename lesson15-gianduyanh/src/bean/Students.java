package bean;

public class Students {
	private int id;
	private String name;
	private double point;
	private String gender;
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
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Students(int id, String name, double point, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", point=" + point + ", gender=" + gender + "]";
	}

	

}
