package bean;

public class Vehicle {
	private String ownerName;
	private String typeCar;
	private int capacity;
	private double cost;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String ownerName, String typeCar, int capacity, double cost) {
		this.ownerName = ownerName;
		this.typeCar = typeCar;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
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
		return "Vehicle [ownerName=" + ownerName + ", typeCar=" + typeCar + ", capacity=" + capacity + ", cost=" + cost
				+ "]";
	}
	private double tax;
	public double increasedTax() {
		if(getCapacity()<100) {
			tax=getCost()*0.1;
		}
		else if(getCapacity()>=100 && getCapacity()<=200) {
			tax=getCost()*0.3;
		}
		else {
			tax=getCost()*0.5;
		}
		return tax;
	}
	public void showInfo() {
		System.out.println(getOwnerName()+"\t\t"+getTypeCar()+"\t\t"+getCapacity()+"\t\t\t"+getCost()+"\t\t\t"+increasedTax());
	}
}
