package bean;

public class Car {
	public static String model = "Audi";
	public String color;
	public int serial;
	
	public Car() {
		
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	

	public Car(String color, int serial) {
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}

	

}
