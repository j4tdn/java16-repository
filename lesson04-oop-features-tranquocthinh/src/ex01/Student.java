package ex01;

public class Student {
	private int id;
	private String name;
	private float theoreticalPoint;
	private float practicePoints;
	
	public Student() {
		super();
	}

	public Student(int id, String name, float theoreticalPoint, float practicePoints) {
		super();
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoints = practicePoints;
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

	public float getPracticePoints() {
		return practicePoints;
	}

	public void setPracticePoints(float practicePoints) {
		this.practicePoints = practicePoints;
	}
	public float mediumScore() {
		return (theoreticalPoint+practicePoints)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoints="
				+ practicePoints + "]";
	}
	
	

}
