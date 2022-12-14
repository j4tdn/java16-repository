package ex02_Tax;

public class Vehicle {
	private String id;
	private String nameOwner;
	private String nameVehicle;
	private int cylinder;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String id, String nameOwner, String nameVehicle, int cylinder, double price) {
		this.id = id;
		this.nameOwner = nameOwner;
		this.nameVehicle = nameVehicle;
		this.cylinder = cylinder;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getNameVehicle() {
		return nameVehicle;
	}

	public void setNameVehicle(String nameVehicle) {
		this.nameVehicle = nameVehicle;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", nameOwner=" + nameOwner + ", nameVehicle=" + nameVehicle + ", cylinder="
				+ cylinder + ", price=" + price + "]";
	}
}
