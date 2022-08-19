package exercise2;

import java.util.Scanner;

import java.util.*;

public class Vehicle {
		static Scanner sc = new Scanner(System.in);
		public String name;
		public String loaiXe;
		public int dungTich;
		public int triGia;
		public Vehicle() {};
		public Vehicle(String name, String loaiXe,int dungTich, int triGia) {
			this.name=name;
			this.loaiXe=loaiXe;
			this.dungTich = dungTich;
			this.triGia = triGia;
		}
		public float thue() {
			if(this.dungTich<100) return this.triGia*0.01f;
			else if(this.dungTich<200) return this.triGia*0.03f;
			return this.triGia * 0.05f;
		}
		public void nhap() {
			System.out.println("Nhap ten chu xe");
			this.name = sc.nextLine();
			System.out.println("Nhap ten loai xe");
			this.loaiXe = sc.nextLine();
			System.out.println("Nhap dung tich:");
			this.dungTich = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap tri gia:");
			this.triGia = Integer.parseInt(sc.nextLine());
		}
		public String xuat() {
			return "Vehicle [name=" + name + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", triGia=" + triGia
					+ "Thue" + this.thue() + "]";
		}
	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle();
		Vehicle xe2 = new Vehicle();
		Vehicle xe3 = new Vehicle();
		xe1.nhap();
		xe2.nhap();
		xe3.nhap();
		System.out.println(xe1.xuat());
		System.out.println(xe2.xuat());
		System.out.println(xe3.xuat());
	}

}
