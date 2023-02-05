package ex04;

import java.io.Serializable;
import java.util.Objects;

import utils.DataRow;

public class Student implements DataRow, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double score;
	private String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double score, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.gender = gender;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(gender, id, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		Student student = (Student)obj;
		if(!(this instanceof Student)) {
			return false;
		}
		
		return id == student.getId();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}

	@Override
	public String toLine() {
		return getId() + ", " + getName() + ", " + getScore() + ", " + getGender();
	}
	

}
