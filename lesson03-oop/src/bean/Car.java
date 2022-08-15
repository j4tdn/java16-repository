package bean;

public class Car {
	// object's scope
	public int serial;
	public static String model;
	// class's scope
	// all objects have the same value
	public String color;

	public Car() {
	}

	public Car(int serial, String color) {
		this.serial = serial;
		this.color = color;
	}

	@Override
	public String toString() {
		return "serial: " + serial + ", model: " + model + ", color: " + color;
	}
}
