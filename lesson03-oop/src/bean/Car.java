package bean;

public class Car {
	//object's scope
	public int  serial;
	public String color;
	
	//class's scope
	public static String model;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int serial, String color) {
	
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}

	
	

	
}
