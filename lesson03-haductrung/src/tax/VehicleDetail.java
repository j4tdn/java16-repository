package tax;

public class VehicleDetail {
	private String vehicleType;
	private int capacity;
	private double cost;

	public VehicleDetail() {

	}

	public VehicleDetail(String vehicleType, int capacity, double cost) {
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
		return "Vehicle [vehicleType=" + vehicleType + ", capacity=" + capacity + ", cost=" + cost + "]";
	}

}
