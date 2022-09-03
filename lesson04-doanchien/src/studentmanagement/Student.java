package studentmanagement;

public class Student {
	private int id;
	private String fullname;
	private float pointTheory;
	private float pointPractice;

	public Student() {
		id = 0;
		fullname = null;
		pointTheory = 0;
		pointPractice = 0;
	}

	public Student(int id, String fullname, float pointTheory, float pointPractice) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.pointTheory = pointTheory;
		this.pointPractice = pointPractice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getPointTheory() {
		return pointTheory;
	}

	public void setPointTheory(float pointTheory) {
		this.pointTheory = pointTheory;
	}

	public float getPointPractice() {
		return pointPractice;
	}

	public void setPointPractice(float pointPractice) {
		this.pointPractice = pointPractice;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", pointTheory=" + pointTheory + ", pointPractice="
				+ pointPractice + "]";
	}
}
