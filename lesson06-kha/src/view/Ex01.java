package view;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			try {
				int a = input("a");
				int b = input("b");
				System.out.println("Results: "+calcular(a,b));
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	private static int input(String varName) {
		do {
			System.out.print("Nhập vào " + varName + " : ");
			try {
				int a = Integer.parseInt(ip.nextLine());
				return a;
			}catch(NumberFormatException ex) {
				System.out.println("Phải nhập vào số nguyên");
			}
		}while(true);
	}
	
	private static float calcular(int a, int b) {
		if(a==0) throw new ArithmeticException("a phải lớn hơn 0");
		else return (float)-b/a;
	}
}
