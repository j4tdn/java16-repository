package Ex02VehicleTax;

public class Tax {
	private Tax() {		
	}
	public static double taxCal(Vehicle vehicles) {
		double tax = 1;
		if (vehicles.getCapacity() < 100) {
			tax *= vehicles.getCost() *0.01;
		}
		else if (vehicles.getCapacity() < 200){
			tax *= vehicles.getCost() *0.03;
		}
		else {
			tax *= vehicles.getCost() *0.05;
		}
		return tax;
		
	}

}
