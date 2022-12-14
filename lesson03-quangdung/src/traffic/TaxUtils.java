package traffic;

public class TaxUtils {

	public TaxUtils() {
		// TODO Auto-generated constructor stub
	}

	public static double taxPay(Vehicle vehicle) {
		double tax;
		int capacity = vehicle.getCapacity();
		if (capacity < 100)
			tax = vehicle.getCost() * 0.01;
		else if (capacity > 200)
			tax = vehicle.getCost() * 0.05;
		else
			tax = vehicle.getCost() * 0.03;
		return tax;
	}
}
