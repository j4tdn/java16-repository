package view;

import java.util.Scanner;

public class QuadraticEquation2 {
	public static void main(String[] args) {
		double a,b,c,x1,x2,delta;
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap a = ");
		a = ip.nextDouble();
		System.out.print("nhap b = ");
		b = ip.nextDouble();
		System.out.print("nhap c = ");
		c = ip.nextDouble();
		delta = Math.pow(b, 2) - a*c*4;
		if(delta < 0) {
			System.out.println("pt vo nghiem ");
		}
		else if (delta == 0) {
			x1 = x2 = -b/(2*a);
			System.out.println("pt co nghiem kep x1 = x2 = "+ x1);
		}
		else {
			System.out.println("pt co 2 nghiem phan biet la :");
			x1=(-b - Math.sqrt(delta)) / (2 * a);
			System.out.println(x1);
			x2=(-b + Math.sqrt(delta)) / (2 * a);
			System.out.println(x2);
			
		}
	
		
		
		
		
	}
	

}
