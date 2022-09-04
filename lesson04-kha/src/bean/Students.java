package bean;

public class Students {
	private int studentID;
	private String studentName;
	private float theoryPoint;
	private float pracPoint;
	
	public Students() {
	}
	
	public Students(int studentID, String studentName, float theoryPoint, float pracPoint) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.theoryPoint = theoryPoint;
		this.pracPoint = pracPoint;
	}
	
	public float getMedian(){
		return  ((theoryPoint + pracPoint)/(float)2.0);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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

	public float getPracPoint() {
		return pracPoint;
	}

	public void setPracPoint(float pracPoint) {
		this.pracPoint = pracPoint;
	}

	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", studentName=" + studentName + ", theoryPoint=" + theoryPoint
				+ ", pracPoint=" + pracPoint + "]";
	}
	
	
	
	
}
