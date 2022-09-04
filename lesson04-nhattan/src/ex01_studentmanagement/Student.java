package ex01_studentmanagement;

public class Student {
	private int id;
	private String fullName;
	private float lecPoint;
	private float labPoint;

	public Student() {
	}

	public Student(int id, String fullName, float lecPoint, float labPoint) {
		this.id = id;
		this.fullName = fullName;
		this.lecPoint = lecPoint;
		this.labPoint = labPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getLecPoint() {
		return lecPoint;
	}

	public void setLecPoint(float lecPoint) {
		this.lecPoint = lecPoint;
	}

	public float getLabPoint() {
		return labPoint;
	}

	public void setLabPoint(float labPoint) {
		this.labPoint = labPoint;
	}

	@Override
	public String toString() {
		return String.format("%-12s%-20s%-5.2f\t%-5.2f", id, fullName, lecPoint, labPoint);
	}
}
