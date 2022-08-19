package Ex02VehicleTax;

import shopping.OrderUtils;

public class App {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("NTL", "Future Neo", 100, 1050000);
		Vehicle v2 = new Vehicle("LMT", "Ford Ranger", 3000, 12500000);
		Vehicle v3 = new Vehicle("NMT", "Lanscape", 1500, 50000000);
		
		
		System.out.println("v1= " + Tax.taxCal(v1));
		 System.out.println("o2= " + Tax.taxCal(v2));
		 System.out.println("o3= " + Tax.taxCal(v3));
	}

}
