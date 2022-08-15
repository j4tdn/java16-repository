package bean;

public class Car {

	// class's scope
	public static String model;
	
	// object's scope
	public String color;
	public int serial;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car( String color, int serial) {
		this.color = color;
		this.serial = serial;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}
}
