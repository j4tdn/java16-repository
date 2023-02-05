package bean;

import java.util.stream.Stream;

public class Students {
	private int id;
	private String name;
	private double point;
	private Gender gender;
	
	public Students() {
	}

	public Students(int id, String name, double point, Gender gender) {
		this.id = id;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}

	public long getId() {
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

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public Gender getGentle() {
		return gender;
	}

	public void setGentle(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", gentle=" + gender + "]";
	}
}


