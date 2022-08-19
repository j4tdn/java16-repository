package Ex02VehicleTax;

public class Vehicle {
	private String owner;
	private String type;
	private int capacity;
	private double cost;
	public Vehicle() {
		
	}
	public Vehicle(String owner, String type, int capacity, double cost) {
		super();
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return "Vehicle [owner=" + owner + ", type=" + type + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	

}
