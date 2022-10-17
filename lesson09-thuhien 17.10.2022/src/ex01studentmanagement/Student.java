package ex01studentmanagement;

import common.Rank;

public class Student {
	private int studentId;
	private String name;
	private Rank rank;

	public Student() {
	}

	public Student(int studentId, String name, Rank rank) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.rank = rank;
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

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", rank=" + rank + "]";
	}
}
