package Car;

public class VehicleUtils {
	
	public static String tax;

	public static double tax(Vehicle vehicle) {
		double tax = 0;
		int capacity = vehicle.getCapacity();
		if (capacity<100)
			tax = vehicle.getCost() * 0.01;
		else if(capacity >200)
			tax = vehicle.getCost() * 0.05;
		else if(capacity >=100 && capacity <= 200)
			tax = vehicle.getCost() * 0.03;
		return tax;
	}
}
