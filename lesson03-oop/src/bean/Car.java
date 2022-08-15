package bean;

public class Car {
	public String model;
	public String color;
	public int  serial;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int serial,String model, String color) {
		this.model = model;
		this.color = color;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}

	
	

	
}
