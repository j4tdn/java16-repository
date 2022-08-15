package bean;

public class Car {
	
	// object 's  scope
	
	public int serial;
	public String color;
	
	// class ' s scope
	//all object have  the same value;
	
	public static String model;
	public Car() {
		
	}

	public Car(String color, int serial) {
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}

	
}
