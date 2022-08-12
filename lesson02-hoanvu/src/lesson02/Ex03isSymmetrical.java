package lesson02;


import java.util.Scanner;

public class Ex03isSymmetrical {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, reversed = 0, original;
		System.out.println("Số cần kiểm tra: ");
		num1 = scanner.nextInt();
		original = num1;
		
		while(num1 != 0) {
		      int digit = num1 % 10;
		      reversed = reversed * 10 + digit;
		      num1 /= 10;
		      
		}
		
		if(reversed == original){
		      System.out.println(original+ " là số đối xứng!!");
		}
		
		else{
		      System.out.println(original+ " không phải là số đối xứng!!");
		    }
		 
		    System.out.println("Finish...");
	}
}