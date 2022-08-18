package ex02_vehicle;

import java.util.Scanner;

public class VehicleUtils {
	public static double taxExport(Vehicle vehicle) {
		double tax = 0;
		if(vehicle.getValue() < 100)
			tax = vehicle.getValue() * 1 /100;
		else if (vehicle.getValue() > 200 )
			tax = vehicle.getValue() * 5 /100;
		else 
			tax = vehicle.getValue() * 3 /100;
		return tax;
	}
	
	public static void intput(Vehicle vehicle) {
		Scanner ip = new Scanner(System.in);
		System.out.println("ENTER VEHICLE INFORMATION");
		System.out.print("Car owner: ");
		vehicle.setCarOwner(ip.next());
		System.out.print("Range Of Vehicle: ");
		vehicle.setRangeOfVehicle(ip.next());
		System.out.print("capacity: ");
		vehicle.setCapacity(ip.nextInt());
		System.out.print("Value: ");
		vehicle.setValue(ip.nextInt());
	}
}
	
