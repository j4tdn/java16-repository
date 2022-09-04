package ex01studentmanagement;

public class Student {

	private int id;
	private String name;
	private float pointTheory,pointPractice;
	
	
	public Student() {
		id = 0;
		name = null;
		pointTheory = 0;
		pointPractice = 0;
	}


	public Student(int id, String name, float pointTheory, float pointPractice) {
		super();
		this.id = id;
		this.name = name;
		this.pointTheory = pointTheory;
		this.pointPractice = pointPractice;
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
		return "Student [id=" + id + ", name=" + name + ", pointTheory=" + pointTheory + ", pointPractice="
				+ pointPractice + "]";
	}
	
	
	
}
