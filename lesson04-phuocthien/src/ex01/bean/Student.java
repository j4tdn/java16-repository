package ex01.bean;

public class Student {
	private int id;
	private String name;
	private float markTheory;
	private float markPractice;

	public Student() {
		id = 0;
		name = null;
		markTheory = 0;
		markPractice = 0;
	}

	public Student(int id, String name, float markTheory, float markPractice) {
		this.id = id;
		this.name = name;
		this.markTheory = markTheory;
		this.markPractice = markPractice;
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

	public float getMarkTheory() {
		return markTheory;
	}

	public void setMarkTheory(float markTheory) {
		this.markTheory = markTheory;
	}

	public float getMarkPractice() {
		return markPractice;
	}

	public void setMarkPractice(float markPractice) {
		this.markPractice = markPractice;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", markTheory=" + markTheory + ","
				+ " markPractice=" + markPractice
				+" avg=" + this.avg()+ "]";
	}
	public float avg() {
		return (this.markPractice+this.markTheory)/2;
	}

}
