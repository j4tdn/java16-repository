package ex02_Vehicle;

import java.util.Scanner;


import java.util.*;

public class ListVehicle {
		static Scanner sc = new Scanner(System.in);
		public String name;
		public String typeCar;
		public int capacity;
		public int price;
		public ListVehicle() {};
		public ListVehicle(String name, String loaiXe,int dungTich, int price) {
			this.name=name;
			this.typeCar=typeCar;
			this.capacity = capacity;
			this.price = price;
		}
		public float vat() {
			if(this.capacity<100) return this.price*0.01f;
			else if(this.capacity<200) return this.price*0.03f;
			return this.price * 0.05f;
		}
		public void input() {
			System.out.println("Enter the owner's name:");
			this.name = sc.nextLine();
			System.out.println("Enter car company name:");
			this.typeCar = sc.nextLine();
			System.out.println("Enter vehicle capacity:");
			this.capacity = Integer.parseInt(sc.nextLine());
			System.out.println("Enter car sales price:");
			this.price = Integer.parseInt(sc.nextLine());
		}
		public String output() {
			return "Vehicle [name=" + name + ", loaiXe=" + typeCar + ", dungTich=" + capacity + ", triGia=" + price
					+ "Thue" + this.vat() + "]";
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of vehicles: \n");
		int n= sc.nextInt();
	ListVehicle xe = new ListVehicle();
	for( int i=0;i<n;i++) {
	   xe.input();
	   System.out.println(xe.output() + "\n" );   
	    }
	}
}
