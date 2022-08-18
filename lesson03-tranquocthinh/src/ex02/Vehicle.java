package ex02;

public class Vehicle {
	private String carOwnerName;
	private String typeCar;
	private double capacity;
	private double price;

	public Vehicle() {
		super();
	}

	public Vehicle(String carOwnerName, String typeCar, double capacity, double price) {
		super();
		this.carOwnerName = carOwnerName;
		this.typeCar = typeCar;
		this.capacity = capacity;
		this.price = price;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public String getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double taxOfMoney(double tax) {
		if (this.capacity < 100) {
			tax = this.price * 0.01;
		} else if (this.capacity >= 100 && this.capacity <= 200) {
			tax = this.price * 0.03;
		} else {
			tax = this.price * 0.05;
		}
		return tax;
	}

	@Override
	public String toString() {
		return "Vehicle [carOwnerName=" + carOwnerName + ", typeCar=" + typeCar + ", capacity=" + capacity + ", price="
				+ price + ", TaxOfMoney: " + taxOfMoney(capacity) + "]";
	}

}
