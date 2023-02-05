
public class Student {

	private int id;
	private String name;
	private double point;
	private String sexual;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double point, String sexual) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.sexual = sexual;
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

	public String getSexual() {
		return sexual;
	}

	public void setSexual(String sexual) {
		this.sexual = sexual;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", sexual=" + sexual + "]";
	}
	
	
}
