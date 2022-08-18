package manager;

public class Vehicle {
	private String username;
	private String carmodel;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String username, String carmodel, int capacity, double price) {
		super();
		this.username = username;
		this.carmodel = carmodel;
		this.capacity = capacity;
		this.price = price;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "" + username + "            " + carmodel + "    " + capacity + "         "
				+ price + "        " + vehicleCapacity() + "";
	}
	
	
	public double vehicleCapacity() {
		double taxAfter = 0;
		if(capacity < 100) taxAfter = price*0.01;
		if(capacity >= 100 && capacity <= 200) taxAfter = price*0.03;
		if(capacity > 200) taxAfter =  price*0.05;
		
		return taxAfter;
		
		
		
		
	}
	


}
