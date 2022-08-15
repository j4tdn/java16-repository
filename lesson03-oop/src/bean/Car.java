package bean;

public class Car {
	public int serial;

	public String color;
	//class's scope
	//all object have the same value
	public static String model;
	
	public Car() {

	}

	public Car(int serial,  String color) {
		this.serial= serial;

		this.color = color;
		
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}


	
	
}
