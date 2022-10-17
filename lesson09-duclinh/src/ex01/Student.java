package ex01;

public class Student {
	private int id;
	private String name;
	public enum Classification {
		A, B, C, D, E, F
	}
	Classification classification;
	public Student(int id, String name, Classification classification) {
		this.id = id;
		this.name = name;
		this.classification = classification;
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
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	@Override
	public String toString() {
		return "id Student: " + id + ", \nName :" + name + ", \nClassification: " + classification+"";
	}
	
	
	
}
