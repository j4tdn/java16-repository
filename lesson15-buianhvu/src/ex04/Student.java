package ex04;



public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double gpa;
	private String gender;

	public Student(int id, String name, double gpa, String gender) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public int compareTo(Student o) {
		if (this.gpa == o.gpa) {
			return this.name.compareTo(o.name);
		}
		return Double.compare(this.gpa, o.gpa);
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + gpa + ", " + gender;
	}

}