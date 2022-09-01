package student.management;

public class Student {
	int studentId;
	String studentName;
	float theoriticalPoint;
	float practicePoint;

	public Student() {
		this.studentName = "";
	}

	public Student(int studentId, String studentName, float theoriticalPoint, float practicePoint) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.theoriticalPoint = theoriticalPoint;
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

	public float getTheoriticalPoint() {
		return theoriticalPoint;
	}

	public void setTheoriticalPoint(float theoriticalPoint) {
		this.theoriticalPoint = theoriticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public float averagePoint() {
		return (theoriticalPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", theoriticalPoint="
				+ theoriticalPoint + ", practicePoint=" + practicePoint + "]";
	}
}
