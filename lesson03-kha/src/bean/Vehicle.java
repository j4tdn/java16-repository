package bean;

public class Vehicle {
	private String owner;
	private String modelname;
	private int xylanh;
	private double cost;
	private double tax;
	
	public Vehicle(String owner, String modelname, int xylanh, double cost) {
		this.owner = owner;
		this.modelname = modelname;
		this.xylanh = xylanh;
		this.cost = cost;
		this.tax = calTax(xylanh, cost);
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getXylanh() {
		return xylanh;
	}

	public void setXylanh(int xylanh) {
		this.xylanh = xylanh;
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

	public double calTax(int xylanh, double cost) {
		if(xylanh < 100) {
			return cost*1/(double)100;
		}
		else if(xylanh < 200) {
			return cost*3/(double)100;
		}
		else {
			return cost*5/(double)100;
		}
	}
	
	
	
}
