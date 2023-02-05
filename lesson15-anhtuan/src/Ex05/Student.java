package Ex05;

public class Student {
	private int id;
	private String name;
	private double point;
	private Enum gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", gender=" + gender + "]";
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

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public Enum getGender() {
		return gender;
	}

	public void setGender(Enum gender) {
		this.gender = gender;
	}

	public Student(int id, String name, double point, Enum gender) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}

}
