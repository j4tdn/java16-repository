package Tax;

public class Vehicle {
	private String owner;
	private String vehicleBrand;
	private int cylinderCapacity;
	private double cost;

	public Vehicle() {

	}

	public Vehicle(String owner, String vehicleBrand, int cylinderCapacity, double cost) {
		super();
		this.owner = owner;
		this.vehicleBrand = vehicleBrand;
		this.cylinderCapacity = cylinderCapacity;
		this.cost = cost;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(int cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", vehicleBrand=" + vehicleBrand + ", cylinderCapacity=" + cylinderCapacity
				+ ", cost=" + cost + "]";
	}

}