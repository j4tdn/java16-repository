package bean;

public class Vehicle {
	private String owner;
	private String model;
	private int capacity;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String owner, String model, int capacity, double price) {
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double registrationTax() {
		if(capacity < 100) {
			return price * 0.01;
		} else if (capacity <= 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}

	@Override
	public String toString() {
		return String.format("%-25s%-20s%10s%20.2f%20.2f", owner, model, capacity, price, registrationTax());
	}
}
