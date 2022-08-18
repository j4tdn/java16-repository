package view;

import java.util.Scanner;

public class Ex05BinaryNumber {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("nhap so can chuyen doi:");
	int number = ip.nextInt();
	String binary="";
	while(number>0) {
		binary=(number%2) + binary;
		number/=2;
	}
	System.out.print("so nhan duoc sau khi chuyen="+binary);
}
}