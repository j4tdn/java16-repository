package bean;

public class Car {
	//object's scope
	public int serial;
	public String color;
	//class's scope
	public static String model;
	
	public  Car() {
		
	}

	public Car(int serial, String color) {
		this.serial = serial;
		this.color = color;
	}
	public Car(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
}