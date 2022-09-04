package ex01StudentManagement;

public class Student {
	private int studentcode;
	private String fullname;
	private float theoreticalpoint;
	private float practicepoint;
	
	public Student() {
		
	}

	public Student(int studentcode, String fullname, float theoreticalpoint, float practicepoint) {
		
		this.studentcode = studentcode;
		this.fullname = fullname;
		this.theoreticalpoint = theoreticalpoint;
		this.practicepoint = practicepoint;
	}

	public int getStudentcode() {
		return studentcode;
	}

	public void setStudentcode(int studentcode) {
		this.studentcode = studentcode;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getTheoreticalpoint() {
		return theoreticalpoint;
	}

	public void setTheoreticalpoint(float theoreticalpoint) {
		this.theoreticalpoint = theoreticalpoint;
	}

	public float getPracticepoint() {
		return practicepoint;
	}

	public void setPracticepoint(float practicepoint) {
		this.practicepoint = practicepoint;
	}

	@Override
	public String toString() {
		return "Student [studentcode=" + studentcode + ", fullname=" + fullname + ", theoreticalpoint="
				+ theoreticalpoint + ", practicepoint=" + practicepoint + "]";
	}
	

	
	

}
