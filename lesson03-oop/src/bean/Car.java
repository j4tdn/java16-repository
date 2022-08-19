package bean;

public class Car {
	 // object's scope
	 public String color;
	 public int serial;
	
	 // class's scope
	 // all objects have the same value
	public static String model;
	 
	 public Car() {
	}

	public Car(int serial, String color) {
		//this.model = model;
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}

	
	
	
}
