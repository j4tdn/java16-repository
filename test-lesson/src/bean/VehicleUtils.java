package bean;

public class VehicleUtils {
	private VehicleUtils(){
	}
	public static double payTax(Vehicle vehicle) {
		double tax ;
		int capacity = vehicle.getCapacity();
		if(capacity < 100) tax = vehicle.getCost() * 0.1;
		else if(capacity >= 100 && capacity <=200 ) tax = vehicle.getCost() * 0.3;
		else tax = vehicle.getCost() * 0.5;
		return tax;		
	}
	
}
