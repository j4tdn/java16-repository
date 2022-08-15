package bean;

public class Car {
	public int serial;
	public String color;
	
	// class's scope
	public static String model;
	
	public Car() {
	}

	public Car(int serial,String model, String color) {
		this.serial = serial;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
	

}

	
