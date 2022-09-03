package ex01_managementstudent;

public class Student {
	private int idStudent;
	private String fullName;
	private float theoPoint, pracPoints;
	
	public Student() {
		idStudent=0;
		fullName ="";
		theoPoint = 0;
		pracPoints = 0;
	}

	public Student(int idStudent, String fullName, float theoPoint, float pracPoints) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.theoPoint = theoPoint;
		this.pracPoints = pracPoints;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float gettheoPoint() {
		return theoPoint;
	}

	public void settheoPoint(float theoPoint) {
		this.theoPoint = theoPoint;
	}

	public float getPracPoints() {
		return pracPoints;
	}

	public void setPracPoints(float pracPoints) {
		this.pracPoints = pracPoints;
	}

	@Override
	public String toString() {
		return "Student information: [idStudent=" + idStudent + ", fullName=" + fullName + ", theoretical point=" + theoPoint
				+ ", Practice points=" + pracPoints + "]";
	}
	
	public float averageScore() {
		return (this.theoPoint + this.pracPoints)/2;
	}
	
	
}
