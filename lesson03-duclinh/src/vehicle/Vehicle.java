package vehicle;

public class Vehicle {
	private String id;
	private String carOwner;
	private String nameOfVehicle;
	private int capacity;
	private double cost;

	public Vehicle() {

	}

	public Vehicle(String id, String carOwner,String nameOfVehicle, int capacity, double cost) {
		this.id = id;
		this.carOwner = carOwner;
		this.nameOfVehicle = nameOfVehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
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
		return "Vehicle [id=" + id + ", carOwner=" + carOwner + ", nameOfVehicle=" + nameOfVehicle + ", capacity="
				+ capacity + ", cost=" + cost + "]";
	}
	
	

}
