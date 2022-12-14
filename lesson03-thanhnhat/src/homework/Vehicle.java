package homework;

public class Vehicle {
	// Chủ xe loại xe - dung tích - giá xe
	private String name;
	private String type;
	private int volumn;
	private double cost;

	public Vehicle(String name, String type, int volumn, double cost) {
		this.name = name;
		this.type = type;
		this.volumn = volumn;
		this.cost = cost;
	}
	
	public Vehicle() {
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

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", volumn=" + volumn + ", cost=" + cost + "]";
	}

	private double motoTax() {
		double tax = 0;
		if (volumn < 100) {
			tax = cost * 0.01;
		}

		else if (volumn >= 100 && volumn <= 200) {
			tax = cost * 0.03;
		}

		else if (volumn > 200) {
			tax = cost * 0.05;
		}
		return tax;
	}

	public void printVC() {
		System.out.printf("%6d %10 %20 %15, %15 \n ", name, type, volumn, cost, motoTax());
	}
}
