package bean;

public class Car {
    //public String model;
    public String color;
    public int serial;
    public static String model;
	public Car( int serial,String color) {
		
	 
		this.color = color;
		this.serial = serial;
	}
	public Car() {
		
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}

    
    
}
