package view;

import java.util.Scanner;

public class Ex01EquationOfDegree1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		boolean checkPass=false;
		do {
			try {
				String snum1,snum2;
				
				System.out.println("Input number 1: ");
				snum1=ip.next();
				System.out.println("Input number 2: ");
				snum2=ip.next();
				
				checkPass= checkValidInput(snum1) && checkValidInput(snum2);
				
				if(checkPass)
				{
					checkPass=false;
					num1=Double.parseDouble(snum1);
					num2=Double.parseDouble(snum2);
					checkPass=equationOfDegree(num1,num2);
				}
				
				if(checkPass)
				break;
				
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println("Nhập lại");
			}
		}while(!checkPass);
		
	}
	public static boolean equationOfDegree(double a, double b) {
		if(a == 0 && b == 0)
			throw new IllegalArgumentException("Vo So Nghiem");
		if(a == 0 && b != 0)
			throw new IllegalArgumentException("Vo Nghiem");
		else 
			System.out.println((-b)/a);
		
		return true;
	}
	
	public static boolean checkValidInput(String a)
	{
		if(a.charAt(0)!='-' && (a.charAt(0)<'0' || a.charAt(0)>'9' ))
			  throw new IllegalArgumentException("Invalid input ");
		for(int i=1;i<a.length();i++)
		{
			if(a.charAt(i)<'0' || a.charAt(i)>'9')
				  if(a.charAt(i)!='-')
				  throw new IllegalArgumentException("Invalid input ");
		}
		return true;
	}
	
}
