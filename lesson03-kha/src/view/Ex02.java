package view;

import java.util.Iterator;
import java.util.Scanner;

import bean.Vehicle;

public class Ex02 {
	public static void main(String[] args) {
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap vao` n ");
		n = ip.nextInt();
		exportAllVehicles(createVehical(n));
	}
	
	public static Vehicle[] createVehical(int n) {
		Vehicle[] listVehicles = new Vehicle[n];
		for (int i = 0; i < listVehicles.length; i++) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Nhap vao` xe thu' " + i + " : ");
			
			String ownname = "";
			System.out.print("Nhập tên chủ xe : ");
			ownname = ip.nextLine();
			
			String modelname = "";
			System.out.print("Nhập tên loại xe : ");
			modelname = ip.nextLine();
			
			String xylanhAsText = "";
			do {
				System.out.print("Nhập dung tích xe : ");
				xylanhAsText = ip.nextLine();
			}while(!xylanhAsText.matches("\\d+"));
			int xylanh = Integer.parseInt(xylanhAsText);
			
			String costAsText = "";
			do {
			System.out.print("Nhập trị giá xe : ");
			costAsText = ip.nextLine();
			}while(!costAsText.matches("\\d+"));
			double cost = Double.valueOf(costAsText); 

			Vehicle v1 = new Vehicle(ownname, modelname, xylanh, cost);
			listVehicles[i] = v1;
		}
		return listVehicles;
	}

	public static void exportAllVehicles(Vehicle[] listVeh) {
		System.out.printf("%-25s %-20s %10s %30s %30s\n","Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("==============================================================================================================================");
		
		for (Vehicle vehicle : listVeh) {
			System.out.printf("%-25s %-20s %10s %30.2f %30.2f\n",vehicle.getOwner(), vehicle.getModelname(), vehicle.getXylanh(), vehicle.getCost(), vehicle.getTax());
		}
	}


}
