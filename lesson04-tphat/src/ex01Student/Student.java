package ex01Student;

public class Student {
	private int studentId;
	private String studentName;
	private float theoryPoint;
	private float practicePoint;

	public Student() {

	}

	public Student(int studentId, String studentName, float theoryPoint, float practicePoint) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public float averagePoint() {
		return (theoryPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", theoryPoint=" + theoryPoint
				+ ", practicePoint=" + practicePoint + "]";
	}
	

}
