package ex01_studentmanagement;

public class Student {
	private int idStudent;
	private String fullName;
	private float theoryPoint, practicePoint;

	public Student() {
		idStudent = 0;
		fullName = "";
		theoryPoint = 0;
		practicePoint = 0;
	}

	public Student(int idStudent, String fullName, float theoryPoint, float practicePoint) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
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

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPacticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fullName=" + fullName + ", theoryPoint=" + theoryPoint
				+ ", pacticePoint=" + practicePoint + "]";
	}
}