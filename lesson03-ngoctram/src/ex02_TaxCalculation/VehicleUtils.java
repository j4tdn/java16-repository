package ex02_TaxCalculation;

public class VehicleUtils {
	private VehicleUtils() {
		
	}
	
	public static double taxCount(Vehicle vehicle) {
		double tax;
		int capacity = vehicle.getCapacity();
		if (capacity > 200) tax = vehicle.getCost() * 0.05;
		else if (capacity >= 100) tax = vehicle.getCost() * 0.03;
		else tax = vehicle.getCost() * 0.01;
		return tax;
	}
}
