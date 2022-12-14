package registerbuycar;

public class Vehicle {
	private int capacity;
	private String carOwner, color;
	private double value;

	public Vehicle(int capacity, String carOwner, String color, double value) {
		super();
		this.capacity = capacity;
		this.carOwner = carOwner;
		this.color = color;
		this.value = value;
	}

	public Vehicle() {
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vehicle [capacity=" + capacity + ", carOwner=" + carOwner + ", color=" + color + ", value=" + value
				+ "]";
	}

	public double taxs() {
		double tax;
		if (capacity < 100)
			tax = value * 0.01;
		else if (capacity >= 100 && capacity <= 200)
			tax = value * 0.03;
		else
			tax = value * 0.05;
		return tax;
	}

	void intax() {
		System.out.printf(" %5s %5d %15.2f %13s %14.5f \n", carOwner, capacity, value, color, taxs());
	}

}
