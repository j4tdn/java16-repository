package Tax;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen Thu Loan",   "Future Neo",  100,  35000000);
		Vehicle v2 = new Vehicle("Le Minh Tinh",      "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape",   1500, 1000000000);
		
		System.out.println(v1 + "\ttax: " + taxInCapacity(v1));
		System.out.println(v2 + "\ttax: " + taxInCapacity(v2));
		System.out.println(v3 + "\ttax: " + taxInCapacity(v3));
	}


	public static double taxInCapacity(Vehicle vehicle) {
		double tax;
		int capacity = vehicle.getCylinderCapacity();
		if (capacity < 100) 
			tax = vehicle.getCost() * 0.01;
		else if (capacity >= 100 && capacity <= 200 )
			tax = vehicle.getCost() * 0.03;
		else 
			tax = vehicle.getCost() * 0.05;
		
		return tax;
	}
}