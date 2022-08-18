package ex02_Tax;

public class Vehicle {
	private String nameOfOwner;
	private String nameOfVehicle;
	private int capacity;
	private double cost;

	public Vehicle(String nameOfOwner, String nameOfVehicle, int capacity, double cost) {
		super();
		this.nameOfOwner = nameOfOwner;
		this.nameOfVehicle = nameOfVehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getNameOfOwner() {
		return nameOfOwner;
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
		return "Vehicle [nameOfOwner=" + nameOfOwner + ", nameOfVehicle=" + nameOfVehicle + ", capacity=" + capacity
				+ ", cost=" + cost + "]";
	}

	public double tax(Vehicle vehicle) {
		double tax = 0;
		if (capacity > 100) {
			tax += getCost() * 0.99;
		} else if (capacity < 200) {
			tax += getCost() * 0.97;
		}else{
			tax += getCost() * 0.95;
		}
		return tax;
	}
}
