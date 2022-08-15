package bean;

public class Car {
	//object's scope
	public int serial;
	public String model;
	
	//class's scope
	//all object have the same value
	public static String color;
	
	public Car() {
	// TODO Auto-generated constructor stub
	}

	public Car(int serial, String color) {
		this.serial = serial;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
	
	
}
