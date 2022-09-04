package Bai1;

public class Students {
	int id;
	String name;
	float marksTheory, marksPractice;
	
	public Students() {
	}

	public Students(int id, String name, float marksTheory, float marksPractice) {
		super();
		this.id = id;
		this.name = name;
		this.marksTheory = marksTheory;
		this.marksPractice = marksPractice;
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

	public float getMarksTheory() {
		return marksTheory;
	}

	public void setMarksTheory(float marksTheory) {
		this.marksTheory = marksTheory;
	}

	public float getMarksPractice() {
		return marksPractice;
	}

	public void setMarksPractice(float marksPractice) {
		this.marksPractice = marksPractice;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marksTheory=" + marksTheory + ", marksPractice="
				+ marksPractice + "]";
	}
}
