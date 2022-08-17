package bean;

public class Car {
	public int serial;
	public static String model;//class's scope
	public String color;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int serial, String model, String color) {
		super();
		this.serial = serial;
		this.model = model;
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
	
	}
	


