package vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("v1","Nguyễn văn A", "Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("v2","Lê Văn  B", "Future Neo", 3000, 250000000);
		Vehicle v3 = new Vehicle("v3","Nguyễn văn C", "Future Neo", 1500, 1000000000);
		
		System.out.println(v1 +"Tax: " + VehicleUtils.payTax(v1));
		System.out.println(v2 +"Tax: " + VehicleUtils.payTax(v2));
		System.out.println(v3 +"Tax: " + VehicleUtils.payTax(v3));
	}
}
