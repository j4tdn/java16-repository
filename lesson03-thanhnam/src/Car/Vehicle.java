package Car;

public class Vehicle {
	private String name;
	private String type;
	
	private double tax;
	private double cost;
	
	private int capacity;
	

	public Vehicle() {

	}

	public Vehicle(String name, String type, int capacity, double cost) {
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", capacity=" + capacity + ", cost=" + cost + ", tax=" + tax
				+ "]";
	}
}
