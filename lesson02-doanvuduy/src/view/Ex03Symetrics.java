package view;

import java.util.Scanner;

public class Ex03Symetrics {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
		 System.out.println("nhap so can kiem tra:");
		 int n= ip.nextInt();
		 int temp=n;
		 int sum=0;
		 while(temp!=0) {
			 sum=sum*10+temp%10;
			 temp/=10;
		 }
		 if(sum==n) System.out.println(n+" la so doi xung");
		 else System.out.println(n+" khong la so doi xung");
	}

	

	}

