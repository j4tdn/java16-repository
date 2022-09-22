package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws InvalidZeroException {
		Scanner ip = new Scanner(System.in);
		double a = 0;
		double b = 0;
		do {
			try {
				System.out.print("nhap a = ");
				a = Integer.parseInt(ip.nextLine());
				if(a == 0) {
					throw new InvalidZeroException("div by zero");}
				System.out.print("nhap b = ");
				b = Integer.parseInt(ip.nextLine());
				
				break;
			}catch (NumberFormatException e) {
			System.out.println("error-->");
			e.printStackTrace();
	        }catch(InvalidZeroException e) {
	        	System.out.println(e.getMessage());
	        }
			}while(true);
		
		System.out.println("x = " + -b/a);
		ip.close();
		
		
	}
	
	
	}


