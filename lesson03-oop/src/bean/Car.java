package bean;

public class Car {
	public String color;
	public int serial;

	public static String module;
	
	public Car() {
	}
	
	public Car(String color, int serial) {
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", module=" + module + ", serial=" + serial + "]";
	}
	
	
}
