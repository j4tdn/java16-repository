package ex02;

public class Vehicle {
	private String Name;
	private String Model;
	private int Capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public int getCapacity() {
		return Capacity;
	}


	public void setCapacity(int capacity) {
		Capacity = capacity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getTax() {
		return tax;
	}



	
	public double Tax() {
		double n ;
		if(this.Capacity < 100) n=0.01;
		else if (this.Capacity <= 200) n=0.03;
		else n=0.05;
		this.tax = this.price * n;
		return this.tax;
	}

	@Override
	public String toString() {
		return Name+ "    " + Model+ "    " + Capacity+ "    " + price+ "    " + tax ;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public String getVehicletype() {
		// TODO Auto-generated method stub
		return null;
	}
}
