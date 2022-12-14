package ex02_TaxCalculation;

public class Vehicle {
	private String nameOfOwner;
	private String nameOfVehicle;
	private int capacity;
	private double cost;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}
	
	public Vehicle(String nameOfOwner, String nameOfVehicle, int capacity, double cost) {
		this.nameOfOwner = nameOfOwner;
		this.nameOfVehicle = nameOfVehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}
	
	public String getNameOfVehicle() {
		return nameOfVehicle;
	}

	public void setNameOfVehicle(String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [nameOfOwner=" + nameOfOwner + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	
	
}
