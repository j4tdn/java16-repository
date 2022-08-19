package ex02vehicle;

public class Vehicle {
	private String name;
	private String lx;
	
	public Vehicle() {
	}

	public Vehicle(String name, String lx) {
		this.name = name;
		this.lx = lx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", lx=" + lx + "]";
	}
	
}
