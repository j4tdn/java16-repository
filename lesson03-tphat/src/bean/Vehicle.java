package bean;

import ex01Shopping.Item;
import ex01Shopping.ItemDetail;

public class Vehicle {
	private String name;
	private String type;
	private int capacity;
	private double price;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String type, int capacity, double price) {
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [Ten chu xe=" + name + ", Loai xe=" + type + ", Dung tich=" + capacity + ", Tri gia=" + price
				+ "]";
	}

	public double export() {
		double totalTax = 0;
		if (getCapacity() < 100) {
			totalTax = getPrice() * 0.1;
		} else if (getCapacity() >= 100 && getCapacity() <= 200) {
			totalTax = getPrice() * 0.3;
		} else {
			totalTax = getPrice() * 0.5;
		}
		return totalTax;
	}

	public void show() {
		System.out.println(toString() + export());
	}
}
