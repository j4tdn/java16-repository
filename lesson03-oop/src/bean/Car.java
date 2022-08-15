package bean;

public class Car {
	private int serial;
	private static String model;
	private String color;
	
	public Car(int serial, String color) {
		this.serial = serial;
		this.color = color;
	}

	public Car(String color) {
		this.color = color;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}
