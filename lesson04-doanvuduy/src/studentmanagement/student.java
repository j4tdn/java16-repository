package studentmanagement;

public class student {

	private int studentId;
	private String name;
	private float theoreticalpoint;
	private float practicepoints;

	public student() {

	}

	public student(int studentId, String name, float theoreticalpoint, float practicepoints) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.theoreticalpoint = theoreticalpoint;
		this.practicepoints = practicepoints;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoreticalpoint() {
		return theoreticalpoint;
	}

	public void setTheoreticalpoint(float theoreticalpoint) {
		this.theoreticalpoint = theoreticalpoint;
	}

	public float getPracticepoints() {
		return practicepoints;
	}

	public void setPracticepoints(float practicepoints) {
		this.practicepoints = practicepoints;
	}

	@Override
	public String toString() {
		return studentId + "-" + name + "-" + mediumscore();
	}

	public void output() {
		System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", studentId, name, theoreticalpoint, practicepoints,
				mediumscore());
	}

	public float mediumscore() {
		return (theoreticalpoint + practicepoints) / 2;
	}

}
