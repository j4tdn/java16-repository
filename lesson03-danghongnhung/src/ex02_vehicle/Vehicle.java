package ex02_vehicle;

public class Vehicle {
	private String carOwner;
	private String rangeOfVehicle;
	private int capacity;
	private double value;
	
	public Vehicle() {
	}

	public Vehicle(String carOwner, String rangeOfVehicle, int capacity, double value) {
		super();
		this.carOwner = carOwner;
		this.rangeOfVehicle = rangeOfVehicle;
		this.capacity = capacity;
		this.value = value;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}

	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return  carOwner +"    "+ rangeOfVehicle  +"      "+ capacity +"         "+ value +"         ";
	}

	
	
	
	
	
	

}
