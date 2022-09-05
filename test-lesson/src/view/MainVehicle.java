package view;

import java.util.Scanner;

import bean.Vehicle;
import bean.VehicleUtils;

public class MainVehicle {	
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("nhập số phần tử");
		String numberAsText = "";
		do {
			System.out.println("nhập số: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		int n = Integer.parseInt(numberAsText);
		Vehicle[] vehicle = new Vehicle[n];
		input(vehicle);
		show(vehicle);
		
	}
	public static void inputVehicle(Vehicle vehicle) {
			System.out.println("nhập mã: ");
			vehicle.setId(ip.nextInt());ip.nextLine();
			System.out.print("Nhập tên chủ xe: ");
	        vehicle.setCarOwner(ip.nextLine());			
	        System.out.print("Tên xe : "); 
	        vehicle.setNameOfVehicle(ip.nextLine());	
	        System.out.print("dung tich : ");
	        vehicle.setCapacity(ip.nextInt());
	        System.out.print("gia : ");
	        vehicle.setCost(ip.nextInt());
	}
	public static void input(Vehicle[] vehicle) {
		for (int i = 0; i < vehicle.length; i++) {
            System.out.println("Xe thứ " + (i+1));
            vehicle[i] = new Vehicle();
            inputVehicle(vehicle[i]);
        }
	}
	public static void show(Vehicle[] vehicle) {
		for (int i = 0; i < vehicle.length; i++) {
            System.out.println("Xe thứ " + (i+1));
            System.out.println(vehicle[i].toString());
            System.out.println(VehicleUtils.payTax(vehicle[i]));
        }
	}
}
