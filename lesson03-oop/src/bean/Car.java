package bean;

public class Car {
	public int serial;
	public static String model;
	public String color;

	public Car() {
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
