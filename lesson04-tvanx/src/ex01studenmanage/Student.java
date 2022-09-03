package ex01studenmanage;

public class Student {
	private int studentId;
	private String fullName;
	private float theoryPoint, pracPoint;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String fullName, float theoryPoint, float pracPoint) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.pracPoint = pracPoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracPoint() {
		return pracPoint;
	}

	public void setPracPoint(float pracPoint) {
		this.pracPoint = pracPoint;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", theoryPoint=" + theoryPoint
				+ ", pracPoint=" + pracPoint + "]";
	}

	public int findmediumScore() {
		return ((int) (getPracPoint() + getTheoryPoint())) / 2;
	}
}
