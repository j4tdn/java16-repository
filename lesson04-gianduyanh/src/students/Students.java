package students;

public class Students {
	private int studentcode;
	private String name;
	private float theoreticalpoint;
	private float practicepoint;
	private float mediumscore;
	
	@Override
	public String toString() {
		return "Students [studentcode=" + studentcode + ", name=" + name + ", theoreticalpoint=" + theoreticalpoint
				+ ", practicepoint=" + practicepoint + "]";
	}

	public Students(int studentcode, String name, float theoreticalpoint, float practicepoint) {
		super();
		this.studentcode = studentcode;
		this.name = name;
		this.theoreticalpoint = theoreticalpoint;
		this.practicepoint = practicepoint;
	}
	
	public Students() {
		
	}

	public int getStudentcode() {
		return studentcode;
	}

	public void setStudentcode(int studentcode) {
		this.studentcode = studentcode;
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

	public float getPracticepoint() {
		return practicepoint;
	}

	public void setPracticepoint(float practicepoint) {
		this.practicepoint = practicepoint;
	}
	
	void output() {
		System.out.printf("%7d %9s %14.2f %16.2f %17.2f \n", studentcode, name, theoreticalpoint, practicepoint, mediumpoint());
    }
	
	void findStudentTheoreTicalPointOut85() {
		if(theoreticalpoint > 8.5) {
			System.out.println("Ho ten Sinh Vien co diem tren 8.5 :" + getStudentcode() + " " + getName() );
		}
	}
	void findStudentTheorythanPracTice() {
		if(theoreticalpoint > practicepoint) {
			System.out.println("Ho ten Sinh Vien co diem ly thuyet > thuc hanh :" + getStudentcode() + " " + getName() );
		}
	}

	
	
	public float mediumpoint() {
		return (practicepoint + theoreticalpoint) /2;
		}
	

}
