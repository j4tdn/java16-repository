package ex02_TaxCalculation;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Future Neo", 3000, 250000000);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Future Neo", 1500, 1000000000);
		
		System.out.println(v1 + "\n=> tax: " + VehicleUtils.taxCount(v1));
		System.out.println(v2 + "\n=> tax: " + VehicleUtils.taxCount(v2));
		System.out.println(v3 + "\n=> tax: " + VehicleUtils.taxCount(v3));
	}
}
