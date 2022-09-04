package ex01StudentManagement;

public class Student {
	private int id;
	private String name;
	private float theoScore;
	private float practScore;
	
	public Student() {
		id = 0;
		name = "";
		theoScore = 0;
		practScore = 0;
	}

	public Student(int id, String name, float theoScore, float practScore) {
		this.id = id;
		this.name = name;
		this.theoScore = theoScore;
		this.practScore = practScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoScore() {
		return theoScore;
	}

	public void setTheoScore(float theoScore) {
		this.theoScore = theoScore;
	}

	public float getPractScore() {
		return practScore;
	}

	public void setPractScore(float practScore) {
		this.practScore = practScore;
	}
	
	public float averagePoint() {
		return 0;
	} 

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoScore=" + theoScore + ", practScore=" + practScore + "]";
	}

	
}
