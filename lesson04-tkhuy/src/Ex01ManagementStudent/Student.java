package Ex01ManagementStudent;	
public class Student {
	private int idStudent;
	private String fullName;
	private float theoryPoint;
	private float practicePoints;
	
	public Student() {
		idStudent=0;
		fullName ="";
		theoryPoint = 0;
		practicePoints = 0;
	}

	public Student(int idStudent, String fullName, float theoryPoint, float practicePoints) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.practicePoints = practicePoints;
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

	public float gettheoryPoint() {
		return theoryPoint;
	}

	public void settheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getpracticePoints() {
		return practicePoints;
	}

	public void setpracticePoints(float practicePoints) {
		this.practicePoints = practicePoints;
	}

	@Override
	public String toString() {
		return "Student information: [idStudent=" + idStudent + ", fullName=" + fullName + ", theoretical point=" + theoryPoint
				+ ", Practice points=" + practicePoints + "]";
	}
	
	public float averageScore() {
		return (this.theoryPoint + this.practicePoints)/2;
	}
	
	
}
