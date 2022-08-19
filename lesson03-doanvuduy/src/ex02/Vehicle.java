package ex02;

public class Vehicle {
	private String Customer;
	private String typeVehicle;
	private int capacity;
	private double value;
	private double tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String customer, String typeVehicle, int capacity, double value, double tax) {
		super();
		Customer = customer;
		this.typeVehicle = typeVehicle;
		this.capacity = capacity;
		this.value = value;
		this.tax = tax;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return String.format("%10s%20s%5d%20f%20f", Customer, typeVehicle, capacity, value, tax);

	}

	/*
	 * Customer ; private String typeVehicle ; private int capacity ; private double
	 * value; private double tax
	 */
}
