package view;

import java.util.Scanner;

public class Ex04MaxNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap so luong can nhap:");
		int n = ip.nextInt();
		int[] a = new int[n];
		int max = a[0];
		for (int i = 0; i < n; i++) {
			System.out.print("nhap so thu " + (i + 1) + "=");
			a[i] = ip.nextInt();
			System.out.println();
			if(a[i]%2==1&&a[i]>max) {
				max=a[i];
				
			}
				}
		System.out.println("so le lon nhat="+max);
			}

		
	

	}