package studentmanagement;

public class StudentDetail {
	private int id;
	private String name;
	private float ltPoint;
	private float thPoint;

	public StudentDetail() {
	}

	public StudentDetail(int id, String name, float ltPoint, float thPoint) {
		this.id = id;
		this.name = name;
		this.ltPoint = ltPoint;
		this.thPoint = thPoint;
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

	public float getLtPoint() {
		return ltPoint;
	}

	public void setLtPoint(float ltPoint) {
		this.ltPoint = ltPoint;
	}

	public float getThPoint() {
		return thPoint;
	}

	public void setThPoint(float thPoint) {
		this.thPoint = thPoint;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", name=" + name + ", ltPoint=" + ltPoint + ", thPoint=" + thPoint + "]";
	}

}
