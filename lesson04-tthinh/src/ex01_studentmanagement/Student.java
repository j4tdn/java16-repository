package ex01_studentmanagement;

public class Student {
	private int id;
	private String name;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
		
	}

	public Student(int id, String name, float theoreticalPoint, float practicePoint) {
		super();
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
	public float arrPoint() {
		return (theoreticalPoint + practicePoint) / 2;
	}
	
	
}
