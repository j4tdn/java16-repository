package ex02_vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 3500000);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 2500000);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000);
		int choice;
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(v1);
		do {
			System.out.println("\t1. Input information and create list vehicle");
			System.out.println("\t2. Export registration tax declaration of vehicles.");
			System.out.println("\t3. Exit");
			System.out.println("Input choice");
			choice = ip.nextInt();
			switch(choice){
				case 1:
				{
					Vehicle v =new Vehicle();
					VehicleUtils.intput(v);
					vehicles.add(v);
					break;
				}
				case 2:	{
					System.out.println("Tên chủ xe       Loại xe     Dung tích       Trị Giá          Thuế phải nộp");
					System.out.println("==============================================================================");
					for(Vehicle veh: vehicles) {
						System.out.println(veh.toString() + VehicleUtils.taxExport(veh));
					}
					break;
				}
			}
		}while(choice!=3);
		System.out.println("-----------------------------------");
	}
}
